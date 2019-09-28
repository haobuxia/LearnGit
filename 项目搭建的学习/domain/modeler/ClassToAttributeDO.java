package edu.thss.platform.domain.modeler;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ClassToAttribute
 * 
 */
@Entity
@Table(name = "PLT_MDL_R_Class2Attribute")
public class ClassToAttributeDO implements Serializable {

	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Id
	@Column(name = "PLT_oid",columnDefinition="varchar(32)")
	private String id;

	@Column(name = "PLT_className", columnDefinition = "varchar(20)")
	private String className;

	@Column(name = "PLT_attributeName", columnDefinition = "varchar(20)")
	private String attributeName;

	@Column(name = "PLT_defaultValue", columnDefinition = "varchar(50)")
	private String defaultValue;

	@Column(name = "PLT_visible")
	private boolean visible = true;

	@Column(name = "PLT_editable")
	private boolean editable = true;

	@Column(name = "PLT_viewControl", columnDefinition = "varchar(50)")
	private String viewControl;
	
	@Column(name = "PLT_isUnique")
	private Boolean isUnique = false;
	private static final long serialVersionUID = 1L;

	@JsonIgnore
	@Column(name = "plt_modifytime", columnDefinition = "timestamp not null default now()")
	@ApiModelProperty(value = "更新时间")
	private Date modifyTime = new Date();

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public ClassToAttributeDO() {
		super();
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getAttributeName() {
		return this.attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getDefaultValue() {
		return this.defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public boolean getVisible() {
		return this.visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public boolean getEditable() {
		return this.editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	public String getViewControl() {
		return this.viewControl;
	}

	public void setViewControl(String viewControl) {
		this.viewControl = viewControl;
	}

	public void setIsUnique(Boolean isUnique) {
		this.isUnique = isUnique;
	}

	public Boolean getIsUnique() {
		return isUnique;
	}

}
