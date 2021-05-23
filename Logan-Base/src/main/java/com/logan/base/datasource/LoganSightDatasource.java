package com.logan.base.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Desc：LoganSightDatasource
 * Created by liugenxing on 2021/5/23 14:30.
 * Copr：© 2021 Logan.All rights reserved.
 */
public class LoganSightDatasource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DatasourceMappingHolder.getDatasourceType();
    }
}
