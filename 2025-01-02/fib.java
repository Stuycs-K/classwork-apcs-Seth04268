public class fib {
  //largest number under 10 is 46
  //46 also conviently the largest not overflow number
  public static int fib(int n) {
    if (n < 2) {
      return n;
    }
    else {
      return fib(n - 1) + fib(n - 2);
    }

  }

  public static void main(String[] args) {
System.out.println(fib(Integer.parseInt(args[0])));
  }
}
