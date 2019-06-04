package com.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@Component
@ConfigurationProperties(prefix = "com.opensource")
@PropertySource(value = "classpath:resource.properties")
public class Resource {
    private String name;
    private String age;
    private String language;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getLanguage() {
        return language;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
