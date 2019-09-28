package edu.thss.platform.domain.modeler;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@ApiModel(description = "文件资料库模型")
@Entity
@Table(name = "PLT_MDL_Library")
public class LibraryDO implements Serializable {
    private static final long serialVersionUID = 1L;

    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Id
    @Column(name = "PLT_oid", columnDefinition = "varchar(32)")
    @ApiModelProperty(value = "资料库全局唯一标识")
    private String oid;

    @Column(name = "plt_libraryId", columnDefinition = "VARCHAR(50) not null unique")
    @ApiModelProperty(value = "资料库id，即英文名称")
    private String libraryId;

    @Column(name = "plt_libraryName", columnDefinition = "VARCHAR(50)")
    @ApiModelProperty(value = "资料库显示名称，即中文名称")
    private String libraryName;

    @Column(name = "plt_currentSavePath", columnDefinition = "VARCHAR(300)")
    @ApiModelProperty(value = "资料库当前保存路径，新保存的文件将存放在该路径中")
    private String currentSavePath;

    @Column(name = "plt_creator", columnDefinition = "varchar(32)")
    @ApiModelProperty(value = "资料库创建者")
    private String creator;

    @Column(name = "plt_createTime", columnDefinition = "date")
    @ApiModelProperty(value = "资料库创建时间")
    private Date createTime;

    @Column(name = "plt_lastModifier", columnDefinition = "varchar(32)")
    @ApiModelProperty(value = "资料库上次修改者")
    private String lastModifier;

    @Column(name = "plt_lastModifyTime", columnDefinition = "date")
    @ApiModelProperty(value = "资料库上次修改时间")
    private Date lastModifyTime;

    public LibraryDO() {
        super();
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getLibraryId() {
        return this.libraryId;
    }

    public void setLibraryId(String libraryId) {
        this.libraryId = libraryId;
    }

    public String getLibraryName() {
        return this.libraryName;
    }

    public void setLibraryName(String vbName) {
        this.libraryName = vbName;
    }

    public String getCurrentSavePath() {
        return this.currentSavePath;
    }

    public void setCurrentSavePath(String currentSavePath) {
        this.currentSavePath = currentSavePath;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLastModifier() {
        return this.lastModifier;
    }

    public void setLastModifier(String lastModifier) {
        this.lastModifier = lastModifier;
    }

    public Date getLastModifyTime() {
        return this.lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}
