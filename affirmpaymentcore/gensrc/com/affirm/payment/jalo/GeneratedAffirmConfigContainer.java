/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Oct 19, 2022, 10:16:29 PM                   ---
 * ----------------------------------------------------------------
 */
package com.affirm.payment.jalo;

import com.affirm.payment.core.constants.AffirmpaymentcoreConstants;
import com.affirm.payment.jalo.AffirmPageConfig;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.affirm.payment.jalo.AffirmConfigContainer AffirmConfigContainer}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedAffirmConfigContainer extends GenericItem
{
	/** Qualifier of the <code>AffirmConfigContainer.affirmContainerCode</code> attribute **/
	public static final String AFFIRMCONTAINERCODE = "affirmContainerCode";
	/** Qualifier of the <code>AffirmConfigContainer.enabled</code> attribute **/
	public static final String ENABLED = "enabled";
	/** Qualifier of the <code>AffirmConfigContainer.authAndCapture</code> attribute **/
	public static final String AUTHANDCAPTURE = "authAndCapture";
	/** Qualifier of the <code>AffirmConfigContainer.modalMode</code> attribute **/
	public static final String MODALMODE = "modalMode";
	/** Qualifier of the <code>AffirmConfigContainer.affirmPublicKey</code> attribute **/
	public static final String AFFIRMPUBLICKEY = "affirmPublicKey";
	/** Qualifier of the <code>AffirmConfigContainer.affirmPublicKeyCA</code> attribute **/
	public static final String AFFIRMPUBLICKEYCA = "affirmPublicKeyCA";
	/** Qualifier of the <code>AffirmConfigContainer.affirmPrivateKey</code> attribute **/
	public static final String AFFIRMPRIVATEKEY = "affirmPrivateKey";
	/** Qualifier of the <code>AffirmConfigContainer.affirmPrivateKeyCA</code> attribute **/
	public static final String AFFIRMPRIVATEKEYCA = "affirmPrivateKeyCA";
	/** Qualifier of the <code>AffirmConfigContainer.sandboxMode</code> attribute **/
	public static final String SANDBOXMODE = "sandboxMode";
	/** Qualifier of the <code>AffirmConfigContainer.affirmPageConfig</code> attribute **/
	public static final String AFFIRMPAGECONFIG = "affirmPageConfig";
	/** Qualifier of the <code>AffirmConfigContainer.vcnMode</code> attribute **/
	public static final String VCNMODE = "vcnMode";
	/** Qualifier of the <code>AffirmConfigContainer.analyticsEnabled</code> attribute **/
	public static final String ANALYTICSENABLED = "analyticsEnabled";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(AFFIRMCONTAINERCODE, AttributeMode.INITIAL);
		tmp.put(ENABLED, AttributeMode.INITIAL);
		tmp.put(AUTHANDCAPTURE, AttributeMode.INITIAL);
		tmp.put(MODALMODE, AttributeMode.INITIAL);
		tmp.put(AFFIRMPUBLICKEY, AttributeMode.INITIAL);
		tmp.put(AFFIRMPUBLICKEYCA, AttributeMode.INITIAL);
		tmp.put(AFFIRMPRIVATEKEY, AttributeMode.INITIAL);
		tmp.put(AFFIRMPRIVATEKEYCA, AttributeMode.INITIAL);
		tmp.put(SANDBOXMODE, AttributeMode.INITIAL);
		tmp.put(AFFIRMPAGECONFIG, AttributeMode.INITIAL);
		tmp.put(VCNMODE, AttributeMode.INITIAL);
		tmp.put(ANALYTICSENABLED, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.affirmContainerCode</code> attribute.
	 * @return the affirmContainerCode
	 */
	public String getAffirmContainerCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AFFIRMCONTAINERCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.affirmContainerCode</code> attribute.
	 * @return the affirmContainerCode
	 */
	public String getAffirmContainerCode()
	{
		return getAffirmContainerCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.affirmContainerCode</code> attribute. 
	 * @param value the affirmContainerCode
	 */
	public void setAffirmContainerCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AFFIRMCONTAINERCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.affirmContainerCode</code> attribute. 
	 * @param value the affirmContainerCode
	 */
	public void setAffirmContainerCode(final String value)
	{
		setAffirmContainerCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.affirmPageConfig</code> attribute.
	 * @return the affirmPageConfig
	 */
	public Collection<AffirmPageConfig> getAffirmPageConfig(final SessionContext ctx)
	{
		Collection<AffirmPageConfig> coll = (Collection<AffirmPageConfig>)getProperty( ctx, AFFIRMPAGECONFIG);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.affirmPageConfig</code> attribute.
	 * @return the affirmPageConfig
	 */
	public Collection<AffirmPageConfig> getAffirmPageConfig()
	{
		return getAffirmPageConfig( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.affirmPageConfig</code> attribute. 
	 * @param value the affirmPageConfig
	 */
	public void setAffirmPageConfig(final SessionContext ctx, final Collection<AffirmPageConfig> value)
	{
		setProperty(ctx, AFFIRMPAGECONFIG,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.affirmPageConfig</code> attribute. 
	 * @param value the affirmPageConfig
	 */
	public void setAffirmPageConfig(final Collection<AffirmPageConfig> value)
	{
		setAffirmPageConfig( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.affirmPrivateKey</code> attribute.
	 * @return the affirmPrivateKey
	 */
	public String getAffirmPrivateKey(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AFFIRMPRIVATEKEY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.affirmPrivateKey</code> attribute.
	 * @return the affirmPrivateKey
	 */
	public String getAffirmPrivateKey()
	{
		return getAffirmPrivateKey( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.affirmPrivateKey</code> attribute. 
	 * @param value the affirmPrivateKey
	 */
	public void setAffirmPrivateKey(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AFFIRMPRIVATEKEY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.affirmPrivateKey</code> attribute. 
	 * @param value the affirmPrivateKey
	 */
	public void setAffirmPrivateKey(final String value)
	{
		setAffirmPrivateKey( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.affirmPrivateKeyCA</code> attribute.
	 * @return the affirmPrivateKeyCA
	 */
	public String getAffirmPrivateKeyCA(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AFFIRMPRIVATEKEYCA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.affirmPrivateKeyCA</code> attribute.
	 * @return the affirmPrivateKeyCA
	 */
	public String getAffirmPrivateKeyCA()
	{
		return getAffirmPrivateKeyCA( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.affirmPrivateKeyCA</code> attribute. 
	 * @param value the affirmPrivateKeyCA
	 */
	public void setAffirmPrivateKeyCA(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AFFIRMPRIVATEKEYCA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.affirmPrivateKeyCA</code> attribute. 
	 * @param value the affirmPrivateKeyCA
	 */
	public void setAffirmPrivateKeyCA(final String value)
	{
		setAffirmPrivateKeyCA( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.affirmPublicKey</code> attribute.
	 * @return the affirmPublicKey
	 */
	public String getAffirmPublicKey(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AFFIRMPUBLICKEY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.affirmPublicKey</code> attribute.
	 * @return the affirmPublicKey
	 */
	public String getAffirmPublicKey()
	{
		return getAffirmPublicKey( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.affirmPublicKey</code> attribute. 
	 * @param value the affirmPublicKey
	 */
	public void setAffirmPublicKey(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AFFIRMPUBLICKEY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.affirmPublicKey</code> attribute. 
	 * @param value the affirmPublicKey
	 */
	public void setAffirmPublicKey(final String value)
	{
		setAffirmPublicKey( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.affirmPublicKeyCA</code> attribute.
	 * @return the affirmPublicKeyCA
	 */
	public String getAffirmPublicKeyCA(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AFFIRMPUBLICKEYCA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.affirmPublicKeyCA</code> attribute.
	 * @return the affirmPublicKeyCA
	 */
	public String getAffirmPublicKeyCA()
	{
		return getAffirmPublicKeyCA( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.affirmPublicKeyCA</code> attribute. 
	 * @param value the affirmPublicKeyCA
	 */
	public void setAffirmPublicKeyCA(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AFFIRMPUBLICKEYCA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.affirmPublicKeyCA</code> attribute. 
	 * @param value the affirmPublicKeyCA
	 */
	public void setAffirmPublicKeyCA(final String value)
	{
		setAffirmPublicKeyCA( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.analyticsEnabled</code> attribute.
	 * @return the analyticsEnabled
	 */
	public Boolean isAnalyticsEnabled(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ANALYTICSENABLED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.analyticsEnabled</code> attribute.
	 * @return the analyticsEnabled
	 */
	public Boolean isAnalyticsEnabled()
	{
		return isAnalyticsEnabled( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.analyticsEnabled</code> attribute. 
	 * @return the analyticsEnabled
	 */
	public boolean isAnalyticsEnabledAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAnalyticsEnabled( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.analyticsEnabled</code> attribute. 
	 * @return the analyticsEnabled
	 */
	public boolean isAnalyticsEnabledAsPrimitive()
	{
		return isAnalyticsEnabledAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.analyticsEnabled</code> attribute. 
	 * @param value the analyticsEnabled
	 */
	public void setAnalyticsEnabled(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ANALYTICSENABLED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.analyticsEnabled</code> attribute. 
	 * @param value the analyticsEnabled
	 */
	public void setAnalyticsEnabled(final Boolean value)
	{
		setAnalyticsEnabled( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.analyticsEnabled</code> attribute. 
	 * @param value the analyticsEnabled
	 */
	public void setAnalyticsEnabled(final SessionContext ctx, final boolean value)
	{
		setAnalyticsEnabled( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.analyticsEnabled</code> attribute. 
	 * @param value the analyticsEnabled
	 */
	public void setAnalyticsEnabled(final boolean value)
	{
		setAnalyticsEnabled( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.authAndCapture</code> attribute.
	 * @return the authAndCapture
	 */
	public Boolean isAuthAndCapture(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, AUTHANDCAPTURE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.authAndCapture</code> attribute.
	 * @return the authAndCapture
	 */
	public Boolean isAuthAndCapture()
	{
		return isAuthAndCapture( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.authAndCapture</code> attribute. 
	 * @return the authAndCapture
	 */
	public boolean isAuthAndCaptureAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAuthAndCapture( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.authAndCapture</code> attribute. 
	 * @return the authAndCapture
	 */
	public boolean isAuthAndCaptureAsPrimitive()
	{
		return isAuthAndCaptureAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.authAndCapture</code> attribute. 
	 * @param value the authAndCapture
	 */
	public void setAuthAndCapture(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, AUTHANDCAPTURE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.authAndCapture</code> attribute. 
	 * @param value the authAndCapture
	 */
	public void setAuthAndCapture(final Boolean value)
	{
		setAuthAndCapture( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.authAndCapture</code> attribute. 
	 * @param value the authAndCapture
	 */
	public void setAuthAndCapture(final SessionContext ctx, final boolean value)
	{
		setAuthAndCapture( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.authAndCapture</code> attribute. 
	 * @param value the authAndCapture
	 */
	public void setAuthAndCapture(final boolean value)
	{
		setAuthAndCapture( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.enabled</code> attribute.
	 * @return the enabled
	 */
	public Boolean isEnabled(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ENABLED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.enabled</code> attribute.
	 * @return the enabled
	 */
	public Boolean isEnabled()
	{
		return isEnabled( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.enabled</code> attribute. 
	 * @return the enabled
	 */
	public boolean isEnabledAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isEnabled( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.enabled</code> attribute. 
	 * @return the enabled
	 */
	public boolean isEnabledAsPrimitive()
	{
		return isEnabledAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.enabled</code> attribute. 
	 * @param value the enabled
	 */
	public void setEnabled(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ENABLED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.enabled</code> attribute. 
	 * @param value the enabled
	 */
	public void setEnabled(final Boolean value)
	{
		setEnabled( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.enabled</code> attribute. 
	 * @param value the enabled
	 */
	public void setEnabled(final SessionContext ctx, final boolean value)
	{
		setEnabled( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.enabled</code> attribute. 
	 * @param value the enabled
	 */
	public void setEnabled(final boolean value)
	{
		setEnabled( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.modalMode</code> attribute.
	 * @return the modalMode
	 */
	public Boolean isModalMode(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, MODALMODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.modalMode</code> attribute.
	 * @return the modalMode
	 */
	public Boolean isModalMode()
	{
		return isModalMode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.modalMode</code> attribute. 
	 * @return the modalMode
	 */
	public boolean isModalModeAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isModalMode( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.modalMode</code> attribute. 
	 * @return the modalMode
	 */
	public boolean isModalModeAsPrimitive()
	{
		return isModalModeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.modalMode</code> attribute. 
	 * @param value the modalMode
	 */
	public void setModalMode(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, MODALMODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.modalMode</code> attribute. 
	 * @param value the modalMode
	 */
	public void setModalMode(final Boolean value)
	{
		setModalMode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.modalMode</code> attribute. 
	 * @param value the modalMode
	 */
	public void setModalMode(final SessionContext ctx, final boolean value)
	{
		setModalMode( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.modalMode</code> attribute. 
	 * @param value the modalMode
	 */
	public void setModalMode(final boolean value)
	{
		setModalMode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.sandboxMode</code> attribute.
	 * @return the sandboxMode
	 */
	public Boolean isSandboxMode(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SANDBOXMODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.sandboxMode</code> attribute.
	 * @return the sandboxMode
	 */
	public Boolean isSandboxMode()
	{
		return isSandboxMode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.sandboxMode</code> attribute. 
	 * @return the sandboxMode
	 */
	public boolean isSandboxModeAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSandboxMode( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.sandboxMode</code> attribute. 
	 * @return the sandboxMode
	 */
	public boolean isSandboxModeAsPrimitive()
	{
		return isSandboxModeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.sandboxMode</code> attribute. 
	 * @param value the sandboxMode
	 */
	public void setSandboxMode(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SANDBOXMODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.sandboxMode</code> attribute. 
	 * @param value the sandboxMode
	 */
	public void setSandboxMode(final Boolean value)
	{
		setSandboxMode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.sandboxMode</code> attribute. 
	 * @param value the sandboxMode
	 */
	public void setSandboxMode(final SessionContext ctx, final boolean value)
	{
		setSandboxMode( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.sandboxMode</code> attribute. 
	 * @param value the sandboxMode
	 */
	public void setSandboxMode(final boolean value)
	{
		setSandboxMode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.vcnMode</code> attribute.
	 * @return the vcnMode
	 */
	public Boolean isVcnMode(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, VCNMODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.vcnMode</code> attribute.
	 * @return the vcnMode
	 */
	public Boolean isVcnMode()
	{
		return isVcnMode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.vcnMode</code> attribute. 
	 * @return the vcnMode
	 */
	public boolean isVcnModeAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isVcnMode( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AffirmConfigContainer.vcnMode</code> attribute. 
	 * @return the vcnMode
	 */
	public boolean isVcnModeAsPrimitive()
	{
		return isVcnModeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.vcnMode</code> attribute. 
	 * @param value the vcnMode
	 */
	public void setVcnMode(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, VCNMODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.vcnMode</code> attribute. 
	 * @param value the vcnMode
	 */
	public void setVcnMode(final Boolean value)
	{
		setVcnMode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.vcnMode</code> attribute. 
	 * @param value the vcnMode
	 */
	public void setVcnMode(final SessionContext ctx, final boolean value)
	{
		setVcnMode( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AffirmConfigContainer.vcnMode</code> attribute. 
	 * @param value the vcnMode
	 */
	public void setVcnMode(final boolean value)
	{
		setVcnMode( getSession().getSessionContext(), value );
	}
	
}
