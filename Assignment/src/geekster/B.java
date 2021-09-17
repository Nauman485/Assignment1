package geekster;
import java.util.*;

public class B {
	
	public void add()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	
	public void sum() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int a = sc.nextInt();
		System.out.println("Enter num2");
		int b = sc.nextInt();
		int c = a+b;
		System.out.println(c);
		sc.close();
	}

}
