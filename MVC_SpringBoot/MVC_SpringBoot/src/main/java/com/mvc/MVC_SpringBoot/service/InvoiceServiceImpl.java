package com.mvc.MVC_SpringBoot.service;

import java.util.List;
import java.util.Optional;

import com.mvc.MVC_SpringBoot.entity.Invoice;
import com.mvc.MVC_SpringBoot.exception.InvoiceNotFoundException;
import com.mvc.MVC_SpringBoot.repo.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



    @Service

        public class InvoiceServiceImpl implements IInvoiceService{

            @Autowired
            private InvoiceRepository repo;

            @Override
            public Invoice saveInvice(Invoice invoice) {
                return repo.save(invoice);
            }

            @Override
            public List<Invoice> getAllInvoices() {
                return repo.findAll();
            }

            @Override
            public Invoice getInvoiceById(Long id) {
                Optional<Invoice> opt = repo.findById(id);
                if(opt.isPresent()) {
                    return opt.get();
                } else {
                    throw new InvoiceNotFoundException("Invoice with Id : "+id+" Not Found");
                }
            }

            @Override
            public void deleteInvoiceById(Long id) {
                repo.delete(getInvoiceById(id));
            }

            @Override
            public void updateInvoice(Invoice invoice) {
                repo.save(invoice);
            }
        }

