package com.logan.datamigration.worker;

import java.util.List;

/**
 * Desc：Importer
 * Created by liugenxing on 2021/5/23 14:24.
 * Copr：© 2021 Logan.All rights reserved.
 */
public interface Importer<T> {
    void importData(List<T> dataList);
}
