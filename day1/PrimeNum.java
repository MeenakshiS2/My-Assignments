package week1.day1;

public class PrimeNum {
public static void main(String[] args) {
    int n = 70;
    boolean flag = false;
    for (int i = 2; i <n-1; i++) {
    
      if (n%i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(n + " is a prime number.");
    else
      System.out.println(n + " is not a prime number.");
	System.out.println();
}
}
