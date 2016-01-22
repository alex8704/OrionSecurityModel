package co.com.binariasystems.orion.model.dto;


public class ResourceDTO {
    private Integer resourceId;
    private String resourcePath;
    private String name;
    private String description;
    private ModuleDTO module;
    private ApplicationDTO application;
	/**
	 * @return the resourceId
	 */
	public Integer getResourceId() {
		return resourceId;
	}
	/**
	 * @param resourceId the resourceId to set
	 */
	public void setResourceId(Integer resourceId) {
		this.resourceId = resourceId;
	}
	/**
	 * @return the resourcePath
	 */
	public String getResourcePath() {
		return resourcePath;
	}
	/**
	 * @param resourcePath the resourcePath to set
	 */
	public void setResourcePath(String resourcePath) {
		this.resourcePath = resourcePath;
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
	 * @return the module
	 */
	public ModuleDTO getModule() {
		return module;
	}
	/**
	 * @param module the module to set
	 */
	public void setModule(ModuleDTO module) {
		this.module = module;
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
