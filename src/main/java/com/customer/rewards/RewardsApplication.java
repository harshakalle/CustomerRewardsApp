package com.customer.rewards;

import com.customer.rewards.entity.CustomerRewards;
import com.customer.rewards.repository.RewardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class RewardsApplication  implements CommandLineRunner {
	@Autowired
	RewardsRepository rewardsRepository;

	public static void main(String[] args) {
		SpringApplication.run(RewardsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		CustomerRewards customerRewards = new CustomerRewards(1,1,"Bob","Marley",120, LocalDateTime.now(),   100);
		CustomerRewards customerRewards2 = new CustomerRewards(2,1,"Bob","Marley",120, LocalDateTime.now(),   100);
		CustomerRewards customerRewards3 = new CustomerRewards(3,1,"Bob","Marley",120, LocalDateTime.now(),   100);
		CustomerRewards customerRewards4 = new CustomerRewards(4,1,"Bob","Marley",120, LocalDateTime.now(),   100);
		CustomerRewards customerRewards5 = new CustomerRewards(5,1,"Bob","Marley",120, LocalDateTime.now(),   100);
		rewardsRepository.save(customerRewards);
		rewardsRepository.save(customerRewards2);
		rewardsRepository.save(customerRewards3);
		rewardsRepository.save(customerRewards4);
		rewardsRepository.save(customerRewards5);
	}
}
