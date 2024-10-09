
import java.util.Arrays;
public class ArrayDemo{


  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
  String returnString = "[";
	for (int i = 0; i < ary.length; i++) {
	  if (i < ary.length - 1) {
		returnString += ary[i] + ", ";
		}
	else  {
		returnString += ary[i];
		}
	}
	return(returnString + "]");

  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
  if (ary.length == 0) {
  return("[[]]");
  }
  String returnn = "[";
  for(int i = 0; i < ary.length-1; i++){
    returnn += arrToString(ary[i]) + ", ";
  }
  return (returnn + arrToString(ary[ary.length - 1]) + "]");
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int zeroCount = 0;
    if (nums.length == 0) {
    return(zeroCount);
    }
    for (int i = 0; i < nums.length; i++) {
    	if (nums[i].length != 0) {
    	for (int k = 0; k < nums[i].length; k++) {
    		if (nums[i][k] == 0) {
    		 zeroCount += 1;
    		}
    	
    	}
      }
    }
    return (zeroCount);
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int sum = 0;
    if (nums.length == 0) {
    return(0);
    }
    for (int i = 0; i < nums.length; i++) {
    	if (nums[i].length != 0) {
    	for (int k = 0; k < nums[i].length; k++) {
    		 sum += nums[i][k];
    	
    	}
      }
    }
    return (sum);
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
public static void replaceNegative(int[][] vals){
  for(int i = 0; i < vals.length; i++){
    for(int k = 0; k < vals[i].length; k++){
      if(vals[i][k] < 0){
         if(i == k){
           vals[i][k] = 1;
         }
         else{
           vals[i][k] = 0;
         }
      }
    }
  }
}


  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
    public static int[] copy(int[] ary) {
		int[] returnArray = new int[ary.length];
		for (int i = 0; i < ary.length; i++) {
			 returnArray[i] = ary[i];
		}
		return(returnArray);
}
public static int[][] copy(int[][] nums){
	int[][] realEmptyArray = new int[0][0];
	int[] EmptyArray = new int[0];
	if (nums.length == 0) {
	return(realEmptyArray);
	}
	int[][] returnArray = new int[nums.length][nums[0].length];
	for (int i = 0; i < nums.length; i++) {
	if (nums[0].length != 0) {
	returnArray[i] = copy(nums[i]);
	}
	else {
	returnArray[i] = EmptyArray;
	}
	}
	return(returnArray);
	
}

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
public static int[][] swapRC(int[][]nums){
int numsLength = nums[0].length;
int[][] returnArray = new int[numsLength][nums.length];
 for (int i = 0; i < nums.length; i++) {
 	for (int k = 0; k < nums[i].length; k++) {
 	returnArray[k][i] = nums[i][k];
 	}
  }
  return returnArray;
}

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
	String dataTable = "<table>";
   for (int i = 0; i < nums.length; i++) {
	   dataTable += "<tr>";
 	for (int k = 0; k < nums[i].length; k++) {
		dataTable += "<td>" + nums[i][k] + "</td>";
 	}
	dataTable += "</tr>";
   }
   dataTable += "</table>";
   return(dataTable);
  }
   public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
	  int[] testCase = {2,3,4,9};
int[][] testCase1 = new int[][] {{2,3,4,9}, {2,3,4,9}, {2,3,4,9}};
  int [][] testCaseVoid = new int[0][0];
  int [][] testCase2 = {{1,2,3},{4,5,6}};
    int [][] testCase8 = {{1,2,3},{},{4,5,6}};
  int [][] testCaseVoidPartial = {{1,-2,3,4,-5,6,-7,-8},{},{-2,3,-4,5,-6,7,-8,9}};
  int [][] testCase3 = {{1,-2,3,4,-5,6,-7,-8},{4,-5,6,-7,8,-9,10,11},{-2,3,-4,5,-6,7,-8,9}};
System.out.println("arrToString test");
System.out.println("\n");
System.out.println(arrToString(testCase1));
  System.out.println(arrToString(testCaseVoid));
  System.out.println(arrToString(testCase3));
  System.out.println("\n");
 System.out.println("arr2DSum test");
  System.out.println(arr2DSum(testCase1));
  System.out.println(arr2DSum(testCase2));
    System.out.println(arr2DSum(testCaseVoid));
    System.out.println(arr2DSum(testCase8));
  System.out.println(arr2DSum(testCase3));
  System.out.println(arr2DSum(testCaseVoidPartial));
  System.out.println("\n");
  System.out.println("swapRC");
  System.out.println(arrToString(swapRC(testCase2)));
  System.out.println(arrToString(swapRC(testCase3)));
  System.out.println("\n");
  System.out.println("copy");
  System.out.println(arrToString(copy(testCase2)));
  System.out.println(arrToString(copy(testCaseVoidPartial)));
  System.out.println(arrToString(copy(testCaseVoid)));
  System.out.println(arrToString(copy(testCase3)));
      System.out.println("\n");
  System.out.println("HTML Table Function");
   System.out.println(htmlTable(testCase2));
  System.out.println(htmlTable(testCaseVoid));
  System.out.println(htmlTable(testCaseVoidPartial));
  System.out.println(htmlTable(testCase3));

  replaceNegative(testCase2);
  replaceNegative(testCaseVoid);
  replaceNegative(testCaseVoidPartial);
  replaceNegative(testCase3);
  System.out.println("\n");
System.out.println("replaceNegative");
  System.out.println(arrToString(testCase2));
  System.out.println(arrToString(testCaseVoid));
  System.out.println(arrToString(testCaseVoidPartial));
  System.out.println(arrToString(testCase3));

  }
}
