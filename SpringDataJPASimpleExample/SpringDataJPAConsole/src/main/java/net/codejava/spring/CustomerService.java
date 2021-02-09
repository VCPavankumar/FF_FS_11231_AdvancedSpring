package net.codejava.spring;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerService {
	@Autowired
	private CustomerRepository repository;

	public void test() {
		// Save a new customer
		Customer newCustomer = new Customer();
		newCustomer.setFirstName("John");
		newCustomer.setLastName("Smith");

		repository.save(newCustomer);
		//	native query
		repository.insertQueryLastName("smith");
		// Find a customer by ID
		Optional<Customer> result = repository.findById(1L);
		result.ifPresent(customer -> System.out.println(customer));

		// Find customers by last name
		List<Customer> customers = repository.findByLastName("Smith");
		customers.forEach(customer -> System.out.println(customer));

		// lastname using query
		List<Customer> customers3 = repository.findQueryLastName("Smith");
		customers3.forEach(customer -> System.out.println(customer));

		// frst name
		List<Customer> customers1 = repository.findByFirstName("John");
		customers1.forEach(customer -> System.out.println(customer));

		// frst name nad last name
		List<Customer> customers2 = repository.findByFirstNameAndLastName("John", "Smith");
		customers2.forEach(customer -> System.out.println(customer));

		// List all customers
		Iterable<Customer> iterator = repository.findAll();
		iterator.forEach(customer -> System.out.println(customer));

		// Count number of customer
		long count = repository.count();
		System.out.println("Number of customers: " + count);

		System.out.println(" --paginate customer sorted by id--");
		Pageable pageable = PageRequest.of(0, 2, Sort.by("id").descending());

		while (true) {
			Page<Customer> page = repository.findAll(pageable);
			System.out.println("Page no: " + page.getNumber());
			page.getContent().forEach(System.out::println);
			if (!page.hasNext()) {
				break;
			}
			pageable = page.nextPageable();
		}

	}
}
