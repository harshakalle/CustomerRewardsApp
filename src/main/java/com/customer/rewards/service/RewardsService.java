package com.customer.rewards.service;

import com.customer.rewards.entity.CustomerRewards;
import com.customer.rewards.exception.InvalidPriceException;
import com.customer.rewards.repository.RewardsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RewardsService {

    @Autowired
    RewardsRepository rewardsRepository;

    //Method to calculate and store reward points
    public CustomerRewards getRewardPoints(double price) {

        CustomerRewards customerRewards = new CustomerRewards();
        if (price > 50 && price > 100) {
            int rewardPoints = (int) ((price - 50) * 1 + (price - 100) * 1);
            customerRewards.setRewardPoints(rewardPoints);
            customerRewards.setPrice(price);
            log.info("Added " + rewardPoints + " to the customer");
            return rewardsRepository.save(customerRewards);
        } else if(price > 50) {
            int rewardPoints = (int) ((price - 50) * 1 + (price - 100) * 1);
            customerRewards.setRewardPoints(rewardPoints);
            customerRewards.setPrice(price);
            log.info("Added " + rewardPoints + " to the customer");
            return rewardsRepository.save(customerRewards);
        } else if (price <= 0){
            //Throwing Exception when wrong price received in the request
            throw new InvalidPriceException(price);
        }
        return customerRewards;
    }
}
