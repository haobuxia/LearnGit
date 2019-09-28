package edu.thss.platform.domain.modeler;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;

import javax.persistence.*;

@ApiModel(description = "资源过滤信息Model")
@Entity
@Table(name = "PLT_MDL_ResFilter")
public class ResFilterDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "资源过滤信息Model的id, 主键")
	@Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "PLT_oid",columnDefinition="varchar(32)")
	private String id;

	@ApiModelProperty(value = "资源绑定信息Model的id")
	@Column(name = "PLT_resBindOid",columnDefinition="varchar(32)")
	private String resBindOid;

	@ApiModelProperty(value = "被绑定的类上的属性名", example = "actorId")
	@Column(name = "PLT_classAttr", columnDefinition = "varchar(20)")
	private String classAttr;

	@ApiModelProperty(value = "资源类上的属性名", example = "userName")
	@Column(name = "PLT_resAttr", columnDefinition = "varchar(20)")
	private String resAttr;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getResBindOid() {
		return resBindOid;
	}

	public void setResBindOid(String resBindOid) {
		this.resBindOid = resBindOid;
	}

	public String getClassAttr() {
		return classAttr;
	}

	public void setClassAttr(String classAttr) {
		this.classAttr = classAttr;
	}

	public String getResAttr() {
		return resAttr;
	}

	public void setResAttr(String resAttr) {
		this.resAttr = resAttr;
	}
	
}
