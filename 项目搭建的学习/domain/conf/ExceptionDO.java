package edu.thss.platform.domain.conf;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PLT_CFG_Exception")
@ApiModel(description = "异常信息数据表模型")
public class ExceptionDO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "PLT_oid", columnDefinition = "varchar(32)")
    @ApiModelProperty(value = "异常信息id", example = "9424836BF05CB14E887C1489EFF493D3")
    private String id;

    @Column(name = "PLT_code", columnDefinition = "integer")
    @ApiModelProperty(value = "异常信息代码", example = "400")
    private Integer code;

    @Column(name = "PLT_message", columnDefinition = "text")
    @ApiModelProperty(value = "异常信息内容", example = "错误信息")
    private String message;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}