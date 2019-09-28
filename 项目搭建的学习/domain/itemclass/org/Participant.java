package edu.thss.platform.domain.itemclass.org;

import edu.thss.platform.domain.itemclass.omf.ItemClass;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(
        name = "PLT_ORG_Participant"
)
@Inheritance(
        strategy = InheritanceType.TABLE_PER_CLASS
)
public class Participant extends ItemClass implements Serializable {
    public Participant() {
    }

    @Column(
            name = "plt_creator",
            columnDefinition = "varchar(32)"
    )
    public String getCreator() {
        return (String)this.attrMap.get("creator");
    }

    public void setCreator(String creator) {
        this.attrMap.put("creator", creator);
    }

    @Column(
            name = "plt_createTime",
            columnDefinition = "date"
    )
    public Date getCreateTime() {
        return (Date)this.attrMap.get("createTime");
    }

    public void setCreateTime(Date createTime) {
        this.attrMap.put("createTime", createTime);
    }

    @Column(
            name = "plt_lastModifier",
            columnDefinition = "varchar(32)"
    )
    public String getLastModifier() {
        return (String)this.attrMap.get("lastModifier");
    }

    public void setLastModifier(String lastModifier) {
        this.attrMap.put("lastModifier", lastModifier);
    }

    @Column(
            name = "plt_lastModifyTime",
            columnDefinition = "date"
    )
    public Date getLastModifyTime() {
        return (Date)this.attrMap.get("lastModifyTime");
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.attrMap.put("lastModifyTime", lastModifyTime);
    }

    @Column(
            name = "plt_name",
            columnDefinition = "VARCHAR(50) unique "
    )
    public String getName() {
        return (String)this.attrMap.get("name");
    }

    public void setName(String name) {
        this.attrMap.put("name", name);
    }
}
