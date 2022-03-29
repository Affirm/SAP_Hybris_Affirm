/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 28 Jan 2020, 23:09:53                       ---
 * ----------------------------------------------------------------
 */
package com.affirm.payment.core.jalo;

import com.affirm.payment.core.constants.AffirmpaymentcoreConstants;
import com.affirm.payment.jalo.AffirmConfigContainer;
import com.affirm.payment.jalo.AffirmPageConfig;
import com.affirm.payment.jalo.AffirmPaymentTransactionEntry;
import com.affirm.payment.jalo.AffirmPromoMessage;
import com.affirm.payment.jalo.PaymentThreshold;
import de.hybris.platform.basecommerce.jalo.site.BaseSite;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.order.payment.AffirmPaymentInfo;
import de.hybris.platform.jalo.order.payment.PaymentInfo;
import de.hybris.platform.jalo.order.payment.PaymentMode;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>AffirmpaymentcoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedAffirmpaymentcoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("affirmConfigContainer", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.basecommerce.jalo.site.BaseSite", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("thresholds", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.payment.PaymentMode", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("affirmVCNId", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.payment.PaymentInfo", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.affirmConfigContainer</code> attribute.
	 * @return the affirmConfigContainer
	 */
	public AffirmConfigContainer getAffirmConfigContainer(final SessionContext ctx, final BaseSite item)
	{
		return (AffirmConfigContainer)item.getProperty( ctx, AffirmpaymentcoreConstants.Attributes.BaseSite.AFFIRMCONFIGCONTAINER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseSite.affirmConfigContainer</code> attribute.
	 * @return the affirmConfigContainer
	 */
	public AffirmConfigContainer getAffirmConfigContainer(final BaseSite item)
	{
		return getAffirmConfigContainer( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BaseSite.affirmConfigContainer</code> attribute. 
	 * @param value the affirmConfigContainer
	 */
	public void setAffirmConfigContainer(final SessionContext ctx, final BaseSite item, final AffirmConfigContainer value)
	{
		item.setProperty(ctx, AffirmpaymentcoreConstants.Attributes.BaseSite.AFFIRMCONFIGCONTAINER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BaseSite.affirmConfigContainer</code> attribute. 
	 * @param value the affirmConfigContainer
	 */
	public void setAffirmConfigContainer(final BaseSite item, final AffirmConfigContainer value)
	{
		setAffirmConfigContainer( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardPaymentInfo.affirmVCNId</code> attribute.
	 * @return the affirmVCNId - Determines whether the subscription ID has been validated.
	 */
	public String getAffirmVCNId(final SessionContext ctx, final PaymentInfo item)
	{
		return (String)item.getProperty( ctx, AffirmpaymentcoreConstants.Attributes.CreditCardPaymentInfo.AFFIRMVCNID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardPaymentInfo.affirmVCNId</code> attribute.
	 * @return the affirmVCNId - Determines whether the subscription ID has been validated.
	 */
	public String getAffirmVCNId(final PaymentInfo item)
	{
		return getAffirmVCNId( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardPaymentInfo.affirmVCNId</code> attribute. 
	 * @param value the affirmVCNId - Determines whether the subscription ID has been validated.
	 */
	public void setAffirmVCNId(final SessionContext ctx, final PaymentInfo item, final String value)
	{
		item.setProperty(ctx, AffirmpaymentcoreConstants.Attributes.CreditCardPaymentInfo.AFFIRMVCNID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardPaymentInfo.affirmVCNId</code> attribute. 
	 * @param value the affirmVCNId - Determines whether the subscription ID has been validated.
	 */
	public void setAffirmVCNId(final PaymentInfo item, final String value)
	{
		setAffirmVCNId( getSession().getSessionContext(), item, value );
	}
	
	public AffirmConfigContainer createAffirmConfigContainer(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AffirmpaymentcoreConstants.TC.AFFIRMCONFIGCONTAINER );
			return (AffirmConfigContainer)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AffirmConfigContainer : "+e.getMessage(), 0 );
		}
	}
	
	public AffirmConfigContainer createAffirmConfigContainer(final Map attributeValues)
	{
		return createAffirmConfigContainer( getSession().getSessionContext(), attributeValues );
	}
	
	public AffirmPageConfig createAffirmPageConfig(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AffirmpaymentcoreConstants.TC.AFFIRMPAGECONFIG );
			return (AffirmPageConfig)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AffirmPageConfig : "+e.getMessage(), 0 );
		}
	}
	
	public AffirmPageConfig createAffirmPageConfig(final Map attributeValues)
	{
		return createAffirmPageConfig( getSession().getSessionContext(), attributeValues );
	}
	
	public AffirmPaymentInfo createAffirmPaymentInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AffirmpaymentcoreConstants.TC.AFFIRMPAYMENTINFO );
			return (AffirmPaymentInfo)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AffirmPaymentInfo : "+e.getMessage(), 0 );
		}
	}
	
	public AffirmPaymentInfo createAffirmPaymentInfo(final Map attributeValues)
	{
		return createAffirmPaymentInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public AffirmPaymentTransactionEntry createAffirmPaymentTransactionEntry(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AffirmpaymentcoreConstants.TC.AFFIRMPAYMENTTRANSACTIONENTRY );
			return (AffirmPaymentTransactionEntry)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AffirmPaymentTransactionEntry : "+e.getMessage(), 0 );
		}
	}
	
	public AffirmPaymentTransactionEntry createAffirmPaymentTransactionEntry(final Map attributeValues)
	{
		return createAffirmPaymentTransactionEntry( getSession().getSessionContext(), attributeValues );
	}
	
	public AffirmPromoMessage createAffirmPromoMessage(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AffirmpaymentcoreConstants.TC.AFFIRMPROMOMESSAGE );
			return (AffirmPromoMessage)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AffirmPromoMessage : "+e.getMessage(), 0 );
		}
	}
	
	public AffirmPromoMessage createAffirmPromoMessage(final Map attributeValues)
	{
		return createAffirmPromoMessage( getSession().getSessionContext(), attributeValues );
	}
	
	public PaymentThreshold createPaymentThreshold(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AffirmpaymentcoreConstants.TC.PAYMENTTHRESHOLD );
			return (PaymentThreshold)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating PaymentThreshold : "+e.getMessage(), 0 );
		}
	}
	
	public PaymentThreshold createPaymentThreshold(final Map attributeValues)
	{
		return createPaymentThreshold( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return AffirmpaymentcoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentMode.thresholds</code> attribute.
	 * @return the thresholds
	 */
	public Collection<PaymentThreshold> getThresholds(final SessionContext ctx, final PaymentMode item)
	{
		Collection<PaymentThreshold> coll = (Collection<PaymentThreshold>)item.getProperty( ctx, AffirmpaymentcoreConstants.Attributes.PaymentMode.THRESHOLDS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentMode.thresholds</code> attribute.
	 * @return the thresholds
	 */
	public Collection<PaymentThreshold> getThresholds(final PaymentMode item)
	{
		return getThresholds( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentMode.thresholds</code> attribute. 
	 * @param value the thresholds
	 */
	public void setThresholds(final SessionContext ctx, final PaymentMode item, final Collection<PaymentThreshold> value)
	{
		item.setProperty(ctx, AffirmpaymentcoreConstants.Attributes.PaymentMode.THRESHOLDS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentMode.thresholds</code> attribute. 
	 * @param value the thresholds
	 */
	public void setThresholds(final PaymentMode item, final Collection<PaymentThreshold> value)
	{
		setThresholds( getSession().getSessionContext(), item, value );
	}
	
}
