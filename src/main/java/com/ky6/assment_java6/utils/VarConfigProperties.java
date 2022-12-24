package com.ky6.assment_java6.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("notion")
public record VarConfigProperties(String secretKey) {
}
