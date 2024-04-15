package com.denec.banking.DTO;

import java.math.BigDecimal;

public class TransferDTO {
    private String toUser;
    private BigDecimal amount;

    public String getToUser() {
        return this.toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
