package edu.thss.platform.domain.modeler;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PLT_MDL_DebugModelScript")
public class DebugModelScriptDO {

	public DebugModelScriptDO(){}
	
	//不能设置Name，只有唯一的Name
	@Id
	@Column(name = "PLT_name", columnDefinition = "varchar(20)")
	private String name = "";

	//@Lob
	@Column(name = "PLT_content", columnDefinition = "text NOT NULL")
	private String content = "";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

		
	

}
