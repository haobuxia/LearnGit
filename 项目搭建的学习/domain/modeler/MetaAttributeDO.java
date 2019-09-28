package edu.thss.platform.domain.modeler;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import edu.thss.platform.domain.modeler.valuetype.AttributeCategory;
import edu.thss.platform.domain.modeler.valuetype.AttributeValueType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;

/**
 * Entity implementation class for Entity: MetaAttributeBO
 * 
 */
@ApiModel(description = "属性元信息")
@Entity
@Table(name = "PLT_MDL_MetaAttribute")
public class MetaAttributeDO implements Serializable {

    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
	@Id
	@Column(name = "PLT_oid",columnDefinition="varchar(32)")
	private String id;

	@ApiModelProperty(value = "属性英文名", example = "actorId")
	@Column(name = "PLT_attributeName", columnDefinition = "varchar(20)")
	private String attributeName;

	@ApiModelProperty(value = "属性显示名, 一般为中文", example = "任务执行人")
	@Column(name = "PLT_displayName", columnDefinition = "varchar(50)")
	private String displayName;

	@ApiModelProperty(value = "枚举类型: 表示此属性是常量还是变量", example = "Variable")
	@Column(name = "PLT_attributeCategory", columnDefinition = "varchar(20)")
	@Enumerated(EnumType.STRING)
	private AttributeCategory attributeCategory;

	@ApiModelProperty(value = "枚举类型: 字段取值类型", example = "String")
	@Column(name = "PLT_valueType", columnDefinition = "varchar(20)")
	private String valueType;

	@ApiModelProperty(value = "字段取值最大字节长度", example = "50")
	@Column(name = "PLT_valueLength")
	private Integer valueLength;

	@ApiModelProperty(value = "表示此属性是否可空", example = "true")
	@Column(name = "PLT_nullable")
	private Boolean nullable = true;

	@ApiModelProperty(value = "此属性的默认值", example = "0")
	@Column(name = "PLT_defaultValue", columnDefinition = "varchar(50)")
	private String defaultValue;

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

	public MetaAttributeDO() {
		super();
	}

	public Integer getValueLength() {
		return this.valueLength;
	}

	public void setValueLength(Integer valueLength) {
		this.valueLength = valueLength;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAttributeName() {
		return this.attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public AttributeCategory  getAttributeCategory() {
		return this.attributeCategory;
	}

	public void setAttributeCategory(AttributeCategory  attributeCategory) {
		this.attributeCategory = attributeCategory;
	}

	public String getDefaultValue() {
		return this.defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public void setNullable(Boolean nullable) {
		this.nullable = nullable;
	}

	public Boolean getNullable() {
		return nullable;
	}

	public String getValueType() {
		return valueType;
	}

	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
}
