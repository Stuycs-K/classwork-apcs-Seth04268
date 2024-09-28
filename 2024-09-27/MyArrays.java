public class MyArrays {
	public static String convertArrayInt(int[] convertString) {
	String returnString = "[";
	for (int i = 0; i < convertString.length; i++) {
		if (i < convertString.length - 1) {
			returnString += convertString[i] + ", ";
		}
		else  {
			returnString += convertString[i];
		}
	}
	return(returnString + "]");
	}
	
	public static String convertArrayString(String[] convertString) {
	String returnString = "[";
	for (int i = 0; i < convertString.length; i++) {
		if (i < convertString.length - 1) {
			returnString += convertString[i] + ", ";
		}
		else  {
			returnString += convertString[i];
		}
	}
	return(returnString + "]");
	}
	public static int[] returnCopy(int[] ary) {
		int[] returnArray = new int[ary.length]; 
		for (int i = 0; i < ary.length; i++) {
			 returnArray[i] = ary[i];
		}
		return(returnArray);
	}


	public static void main (String arg[]) {
	int[] numberCount = {1,2,3,4,5,6,7,8};
	int[] emptyForTest = new int[0]; 
	//Printing the tests for the ints
	System.out.println(convertArrayInt(numberCount));
	System.out.println(convertArrayInt(emptyForTest));
	
	String[] arr = new String[]{"Apple","Banana","Orange"};
	String[] arr2 = new String[0]; 
	//Printing the tests for the ints
	System.out.println(convertArrayString(arr));
	System.out.println(convertArrayString(arr2));
	
	
	int[] arr1 = {1,2,3,4,5,6,7,8};
	System.out.println(convertArrayInt(arr1).equals(convertArrayInt(returnCopy(arr1))));
	System.out.println(arr1 != returnCopy(arr1));
	int[] arr4 = {1,2,3,4,5,6,7,8,9,10,11,12};
	System.out.println(convertArrayInt(arr4).equals(convertArrayInt(returnCopy(arr4))));
	System.out.println(arr4 != returnCopy(arr4));
	int[] arr7 = new int[0];
	System.out.println(convertArrayInt(arr7).equals(convertArrayInt(returnCopy(arr7))));
	System.out.println(arr7 != returnCopy(arr7));
	
	
	}

}
