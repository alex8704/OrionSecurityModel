package co.com.binariasystems.orion.model.dto;

import java.io.Serializable;

import co.com.binariasystems.fmw.util.ObjectUtils.UpperTransform;
import co.com.binariasystems.orion.model.enumerated.Application;

public class ApplicationDTO implements Serializable {
    private Integer applicationId;
    @UpperTransform
    private Application applicationCode;
    private String name;
    @UpperTransform
    private String description;
	/**
	 * @return the applicationId
	 */
	public Integer getApplicationId() {
		return applicationId;
	}
	/**
	 * @param applicationId the applicationId to set
	 */
	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}
	/**
	 * @return the applicationCode
	 */
	public Application getApplicationCode() {
		return applicationCode;
	}
	/**
	 * @param applicationCode the applicationCode to set
	 */
	public void setApplicationCode(Application applicationCode) {
		this.applicationCode = applicationCode;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((applicationCode == null) ? 0 : applicationCode.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplicationDTO other = (ApplicationDTO) obj;
		if (applicationCode != other.applicationCode)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
    
	
}
