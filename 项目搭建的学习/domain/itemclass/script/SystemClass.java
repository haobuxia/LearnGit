package edu.thss.platform.domain.itemclass.script;

import edu.thss.platform.domain.itemclass.omf.ItemClass;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(
        name = "PLT_SYS_SystemClass"
)
@Inheritance(
        strategy = InheritanceType.TABLE_PER_CLASS
)
public class SystemClass extends ItemClass implements Serializable {
    public SystemClass() {
    }
}
