package com.practice.customized.exception;

public class ProductNotFoundMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			checkProuct(0);
		} catch (ProductNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void checkProuct(int stock) throws ProductNotFoundException {
		
		if( stock <= 0) {
			throw new ProductNotFoundException("stock is not available for this product");
		}
		else {
			System.out.println("stock is available for this product");
		}
	}

}
