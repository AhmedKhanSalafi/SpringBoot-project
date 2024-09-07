package com.mvc.MVC_SpringBoot.repo;

import com.mvc.MVC_SpringBoot.entity.Invoice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}

