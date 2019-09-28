package edu.thss.platform.domain.modeler;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@ApiModel(description = "文件对象模型")
@Entity
@Table(name = "PLT_MDL_File")
public class FileDO implements Serializable {
    private static final long serialVersionUID = 1L;

    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Id
    @Column(name = "PLT_oid", columnDefinition = "varchar(32)")
    @ApiModelProperty(value = "文件全局唯一标识")
    private String oid;

    @Column(name = "plt_filename", columnDefinition = "VARCHAR(255)")
    @ApiModelProperty(value = "文件名")
    private String filename;

    @Column(name = "plt_libraryId", columnDefinition = "VARCHAR(50) not null")
    @ApiModelProperty(value = "文件所属资料库id")
    private String libraryId;

    @Column(name = "plt_filePath", columnDefinition = "VARCHAR(300)")
    @ApiModelProperty(value = "文件保存路径（绝对路径，不包括文件名）")
    private String filePath;

    @Column(name = "plt_creator", columnDefinition = "varchar(32)")
    @ApiModelProperty(value = "文件创建者")
    private String creator;

    @Column(name = "plt_createTime", columnDefinition = "date")
    @ApiModelProperty(value = "文件创建时间")
    private Date createTime;

    @Column(name = "plt_lastModifier", columnDefinition = "varchar(32)")
    @ApiModelProperty(value = "文件上次修改者")
    private String lastModifier;

    @Column(name = "plt_lastModifyTime", columnDefinition = "date")
    @ApiModelProperty(value = "文件上次修改时间")
    private Date lastModifyTime;

    public FileDO() {
        super();
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getLibraryId() {
        return this.libraryId;
    }

    public void setLibraryId(String libraryId) {
        this.libraryId = libraryId;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
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
