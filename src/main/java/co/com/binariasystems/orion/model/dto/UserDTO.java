package co.com.binariasystems.orion.model.dto;

import java.io.Serializable;
import java.util.Date;

import co.com.binariasystems.orion.model.enumerated.SN2Boolean;

public class UserDTO implements Serializable {
	private Integer userId;
    private String loginAlias;
    private UserCredentialsDTO credentials;
    private String identificationTypeCode;
    private String identificationNumber;
    private String fullName;
    private Date lastAccessDate;
    private String lastAccessIP;
    private String isoLanguageCode;
    private String emailAddress;
    private Integer failedRetries;
    private SN2Boolean isBlockedByMaxRetries;
    private Date blockingDate;
    private SN2Boolean isActive;
	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * @return the loginAlias
	 */
	public String getLoginAlias() {
		return loginAlias;
	}
	/**
	 * @param loginAlias the loginAlias to set
	 */
	public void setLoginAlias(String loginAlias) {
		this.loginAlias = loginAlias;
	}
	/**
	 * @return the credentials
	 */
	public UserCredentialsDTO getCredentials() {
		return credentials;
	}
	/**
	 * @param credentials the credentials to set
	 */
	public void setCredentials(UserCredentialsDTO credentials) {
		this.credentials = credentials;
	}
	/**
	 * @return the identificationTypeCode
	 */
	public String getIdentificationTypeCode() {
		return identificationTypeCode;
	}
	/**
	 * @param identificationTypeCode the identificationTypeCode to set
	 */
	public void setIdentificationTypeCode(String identificationTypeCode) {
		this.identificationTypeCode = identificationTypeCode;
	}
	/**
	 * @return the identificationNumber
	 */
	public String getIdentificationNumber() {
		return identificationNumber;
	}
	/**
	 * @param identificationNumber the identificationNumber to set
	 */
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * @return the lastAccessDate
	 */
	public Date getLastAccessDate() {
		return lastAccessDate;
	}
	/**
	 * @param lastAccessDate the lastAccessDate to set
	 */
	public void setLastAccessDate(Date lastAccessDate) {
		this.lastAccessDate = lastAccessDate;
	}
	/**
	 * @return the lastAccessIP
	 */
	public String getLastAccessIP() {
		return lastAccessIP;
	}
	/**
	 * @param lastAccessIP the lastAccessIP to set
	 */
	public void setLastAccessIP(String lastAccessIP) {
		this.lastAccessIP = lastAccessIP;
	}
	/**
	 * @return the isoLanguageCode
	 */
	public String getIsoLanguageCode() {
		return isoLanguageCode;
	}
	/**
	 * @param isoLanguageCode the isoLanguageCode to set
	 */
	public void setIsoLanguageCode(String isoLanguageCode) {
		this.isoLanguageCode = isoLanguageCode;
	}
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	/**
	 * @return the failedRetries
	 */
	public Integer getFailedRetries() {
		return failedRetries;
	}
	/**
	 * @param failedRetries the failedRetries to set
	 */
	public void setFailedRetries(Integer failedRetries) {
		this.failedRetries = failedRetries;
	}
	/**
	 * @return the isBlockedByMaxRetries
	 */
	public SN2Boolean getIsBlockedByMaxRetries() {
		return isBlockedByMaxRetries;
	}
	/**
	 * @param isBlockedByMaxRetries the isBlockedByMaxRetries to set
	 */
	public void setIsBlockedByMaxRetries(SN2Boolean isBlockedByMaxRetries) {
		this.isBlockedByMaxRetries = isBlockedByMaxRetries;
	}
	/**
	 * @return the blockingDate
	 */
	public Date getBlockingDate() {
		return blockingDate;
	}
	/**
	 * @param blockingDate the blockingDate to set
	 */
	public void setBlockingDate(Date blockingDate) {
		this.blockingDate = blockingDate;
	}
	/**
	 * @return the isActive
	 */
	public SN2Boolean getIsActive() {
		return isActive;
	}
	/**
	 * @param isActive the isActive to set
	 */
	public void setIsActive(SN2Boolean isActive) {
		this.isActive = isActive;
	}
    
}
