package co.com.binariasystems.orion.model.dto;

import java.io.Serializable;

public class AuthenticationDTO implements Serializable {
	private String username;
	private String password;
	private Boolean rememberMe;
	private String applicationCode;
	
	public AuthenticationDTO(){}
	
	public AuthenticationDTO(String username, String password, Boolean rememberMe, String applicationCode) {
		this.username = username;
		this.password = password;
		this.rememberMe = rememberMe;
		this.applicationCode = applicationCode;
	}

	public AuthenticationDTO(String username, String password, String applicationCode) {
		super();
		this.username = username;
		this.password = password;
		this.applicationCode = applicationCode;
	}
	
	public AuthenticationDTO(String username, String applicationCode) {
		this.username = username;
		this.applicationCode = applicationCode;
	}

	public AuthenticationDTO(String username, String password, Boolean rememberMe) {
		super();
		this.username = username;
		this.password = password;
		this.rememberMe = rememberMe;
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getRememberMe() {
		return rememberMe;
	}

	public void setRememberMe(Boolean rememberMe) {
		this.rememberMe = rememberMe;
	}

	/**
	 * @return the applicationCode
	 */
	public String getApplicationCode() {
		return applicationCode;
	}

	/**
	 * @param applicationCode the applicationCode to set
	 */
	public void setApplicationCode(String applicationCode) {
		this.applicationCode = applicationCode;
	}
	
	
}
