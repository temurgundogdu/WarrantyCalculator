package com.temur;

/*
 * tgundogdu
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Calc calculator = new Calc();
        String serial, sure;
        int vsure = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter serial number: ");

        while ((serial = scanner.nextLine()).length() < 9) {
            System.out.println("Serial number must be at least" +
                    " 9 digits!!!");
            System.out.println("Please enter serial number: ");
        }
        calculator.setSerialNumber(serial);

        System.out.println("Please enter warranty period: " + "\n"
                + "1 [1 year] 2 [2 years]");

        while (true) {
            sure = scanner.nextLine();
            if ((sure.length() < 1)) {
                vsure = 0;
            } else {
                try {
                    vsure = Integer.parseInt(sure);
                } catch (NumberFormatException e) {
                    vsure = 0;
                }
            }

            switch (vsure) {
                case 1: case 2:
                    calculator.setWarYear(vsure);
                    System.out.println("Year of production: " + (calculator.yearPicker() + 2000));
                    System.out.println("Week of production: " + calculator.weekPicker());
                    calculator.prodDate();
                    calculator.warDate();
                    break;
                default:
                    System.out.println("You must enter 1 or 2 for warranty period!!! ");
                    System.out.println("Please enter warranty period: " + "\n"
                            + "1 [1 year] 2 [2 years]");
            }}
    }
}
