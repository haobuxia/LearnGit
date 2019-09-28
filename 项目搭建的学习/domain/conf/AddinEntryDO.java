package edu.thss.platform.domain.conf;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PLT_CFG_AddinEntry")
@ApiModel(description = "插件入口")
public class AddinEntryDO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "PLT_oid", columnDefinition = "varchar(32)")
    @ApiModelProperty(value = "插件入口id", example = "9424836BF05CB14E887C1489EFF493D3")
    private String id;

    @Column(name = "PLT_name", columnDefinition = "varchar(100)")
    @ApiModelProperty(value = "插件入口名", example = "entry1")
    private String name;

    @Column(name = "PLT_alias", columnDefinition = "varchar(200)")
    @ApiModelProperty(value = "插件别名", example = "edu.thss.platform.**")
    private String alias;

    @Column(name = "PLT_description", columnDefinition = "text")
    @ApiModelProperty(value = "插件入口说明", example = "插件入口1的说明")
    private String note;

    @Column(name = "PLT_module", columnDefinition = "varchar(100)")
    @ApiModelProperty(value = "插件入口所属模块", example = "通用模块")
    private String module;

    @Column(name = "PLT_status", columnDefinition = "varchar(20)")
    @ApiModelProperty(value = "插件入口状态", example = "启用/禁用")
    private String status;

    @Column(name = "PLT_path", columnDefinition = "varchar(200)")
    @ApiModelProperty(value = "插件入口路径", example = "modeler/message.vue")
    private String path;

    @Column(name = "PLT_addin", columnDefinition = "varchar(32)")
    @ApiModelProperty(value = "所属插件id", example = "9424836BF05CB14E887C1489EFF493D3")
    private String addin;

    @Column(name = "PLT_addinName", columnDefinition = "varchar(100)")
    @ApiModelProperty(value = "所属插件名", example = "插件1")
    private String addinName;

    public String getAddinName() {
        return addinName;
    }

    public void setAddinName(String addinName) {
        this.addinName = addinName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getModule() { return module; }

    public void setModule(String module) { this.module = module; }

    public String getAddin() {
        return addin;
    }

    public void setAddin(String addin) {
        this.addin = addin;
    }
}