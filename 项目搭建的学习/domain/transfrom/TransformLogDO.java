package edu.thss.platform.domain.transfrom;

import edu.thss.platform.domain.transfrom.valuetype.TransformActionType;

import javax.persistence.*;

@Entity
@Table(name = "plt_mdl_translog")
public class TransformLogDO {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private TransformActionType actionType;

    @Column(columnDefinition = "varchar")
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TransformActionType getActionType() {
        return actionType;
    }

    public void setActionType(TransformActionType actionType) {
        this.actionType = actionType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
