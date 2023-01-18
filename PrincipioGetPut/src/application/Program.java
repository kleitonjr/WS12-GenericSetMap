package application;

import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
	
		//COVARIANCIA
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		
		//GET - OK
		Number x = list.get(0);

		//PUT - ERROR
		list.add(20); // erro de compilacao

		//CONTRAVAIRANCIA
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs;

		//Put - OK
		myNums.add(10);
		myNums.add(3.14);
		
		//GET -> ERROR
		Number x = myNums.get(0); // erro de compilacao

	}

}
