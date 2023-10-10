public class Solution {
  static boolean isPrime(int number) {
    if (number == 0 || number == 1) {
      return false;
    }
    for (int i = 1; i <= number; i++) {
      if (number % i == 0 && (i != 1 && i != number)) {
          return false;
      }
    }
     return true;
  }
 

    public static void main(String[] args) {
      for (int i = 0; i <= 100; i++) {
        if ( Solution.isPrime(i)){
        System.out.println(i);
        }
      }
  }
}