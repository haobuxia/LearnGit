package edu.thss.platform.domain.itemclass.omf;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(
        name = "PLT_RSC_ResourceBase"
)
@Inheritance(
        strategy = InheritanceType.TABLE_PER_CLASS
)
public class ResourceBase extends ItemClass implements Serializable {
    public ResourceBase() {
    }
}
