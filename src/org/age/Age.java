package org.age;
import java.util.Scanner;
public class Age {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the age");
	int age=s.nextInt();
	System.out.println("Enter the person age:"+age);
	if (age==18) {
		System.out.println("Person is elegible to vote");
	} else {
		System.out.println("Persobn is not elegible to vote");

	}
	System.out.println("its done");
	System.out.println("its done");
		
}
}
