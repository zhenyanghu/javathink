package thinkinjava.chapter15;

import thinkinjava.util.Generator;

public class Customer {

	private static long count = 1;
	private final long id = count++;
	private Customer() {
	}
	public String toString() {
		return "Customer -- " + id;
	}
	
	public static Generator<Customer> generator() {
		return new Generator<Customer>() {

			@Override
			public Customer next() {
				return new Customer();				 
			}
			
		};
	}
	
	public static void main(String[] args) {
		Customer customer = generator().next();
		System.out.println(customer);
		Customer customer1 = generator().next();
		System.out.println(customer1);
	}
}
