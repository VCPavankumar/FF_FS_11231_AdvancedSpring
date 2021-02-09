package net.codejava.spring;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

public interface CustomerRepository extends  CrudRepository<Customer, Long>, PagingAndSortingRepository<Customer, Long>, JpaRepository<Customer,Long>{ //QuerydslPredicateExecutor<Customer>,
	
	@Query("select cust from Customer cust where lastname =?1")
	List<Customer> findQueryLastName(String lastName);
	
	@Modifying //insert/update
	@Transactional 
	@Query(value="insert into Customer(id,firstName,lastName) values(21,'Ram','Raj')", nativeQuery = true)
	void insertQueryLastName(String lastName);
	
	List<Customer> findByLastName(String lastName);
	List<Customer> findByFirstName(String firstName);
	List<Customer> findByFirstNameAndLastName(String firstName,String lastName);

}
