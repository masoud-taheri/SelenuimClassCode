package chapter03;

public class S0301_GenericMethodTest<W> {

	public static <E> void printArray(E[] inputArray) {
		for(E element:inputArray) {
			System.out.print("\t" + element);
			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = {1,2,3,4,5,6};
		Double[] doubleArray = {1.1,2.2,3.3,4.4};
		Character[] charArray = {'H','E','L','L','O'};
		printArray(intArray);
		printArray(doubleArray);
		printArray(charArray);
	}

}
