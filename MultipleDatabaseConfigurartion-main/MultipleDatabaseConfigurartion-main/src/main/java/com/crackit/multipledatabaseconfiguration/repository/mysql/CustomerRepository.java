package com.crackit.multipledatabaseconfiguration.repository.mysql;

import com.crackit.multipledatabaseconfiguration.entity.mysql.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
