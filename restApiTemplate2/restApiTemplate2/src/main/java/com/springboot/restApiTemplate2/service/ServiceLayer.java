package com.springboot.restApiTemplate2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


    @Service
    public class ServiceLayer {



        @Autowired
        private RestTemplate restTemplate;



        public String consumeApi(){

//
            return restTemplate.getForObject("http://localhost:9090/students",String.class);

           //  return restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/1",String.class);


        }
    }


