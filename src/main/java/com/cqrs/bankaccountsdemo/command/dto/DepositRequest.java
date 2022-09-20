package com.cqrs.bankaccountsdemo.command.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DepositRequest {

    private String accountId;
    private BigDecimal amount;
}
