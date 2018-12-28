/*
 * Copyright 2016-2018 shardingsphere.io.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package io.shardingsphere.core.metadata.table;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Table metadata.
 *
 * @author panjuan
 */
@EqualsAndHashCode
@ToString
public final class TableMetaData {
    
    private final Map<String, ColumnMetaData> columns;
    
    public TableMetaData(final Collection<ColumnMetaData> columnMetaDataList) {
        columns = new LinkedHashMap<>(columnMetaDataList.size(), 1);
        for (ColumnMetaData each : columnMetaDataList) {
            columns.put(each.getColumnName(), each);
        }
    }
    
    /**
     * Get all column names.
     *
     * @return column names
     */
    public Collection<String> getAllColumnNames() {
        return columns.keySet();
    }
    
    /**
     * Get all column meta data.
     *
     * @return column meta data
     */
    public Collection<ColumnMetaData> getAllColumns() {
        return columns.values();
    }
}
