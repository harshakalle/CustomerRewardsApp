package com.customer.rewards.controller;

import com.customer.rewards.entity.CustomerRewards;
import com.customer.rewards.service.RewardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rewards")
public class RewardsController {

    @Autowired
    RewardsService rewardsService;

    @GetMapping("/get-reward-points")
    @ResponseBody
    public CustomerRewards getRewardPoints(@RequestParam("price") double price) {
        return rewardsService.getRewardPoints(price);
    }
}
