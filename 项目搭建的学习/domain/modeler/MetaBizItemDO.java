package edu.thss.platform.domain.modeler;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PLT_MDL_MetaBizItem")
public class MetaBizItemDO implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "PLT_oid",columnDefinition="varchar(32)")
	private String id;

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public boolean isSingleLine() {
		return singleLine;
	}

	public void setSingleLine(boolean singleLine) {
		this.singleLine = singleLine;
	}

	@Column(name = "PLT_className", columnDefinition = "varchar(20)")
	private String className;
	
	@Column(name = "PLT_singleLine")
	private boolean singleLine;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}
