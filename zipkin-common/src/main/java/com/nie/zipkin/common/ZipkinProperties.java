package com.nie.zipkin.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by sam on 2017/11/3.
 */
@Component
@ConfigurationProperties(prefix = "zipkin")
public class ZipkinProperties {
    private String endpoint;
    private String service;

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}
