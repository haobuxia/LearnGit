package edu.thss.platform.domain.modeler;

import io.swagger.annotations.ApiModel;

import javax.persistence.*;
import java.io.Serializable;


@ApiModel(description = "文件对象模型")
@Entity
@Table(name = "plt_sys_icon")
public class OperationIconDO implements Serializable {

    public OperationIconDO() {

    }

    public OperationIconDO(String oid, String name) {
        setOid(oid);
        setName(name);
    }

    @Id
    @Column(name = "PLT_oid", columnDefinition = "varchar(32)")
    private String oid;

    @Column(name = "PLT_name", columnDefinition = "varchar(50) UNIQUE NOT NULL")
    private String name;

    @Column(name = "PLT_data", columnDefinition = "bytea NOT NULL")
    private byte[] data;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }





}
