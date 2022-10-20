/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Oct 19, 2022, 10:16:29 PM                   ---
 * ----------------------------------------------------------------
 */
package com.affirm.payment.jalo;

import com.affirm.payment.core.constants.AffirmpaymentcoreConstants;
import com.affirm.payment.jalo.AffirmPromoMessage;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.affirm.payment.jalo.AffirmPageConfig AffirmPageConfig}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedAffirmPageConfig extends GenericItem
{
	/** Qualifier of the <code>AffirmPageConfig.affirmConfigCode</code> attribute **/
	public static final String AFFIRMCONFIGCODE = "affirmConfigCode";
	/** Qualifier of the <code>AffirmPageConfig.affirmPromoMessageList</code> attribute **/
	public static final String AFFIRMPROMOMESSAGELIST = "affirmPromoMessageList";
	/** Qualifier of the <code>AffirmPageConfig.showAffirmPromotionFlag</code> attribute **/
	public static final String SHOWAFFIRMPROMOTIONFLAG = "showAffirmPromotionFlag";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(AFFIRMCONFIGCODE, AttributeMode.INITIAL);
		tmp.put(AFFIRMPROMOMESSAGELIST, AttributeMode.INITIAL);
		tmp.put(SHOWAFFIRMPROMOTIONFLAG, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmPageConfig.affirmConfigCode</code> attribute.
	 * @return the affirmConfigCode
	 */
	public String getAffirmConfigCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AFFIRMCONFIGCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmPageConfig.affirmConfigCode</code> attribute.
	 * @return the affirmConfigCode
	 */
	public String getAffirmConfigCode()
	{
		return getAffirmConfigCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmPageConfig.affirmConfigCode</code> attribute. 
	 * @param value the affirmConfigCode
	 */
	public void setAffirmConfigCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AFFIRMCONFIGCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmPageConfig.affirmConfigCode</code> attribute. 
	 * @param value the affirmConfigCode
	 */
	public void setAffirmConfigCode(final String value)
	{
		setAffirmConfigCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmPageConfig.affirmPromoMessageList</code> attribute.
	 * @return the affirmPromoMessageList
	 */
	public Collection<AffirmPromoMessage> getAffirmPromoMessageList(final SessionContext ctx)
	{
		Collection<AffirmPromoMessage> coll = (Collection<AffirmPromoMessage>)getProperty( ctx, AFFIRMPROMOMESSAGELIST);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmPageConfig.affirmPromoMessageList</code> attribute.
	 * @return the affirmPromoMessageList
	 */
	public Collection<AffirmPromoMessage> getAffirmPromoMessageList()
	{
		return getAffirmPromoMessageList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmPageConfig.affirmPromoMessageList</code> attribute. 
	 * @param value the affirmPromoMessageList
	 */
	public void setAffirmPromoMessageList(final SessionContext ctx, final Collection<AffirmPromoMessage> value)
	{
		setProperty(ctx, AFFIRMPROMOMESSAGELIST,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmPageConfig.affirmPromoMessageList</code> attribute. 
	 * @param value the affirmPromoMessageList
	 */
	public void setAffirmPromoMessageList(final Collection<AffirmPromoMessage> value)
	{
		setAffirmPromoMessageList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmPageConfig.showAffirmPromotionFlag</code> attribute.
	 * @return the showAffirmPromotionFlag
	 */
	public Boolean isShowAffirmPromotionFlag(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SHOWAFFIRMPROMOTIONFLAG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmPageConfig.showAffirmPromotionFlag</code> attribute.
	 * @return the showAffirmPromotionFlag
	 */
	public Boolean isShowAffirmPromotionFlag()
	{
		return isShowAffirmPromotionFlag( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmPageConfig.showAffirmPromotionFlag</code> attribute. 
	 * @return the showAffirmPromotionFlag
	 */
	public boolean isShowAffirmPromotionFlagAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isShowAffirmPromotionFlag( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmPageConfig.showAffirmPromotionFlag</code> attribute. 
	 * @return the showAffirmPromotionFlag
	 */
	public boolean isShowAffirmPromotionFlagAsPrimitive()
	{
		return isShowAffirmPromotionFlagAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmPageConfig.showAffirmPromotionFlag</code> attribute. 
	 * @param value the showAffirmPromotionFlag
	 */
	public void setShowAffirmPromotionFlag(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SHOWAFFIRMPROMOTIONFLAG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmPageConfig.showAffirmPromotionFlag</code> attribute. 
	 * @param value the showAffirmPromotionFlag
	 */
	public void setShowAffirmPromotionFlag(final Boolean value)
	{
		setShowAffirmPromotionFlag( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmPageConfig.showAffirmPromotionFlag</code> attribute. 
	 * @param value the showAffirmPromotionFlag
	 */
	public void setShowAffirmPromotionFlag(final SessionContext ctx, final boolean value)
	{
		setShowAffirmPromotionFlag( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmPageConfig.showAffirmPromotionFlag</code> attribute. 
	 * @param value the showAffirmPromotionFlag
	 */
	public void setShowAffirmPromotionFlag(final boolean value)
	{
		setShowAffirmPromotionFlag( getSession().getSessionContext(), value );
	}
	
}
