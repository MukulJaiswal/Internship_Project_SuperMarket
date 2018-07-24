package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.SuperMarketDao;
import com.example.demo.model.SuperMarket;

@SpringBootApplication
public class SpringBootJpaApplication implements CommandLineRunner {

	@Autowired
	SuperMarketDao superMarketDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		superMarketDao.save(new SuperMarket("Shoes", 100, "15/8/2018"));
		superMarketDao.save(new SuperMarket("T-shirt", 100, "15/8/2018"));
		superMarketDao.save(new SuperMarket("Jeans", 100, "15/8/2018"));
		superMarketDao.save(new SuperMarket("Pants", 100, "15/8/2018"));
		superMarketDao.save(new SuperMarket("Skirts", 100, "15/8/2018"));
		superMarketDao.save(new SuperMarket("Bermuda", 100, "15/8/2018"));
	}
}
