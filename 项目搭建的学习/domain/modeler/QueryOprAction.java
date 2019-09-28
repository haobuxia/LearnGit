package edu.thss.platform.domain.modeler;

import io.swagger.annotations.ApiModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@ApiModel(description = "快速查询操作动作类型")
@Entity
@Table(name = "plt_qry_action")
public class QueryOprAction {
    @Id
    @Column(name = "PLT_oid", columnDefinition = "text")
    private String oid;

    @Column(name = "PLT_name", columnDefinition = "text")
    private String name;

    @Column(name = "plt_displayname", columnDefinition = "text")
    private String displayName;

    @Column(name = "plt_description", columnDefinition = "text")
    private String description;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
