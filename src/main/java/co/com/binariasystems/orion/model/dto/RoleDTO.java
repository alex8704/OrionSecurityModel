package co.com.binariasystems.orion.model.dto;


public class RoleDTO {
    private Integer rolId;
    private String name;
    private String description;
    private ApplicationDTO application;
	/**
	 * @return the rolId
	 */
	public Integer getRolId() {
		return rolId;
	}
	/**
	 * @param rolId the rolId to set
	 */
	public void setRolId(Integer rolId) {
		this.rolId = rolId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the application
	 */
	public ApplicationDTO getApplication() {
		return application;
	}
	/**
	 * @param application the application to set
	 */
	public void setApplication(ApplicationDTO application) {
		this.application = application;
	}
    
}
