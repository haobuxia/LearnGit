package edu.thss.platform.domain.modeler;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "PLT_MDL_MetaRelation")
public class MetaRelationDO implements Serializable {

    @Id
    @Column(name = "PLT_oid", columnDefinition = "varchar(32)")
    private String id;

    @ApiModelProperty(value = "关联类名", example = "Loc2SFile")
    @Column(name = "PLT_className", columnDefinition = "varchar(20)")
    private String className;

    @ApiModelProperty(value = "左类名", example = "Vault")
    @Column(name = "PLT_leftClass", columnDefinition = "varchar(20)")
    private String leftClass;

    @ApiModelProperty(value = "右类名", example = "VaultLocation")
    @Column(name = "PLT_rightClass", columnDefinition = "varchar(20)")
    private String rightClass;

    @ApiModelProperty(value = "左类角色", example = "仓库")
    @Column(name = "PLT_leftRole", columnDefinition = "varchar(20)")
    private String leftRole;

    @ApiModelProperty(value = "右类角色", example = "仓库位置")
    @Column(name = "PLT_rightRole", columnDefinition = "varchar(20)")
    private String rightRole;

    private static final long serialVersionUID = 1L;

    @JsonIgnore
    @Column(name = "plt_modifytime", columnDefinition = "timestamp not null default now()")
    @ApiModelProperty(value = "更新时间")
    private Date modifyTime = new Date();

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }



    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setLeftClass(String leftClass) {
        this.leftClass = leftClass;
    }

    public String getLeftClass() {
        return leftClass;
    }

    public void setRightClass(String rightClass) {
        this.rightClass = rightClass;
    }

    public String getRightClass() {
        return rightClass;
    }

    public void setLeftRole(String leftRole) {
        this.leftRole = leftRole;
    }

    public String getLeftRole() {
        return leftRole;
    }

    public void setRightRole(String rightRole) {
        this.rightRole = rightRole;
    }

    public String getRightRole() {
        return rightRole;
    }
}
