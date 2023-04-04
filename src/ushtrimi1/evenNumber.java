package ushtrimi1;

import java.util.Scanner;

public class evenNumber {
    public static void main(String[] args) {

 Scanner scan =new Scanner(System.in);
        System.out.println("ju lutem vendosni nje numer pozitiv");
 int numri= scan.nextInt();
 while(numri<0){
     System.out.println("ju lutem vent=dosni numer pozitiv ");
     numri= scan.nextInt();
 }
if(numri%2==0){
    System.out.println("numri i vendosur"+numri+"eshte cift");

}
else {
    System.out.println("numri eshte tek");
}
    }
}
