package com.java.class11;

public class NestedSwitch {
    public static void main(String[] args) {

        //case or default statement can have entire switch statement inside

        //Online store
        // we want to write a program which calculate shipping cost based on destination and base on total spending
        //if customer spending < $5  ->  $5 shipping
        //if spending >5 and <= 10  -> $10 shipping
        // >10 -> we also look shipping destination


        //if USA -> 10% of total spending for spending
        //if Canada -> 15% of total spending for spending
        // Europe -> 20% of total spending for spending
        //other place -> 25% of total spending for spending


       /* int num = 10;
        String country = "USA";
        switch (num) {
            case 1:
                System.out.println("case1");
                switch (country) {
                    case "USA" */

        String destination = "USA";
        double totalSpending = 144;
        if ((int) totalSpending > 0) {
            switch ((int) totalSpending) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:

                    System.out.println("Shipping cost $5");
                    break;

                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    System.out.println("SHipping cost is $10");
                    break;


                default:
                    switch (destination.toLowerCase()) {
                        case "usa": //10%
                            System.out.println("Shipping cost is &" + totalSpending * 0.1);
                            break;
                        case "canada": //15%
                            System.out.println("Shipping cost is &" + totalSpending * 0.15);
                            break;
                        case "europa"://20%
                            System.out.println("Shipping cost is &" + totalSpending * 0.2);
                            break;
                        default://25%
                            System.out.println("Shipping cost is &" + totalSpending * 0.25);
                            break;
                    }
            }
        }

        else {
            System.out.println("Wrong input");
        }
    }
}
