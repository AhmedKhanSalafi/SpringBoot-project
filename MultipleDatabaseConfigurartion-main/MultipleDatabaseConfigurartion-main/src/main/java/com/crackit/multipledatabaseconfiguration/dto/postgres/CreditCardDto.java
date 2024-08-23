package com.crackit.multipledatabaseconfiguration.dto.postgres;

import lombok.Data;

@Data
public class CreditCardDto {
    private Long id;
    private String name;
    private int expirationMonth;
    private int expirationYear;
}
