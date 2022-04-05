package chapter01;

import java.util.ArrayList;
import java.util.List;

public class S0108Class {

	public static void main(String[] args) {
		List<String> persons = new ArrayList<String>();
		persons.add(0,"farank");
		persons.add("Ali");
		persons.add("Mehdi");
		persons.add(0,"Hossein");
		//System.out.println(persons.get(2));
		for(String s: persons) 
		{
			System.out.println(s);
		}
	}

}
