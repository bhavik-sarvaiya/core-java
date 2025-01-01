package com.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.print.DocFlavor.INPUT_STREAM;

import com.stream.model.Product;

public class StreamFilter {

	public static void main(String args[]) {
		Product p1 = new Product(1, "Tea", 1000, 1);
		Product p2 = new Product(2, "rice", 3000, 1);
		Product p3 = new Product(3, "oil", 5000, 2);
		Product p4 = new Product(4, "cofeee", 750, 1);
		Product p5 = new Product(5, "wheat", 10000, 2);
		Product p6 = new Product(6, "sugar", 2000, 1);
		Product p7 = new Product(7, "milk", 1000, 2);

		List<Product> productList = new ArrayList<Product>();
		productList.add(p7);
		productList.add(p6);
		productList.add(p5);
		productList.add(p4);
		productList.add(p3);
		productList.add(p2);
		productList.add(p1);

//		List<String> productValueBaseOnType = productList
//				.stream()
//				.filter(p -> p.getType()==2)
//				.map(p -> p.getName())
//				.collect(Collectors.toList());
//		
//		System.out.println(productValueBaseOnType);

		List<String> priceList = productList
				.stream()
				//.filter(p -> p.getPrice() < 1000)
				.map(p -> p.getName())
				.collect(Collectors.toList());

		System.out.println(priceList);
		
		Integer totalPrice = productList.stream()
				.filter(p -> p.getType() == 2)
				.map(Product::getPrice)
				.reduce(0,Integer::sum);

		System.out.println(totalPrice);
		
		Map<Integer, String> productPriceMap =   productList.stream()
	            .filter(p -> p.getType() ==2)
	            .collect(Collectors.toMap(Product::getPrice, Product::getName));  
		System.out.println(productPriceMap);
	}
}
