package edu.thss.platform.domain.modeler;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "PLT_MDL_MetaResource")
public class MetaResourceDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Id
	@Column(name = "PLT_oid",columnDefinition="varchar(32)")
	private String id;

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getdBSource() {
		return dBSource;
	}

	public void setdBSource(String dBSource) {
		this.dBSource = dBSource;
	}

	@Column(name = "PLT_resourceName", columnDefinition = "varchar(20)")
	private String resourceName;
	
	@Column(name = "PLT_tableName", columnDefinition = "varchar(30)")
	private String tableName;
	
	@Column(name = "PLT_dBSource", columnDefinition = "varchar(200)")
	private String dBSource;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

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

}
