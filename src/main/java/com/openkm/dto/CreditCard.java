package com.openkm.dto;

public class CreditCard {
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public Integer getSecCode() {
        return secCode;
    }

    public void setSecCode(Integer secCode) {
        this.secCode = secCode;
    }

    private String fullName;
    private String cardNumber;
    private String expDate;
    private Integer secCode;

    @Override
    public String toString(){
        return String.format("Full Name: %s%nCard Number: %s%n Expiracy Date: %s%n Sequence Code: %d", fullName, cardNumber, expDate, secCode);
    }
}
