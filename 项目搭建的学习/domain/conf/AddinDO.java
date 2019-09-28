package edu.thss.platform.domain.conf;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PLT_CFG_Addin")
public class AddinDO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "PLT_oid", columnDefinition = "varchar(32)")
    private String id;

    @Column(name = "PLT_name", columnDefinition = "varchar(100)")
    private String name;

    @Column(name = "PLT_description", columnDefinition = "text")
    private String note;

    @Column(name = "PLT_version", columnDefinition = "varchar(100)")
    private String version;

    @Column(name = "PLT_datasource", columnDefinition = "bytea")
    private byte[] datasource;

    @Column(name = "PLT_status", columnDefinition = "varchar(30)")
    private String status;

    @Column(name = "PLT_versionPub", columnDefinition = "varchar(100)")
    private String versionPub;

    @Column(name = "PLT_createtime", columnDefinition = "varchar(30)")
    private String createTime;

    public String getCreateTime() { return createTime; }

    public void setCreateTime(String createTime) { this.createTime = createTime; }

    public String getVersionPub() {
        return versionPub;
    }

    public void setVersionPub(String versionPub) {
        this.versionPub = versionPub;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public byte[] getDatasource() {
        return datasource;
    }

    public void setDatasource(byte[] datasource) {
        this.datasource = new byte[datasource.length];
        System.arraycopy(datasource, 0, this.datasource, 0, datasource.length);
    }

}