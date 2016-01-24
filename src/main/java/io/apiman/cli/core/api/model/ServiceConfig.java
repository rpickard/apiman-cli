/*
 * Copyright 2016 Pete Cornish
 *
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
 */

package io.apiman.cli.core.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Legacy support for apiman 1.1.x.
 *
 * @author Pete Cornish {@literal <outofcoffee@gmail.com>}
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceConfig {
    @JsonProperty
    private String endpoint;

    @JsonProperty
    private String endpointType;

    @JsonProperty
    private boolean publicService;

    @JsonProperty
    private List<ApiGateway> gateways;

    public ServiceConfig() {
    }

    public ServiceConfig(String endpoint, String endpointType, boolean publicService, List<ApiGateway> gateways) {
        this.endpoint = endpoint;
        this.endpointType = endpointType;
        this.publicService = publicService;
        this.gateways = gateways;
    }

    public void setPublicService(boolean publicService) {
        this.publicService = publicService;
    }
}
