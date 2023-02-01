package com.customer.rewards.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "customer_rewards")
public class CustomerRewards {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "price")
    private double price;

    @Column(name = "transaction_date")
    LocalDateTime localDateTime;

    @Column(name = "reward_points")
    private int rewardPoints;
}
