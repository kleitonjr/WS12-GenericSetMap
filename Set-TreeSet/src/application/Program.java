package application;

import java.util.LinkedHashSet;
import java.util.Set;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		
//		LinkedHashSet - velocidade intermediária e elementos na ordem em que são
//		adicionados
		
		Set<Product> set = new LinkedHashSet<>();
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		System.out.println(set.contains(prod));
	}
}