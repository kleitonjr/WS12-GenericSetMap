package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
//		Na contagem de votos de uma eleição, são gerados vários registros
//		de votação contendo o nome do candidato e a quantidade de votos
//		(formato .csv) que ele obteve em uma urna de votação. Você deve
//		fazer um programa para ler os registros de votação a partir de um
//		arquivo, e daí gerar um relatório consolidado com os totais de cada
//		candidato.
		
		System.out.print("Informe o caminho completo do arquivo: ");
		String path = sc.nextLine();		
//		C:\temp\map.txt
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
		
			Map<String, Integer> votes = new LinkedHashMap<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				int count = Integer.parseInt(fields[1]);
				
				if(votes.containsKey(name)) {
					int votesSoFar = votes.get(name);
					votes.put(name, count + votesSoFar);
				}
				else{
					votes.put(name, count);
				}
				
				line = br.readLine();
			}
			for(String key : votes.keySet()) {
				System.out.println(key  + ": " + votes.get(key));
			}
			
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
