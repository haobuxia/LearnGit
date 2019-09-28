package edu.thss.platform.domain.itemclass.org;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(
        name = "PLT_ORG_User"
)
@Inheritance(
        strategy = InheritanceType.TABLE_PER_CLASS
)
public class User extends Participant implements Serializable {
    public User() {
    }

    @Column(
            name = "plt_expiredTime",
            columnDefinition = "date"
    )
    public Date getExpiredTime() {
        return (Date)this.attrMap.get("expiredTime");
    }

    public void setExpiredTime(Date expiredTime) {
        this.attrMap.put("expiredTime", expiredTime);
    }

    @Column(
            name = "plt_isFrozen",
            columnDefinition = "boolean DEFAULT false"
    )
    public Boolean getIsFrozen() {
        return (Boolean)this.attrMap.get("isFrozen");
    }

    public void setIsFrozen(Boolean isFrozen) {
        this.attrMap.put("isFrozen", isFrozen);
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
            name = "plt_password",
            columnDefinition = "VARCHAR(50) not null "
    )
    public String getPassword() {
        return (String)this.attrMap.get("password");
    }

    public void setPassword(String password) {
        this.attrMap.put("password", password);
    }

    @Column(
            name = "plt_comment",
            columnDefinition = "VARCHAR(200)"
    )
    public String getComment() {
        return (String)this.attrMap.get("comment");
    }

    public void setComment(String comment) {
        this.attrMap.put("comment", comment);
    }

    @Column(
            name = "plt_email",
            columnDefinition = "VARCHAR(100)"
    )
    public String getEmail() {
        return (String)this.attrMap.get("email");
    }

    public void setEmail(String email) {
        this.attrMap.put("email", email);
    }
}
