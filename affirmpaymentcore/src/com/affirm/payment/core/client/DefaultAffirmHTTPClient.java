package com.affirm.payment.core.client;

import com.affirm.payment.model.AffirmConfigContainerModel;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * HTTP client class to send the JSON request to Affirm
 */
public class DefaultAffirmHTTPClient implements AffirmHTTPClient {

   private static final Logger LOG = LoggerFactory.getLogger(DefaultAffirmHTTPClient.class);

   public static final String COUNTRY_CODE_CAN = "CAN";

   public String send(String endpointUrl, String jsonString, AffirmConfigContainerModel affirmConfigContainer, String idempotencyKey, String countryCode){
      try {
         HttpPost request = new HttpPost(endpointUrl);
         String auth = "";
         if (countryCode.equals(COUNTRY_CODE_CAN)) {
            auth = affirmConfigContainer.getAffirmPublicKeyCA() + ":" + affirmConfigContainer.getAffirmPrivateKeyCA();
         } else {
            auth = affirmConfigContainer.getAffirmPublicKey() + ":" + affirmConfigContainer.getAffirmPrivateKey();
         }
         byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(StandardCharsets.ISO_8859_1));
         String authHeader = "Basic " + new String(encodedAuth);
         request.setHeader(HttpHeaders.AUTHORIZATION, authHeader);
         request.addHeader("content-type", "application/json");
         request.addHeader("Idempotency-Key", idempotencyKey);
         request.addHeader("Country-Code", countryCode);
         request.setEntity( new StringEntity(jsonString));

         HttpClient client = HttpClientBuilder.create().build();
         HttpResponse response = client.execute(request);

         String jsonResponse = EntityUtils.toString(response.getEntity(), "UTF-8");
         if (isSuccess(response)) {
            LOG.debug("response : " + jsonResponse);
         } else {
            LOG.warn("Register message sent failed. Verify below information.");
            LOG.warn("[URL] : " + endpointUrl);
            LOG.warn("[Message] : " + jsonString);
            LOG.warn("[Reason] : " + jsonResponse);
         }
         return jsonResponse;
      } catch (IOException e) {
         e.printStackTrace();
      }

      return null;
   }

   private boolean isSuccess(HttpResponse response) {
      return response.getStatusLine().getStatusCode() == HttpStatus.SC_OK || response.getStatusLine().getStatusCode() == HttpStatus.SC_CREATED;
   }


}
