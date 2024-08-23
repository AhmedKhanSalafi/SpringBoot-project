package com.crackit.multipledatabaseconfiguration.repository.postgres;

import com.crackit.multipledatabaseconfiguration.entity.postgres.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {
}
