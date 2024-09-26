//package com.blood_bank.Blood_Bank.Dao;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Controller;
//
//@Controller
//public class CreateDatabaseDao {
//	@Autowired
//    private JdbcTemplate jdbcTemplate;
//	
//	public CreateDatabaseDao(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//	
//	public int createDatabase(String name) {
//        String query = "CREATE Database IF NOT EXISTS ?; use ?;";
//        return this.jdbcTemplate.update(query,name,name);
//    }
//}
