package edu.thss.platform.domain.itemclass.org;

import edu.thss.platform.domain.itemclass.omf.Relation;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(
        name = "PLT_ORG_R_Group2Group"
)
@Inheritance(
        strategy = InheritanceType.TABLE_PER_CLASS
)
public class Group2Group extends Relation implements Serializable {
    public Group2Group() {
    }
}
