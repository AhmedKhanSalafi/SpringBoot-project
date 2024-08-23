package com.crackit.multipledatabaseconfiguration.entity.postgres;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "credit_card")
public class CreditCard {

    @Id
    private Long id;
    private String name;
    private int expirationMonth;
    private int expirationYear;
}
