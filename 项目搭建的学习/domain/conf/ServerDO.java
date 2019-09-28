package edu.thss.platform.domain.conf;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;

@Entity
@Table(name = "PLT_CFG_Server")
@ApiModel(description="服务实例类")
public class ServerDO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "PLT_oid",columnDefinition="varchar(32)")
    private String id;

    @Column(name = "PLT_home", columnDefinition = "varchar(100)")
    private String home;

    @Column(name = "PLT_name", columnDefinition = "varchar(100)")
    private String name;

    @Column(name = "PLT_modelfronthost", columnDefinition = "varchar(100)")
    private String modelfronthost;

    @Column(name = "PLT_modelfrontport", columnDefinition = "integer")
    private Integer modelfrontport;

    @Column(name = "PLT_modelfrontpath", columnDefinition = "varchar(500)")
    private String modelfrontpath;

    @Column(name = "PLT_modelfrontpid", columnDefinition = "integer")
    private Integer modelfrontpid;

    @Column(name = "PLT_modelendhost", columnDefinition = "varchar(100)")
    private String modelendhost;

    @Column(name = "PLT_modelendport", columnDefinition = "integer")
    private Integer modelendport;

    @Column(name = "PLT_modelendpath", columnDefinition = "varchar(500)")
    private String modelendpath;

    @Column(name = "PLT_modelendpid", columnDefinition = "integer")
    private Integer modelendpid;

    @Column(name = "PLT_appfronthost", columnDefinition = "varchar(100)")
    private String appfronthost;

    @Column(name = "PLT_appfrontport", columnDefinition = "integer")
    private Integer appfrontport;

    @Column(name = "PLT_appfrontpath", columnDefinition = "varchar(500)")
    private String appfrontpath;

    @Column(name = "PLT_appfrontpid", columnDefinition = "integer")
    private Integer appfrontpid;

    @Column(name = "PLT_appendhost", columnDefinition = "varchar(100)")
    private String appendhost;

    @Column(name = "PLT_appendport", columnDefinition = "integer")
    private Integer appendport;

    @Column(name = "PLT_appendpath", columnDefinition = "varchar(500)")
    private String appendpath;

    @Column(name = "PLT_appendpid", columnDefinition = "integer")
    private Integer appendpid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelfronthost() {
        return modelfronthost;
    }

    public void setModelfronthost(String modelfronthost) {
        this.modelfronthost = modelfronthost;
    }

    public Integer getModelfrontport() {
        return modelfrontport;
    }

    public void setModelfrontport(Integer modelfrontport) {
        this.modelfrontport = modelfrontport;
    }

    public String getModelfrontpath() {
        return modelfrontpath;
    }

    public void setModelfrontpath(String modelfrontpath) {
        this.modelfrontpath = modelfrontpath;
    }

    public Integer getModelfrontpid() {
        return modelfrontpid;
    }

    public void setModelfrontpid(Integer modelfrontpid) {
        this.modelfrontpid = modelfrontpid;
    }

    public String getModelendhost() {
        return modelendhost;
    }

    public void setModelendhost(String modelendhost) {
        this.modelendhost = modelendhost;
    }

    public Integer getModelendport() {
        return modelendport;
    }

    public void setModelendport(Integer modelendport) {
        this.modelendport = modelendport;
    }

    public String getModelendpath() {
        return modelendpath;
    }

    public void setModelendpath(String modelendpath) {
        this.modelendpath = modelendpath;
    }

    public Integer getModelendpid() {
        return modelendpid;
    }

    public void setModelendpid(Integer modelendpid) {
        this.modelendpid = modelendpid;
    }

    public String getAppfronthost() {
        return appfronthost;
    }

    public void setAppfronthost(String appfronthost) {
        this.appfronthost = appfronthost;
    }

    public Integer getAppfrontport() {
        return appfrontport;
    }

    public void setAppfrontport(Integer appfrontport) {
        this.appfrontport = appfrontport;
    }

    public String getAppfrontpath() {
        return appfrontpath;
    }

    public void setAppfrontpath(String appfrontpath) {
        this.appfrontpath = appfrontpath;
    }

    public Integer getAppfrontpid() {
        return appfrontpid;
    }

    public void setAppfrontpid(Integer appfrontpid) {
        this.appfrontpid = appfrontpid;
    }

    public String getAppendhost() {
        return appendhost;
    }

    public void setAppendhost(String appendhost) {
        this.appendhost = appendhost;
    }

    public Integer getAppendport() {
        return appendport;
    }

    public void setAppendport(Integer appendport) {
        this.appendport = appendport;
    }

    public String getAppendpath() {
        return appendpath;
    }

    public void setAppendpath(String appendpath) {
        this.appendpath = appendpath;
    }

    public Integer getAppendpid() {
        return appendpid;
    }

    public void setAppendpid(Integer appendpid) {
        this.appendpid = appendpid;
    }
}
