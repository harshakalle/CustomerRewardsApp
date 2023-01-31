package com.customer.rewards.exception;

public class InvalidPriceException extends RuntimeException {

    public InvalidPriceException(double price) {
        super("Invalid price " + price);
    }
}
