package com.talkweb.numberportability.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: YuYuMing
 * @email 642346596@qq.com
 * @Date: 2020/6/2
 */
//Excel导出配置项
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
public @interface ExportConfig {
    /**
     *表头显示名(如：id字段显示为"编号") 默认为字段名
     * @return
     */
    String value() default "field";

    /**
     *单元格宽度 默认-1(自动计算列宽)
     * @return
     */
    short width()default -1;
}
