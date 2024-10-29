package com.Banking.Application.Banking.Application.using.Spring.Boot.repo;

import com.Banking.Application.Banking.Application.using.Spring.Boot.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
