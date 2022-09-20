package com.cqrs.bankaccountsdemo.command.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateAccountRequest {
    private BigDecimal startingBalance;
}
