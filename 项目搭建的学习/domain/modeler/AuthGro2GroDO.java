package edu.thss.platform.domain.modeler;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;
import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "PLT_MDL_R_AuthGro2Gro")
@ApiModel(description = "授权组到授权组数据库表模型")
public class AuthGro2GroDO implements Serializable {
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getChildId() {
		return childId;
	}

	public void setChildId(String childId) {
		this.childId = childId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = 1L;

	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Id
	@Column(name = "PLT_oid",columnDefinition="varchar(32)")
	@ApiModelProperty(value = "授权子组到授权组对象id", example = "0627D8A0DB2980479369EA44830D7FB3")
	private String id;
	
	@Column(name = "PLT_parentId", columnDefinition = "varchar(20)")
	@ApiModelProperty(value = "授权组名称", example = "RootAuthGroup")
	private String parentId;
	
	@Column(name = "PLT_childId", columnDefinition = "varchar(20)")
	@ApiModelProperty(value = "授权子组名称", example = "CreateObjects")
	private String childId;

}
