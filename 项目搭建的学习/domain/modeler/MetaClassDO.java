package edu.thss.platform.domain.modeler;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import edu.thss.platform.domain.modeler.valuetype.ClassCategory;
import edu.thss.platform.domain.modeler.valuetype.ClassType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;

/**
 * Entity implementation class for Entity: MetaClassDO
 * 
 */
@ApiModel(description = "模型类元信息")
@Entity
@Table(name = "PLT_MDL_MetaClass")
public class MetaClassDO implements Serializable {

	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@ApiModelProperty(value = "类的ID")
	@Column(name = "PLT_oid",columnDefinition="varchar(32)")
    @Id
	private String id;

	@ApiModelProperty(value = "类的英文名. 由于操作也是继承于此结构,因此在表示操作的对象中,此字段即为操作名",
			example = "UserTest")
	@Column(name = "PLT_className", columnDefinition = "varchar")
	private String className;

	@ApiModelProperty(value = "类的显示名", example = "测试用户类")
	@Column(name = "PLT_displayName", columnDefinition = "varchar(50)")
	private String displayName;

	@ApiModelProperty(value = "持久类或动态类，在DWF3.0中此字段将作废", example = "PersistentClass")
	@Column(name = "PLT_classType", columnDefinition = "varchar(20)")
	@Enumerated(EnumType.STRING)
	private ClassType classType = ClassType.PersistentClass;

	@ApiModelProperty(value = "表示当前类是实体类、关联类、资源类或是模块类和操作", example = "ItemClass")
	@Column(name = "PLT_classCategory", columnDefinition = "varchar(20)")
	@Enumerated(EnumType.STRING)
	private ClassCategory classCategory;

	@ApiModelProperty(value = "表示当前类的父类", example = "ItemClass")
	@Column(name = "PLT_parentClass", columnDefinition = "varchar(20)")
	private String parentClass;

	@ApiModelProperty(value = "表示当前类是否是系统类", example = "false")
	@Column(name = "PLT_isSystem")
	private boolean isSystem = false;

	@ApiModelProperty(value = "状态，目前此字段含义不确定，属于保留字段")
	@Column(name = "PLT_state")
	private Integer state = 0;

	@ApiModelProperty(value = "扩展字段，根据不同的类的类型，可自定义存储相应内容：模块类存储的是图标名；外部实体类存储的是属性映射信息")
	@Column(name = "PLT_packagePath", columnDefinition = "text")
	private String packagePath;

	@ApiModelProperty(value = "自定义的域名", example = "CUS")
	@Column(name = "PLT_zoneName", columnDefinition = "varchar")
	private String zoneName;

	@JsonIgnore
	@Column(name = "plt_modifytime", columnDefinition = "timestamp not null default now()")
	@ApiModelProperty(value = "更新时间")
	private Date modifyTime = new Date();

	@ApiModelProperty(value = "应用ID，此字段只对module类型的有意义")
	@Column(name = "PLT_appId", columnDefinition = "varchar(50) default ''")
	private String appId = "";

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	private static final long serialVersionUID = 1L;

	public MetaClassDO() {
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

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public ClassType getClassType() {
		return this.classType;
	}

	public void setClassType(ClassType classType) {
		this.classType = classType;
	}

	public ClassCategory getClassCategory() {
		return this.classCategory;
	}

	public void setClassCategory(ClassCategory classCategory) {
		this.classCategory = classCategory;
	}

	public String getParentClass() {
		return this.parentClass;
	}

	public void setParentClass(String parentClass) {
		this.parentClass = parentClass;
	}

	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getState() {
		return state;
	}

	public void setPackagePath(String packagePath) {
		this.packagePath = packagePath;
	}

	public String getPackagePath() {
		return packagePath;
	}

	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}

	public String getZoneName() {
		return zoneName;
	}

}
