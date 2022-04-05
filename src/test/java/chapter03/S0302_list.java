package chapter03;

import java.util.ArrayList;
import java.util.List;

public class S0302_list<W> {

	public static <E> void printArray(E[] inputArray) {
		
		
	}
	public static void main(String[] args) {
		
		List<String> languages = new ArrayList<String>();
		languages.add("Kurdish");
		languages.add("Persian");
		languages.add("Engilish");
		languages.add("French");
		
		for(String lang : languages)
		{
			System.out.println(lang.toUpperCase());
		}
	}

}
