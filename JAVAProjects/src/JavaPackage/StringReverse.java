package JavaPackage;



import java.util.Scanner;


public class StringReverse {



public static void main(java.lang.String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.println(" Enter a String");

String str = scanner.nextLine();

String reversed = "";

for(int i = str.length()-1;i>=0;i--) {

reversed += str.charAt(i);

}

System.out.println("The reversed string is:" + reversed);

}



}