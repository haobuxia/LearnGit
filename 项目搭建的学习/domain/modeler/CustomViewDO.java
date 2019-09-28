package edu.thss.platform.domain.modeler;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;

import javax.persistence.*;

@ApiModel(description = "自定义视图模型")
@SuppressWarnings("serial")
@DynamicUpdate
@Entity
@Table(name = "PLT_MDL_CustomView")
public class CustomViewDO implements Serializable {

	@ApiModelProperty(value = "拥有本视图的数据模型类英文名", example = "Multi")
	@Column(name = "PLT_className", columnDefinition = "varchar(20) NOT NULL")
	private String className;

	@ApiModelProperty(value = "视图内容(XML格式)")
	@Column(name = "PLT_content", columnDefinition = "TEXT")
	private String content;

	/**
	 * modify by yuyajie 2014-9-16 begin
	 * */
	@ApiModelProperty(value = "DWF3.0表单(JSON格式)")
	@Column(name = "plt_v3content", columnDefinition = "text")
	private String v3Content;

	@Column(name = "PLT_phoneContent", columnDefinition = "TEXT")
	private String phoneContent;
	
	public String getPhoneContent() {
		return phoneContent;
	}

	public void setPhoneContent(String phoneContent) {
		this.phoneContent = phoneContent;
	}

	/**
	 * modify by yuyajie 2014-9-16 end
	 * */
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Id
	@Column(name = "PLT_oid", columnDefinition = "varchar(32)")
	private String oid;

	@Column(name = "PLT_owner", columnDefinition = "varchar(32)")
	private String owner;

	@ApiModelProperty(value = "视图英文名", example = "Multi")
	@Column(name = "PLT_viewName", columnDefinition = "varchar(20) NOT NULL")
	private String viewName;

	@Column(name = "plt_uid")
	private String uid;

	@Column(name = "plt_thumbnail")
	private byte[] thumbnail;

	@Column(name = "plt_displayName", columnDefinition = "varchar(500)")
	private String displayName;

	@Column(name = "plt_note", columnDefinition = "varchar(500)")
	private String note;

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

	public String getClassName() {
		return className;
	}

	public String getContent() {
		return content;
	}

	public String getOid() {
		return oid;
	}

	public String getOwner() {
		return owner;
	}

	public String getViewName() {
		return viewName;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setViewName(String viewName) {
		this.viewName = viewName;
	}

	public String getV3Content() {
		return v3Content;
	}

	public void setV3Content(String v3Content) {
		this.v3Content = v3Content;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public byte[] getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(byte[] thumbnail) {
		this.thumbnail = thumbnail;
	}
}
