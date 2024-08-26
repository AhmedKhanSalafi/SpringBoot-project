package com.springboot.restApiTemplate2.controller;

import com.springboot.restApiTemplate2.service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    public class Controller {




        @Autowired
        private ServiceLayer serviceLayer;



        @GetMapping("/")
        public String getData(){

            return  serviceLayer.consumeApi();
        }


}
