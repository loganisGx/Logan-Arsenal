package com.logan.base.aspect;

import com.logan.base.datasource.DatasourceMappingHandler;
import com.logan.base.datasource.DatasourceMappingHolder;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Desc：DatasourceMappingAspect
 * Created by liugenxing on 2021/5/23 15:41.
 * Copr：© 2021 Logan.All rights reserved.
 */
@Aspect
@Component
@Order(-9999)
public class DatasourceMappingAspect {

    @Autowired
    private DatasourceMappingHandler datasourceMappingHandler;

    @Before("@annotation(com.logan.base.annotation.DatasourceMapping)")
    @Order(-9999)
    public void chooseDatasource(JoinPoint joinPoint){
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        System.out.println(className + "." + methodName + "(" + Arrays.asList(joinPoint.getArgs())+ ")");
        String datasourceKey = datasourceMappingHandler.mapping(methodName);
        if (datasourceKey == null){
            throw new RuntimeException("DatasourceKey can not be null! ---" + methodName);
        }
        DatasourceMappingHolder.setDatasourceType(datasourceKey);
    }
}
