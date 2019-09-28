package edu.thss.platform.domain.modeler;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "PLT_MDL_AuthItemGro")
@ApiModel(description = "授权组数据库表模型")
public class AuthItemGroDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Id
	@Column(name = "PLT_oid",columnDefinition="varchar(32)")
	@ApiModelProperty(value = "授权组对象id", example = "9424836BF05CB14E887C1489EFF493D3")
	private String id;
	
	@Column(name = "PLT_groupId", columnDefinition = "varchar(20) not null unique")
	@ApiModelProperty(value = "授权组名称", example = "CreateObjects")
	private String groupId;
	
	@Column(name = "PLT_displayName", columnDefinition = "varchar(50)")
	@ApiModelProperty(value = "授权组显示名称", example = "各种创建对象")
	private String displayName;

	@Column(name = "PLT_note", columnDefinition = "varchar(100)")
	@ApiModelProperty(value = "备注", example = "批量创建，单个创建")
	private String note;

	@JsonIgnore
	@Column(name = "plt_modifytime", columnDefinition = "timestamp  not null default now()")
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

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
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
