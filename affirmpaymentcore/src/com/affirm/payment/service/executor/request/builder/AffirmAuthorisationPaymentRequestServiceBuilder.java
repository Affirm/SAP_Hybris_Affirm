package com.affirm.payment.service.executor.request.builder;

import com.affirm.payment.AffirmPaymentConstants;

public class AffirmAuthorisationPaymentRequestServiceBuilder extends AffirmPaymentRequestServiceBuilder<AffirmAuthorisationPaymentRequestServiceBuilder> {

   public AffirmAuthorisationPaymentRequestServiceBuilder  setTransactionId(final String transactionId)
   {
      affirmPaymentServiceRequest.addParam(AffirmPaymentConstants.Authorisation.TRANSACTION_ID, transactionId);
      return this;
   }

}
