/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 28 Jan 2020, 23:09:53                       ---
 * ----------------------------------------------------------------
 */
package com.affirm.payment.jalo;

import com.affirm.payment.core.constants.AffirmpaymentcoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.affirm.payment.jalo.PaymentThreshold PaymentThreshold}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedPaymentThreshold extends GenericItem
{
	/** Qualifier of the <code>PaymentThreshold.threshold</code> attribute **/
	public static final String THRESHOLD = "threshold";
	/** Qualifier of the <code>PaymentThreshold.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>PaymentThreshold.minimumMode</code> attribute **/
	public static final String MINIMUMMODE = "minimumMode";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(THRESHOLD, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(MINIMUMMODE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentThreshold.currency</code> attribute.
	 * @return the currency - Currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentThreshold.currency</code> attribute.
	 * @return the currency - Currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentThreshold.currency</code> attribute. 
	 * @param value the currency - Currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentThreshold.currency</code> attribute. 
	 * @param value the currency - Currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentThreshold.minimumMode</code> attribute.
	 * @return the minimumMode - The flag to indicate if it is a minimum or maximum treshold
	 */
	public Boolean isMinimumMode(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, MINIMUMMODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentThreshold.minimumMode</code> attribute.
	 * @return the minimumMode - The flag to indicate if it is a minimum or maximum treshold
	 */
	public Boolean isMinimumMode()
	{
		return isMinimumMode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentThreshold.minimumMode</code> attribute. 
	 * @return the minimumMode - The flag to indicate if it is a minimum or maximum treshold
	 */
	public boolean isMinimumModeAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isMinimumMode( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentThreshold.minimumMode</code> attribute. 
	 * @return the minimumMode - The flag to indicate if it is a minimum or maximum treshold
	 */
	public boolean isMinimumModeAsPrimitive()
	{
		return isMinimumModeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentThreshold.minimumMode</code> attribute. 
	 * @param value the minimumMode - The flag to indicate if it is a minimum or maximum treshold
	 */
	public void setMinimumMode(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, MINIMUMMODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentThreshold.minimumMode</code> attribute. 
	 * @param value the minimumMode - The flag to indicate if it is a minimum or maximum treshold
	 */
	public void setMinimumMode(final Boolean value)
	{
		setMinimumMode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentThreshold.minimumMode</code> attribute. 
	 * @param value the minimumMode - The flag to indicate if it is a minimum or maximum treshold
	 */
	public void setMinimumMode(final SessionContext ctx, final boolean value)
	{
		setMinimumMode( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentThreshold.minimumMode</code> attribute. 
	 * @param value the minimumMode - The flag to indicate if it is a minimum or maximum treshold
	 */
	public void setMinimumMode(final boolean value)
	{
		setMinimumMode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentThreshold.threshold</code> attribute.
	 * @return the threshold - Threshold value
	 */
	public Double getThreshold(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, THRESHOLD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentThreshold.threshold</code> attribute.
	 * @return the threshold - Threshold value
	 */
	public Double getThreshold()
	{
		return getThreshold( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentThreshold.threshold</code> attribute. 
	 * @return the threshold - Threshold value
	 */
	public double getThresholdAsPrimitive(final SessionContext ctx)
	{
		Double value = getThreshold( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentThreshold.threshold</code> attribute. 
	 * @return the threshold - Threshold value
	 */
	public double getThresholdAsPrimitive()
	{
		return getThresholdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentThreshold.threshold</code> attribute. 
	 * @param value the threshold - Threshold value
	 */
	public void setThreshold(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, THRESHOLD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentThreshold.threshold</code> attribute. 
	 * @param value the threshold - Threshold value
	 */
	public void setThreshold(final Double value)
	{
		setThreshold( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentThreshold.threshold</code> attribute. 
	 * @param value the threshold - Threshold value
	 */
	public void setThreshold(final SessionContext ctx, final double value)
	{
		setThreshold( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentThreshold.threshold</code> attribute. 
	 * @param value the threshold - Threshold value
	 */
	public void setThreshold(final double value)
	{
		setThreshold( getSession().getSessionContext(), value );
	}
	
}
