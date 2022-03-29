/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 28 Jan 2020, 23:09:53                       ---
 * ----------------------------------------------------------------
 */
package com.affirm.payment.core.constants;

/**
 * @deprecated since ages - use constants in Model classes instead
 */
@Deprecated
@SuppressWarnings({"unused","cast"})
public class GeneratedAffirmpaymentcoreConstants
{
	public static final String EXTENSIONNAME = "affirmpaymentcore";
	public static class TC
	{
		public static final String AFFIRMCONFIGCONTAINER = "AffirmConfigContainer".intern();
		public static final String AFFIRMPAGECONFIG = "AffirmPageConfig".intern();
		public static final String AFFIRMPAYMENTINFO = "AffirmPaymentInfo".intern();
		public static final String AFFIRMPAYMENTTRANSACTIONENTRY = "AffirmPaymentTransactionEntry".intern();
		public static final String AFFIRMPROMOMESSAGE = "AffirmPromoMessage".intern();
		public static final String AFFIRMPROMOPAGETYPE = "AffirmPromoPageType".intern();
		public static final String PAYMENTTHRESHOLD = "PaymentThreshold".intern();
	}
	public static class Attributes
	{
		public static class AbstractOrder
		{
			public static final String TOTALINCLUDINGTAX = "totalIncludingTax".intern();
		}
		public static class BaseSite
		{
			public static final String AFFIRMCONFIGCONTAINER = "affirmConfigContainer".intern();
		}
		public static class CreditCardPaymentInfo
		{
			public static final String AFFIRMVCNID = "affirmVCNId".intern();
		}
		public static class PaymentMode
		{
			public static final String THRESHOLDS = "thresholds".intern();
		}
	}
	public static class Enumerations
	{
		public static class AffirmPromoPageType
		{
			public static final String CATEGORY = "CATEGORY".intern();
			public static final String PDP = "PDP".intern();
			public static final String CART = "CART".intern();
		}
		public static class PaymentTransactionType
		{
			public static final String INITIATE = "INITIATE".intern();
			public static final String UPDATE = "UPDATE".intern();
		}
	}
	
	protected GeneratedAffirmpaymentcoreConstants()
	{
		// private constructor
	}
	
	
}
