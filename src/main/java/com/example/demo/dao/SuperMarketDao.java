package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.SuperMarket;

/**
 * Here JpaRepository Interface manages all the Database connection and provides
 * CRUD functions for Controller Class;
 * 
 * @author MukulJaiswal
 *
 */
@Repository
public interface SuperMarketDao extends JpaRepository<SuperMarket, Integer> {

}
