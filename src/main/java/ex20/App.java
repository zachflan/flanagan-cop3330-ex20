/*
 *  UCF COP3330 Summer 2021 Assignment 14 Solution
 *  Copyright 2021 Zachary Flanagan
 */

package ex20;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner orderAmount = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        String orderAmountS = orderAmount.nextLine();
        double orderAmountD = Double.parseDouble(orderAmountS);

        Scanner state = new Scanner(System.in);
        System.out.print("What state do you live in? ");
        String stateS = state.nextLine();

        double Wisconsintax = 0.05 * orderAmountD;
        double EauClairetax = 0.005 * orderAmountD;
        double Dunntax = 0.004 * orderAmountD;
        double Illinoisintax = 0.08 * orderAmountD;

        if(stateS.equals("Wisconsin")){
            orderAmountD = orderAmountD + Wisconsintax;
            Scanner county = new Scanner(System.in);
            System.out.print("What county do you live in? ");
            String countyS = county.nextLine();
            if(countyS.equals("Eau Claire")){
                double totaltax = Wisconsintax + EauClairetax;
                System.out.format("The tax is $%.2f.\n", totaltax);
                orderAmountD = orderAmountD + totaltax;
                System.out.format("The total is $%.2f.", orderAmountD);
            } else if(countyS.equals("Dunn")){
                double totaltax = Wisconsintax + Dunntax;
                System.out.format("The tax is $%.2f.\n", totaltax);
                orderAmountD = orderAmountD + totaltax;
                System.out.format("The total is $%.2f.", orderAmountD);
            } else {
                System.out.format("The tax is $%.2f.\n", Wisconsintax);
                System.out.format("The total is $%.2f.", orderAmountD);
            }

        } else if (stateS.equals("Illinois")){
            orderAmountD = orderAmountD + Illinoisintax;
            System.out.format("The tax is $%.2f.\n", Illinoisintax);
            System.out.format("The total is $%.2f.", orderAmountD);
        } else {
            System.out.format("No sales tax.");
        }
    }
}