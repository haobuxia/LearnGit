package edu.thss.platform.domain.modeler;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "PLT_MDL_R_Oper2C2V")
public class Oper2C2VDO {
	private static final long serialVersionUID = 1L;

	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Id
	@Column(name = "PLT_oid",columnDefinition="varchar(32)")
	private String id;
	
	@Column(name = "PLT_operName", columnDefinition = "varchar(20)")
	private String operName;
	
	@Column(name = "PLT_diplayName", columnDefinition = "varchar(50)")
	private String diplayName;
	
	@Column(name = "PLT_path", columnDefinition = "varchar(150)")
	private String path;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOperName() {
		return operName;
	}

	public void setOperName(String operName) {
		this.operName = operName;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getViewName() {
		return viewName;
	}

	public void setViewName(String viewName) {
		this.viewName = viewName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getRelName() {
		return relName;
	}

	public void setRelName(String relName) {
		this.relName = relName;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setInherited(boolean isInherited) {
		this.isInherited = isInherited;
	}

	public boolean isInherited() {
		return isInherited;
	}

	public void setDiplayName(String diplayName) {
		this.diplayName = diplayName;
	}

	public String getDiplayName() {
		return diplayName;
	}

	@Column(name = "PLT_viewName", columnDefinition = "varchar(50)")
	private String viewName;
	
	@Column(name = "PLT_className", columnDefinition = "varchar(20)")
	private String className;
	
	@Column(name = "PLT_relName", columnDefinition = "varchar(20)")
	private String relName;
	
	@Column(name = "PLT_note", columnDefinition = "varchar(200)")
	private String note;
	
	@Column(name = "PLT_isInherited")
	private boolean isInherited;
	
	@Column(name = "PLT_icon", columnDefinition = "varchar(50)")
	private String icon;
	
	@Column(name = "PLT_parameter", columnDefinition = "varchar(500)")
	private String parameter;
	
	@Column(name = "PLT_extend", columnDefinition = "varchar(500)")
	private String extend;

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

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getParameter() {
		return parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	public String getExtend() {
		return extend;
	}

	public void setExtend(String extend) {
		this.extend = extend;
	}

}
