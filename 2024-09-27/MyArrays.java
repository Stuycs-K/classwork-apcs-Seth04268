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

}
