package com.springboot.restApiTemplate2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean

// Method
    public RestTemplate restTemplate()
    {
        return new RestTemplate();
    }


}
