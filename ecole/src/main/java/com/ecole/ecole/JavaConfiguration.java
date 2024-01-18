package com.ecole.ecole;

import org.dozer.spring.DozerBeanMapperFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

@Configuration
public class JavaConfiguration {

    @Value("classpath*:dozer/*.xml")
    private Resource[] resources;

    @Bean
    public DozerBeanMapperFactoryBean modelMapper() {
        DozerBeanMapperFactoryBean dz = new DozerBeanMapperFactoryBean();
        dz.setMappingFiles(this.resources);
        return dz;
    }
}
