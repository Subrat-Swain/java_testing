package com.anvsystems.utils;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.anvsystems.entities.Customer;

/**
 * <h1>This interface deals with CRUD operation: Create, Read, Update, Delete
 * operation for given entities
 * <h1>
 * @author Subrat Swain
 * @version 1.0
 */

// We Use I as naming convention for easy search
public interface IDataUtils {
	
	/**
	 * <p>Create a new Customer Entity</p>
	 * @param c
	 * @return customer
	 * @throws FileNotFoundException 
	 * @throws IOException 
	 */

	public Customer createCustomer(Customer c) throws FileNotFoundException, IOException;
	/**
	 * <p>Create a new Customer Entity</p>
	 * @param c
	 * @return customer
	 */
	
	public Customer readCustomer(Customer id);
	/**
	 * <p>Read a new Customer Entity</p>
	 * @param c
	 * @return customer
	 */
	
	public Customer readCustomerByName(String name);
	/**
	 * <p>Read a new Customer Entity</p>
	 * @param c
	 * @return customer
	 */
	
	public Customer updateCustomer(String id, Customer c );
	/**
	 * <p>Update an existing Customer Entity</p>
	 * @param c
	 * @return customer
	 */
	public Customer deleteCustomer(String id);
	/**
	 * <p>Delete a new Customer Entity</p>
	 * @param c
	 * @return customer
	 */
}
