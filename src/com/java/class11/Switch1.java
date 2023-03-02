package com.java.class11;

public class Switch1 {
    public static void main(String[] args) {

        int rate = 1;
        /*if (rate == 1) {
            System.out.println("Awful service");
        }
        else if (rate==2)
        System.out.println("Extremely poor service");
        */
            //once java finds the first matching case
        //it will enter the body that case execute it
        //end it will enter the bodies of all of the following
        //cases until the first break or end of thr switch
        switch (rate) {
            case 1: //2 ==1 ?
                //break is an optional statement
                //you end the case with brake statement
                //when you want to end the switch statement with logic
                //of the case
            case 2:
            case 3:
                System.out.println("Bad service");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("OKey service");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("Good service");
                break;

            default:// it's same as else statement
                System.out.println("Invalid input");
        }


        /*
        if (shipmentCountry("Alaska")) {
        }
        else if (shipmentCountry("NYC")) {
        }
        else if (shipmentCountry("Florida")) {
        }
         else if (shipmentCountry("California")) {
        }

         */

        String shipmentCountry = "Hawaii";
        final String il = "Illinois";

        switch (shipmentCountry) {
            //if case is Alaska || Hawaii. Printout Shipment cost is $10"
            case "Alaska":
            case "Hawaii":
                System.out.println("Shipment cost is $10");
                break;
            case il:
                System.out.println("Ilinois");
                break;
            case "NYC":
                System.out.println("Shipment cost is $5");
                break;
            case "Florida":
                System.out.println("Shipment cost is $7");
                break;
            case"California":
                System.out.println("Shipment cost is $12");
                break;
            //if you have same exact body for 2. It should be merge

            //variables are not allowed in case
            //String value in double are literals
            //value like 5,10, 143.44
        }

        //final is a java keyword that ensures the value of a variables can only be
        //initialized once and can not be changed afterwards
        //this is constant value
        final int num = 23;
        //num = 10;

        //ex.
        //area code for Chicago
        final int areaCodeForChicago = 312;
    }
}
