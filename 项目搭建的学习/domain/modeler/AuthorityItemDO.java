package edu.thss.platform.domain.modeler;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "PLT_MDL_AuthorityItem")
@ApiModel(description = "授权项数据库表模型")
public class AuthorityItemDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Id
	@Column(name = "PLT_oid",columnDefinition="varchar(32)")
	@ApiModelProperty(value = "授权项id", example = "AC75A09D18FFCB42BD7CD8E29A47470A")
	private String id;
	
	@Column(name = "PLT_authorityId", columnDefinition = "varchar(20) not null unique")
	@ApiModelProperty(value = "授权项名", example = "OICheckIn")
	private String authorityId;
	
	@Column(name = "PLT_displayName", columnDefinition = "varchar(50)")
	@ApiModelProperty(value = "授权项显示名", example = "拥有类检入")
	private String displayName;
	
	@Column(name = "PLT_note", columnDefinition = "varchar(100)")
	@ApiModelProperty(value = "备注", example = "操作授权项")
	private String note;

	@JsonIgnore
	@Column(name = "plt_modifytime", columnDefinition = "timestamp not null  default now()")
	@ApiModelProperty(value = "更新时间")
	private Date modifyTime = new Date();

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

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

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
