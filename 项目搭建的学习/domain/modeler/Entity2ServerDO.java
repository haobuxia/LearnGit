package edu.thss.platform.domain.modeler;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PLT_MDL_Entity2Server")
public class Entity2ServerDO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "PLT_className", columnDefinition = "varchar(20)")
	private String className;

	@Column(name = "PLT_ip", columnDefinition = "varchar(50)")
	private String ip;

	@Column(name = "PLT_port")
	private Integer port;

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	
}
