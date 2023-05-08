package JavaPackage;


import java.util.Scanner;


public class GreatestNum {


public static void main(String[] args) {

Scanner sc = new Scanner (System.in);

int num1=20;

int num2=30;

int num3=40;

System.out.println("Enter First num");

num1=sc.nextInt();

System.out.println("Enter Second num");

num2=sc.nextInt();

System.out.println("Enter Third num");

num3=sc.nextInt();


if(num1>num2 && num2>num3) {

System.out.println("The greatest"+num1);

}else if(num2>num3 && num1>num3 ){

System.out.println("The geatest"+num2);

}else

{

System.out.println("The greatest"+num3);

}

}


}