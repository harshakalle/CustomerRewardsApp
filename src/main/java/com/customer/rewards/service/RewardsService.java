package com.customer.rewards.service;

import com.customer.rewards.entity.CustomerRewards;
import com.customer.rewards.exception.InvalidPriceException;
import com.customer.rewards.repository.RewardsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
public class RewardsService {

    @Autowired
    RewardsRepository rewardsRepository;

    //Method to calculate and store reward points
    public CustomerRewards getRewardPoints(CustomerRewards customerRewards) {

        if (customerRewards.getPrice() > 50 && customerRewards.getPrice() > 100) {
            int rewardPoints = (int) ((customerRewards.getPrice() - 50) * 1 + (customerRewards.getPrice() - 100) * 1);
            customerRewards.setLocalDateTime(LocalDateTime.now());
            customerRewards.setRewardPoints(rewardPoints);
            log.info("Added " + rewardPoints + " to the customer");
            return rewardsRepository.save(customerRewards);
        } else if(customerRewards.getPrice() > 50) {
            int rewardPoints = (int) ((customerRewards.getPrice() - 50) * 1);
            customerRewards.setLocalDateTime(LocalDateTime.now());
            customerRewards.setRewardPoints(rewardPoints);
            log.info("Added " + rewardPoints + " to the customer");
            return rewardsRepository.save(customerRewards);
        } else if (customerRewards.getPrice() <= 0){
            //Throwing Exception when wrong price received in the request
            throw new InvalidPriceException(customerRewards.getPrice());
        }
        return customerRewards;
    }

    public List<CustomerRewards> getAllCustomers() {
        return  rewardsRepository.findAll();
    }
}
