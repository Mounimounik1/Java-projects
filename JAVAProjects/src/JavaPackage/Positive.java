package JavaPackage;


import java.util.Scanner;


public class Positive {


public static void main(String[] args) {

int n;

Scanner sc = new Scanner(System.in);


System.out.println("Enter num");

n=sc.nextInt();



if(n>0) {

System.out.println("Positive");

}

else if(n<0) {

System.out.println("Negative");

}else {

System.out.println("Zero");

}

}


}