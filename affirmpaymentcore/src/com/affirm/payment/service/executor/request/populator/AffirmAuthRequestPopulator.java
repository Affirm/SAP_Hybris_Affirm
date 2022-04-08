package com.affirm.payment.service.executor.request.populator;

import com.affirm.payment.AffirmPaymentConstants;
import com.affirm.payment.service.executor.request.AffirmPaymentServiceRequest;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.HashMap;

public class AffirmAuthRequestPopulator implements Populator<AffirmPaymentServiceRequest,HashMap> {
   @Override public void populate(AffirmPaymentServiceRequest request, HashMap map) throws ConversionException {
      AbstractOrderModel cart = (AbstractOrderModel) request.getParams().get(AffirmPaymentConstants.ORDER);
      String transactionId = (String) request.getParams().get(AffirmPaymentConstants.Authorisation.TRANSACTION_ID);
      map.put(AffirmPaymentConstants.Authorisation.TRANSACTION_ID, transactionId);
      map.put(AffirmPaymentConstants.ORDER_ID, cart.getCode());

   }
}
