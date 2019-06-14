package com.k001.managmentHotel;

public class Main {
    public static void main(String[] args) {
        DayBill[] dayBills = new DayBill[100];
        HourBill[] hourBills = new HourBill[100];
        int numberOfDayBill = 0;
        int numberOfHourBill = 0;
        Menu menu = new Menu();
        System.out.println("Welcome to OKAMI Hotel!!!!");
        menu.chooseOption(dayBills, hourBills, numberOfDayBill, numberOfHourBill);
    }
}
