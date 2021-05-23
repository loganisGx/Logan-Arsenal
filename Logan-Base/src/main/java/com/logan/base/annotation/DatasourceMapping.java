package com.logan.base.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Desc：DatasourceMapping
 * Created by liugenxing on 2021/5/23 16:01.
 * Copr：© 2021 Logan.All rights reserved.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DatasourceMapping {
}
