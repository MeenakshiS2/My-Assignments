package week1.day1;

public class Fibbonacci {
public static void main(String[] args) {
	int num1=0,i;
	int num2=1;
	int sum=0;
	System.out.println(num1+" "+num2);
	for(i=2;i<=11;i++)
	{sum=num1+num2;
	System.out.println(sum);
	num1=num2;
	num2=sum;
	
	}
}
}
