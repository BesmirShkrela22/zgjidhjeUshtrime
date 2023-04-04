package ushtrimi1;

public class greater {
    public static void main(String[] args) {
        int moshabesi=39;
        int moshabora=27;

        if(moshabesi>moshabora+5&& moshabesi<moshabora+10){
            System.out.println("eshte ok");

        }
        else if (moshabesi%2==0) {
            System.out.println("mosha eshte cift");


        }
        while (moshabesi>moshabora){
            System.out.println("eshte goxha mire");
         moshabora++;
        }
    }
}
