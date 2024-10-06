//1. Write both your names + emails at the top of the document as a comment.
//Seth Fenton, sfenton50@stuy.edu, Ansel Darnell, Adarnell60@stuy.edu
//2. Copy your arrToString method from before.
public class ArrayMethods {
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

public static String arrToString(String[] convertString) {
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

/**Return a String that represets the array in the format:
* "[2, 3, 4, 9]"
* Note the comma+space between values, and between values
*/

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

//3. Write arrToString, with a 2D array parameter.
//Note: Different parameters are allowed with the same function name.
/**Return a String that represets the 2D array in the format:
  * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
  * Note the comma+space between values, and between arrays
  * You are encouraged to notice that you may want to re-use
  * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
  */
public static String arrToString(int[][]ary){
  //this should use arrToString(int[])
  if (ary.length == 0) {
  return("[[]]");
  }
  String returnn = "[";
  for(int i = 0; i < ary.length-1; i++){
    returnn += arrToString(ary[i]) + ", ";
  }
  return (returnn + arrToString(ary[ary.length - 1]) + "]");
}

/*Return the sum of all of the values in the 2D array */

public static int arr2DSum(int[][]nums){
  if (nums.length == 0 || nums[0].length == 0) {
  return(0);
  }
  int sum = 0;
  for (int i = 0; i < nums.length; i++) {
    for (int k = 0; k < nums[i].length; k++) {
      sum += nums[i][k];
    }
  }
  return sum;//place holder return value so it compiles.
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
public static int[] returnCopy(int[] ary) {
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
	returnArray[i] = returnCopy(nums[i]);
	}
	else {
	returnArray[i] = EmptyArray;
	}
	}
	return(returnArray);
	
}
/**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
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

public static void main (String[] args) {
  int[] testCase = {2,3,4,9};
  System.out.println(arrToString(testCase));
  int[][] testCase1 = new int[][] {{2,3,4,9}, {2,3,4,9}, {2,3,4,9}};
  int [][] testCaseVoid = new int[0][0];
  int [][] testCase2 = {{1,2,3},{4,5,6}};
  int [][] testCaseVoidPartial = {{1,-2,3,4,-5,6,-7,-8},{},{-2,3,-4,5,-6,7,-8,9}};
  int [][] testCase3 = {{1,-2,3,4,-5,6,-7,-8},{4,-5,6,-7,8,-9,10,11},{-2,3,-4,5,-6,7,-8,9}};
  System.out.println(arrToString(testCase1));
  System.out.println(arrToString(testCaseVoid));
  System.out.println(arrToString(testCase3));
  System.out.println(arr2DSum(testCase1));
  System.out.println(arr2DSum(testCaseVoid));
  System.out.println(arr2DSum(testCase3));
  System.out.println(arr2DSum(testCaseVoidPartial));
  System.out.println(arrToString(swapRC(testCase2)));
  System.out.println(arrToString(swapRC(testCase3)));
  System.out.println(arrToString(copy(testCase2)));
  System.out.println(arrToString(copy(testCaseVoidPartial)));
  System.out.println(arrToString(copy(testCaseVoid)));
  System.out.println(arrToString(copy(testCase3)));
  replaceNegative(testCase2);
  replaceNegative(testCaseVoid);
  replaceNegative(testCaseVoidPartial);
  replaceNegative(testCase3);
  System.out.println(arrToString(testCase2));
  System.out.println(arrToString(testCaseVoid));
  System.out.println(arrToString(testCaseVoidPartial));
  System.out.println(arrToString(testCase3));

}
}
