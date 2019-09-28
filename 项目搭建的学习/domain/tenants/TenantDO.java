package edu.thss.platform.domain.tenants;


import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;

import javax.persistence.*;

@Entity
@Table(name = "plt_tenant")
@ApiModel(description = "租户信息")
public class TenantDO {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "plt_id")
    private Integer id;

    @Column(name = "plt_tenantname",columnDefinition="varchar(500)")
    private String tenantName;

    @Column(name = "plt_note",columnDefinition="varchar(1000)")
    private String note;

    @Column(name = "plt_schemaname",columnDefinition="varchar(500)")
    private String schemaName;

    @JsonIgnore
    @Column(name = "plt_last_translog_id")
    Integer lastTransLogId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public Integer getLastTransLogId() {
        return lastTransLogId;
    }

    public void setLastTransLogId(Integer lastTransLogId) {
        this.lastTransLogId = lastTransLogId;
    }
}
