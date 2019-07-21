package com.my.springboot.dao;

//Do the DB operations
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.my.springboot.model.Customer;

@Repository
public class CustomerDao {
	
	@Autowired //Spring will automatically assign the fields with the passed values //dependency injection
	private JdbcTemplate jdbcTemplate; //object of jdbc
//	private static final String SQL1 = "select * from b_orders where cname = 'ish'"; //set the query
	private static final String SQL3 = "INSERT INTO customers (cname) VALUES (:cname)"; 

	@Autowired 
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	// To create new record
	public Customer saveCustomer(Customer customer)  {
							
			SqlParameterSource c_parameters = new MapSqlParameterSource()
					.addValue("cname", customer.getCname());
			
					namedParameterJdbcTemplate.update(SQL3, c_parameters);
					System.out.println(namedParameterJdbcTemplate.update(SQL3, c_parameters));

					return customer;
		}
		
	
//	// To view data
//	public List<Burger> getData() {
//		List<Burger> burgers = new ArrayList<Burger>();
//		List<Map<String, Object>> rows = jdbcTemplate.queryForList(SQL1); //Set the query to a map
//		
//		//retrieve all the data in the DB from the customer table row by row
//		for (Map<String, Object> row : rows) {
//			Burger burger = new Burger();
//			burger.setId((int) row.get("id"));
////			customer.setCname((String) row.get("cname"));
//			burger.setName((String) row.get("name"));
//			burger.setPrice((int) row.get("price"));
//			burger.setQty((int) row.get("qty"));
//			burger.setTotal((int) row.get("total"));
//			burgers.add(burger);
//		}
//		return burgers;
//	}
}