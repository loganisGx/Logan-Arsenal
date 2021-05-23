package com.logan.datamigration.handler;

import com.logan.base.datasource.DatasourceMappingHandler;
import com.logan.datamigration.config.DataMigrationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Desc：DMDatasourceMappingHandler
 * Created by liugenxing on 2021/5/23 16:58.
 * Copr：© 2021 Logan.All rights reserved.
 */
@Service
public class DMDatasourceMappingHandler implements DatasourceMappingHandler {

    @Autowired
    private DataMigrationProperties properties;

    @Override
    public String mapping(String methodName) {
        Map<String, List<String>> typeMap = properties.getTypeMap();
        for (String typeKey : typeMap.keySet()) {
            for (String typeValue : typeMap.get(typeKey)) {
                if (methodName.startsWith(typeValue)) {
                    return typeKey;
                }
            }
        }

        return null;
    }
}
