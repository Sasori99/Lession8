package com.k001.managmentHotel;

import com.k001.informationPeople.CheckInputValue;

public class Menu extends CheckInputValue {
    private int option;

    Menu() {
        option = 0;
    }

    private boolean checkOption() {
        if (option < 0 || option > 5) return false;
        return true;
    }

    private void sumOfType(int numberOfDayBill, int numberOfHourBill) {
        System.out.println("Day Bill: " + numberOfDayBill + " bills");
        System.out.println("Hour Bill: " + numberOfHourBill + " bills");
    }

    private void averageMoney(DayBill[] dayBills, HourBill[] hourBills, int numberOfDayBill, int numberOfHourBill) {
        double averageMoneyDayBill = 0.0;
        double averageMoneyHourBill = 0.0;

        for (int i = 1; i <= numberOfDayBill; i++)
            averageMoneyDayBill += dayBills[i].getmMoney();
        if (numberOfDayBill != 0) {
            averageMoneyDayBill = averageMoneyDayBill / numberOfDayBill;
        }
        System.out.println("Average Money of Day Bill: " + averageMoneyDayBill);

        for (int i = 1; i <= numberOfHourBill; i++)
            averageMoneyHourBill += hourBills[i].getmMoney();
        if (numberOfHourBill != 0) {
            averageMoneyHourBill = averageMoneyHourBill / numberOfHourBill;
        }
        System.out.println("Average Money of Hour Bill: " + averageMoneyHourBill);
    }

    public void chooseOption(DayBill[] dayBills, HourBill[] hourBills, int numberOfDayBill, int numberOfHourBill) {
        do {
            System.out.println("Choose an option:");
            System.out.println("    1. Add a bill.\n    2. Display bills.\n    3. Sum of each type.\n    4. Average money.\n    5.Get out.");
            do {
                option = super.inputInteger();
            } while (!checkOption());
            switch (option) {
                case 1: {
                    System.out.println("Choose a type of bill:");
                    System.out.println("     1. Day bill.\n     2. Hour bill.");
                    int optionBill = 0;
                    do {
                        optionBill = super.inputInteger();
                        if (optionBill != 1 && optionBill != 2) {
                            System.out.println("Choise is not legal! Please choose again!");
                        }
                    } while (optionBill != 1 && optionBill != 2);
                    if (optionBill == 1) {
                        numberOfDayBill++;
                        DayBill newDayBill = new DayBill();
                        newDayBill.addBill();
                        dayBills[numberOfDayBill] = newDayBill;
                    }
                    if (optionBill == 2) {
                        numberOfHourBill++;
                        HourBill newHourBill = new HourBill();
                        newHourBill.addBill();
                        hourBills[numberOfHourBill] = newHourBill;
                    }
                    break;
                }
                case 2: {
                    if (numberOfDayBill > 0) {
                        System.out.println("--------List of day bills---------");
                        for (int i = 1; i <= numberOfDayBill; i++) {
                            dayBills[i].displayBill();
                            System.out.println();
                        }
                    }
                    else {
                        System.out.println("List of day bills is empty!");
                    }

                    if (numberOfHourBill > 0) {
                        System.out.println("--------List of hour bills--------");
                        for (int i = 1; i <= numberOfHourBill; i++) {
                            hourBills[i].displayBill();
                            System.out.println();
                        }
                    }
                    else {
                        System.out.println("List of hour bills is empty!");
                    }
                    break;
                }
                case 3: {
                    sumOfType(numberOfDayBill, numberOfHourBill);
                    break;
                }
                case 4: {
                    averageMoney(dayBills, hourBills, numberOfDayBill, numberOfHourBill);
                    break;
                }
                case 5: {
                    System.out.println("Thank for using our service !!!!");
                    break;
                }
            }
        } while (option != 5);

    }
}
