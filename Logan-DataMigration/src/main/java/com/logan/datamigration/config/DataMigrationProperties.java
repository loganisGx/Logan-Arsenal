package com.logan.datamigration.config;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Desc：DataMigrationProperties
 * Created by liugenxing on 2021/5/23 16:13.
 * Copr：© 2021 Logan.All rights reserved.
 */
@Component
public class DataMigrationProperties {
    private Map<String,List<String>> typeMap;

    public Map<String, List<String>> getTypeMap() {
        return typeMap;
    }

    public void setTypeMap(Map<String, List<String>> typeMap) {
        this.typeMap = typeMap;
    }
}
