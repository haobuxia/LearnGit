package edu.thss.platform.domain.modeler;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PLT_MDL_ScriptCode")
public class ScriptCodeDO implements Serializable {
    public ScriptCodeDO() {}

    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Id
    @Column(name = "PLT_oid",columnDefinition="varchar(32)")
    @ApiModelProperty(value = "脚本id", example = "6FF1F93B2EDD8F4B9CF65C6BEBB39A67")
    private String id;

    @ApiModelProperty(value = "脚本名称", example = "Check_Equipment_Is_Null")
    @Column(name = "plt_id", columnDefinition = "VARCHAR(50) not null  unique ")
    private String scriptId;

    @ApiModelProperty(value = "备注", example = "检查事故报告的有效性")
    @Column(name = "plt_note", columnDefinition = "VARCHAR(300)")
    private String note;

    //@Lob
    @ApiModelProperty(value = "脚本代码字符串")
    @Column(name = "plt_scriptExp")
    private String scriptExp;

    public String getOid() {
        return id;
    }

    public void setOid(String id) {
        this.id = id;
    }

    public String getId() {
        return scriptId;
    }

    public void setId(String scriptId) {
        this.scriptId = scriptId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getScriptExp() {
        return scriptExp;
    }

    public void setScriptExp(String scriptExp) {
        this.scriptExp = scriptExp;
    }
}
