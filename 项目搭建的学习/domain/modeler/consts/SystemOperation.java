package edu.thss.platform.domain.modeler.consts;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 用于标记是否为不需要绑定的操作
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface SystemOperation {

}
