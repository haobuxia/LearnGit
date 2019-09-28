package edu.thss.platform.domain.itemclass.script;

import edu.thss.platform.domain.itemclass.omf.ResourceBase;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(
        name = "PLT_MDL_ScriptAction"
)
@Inheritance(
        strategy = InheritanceType.TABLE_PER_CLASS
)
public class ScriptAction extends ResourceBase implements Serializable {
    public ScriptAction() {
    }

    @Column(
            name = "plt_action",
            columnDefinition = "VARCHAR(200)"
    )
    public String getAction() {
        return (String)this.attrMap.get("action");
    }

    public void setAction(String action) {
        this.attrMap.put("action", action);
    }

    @Column(
            name = "plt_displayName",
            columnDefinition = "VARCHAR(50)"
    )
    public String getDisplayName() {
        return (String)this.attrMap.get("displayName");
    }

    public void setDisplayName(String displayName) {
        this.attrMap.put("displayName", displayName);
    }
}
