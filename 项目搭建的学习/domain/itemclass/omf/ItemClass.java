package edu.thss.platform.domain.itemclass.omf;



import edu.thss.platform.domain.itemclass.omf.Root;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(
        name = "PLT_CUS_ITEMCLASS"
)
@Inheritance(
        strategy = InheritanceType.TABLE_PER_CLASS
)
public class ItemClass extends Root implements Serializable {
    private static final long serialVersionUID = 1L;

    public ItemClass() {
    }
}
