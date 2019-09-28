package edu.thss.platform.domain.itemclass.omf;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(
        name = "PLT_CUS_Relation",
        uniqueConstraints = {@UniqueConstraint(
                columnNames = {"plt_leftoid", "plt_rightoid"}
        )}
)
@Inheritance(
        strategy = InheritanceType.TABLE_PER_CLASS
)
public class Relation extends Root {
    private static final long serialVersionUID = 1L;

    public Relation() {
    }

    @Column(
            name = "plt_createtime",
            columnDefinition = "DATE"
    )
    public Date getCreateTime() {
        return (Date)this.attrMap.get("createTime");
    }

    @Column(
            name = "plt_creator",
            columnDefinition = "varchar(32)"
    )
    public String getCreator() {
        return (String)this.attrMap.get("creator");
    }

    @Column(
            name = "plt_lastmodifier",
            columnDefinition = "varchar(32)"
    )
    public String getLastModifier() {
        return (String)this.attrMap.get("lastModifier");
    }

    @Column(
            name = "plt_lastmodifytime",
            columnDefinition = "DATE"
    )
    public Date getLastModifyTime() {
        return (Date)this.attrMap.get("lastModifyTime");
    }

    @Column(
            name = "plt_leftclass",
            columnDefinition = "varchar(50)"
    )
    public String getLeftClass() {
        return (String)this.attrMap.get("leftClass");
    }

    @Column(
            name = "plt_leftoid",
            columnDefinition = "varchar(32)"
    )
    public String getLeftOid() {
        return (String)this.attrMap.get("leftOid");
    }

    @Column(
            name = "plt_order",
            columnDefinition = "integer"
    )
    public Integer getOrder() {
        return (Integer)this.attrMap.get("order");
    }

    @Column(
            name = "plt_rightclass",
            columnDefinition = "varchar(50)"
    )
    public String getRightClass() {
        return (String)this.attrMap.get("rightClass");
    }

    @Column(
            name = "plt_rightoid",
            columnDefinition = "varchar(32)"
    )
    public String getRightOid() {
        return (String)this.attrMap.get("rightOid");
    }

    @Column(
            name = "plt_rightRev",
            columnDefinition = "varchar(32)"
    )
    public String getRightRev() {
        return (String)this.attrMap.get("rightRev");
    }

    public String getSideClass(Side side) {
        if (Side.Left.equals(side)) {
            return this.getLeftClass();
        } else {
            return Side.Right.equals(side) ? this.getRightClass() : null;
        }
    }

    public String getSideOid(Side side) {
        if (Side.Left.equals(side)) {
            return this.getLeftOid();
        } else {
            return Side.Right.equals(side) ? this.getRightOid() : null;
        }
    }

    public void setCreateTime(Date CreateTime) {
        this.attrMap.put("createTime", CreateTime);
    }

    public void setCreator(String Creator) {
        this.attrMap.put("creator", Creator);
    }

    public void setLastModifier(String lastModifier) {
        this.attrMap.put("lastModifier", lastModifier);
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.attrMap.put("lastModifyTime", lastModifyTime);
    }

    public void setLeftClass(String leftClass) {
        this.attrMap.put("leftClass", leftClass);
    }

    public void setLeftOid(String leftOid) {
        this.attrMap.put("leftOid", leftOid);
    }

    public void setOrder(Integer value) {
        this.attrMap.put("order", value);
    }

    public void setRightClass(String rightClass) {
        this.attrMap.put("rightClass", rightClass);
    }

    public void setRightOid(String rightOid) {
        this.attrMap.put("rightOid", rightOid);
    }

    public void setRightRev(String rightRev) {
        this.attrMap.put("rightRev", rightRev);
    }

    public void setSideClass(Side side, String value) {
        if (Side.Left.equals(side)) {
            this.setLeftClass(value);
        } else if (Side.Right.equals(side)) {
            this.setRightClass(value);
        }

    }

    public void setSideOid(Side side, String value) {
        if (Side.Left.equals(side)) {
            this.setLeftOid(value);
        } else if (Side.Right.equals(side)) {
            this.setRightOid(value);
        }

    }

    @Column(
            name = "plt_version",
            columnDefinition = "integer"
    )
    public Integer getVersion() {
        return (Integer)this.attrMap.get("version");
    }

    public void setVersion(Integer version) {
        this.attrMap.put("version", version);
    }
}
