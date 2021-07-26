package com.fd.targettime.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author : zxq
 * @create : 2021/7/26 16:20
 */
@Configuration
public class WebAppConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("doc.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
//        registry.addResourceHandler("/webjars/**")
//                .addResourceLocations("classpath:/META-INF/resources/webjars/");
//        registry.addResourceHandler("/")
//                .addResourceLocations("classpath:/META-INF/resources/");
//        registry.addResourceHandler("/csrf")
//                .addResourceLocations("classpath:/META-INF/resources/");
//        registry.addResourceHandler("/v2/api-docs-ext")
//                .addResourceLocations("classpath:/META-INF/resources/");
    }
}
