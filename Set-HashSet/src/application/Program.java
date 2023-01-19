package application;

import java.util.HashSet;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		
//		HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado
		
		Set<String> set = new HashSet<>();
		
//		Adiciona na lista
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		set.add("Celular");
		
//		Valida se na lista tem o dado
//		System.out.println(set.contains("Notebook"));
		
//		Remove o dado da lista
		set.remove("Tablet");
			
//		Remove com condição
		set.removeIf(x -> x.charAt(0) == 'N');
//		set.removeIf(x -> x.length() >= 3);
		
		for (String p : set) {
			System.out.println(p);
		}
	}
}