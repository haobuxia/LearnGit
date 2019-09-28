package edu.thss.platform.domain.tenants;

import io.swagger.annotations.ApiModel;
import javax.persistence.*;

@Entity
@Table(name = "plt_tenant2user")
@ApiModel(description = "租户与用户的关联")
public class TenantToUserDO {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "plt_id")
    private Integer id;

    @Column(name = "plt_tenantid")
    private Integer tenantId;

    @Column(name = "plt_uid")
    private String uid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
