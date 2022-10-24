/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Oct 19, 2022, 10:16:29 PM                   ---
 * ----------------------------------------------------------------
 */
package com.affirm.payment.jalo;

import com.affirm.payment.core.constants.AffirmpaymentcoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.affirm.payment.jalo.AffirmPromoMessage AffirmPromoMessage}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedAffirmPromoMessage extends GenericItem
{
	/** Qualifier of the <code>AffirmPromoMessage.affirmPromoMessageCode</code> attribute **/
	public static final String AFFIRMPROMOMESSAGECODE = "affirmPromoMessageCode";
	/** Qualifier of the <code>AffirmPromoMessage.affirmPromotionMessage</code> attribute **/
	public static final String AFFIRMPROMOTIONMESSAGE = "affirmPromotionMessage";
	/** Qualifier of the <code>AffirmPromoMessage.affirmPageType</code> attribute **/
	public static final String AFFIRMPAGETYPE = "affirmPageType";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(AFFIRMPROMOMESSAGECODE, AttributeMode.INITIAL);
		tmp.put(AFFIRMPROMOTIONMESSAGE, AttributeMode.INITIAL);
		tmp.put(AFFIRMPAGETYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmPromoMessage.affirmPageType</code> attribute.
	 * @return the affirmPageType
	 */
	public EnumerationValue getAffirmPageType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, AFFIRMPAGETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmPromoMessage.affirmPageType</code> attribute.
	 * @return the affirmPageType
	 */
	public EnumerationValue getAffirmPageType()
	{
		return getAffirmPageType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmPromoMessage.affirmPageType</code> attribute. 
	 * @param value the affirmPageType
	 */
	public void setAffirmPageType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, AFFIRMPAGETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmPromoMessage.affirmPageType</code> attribute. 
	 * @param value the affirmPageType
	 */
	public void setAffirmPageType(final EnumerationValue value)
	{
		setAffirmPageType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmPromoMessage.affirmPromoMessageCode</code> attribute.
	 * @return the affirmPromoMessageCode
	 */
	public String getAffirmPromoMessageCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AFFIRMPROMOMESSAGECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmPromoMessage.affirmPromoMessageCode</code> attribute.
	 * @return the affirmPromoMessageCode
	 */
	public String getAffirmPromoMessageCode()
	{
		return getAffirmPromoMessageCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmPromoMessage.affirmPromoMessageCode</code> attribute. 
	 * @param value the affirmPromoMessageCode
	 */
	public void setAffirmPromoMessageCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AFFIRMPROMOMESSAGECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmPromoMessage.affirmPromoMessageCode</code> attribute. 
	 * @param value the affirmPromoMessageCode
	 */
	public void setAffirmPromoMessageCode(final String value)
	{
		setAffirmPromoMessageCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmPromoMessage.affirmPromotionMessage</code> attribute.
	 * @return the affirmPromotionMessage
	 */
	public String getAffirmPromotionMessage(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AFFIRMPROMOTIONMESSAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmPromoMessage.affirmPromotionMessage</code> attribute.
	 * @return the affirmPromotionMessage
	 */
	public String getAffirmPromotionMessage()
	{
		return getAffirmPromotionMessage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmPromoMessage.affirmPromotionMessage</code> attribute. 
	 * @param value the affirmPromotionMessage
	 */
	public void setAffirmPromotionMessage(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AFFIRMPROMOTIONMESSAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmPromoMessage.affirmPromotionMessage</code> attribute. 
	 * @param value the affirmPromotionMessage
	 */
	public void setAffirmPromotionMessage(final String value)
	{
		setAffirmPromotionMessage( getSession().getSessionContext(), value );
	}
	
}
