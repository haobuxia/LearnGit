package edu.thss.platform.domain.app;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@DynamicUpdate
@Table(name = "plt_mdl_appinfo")
@ApiModel(description = "App的元数据信息")
public class AppInfoDO {

    @Id
    @Column(name = "PLT_id",columnDefinition="varchar(32)")
    String id;

    @ApiModelProperty(value = "App的英文名, 会出现在url中")
    @Column(name = "plt_appname")
    String appName;

    @ApiModelProperty(value = "备注")
    @Column(name = "note")
    String note;

    @JsonIgnore
    @ApiModelProperty(value = "页面左上角的logo")
    @Column(name = "plt_logo")
    byte[] logo;

    @JsonIgnore
    @ApiModelProperty(value = "tab标签上的icon")
    @Column(name = "plt_icon")
    byte[] icon;

    @ApiModelProperty(value = "tab标签上的title")
    @Column(name = "plt_title")
    String title;

    @ApiModelProperty(value = "起始页的url地址")
    @Column(name = "plt_startpageurl")
    String startPageURL;

    @ApiModelProperty(value = "拓展字段，可以前端自定义存储格式（例如json格式 )")
    @Column(name = "plt_extconfig", columnDefinition = "text")
    String extConfig;

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


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public byte[] getIcon() {
        return icon;
    }

    public void setIcon(byte[] icon) {
        this.icon = icon;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartPageURL() {
        return startPageURL;
    }

    public void setStartPageURL(String startPageURL) {
        this.startPageURL = startPageURL;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getExtConfig() {
        return extConfig;
    }

    public void setExtConfig(String extConfig) {
        this.extConfig = extConfig;
    }
}
