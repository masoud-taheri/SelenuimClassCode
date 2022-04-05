package chapter03;

import java.util.ArrayList;
import java.util.List;

public class S0303_listStream<W> {

	public static <E> void printArray(E[] inputArray) {
		
		
	}
	public static void main(String[] args) {
		
		List<String> languages = new ArrayList<String>();
		languages.add("Kurdish");
		languages.add("Persian");
		languages.add("Engilish");
		languages.add("French");
		
		languages.stream().forEach(i->System.out.println(i));
		System.out.println("_________________________________________");
		languages.stream().map(y->y.toUpperCase()).forEach(i->System.out.println(i));
	}

}
