package co.com.binariasystems.orion.model.dto;

import java.io.Serializable;


public class ModuleDTO implements Serializable {
    private Integer moduleId;
    private String name;
    private String description;
    private ModuleDTO parentModule;
    private ApplicationDTO applicationId;
	/**
	 * @return the moduleId
	 */
	public Integer getModuleId() {
		return moduleId;
	}
	/**
	 * @param moduleId the moduleId to set
	 */
	public void setModuleId(Integer moduleId) {
		this.moduleId = moduleId;
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
	 * @return the parentModule
	 */
	public ModuleDTO getParentModule() {
		return parentModule;
	}
	/**
	 * @param parentModule the parentModule to set
	 */
	public void setParentModule(ModuleDTO parentModule) {
		this.parentModule = parentModule;
	}
	/**
	 * @return the applicationId
	 */
	public ApplicationDTO getApplicationId() {
		return applicationId;
	}
	/**
	 * @param applicationId the applicationId to set
	 */
	public void setApplicationId(ApplicationDTO applicationId) {
		this.applicationId = applicationId;
	}
    
}
