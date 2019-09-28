package edu.thss.platform.domain.itemclass.org;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(
        name = "PLT_ORG_Group"
)
@Inheritance(
        strategy = InheritanceType.TABLE_PER_CLASS
)
public class Group extends Participant implements Serializable {
    public Group() {
    }

    @Column(
            name = "plt_comment",
            columnDefinition = "VARCHAR(200)"
    )
    public String getComment() {
        return (String)this.attrMap.get("comment");
    }

    public void setComment(String comment) {
        this.attrMap.put("comment", comment);
    }
}
