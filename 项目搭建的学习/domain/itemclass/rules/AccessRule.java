package edu.thss.platform.domain.itemclass.rules;


import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(
        name = "PLT_RUL_AccessRule"
)
@Inheritance(
        strategy = InheritanceType.TABLE_PER_CLASS
)
public class AccessRule extends Rule implements Serializable {
    public AccessRule() {
    }

    @Column(
            name = "plt_participant",
            columnDefinition = "VARCHAR(50)"
    )
    public String getParticipant() {
        return (String)this.attrMap.get("participant");
    }

    public void setParticipant(String participant) {
        this.attrMap.put("participant", participant);
    }

    @Column(
            name = "plt_level",
            columnDefinition = "integer"
    )
    public Integer getLevel() {
        return (Integer)this.attrMap.get("level");
    }

    public void setLevel(Integer level) {
        this.attrMap.put("level", level);
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
            name = "plt_conditionId",
            columnDefinition = "VARCHAR(20)"
    )
    public String getConditionId() {
        return (String)this.attrMap.get("conditionId");
    }

    public void setConditionId(String conditionId) {
        this.attrMap.put("conditionId", conditionId);
    }

    @Column(
            name = "plt_authority",
            columnDefinition = "VARCHAR(50)"
    )
    public String getAuthority() {
        return (String)this.attrMap.get("authority");
    }

    public void setAuthority(String authority) {
        this.attrMap.put("authority", authority);
    }

    @Column(
            name = "plt_attrName",
            columnDefinition = "VARCHAR(20)"
    )
    public String getAttrName() {
        return (String)this.attrMap.get("attrName");
    }

    public void setAttrName(String attrName) {
        this.attrMap.put("attrName", attrName);
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

    private Date modifyTime = new Date();

    @JsonIgnore
    @Column(name = "plt_modifytime", columnDefinition = "timestamp not null default now()")
    @ApiModelProperty(value = "更新时间")
    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

}
