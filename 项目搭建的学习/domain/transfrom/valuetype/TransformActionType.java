package edu.thss.platform.domain.transfrom.valuetype;

public enum  TransformActionType {

    //Class
    ADD_CLASS,             // 添加类
    DEL_CLASS,             // 删除类
    UPDATE_CLASS,          // 更新类

    //Attribute
    BIND_ATTR_TO_CLASS,    // 绑定属性到类
    UNTIE_ATTR,            // 将属性从某个类上解绑
    UPDATE_ATTRIBUTE       // 更新属性

}
