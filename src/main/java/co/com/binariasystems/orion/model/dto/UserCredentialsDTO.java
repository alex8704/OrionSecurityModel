package co.com.binariasystems.orion.model.dto;

import java.io.Serializable;


public class UserCredentialsDTO implements Serializable {
	private String password;
    private String passwordSalt;
    
	public UserCredentialsDTO() {
	}
	public UserCredentialsDTO(String password, String passwordSalt) {
		this.password = password;
		this.passwordSalt = passwordSalt;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the passwordSalt
	 */
	public String getPasswordSalt() {
		return passwordSalt;
	}
	/**
	 * @param passwordSalt the passwordSalt to set
	 */
	public void setPasswordSalt(String passwordSalt) {
		this.passwordSalt = passwordSalt;
	}
    
}
