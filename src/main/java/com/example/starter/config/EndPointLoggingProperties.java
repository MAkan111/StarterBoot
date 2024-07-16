package com.example.starter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "endpoint.logging")
public record EndPointLoggingProperties(boolean active) {}