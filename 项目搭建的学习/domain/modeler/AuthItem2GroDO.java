package edu.thss.platform.domain.modeler;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "PLT_MDL_R_AuthItem2Gro")
@ApiModel(description = "授权项到授权组数据库表模型")
public class AuthItem2GroDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Id
	@Column(name = "PLT_oid",columnDefinition="varchar(32)")
	@ApiModelProperty(value = "授权项到授权组对象id", example = "0D593C94979CB94C88CE4DB82352F369")
	private String id;
	
	@Column(name = "PLT_authorityId", columnDefinition = "varchar(20)")
	@ApiModelProperty(value = "授权项名称", example = "ViewSearch")
	private String authorityId;
	
	@Column(name = "PLT_groupId", columnDefinition = "varchar(20)")
	@ApiModelProperty(value = "授权组名称", example = "CommonOpAuth")
	private String groupId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAuthorityId() {
		return authorityId;
	}

	public void setAuthorityId(String authorityId) {
		this.authorityId = authorityId;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
