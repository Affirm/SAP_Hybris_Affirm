package com.affirm.payment.service.executor.request.builder;

import com.affirm.payment.AffirmPaymentConstants;

public class AffirmRefundPaymentRequestServiceBuilder extends AffirmPaymentRequestServiceBuilder<AffirmRefundPaymentRequestServiceBuilder> {

   public AffirmRefundPaymentRequestServiceBuilder setRefundAmount(final int amount)
   {
      affirmPaymentServiceRequest.addParam(AffirmPaymentConstants.REFUND.AMOUNT, amount);
      return this;
   }

}
