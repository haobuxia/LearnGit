package edu.thss.platform.domain.itemclass.script;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(
        name = "PLT_MDL_Script2Class"
)
@Inheritance(
        strategy = InheritanceType.TABLE_PER_CLASS
)
public class Script2Class extends SystemClass implements Serializable {
    public Script2Class() {
    }

    @Column(
            name = "plt_id",
            columnDefinition = "VARCHAR(50) not null "
    )
    public String getId() {
        return (String)this.attrMap.get("id");
    }

    public void setId(String id) {
        this.attrMap.put("id", id);
    }

    @Column(
            name = "plt_className",
            columnDefinition = "VARCHAR(50)"
    )
    public String getClassName() {
        return (String)this.attrMap.get("className");
    }

    public void setClassName(String className) {
        this.attrMap.put("className", className);
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
            name = "plt_isInheritant",
            columnDefinition = "boolean"
    )
    public Boolean getIsInheritant() {
        return (Boolean)this.attrMap.get("isInheritant");
    }

    public void setIsInheritant(Boolean isInheritant) {
        this.attrMap.put("isInheritant", isInheritant);
    }
}
