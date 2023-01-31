package com.customer.rewards.repository;

import com.customer.rewards.entity.CustomerRewards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RewardsRepository extends JpaRepository<CustomerRewards, Integer> {
}
