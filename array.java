public class Batch {
	public static void main(String args[]) {

		System.out.println("Hello Java");
		System.out.println("");
		int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] array2 = new int[intArray.length]; 
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]);
		}
	
		 for (int i = 0; i < intArray.length; i++) {     
                      array2[i] = intArray[i];     
       		 }
		System.out.println("Elements are ");    
        for (int i = 0; i < array2.length; i++) {     
           System.out.print(array2[i] + " ");  
	}

	}

}