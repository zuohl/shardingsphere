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

package io.shardingsphere.orchestration.internal.event.config;

import io.shardingsphere.api.config.MasterSlaveRuleConfiguration;
import io.shardingsphere.core.config.DataSourceConfiguration;
import io.shardingsphere.core.rule.Authentication;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Map;
import java.util.Properties;

/**
 * Master slave configuration data source parameter changed event.
 *
 * @author zhangliang
 */
@RequiredArgsConstructor
@Getter
public final class MasterSlaveConfigurationDataSourceParameterChangedEvent {
    
    private final String schemaName;
    
    private final Map<String, DataSourceConfiguration> dataSourceConfigurationMap;
    
    private final MasterSlaveRuleConfiguration masterSlaveRuleConfig;
    
    private final Authentication authentication;
    
    private final Properties props;
}
