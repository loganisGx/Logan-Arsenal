package com.logan.base.datasource;

/**
 * Desc：DatasourceMappingHandler
 * Created by liugenxing on 2021/5/23 16:09.
 * Copr：© 2021 Logan.All rights reserved.
 */
public class DatasourceMappingHolder {
    private static ThreadLocal<String> local = new ThreadLocal<>();

    public static void setDatasourceType(String datasourceType) {
        local.set(datasourceType);
    }

    public static String getDatasourceType() {
        String type = local.get();
        local.remove();     //防止内存泄漏
        return type;
    }
}
