package com.customer.rewards.exception;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ErrorResponse {

    private String message;
    private LocalDateTime timestamp;
}
