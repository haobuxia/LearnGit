package edu.thss.platform.domain.itemclass.opr;


import com.fasterxml.jackson.annotation.JsonIgnore;
import edu.thss.platform.domain.itemclass.script.SystemClass;
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
        name = "PLT_FPT_QueryOprConfig"
)
@Inheritance(
        strategy = InheritanceType.TABLE_PER_CLASS
)
public class QueryOprConfig extends SystemClass implements Serializable {
    public QueryOprConfig() {
    }

    @Column(
            name = "plt_moduleName",
            columnDefinition = "VARCHAR(50)"
    )
    public String getModuleName() {
        return (String)this.attrMap.get("moduleName");
    }

    public void setModuleName(String moduleName) {
        this.attrMap.put("moduleName", moduleName);
    }

    @Column(
            name = "plt_order",
            columnDefinition = "integer"
    )
    public Integer getOrder() {
        return (Integer)this.attrMap.get("order");
    }

    public void setOrder(Integer order) {
        this.attrMap.put("order", order);
    }

    @Column(
            name = "plt_displayName",
            columnDefinition = "VARCHAR(50)"
    )
    public String getDisplayName() {
        return (String)this.attrMap.get("displayName");
    }

    public void setDisplayName(String displayName) {
        this.attrMap.put("displayName", displayName);
    }

    @Column(
            name = "plt_icon",
            columnDefinition = "VARCHAR(200)"
    )
    public String getIcon() {
        return (String)this.attrMap.get("icon");
    }

    public void setIcon(String icon) {
        this.attrMap.put("icon", icon);
    }

    @Column(
            name = "plt_targetClass",
            columnDefinition = "VARCHAR(50)"
    )
    public String getTargetClass() {
        return (String)this.attrMap.get("targetClass");
    }

    public void setTargetClass(String targetClass) {
        this.attrMap.put("targetClass", targetClass);
    }

    @Column(
            name = "plt_conType",
            columnDefinition = "VARCHAR(50)"
    )
    public String getConType() {
        return (String)this.attrMap.get("conType");
    }

    public void setConType(String conType) {
        this.attrMap.put("conType", conType);
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
            name = "plt_action",
            columnDefinition = "VARCHAR(200)"
    )
    public String getAction() {
        return (String)this.attrMap.get("action");
    }

    public void setAction(String action) {
        this.attrMap.put("action", action);
    }

    @Column(
            name = "plt_viewType",
            columnDefinition = "VARCHAR(50)"
    )
    public String getViewType() {
        return (String)this.attrMap.get("viewType");
    }

    public void setViewType(String viewType) {
        this.attrMap.put("viewType", viewType);
    }

    @Column(
            name = "plt_viewName",
            columnDefinition = "VARCHAR(50)"
    )
    public String getViewName() {
        return (String)this.attrMap.get("viewName");
    }

    public void setViewName(String viewName) {
        this.attrMap.put("viewName", viewName);
    }

    @Column(
            name = "plt_viewTitle",
            columnDefinition = "VARCHAR(100)"
    )
    public String getViewTitle() {
        return (String)this.attrMap.get("viewTitle");
    }

    public void setViewTitle(String viewTitle) {
        this.attrMap.put("viewTitle", viewTitle);
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
            name = "plt_params",
            columnDefinition = "VARCHAR(200)"
    )
    public String getParams() {
        return (String)this.attrMap.get("params");
    }

    public void setParams(String params) {
        this.attrMap.put("params", params);
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
