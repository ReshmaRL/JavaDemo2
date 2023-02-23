package JavaDemo2;

import java.util.Scanner;

public class Name {
	static String name;
	static int age;
	public static void main(String args[]) {
		System.out.println(getName());
String result=getName();
System.out.println(result);
		//display();
	}

	static String getName() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter name");
		name = s1.next();
		int age=getage();
		System.out.print(age);
		return name;
	}
	static int getage() {
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter age");
		age = s2.nextInt();
		return age;
	}
	static void display() {
		System.out.println(name);
		System.out.println(age);
	}
}
