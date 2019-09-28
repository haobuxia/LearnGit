package edu.thss.platform.domain.itemclass.omf;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(
        name = "PLT_CUS_ROOT"
)
@Inheritance(
        strategy = InheritanceType.TABLE_PER_CLASS
)
public class Root implements Serializable {
    protected Map<String, Object> attrMap = new HashMap();
    private static final long serialVersionUID = 1L;

    public Root() {
    }

    public Map<String, Object> toMap() {
        return this.attrMap;
    }

    public void fromMap(Map<String, Object> map) {
        this.attrMap = new HashMap(map);
    }

    public Object get(String name) {
        return this.attrMap.get(name);
    }

    public void put(String name, Object val) {
        this.attrMap.put(name, val);
    }

    @Id
    @Column(
            name = "plt_oid",
            columnDefinition = "varchar(32)"
    )
    public String getOid() {
        return (String)this.attrMap.get("oid");
    }

    public void setOid(String Oid) {
        this.attrMap.put("oid", Oid);
    }
}
