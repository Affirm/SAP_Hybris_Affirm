/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 28 Jan 2020, 23:09:53                       ---
 * ----------------------------------------------------------------
 */
package com.affirm.payment.jalo;

import com.affirm.payment.core.constants.AffirmpaymentcoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.payment.jalo.PaymentTransactionEntry;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.affirm.payment.jalo.AffirmPaymentTransactionEntry AffirmPaymentTransactionEntry}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedAffirmPaymentTransactionEntry extends PaymentTransactionEntry
{
	/** Qualifier of the <code>AffirmPaymentTransactionEntry.authorisationJSON</code> attribute **/
	public static final String AUTHORISATIONJSON = "authorisationJSON";
	/** Qualifier of the <code>AffirmPaymentTransactionEntry.properties</code> attribute **/
	public static final String PROPERTIES = "properties";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(PaymentTransactionEntry.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(AUTHORISATIONJSON, AttributeMode.INITIAL);
		tmp.put(PROPERTIES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmPaymentTransactionEntry.authorisationJSON</code> attribute.
	 * @return the authorisationJSON - long detailed description of material care.
	 */
	public String getAuthorisationJSON(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AUTHORISATIONJSON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmPaymentTransactionEntry.authorisationJSON</code> attribute.
	 * @return the authorisationJSON - long detailed description of material care.
	 */
	public String getAuthorisationJSON()
	{
		return getAuthorisationJSON( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmPaymentTransactionEntry.authorisationJSON</code> attribute. 
	 * @param value the authorisationJSON - long detailed description of material care.
	 */
	public void setAuthorisationJSON(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AUTHORISATIONJSON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmPaymentTransactionEntry.authorisationJSON</code> attribute. 
	 * @param value the authorisationJSON - long detailed description of material care.
	 */
	public void setAuthorisationJSON(final String value)
	{
		setAuthorisationJSON( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmPaymentTransactionEntry.properties</code> attribute.
	 * @return the properties
	 */
	public Map<String,String> getAllProperties(final SessionContext ctx)
	{
		Map<String,String> map = (Map<String,String>)getProperty( ctx, PROPERTIES);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmPaymentTransactionEntry.properties</code> attribute.
	 * @return the properties
	 */
	public Map<String,String> getAllProperties()
	{
		return getAllProperties( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmPaymentTransactionEntry.properties</code> attribute. 
	 * @param value the properties
	 */
	public void setAllProperties(final SessionContext ctx, final Map<String,String> value)
	{
		setProperty(ctx, PROPERTIES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmPaymentTransactionEntry.properties</code> attribute. 
	 * @param value the properties
	 */
	public void setAllProperties(final Map<String,String> value)
	{
		setAllProperties( getSession().getSessionContext(), value );
	}
	
}
