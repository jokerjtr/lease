package com.atguigu.lease.common.minio;

import io.minio.MinioClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lhz
 * @Date 2024/6/2 22:36
 */
@Configuration
@EnableConfigurationProperties(MinioProperties.class)
//可以为MinioClient的配置类增加一个条件注解`@ConditionalOnProperty`，
// 如下，该注解表达的含义是只有当`minio.endpoint`属性存在时，该配置类才会生效。
@ConditionalOnProperty(name = "minio.endpoint")
public class MinioConfiguration {
    @Autowired
    private MinioProperties properties;
    @Bean
    public MinioClient minioClient() {
        return MinioClient.builder().endpoint(properties.getEndpoint()).credentials(properties.getAccessKey(), properties.getSecretKey()).build();
    }
}
