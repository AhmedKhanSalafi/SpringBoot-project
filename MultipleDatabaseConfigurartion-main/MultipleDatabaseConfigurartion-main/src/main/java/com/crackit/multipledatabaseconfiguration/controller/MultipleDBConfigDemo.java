package com.crackit.multipledatabaseconfiguration.controller;

import com.crackit.multipledatabaseconfiguration.dto.mysql.CustomerDto;
import com.crackit.multipledatabaseconfiguration.dto.postgres.CreditCardDto;
import com.crackit.multipledatabaseconfiguration.entity.mysql.Customer;
import com.crackit.multipledatabaseconfiguration.entity.postgres.CreditCard;
import com.crackit.multipledatabaseconfiguration.repository.mysql.CustomerRepository;
import com.crackit.multipledatabaseconfiguration.repository.postgres.CreditCardRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/crackit/demo/multipledb")
public class MultipleDBConfigDemo {

   @Autowired
    private ModelMapper modelMapper;

   @Autowired
   private CustomerRepository customerRepository;

   @Autowired
   private CreditCardRepository creditCardRepository;

    @GetMapping("/customers/{id}")
    public CustomerDto getCustomer(@PathVariable("id") Long customerId){
        return modelMapper.map(customerRepository.findById(customerId), CustomerDto.class);
    }

    @PostMapping("/customers")
    public CustomerDto saveCustomer(@RequestBody CustomerDto customerDto){
        Customer customer = modelMapper.map(customerDto, Customer.class);
        return modelMapper.map(customerRepository.save(customer), CustomerDto.class);
    }

    @GetMapping("/creditCard/{id}")
    public CreditCardDto getCreditCardInfo(@PathVariable("id") Long creditCardId){
        return modelMapper.map(creditCardRepository.findById(creditCardId), CreditCardDto.class);
    }

    @PostMapping("/creditCard")
    public CreditCardDto saveCreditCardInfo(@RequestBody CreditCardDto creditCardDto){
        CreditCard creditCard = modelMapper.map(creditCardDto, CreditCard.class);
        return modelMapper.map(creditCardRepository.save(creditCard), CreditCardDto.class);
    }

}
