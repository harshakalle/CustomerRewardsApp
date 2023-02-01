package com.customer.rewards.controller;

import com.customer.rewards.entity.CustomerRewards;
import com.customer.rewards.service.RewardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rewards")
public class RewardsController {

    @Autowired
    RewardsService rewardsService;

    @PostMapping("/get-reward-points")
    @ResponseBody
    public CustomerRewards getRewardPoints(@RequestBody CustomerRewards customerRewards) {
        return rewardsService.getRewardPoints(customerRewards);
    }

    @GetMapping("/get-all-customers")
    public List<CustomerRewards> getAllCustomers() {
        return rewardsService.getAllCustomers();
    }
}
