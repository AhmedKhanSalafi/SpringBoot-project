package com.mvc.MVC_SpringBoot.service;


import com.mvc.MVC_SpringBoot.entity.Invoice;

import java.util.List;

public interface IInvoiceService {

        public Invoice saveInvice(Invoice invoice);
        public List<Invoice> getAllInvoices();
        public Invoice getInvoiceById(Long id);
        public void deleteInvoiceById(Long id);
        public void updateInvoice(Invoice invoice);

}
