package edu.thss.platform.domain.itemclass.rules;

import edu.thss.platform.domain.itemclass.omf.ItemClass;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(
        name = "PLT_RUL_Rule"
)
@Inheritance(
        strategy = InheritanceType.TABLE_PER_CLASS
)
public class Rule extends ItemClass implements Serializable {
    public Rule() {
    }

    @Column(
            name = "plt_note",
            columnDefinition = "VARCHAR(300)"
    )
    public String getNote() {
        return (String)this.attrMap.get("note");
    }

    public void setNote(String note) {
        this.attrMap.put("note", note);
    }
}
