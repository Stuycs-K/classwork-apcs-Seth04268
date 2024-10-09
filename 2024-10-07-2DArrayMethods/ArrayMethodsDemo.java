public class ArrayMethodsDemo {
   //compare the two methods:

   //One just modifies a parameter, and needs no return value
   public static void modify(int[]nums){
      nums[0] = -99;
   }

   //The other creates a new array and does require a return value
   public static int[] createArray(int[]nums){
      int[]ans = new int[nums.length];
      ans[0] = 6666;
      return ans;
   }

   public static void main(String[] args) {
      int [] values = {1,2,3,4,5};
      //create a new array and change it:
      int [] values2 = createArray(values);
      //modify an existing array:
      modify(values);

   }
}
