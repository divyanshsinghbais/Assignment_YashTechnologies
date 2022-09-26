/**
 * 
 */
package com.yash.pms;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.yash.pms.exceptions.InvalidInput;
import com.yash.pms.exceptions.ProductAlreadyExistException;
import com.yash.pms.exceptions.ProductDoesNotExistException;
import com.yash.pms.model.Product;
import com.yash.pms.services.ProductService;

/**
 * @author divyansh.singh
 *
 */
public class ProductManagementSystem {

	/**
	 * @param args
	 * @throws InvalidInput 
	 * @throws ProductAlreadyExistException 
	 * @throws ProductDoesNotExistException 
	 */
	public static void main(String[] args) throws InvalidInput, ProductAlreadyExistException, ProductDoesNotExistException {

		System.out.println("Welcome to product store.\n");

		ProductService productService = new ProductService();

		//Initialize default products
		productService.initProducts();

		try (// Creating Scanner Object to read input
				Scanner input = new Scanner(System.in)) {
			int option;

			// Do - While loop
			do {
				productService.menu();
				option = input.nextInt();

				// Switch case
				switch (option) {

				case 1:
					productService.showProducts();
					break;

					// Case 2
				case 2:
					//Take id
					System.out.print("Enter product id ? ");
					int p_id = input.nextInt();
					input.nextLine();

					System.out.print("Enter product name ? ");
					String p_name = input.nextLine();

					System.out.print("Enter product price ? ");
					int p_price = input.nextInt();			

					//Created and insert new product in the object array
					Product product = new Product(p_id, p_name, p_price);
					System.out.println("New product added: "
							+productService.addProduct(product).toString());				

					break;

					//Case 3: Delete 
					// Case 2
				case 3:
					//Take id
					System.out.print("Enter product id ? ");
					int p_id1 = input.nextInt();
					input.nextLine();

					//Delete new product in the object array
					System.out.println("Product with id: "+productService.deleteProduct(p_id1) +" is deleted");
					break;

				case 4:
					//Take id
					System.out.print("Enter product id ? ");
					int p_id2 = input.nextInt();
					input.nextLine();

					//Retrieve product details based on product ID 
					System.out.println("Product details: \n"+productService.getProductById(p_id2).toString());

					break;

				case 5:
					//Take old id
					System.out.print("Enter product id ? ");
					int old_id = input.nextInt();
					
					//Take new id
					System.out.print("Enter new product id ? ");
					int new_id = input.nextInt();
					input.nextLine();

					System.out.print("Enter new product name ? ");
					String new_name = input.nextLine();

					System.out.print("Enter new product price ? ");
					int new_price = input.nextInt();			

					//Created and insert new product in the object array
					Product p = new Product(new_id, new_name, new_price);
					System.out.println("Updated product: "
							+productService.updateProductById(old_id, p).toString());				

					break;

					// Case 6: Default case
					// If none above case executes
				default:
					
					System.exit(0);
					break;
				}
			}

			// Checking condition
			while (option != 6);
		}
		catch(InputMismatchException e) {
			System.out.println("INVALID FORMAT ENTERED");
		}
	}

}


