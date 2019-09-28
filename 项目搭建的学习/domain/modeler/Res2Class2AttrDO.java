package edu.thss.platform.domain.modeler;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;

import javax.persistence.*;

@ApiModel(description = "资源绑定信息模型")
@Entity
@Table(name = "PLT_MDL_R_Res2Class2Attr")
public class Res2Class2AttrDO implements Serializable {
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@ApiModelProperty(value = "被绑定了资源的属性的英文名", example = "dataSource")
	@Column(name = "PLT_attrName", columnDefinition = "varchar(20)")
	private String attrName;

	@ApiModelProperty(value = "回填格式, 即回填到数据库中的字段定义")
	@Column(name = "PLT_backFormat", columnDefinition = "varchar(200)")
	private String backFormat;

	@ApiModelProperty(value = "被绑定了资源的类的英文名", example = "DataSet")
	@Column(name = "PLT_className", columnDefinition = "varchar(20)")
	private String className;

	@ApiModelProperty(value = "显示格式, 即在视图上显示的字段定义")
	@Column(name = "PLT_displayFormat", columnDefinition = "varchar(200)")
	private String displayFormat;

	@ApiModelProperty(value = "联动组号", example = "1")
	@Column(name = "PLT_groupId", columnDefinition = "varchar(20)")
	private String groupId;

	@ApiModelProperty(value = "绑定信息的id")
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "PLT_oid", columnDefinition = "varchar(32)")
	private String id;

	@ApiModelProperty(value = "是否允许编辑", example = "false")
	@Column(name = "PLT_isWrite")
	private boolean isWrite;

	@ApiModelProperty(value = "在资源点选框中显示的字段的定义, 格式: aaa distinct, bbb distinct,", example = "plt_type distinct,")
	@Column(name = "PLT_viewFormat", columnDefinition = "varchar(200)")
	private String viewFormat;

	@ApiModelProperty(value = "是否允许多选", example = "false")
	@Column(name = "PLT_multiChoose")
	private boolean multiChoose;

	@ApiModelProperty(value = "绑定的资源类名", example = "RscUser")
	@Column(name = "PLT_resourceName", columnDefinition = "varchar(20)")
	private String resourceName;

	@ApiModelProperty(value = "分隔符", example = ",")
	@Column(name = "PLT_separator", columnDefinition = "varchar(10)")
	private String separator;

	public String getAttrName() {
		return attrName;
	}

	public String getBackFormat() {
		return backFormat;
	}

	public String getClassName() {
		return className;
	}

	public String getDisplayFormat() {
		return displayFormat;
	}

	public String getGroupId() {
		return groupId;
	}

	public String getId() {
		return id;
	}

	public String getResourceName() {
		return resourceName;
	}

	public String getSeparator() {
		return separator;
	}

	public boolean hasDisplayFormat() {
		return displayFormat != null;
	}

	public boolean hasGroup() {
		return groupId != null;
	}

	public boolean hasViewFormat() {
		return viewFormat != null;
	}

	public boolean isMultiChoose() {
		return multiChoose;
	}

	public boolean isWrite() {
		return isWrite;
	}

	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public void setBackFormat(String backFormat) {
		this.backFormat = backFormat;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public void setDisplayFormat(String displayFormat) {
		this.displayFormat = displayFormat;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setMultiChoose(boolean multiChoose) {
		this.multiChoose = multiChoose;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public void setSeparator(String separator) {
		this.separator = separator;
	}

	public void setWrite(boolean isWrite) {
		this.isWrite = isWrite;
	}

	public void setViewFormat(String viewFormat) {
		this.viewFormat = viewFormat;
	}

	public String getViewFormat() {
		return viewFormat;
	}
}
