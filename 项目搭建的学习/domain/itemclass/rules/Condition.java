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
        name = "PLT_RUL_Condition"
)
@Inheritance(
        strategy = InheritanceType.TABLE_PER_CLASS
)
public class Condition extends Rule implements Serializable {
    public Condition() {
    }

    @Column(
            name = "plt_conditionState",
            columnDefinition = "integer"
    )
    public Integer getConditionState() {
        return (Integer)this.attrMap.get("conditionState");
    }

    public void setConditionState(Integer conditionState) {
        this.attrMap.put("conditionState", conditionState);
    }

    @Column(
            name = "plt_conditionExpre",
            columnDefinition = "VARCHAR(200)"
    )
    public String getConditionExpre() {
        return (String)this.attrMap.get("conditionExpre");
    }

    public void setConditionExpre(String conditionExpre) {
        this.attrMap.put("conditionExpre", conditionExpre);
    }

    @Column(
            name = "plt_conditionId",
            columnDefinition = "VARCHAR(20) unique "
    )
    public String getConditionId() {
        return (String)this.attrMap.get("conditionId");
    }

    public void setConditionId(String conditionId) {
        this.attrMap.put("conditionId", conditionId);
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
