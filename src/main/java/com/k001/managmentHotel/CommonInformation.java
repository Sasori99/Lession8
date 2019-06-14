package com.k001.managmentHotel;

import com.k001.informationPeople.CheckInputValue;

public class CommonInformation extends CheckInputValue {
    private String mIdBill;
    private Date mDate;
    private String mNameCustomer;
    private String mIdRoom;
    private double mPrice;

    CommonInformation() {
        mIdBill = "";
        mDate = new Date();
        mNameCustomer = "";
        mIdRoom = "";
        mPrice = 0.0;
    }

    private boolean checkPrice(){
        if (mPrice < 0.0) return false;
        return true;
    }

    public void addBill() {
        System.out.println("Input information of new day bill:");

        System.out.println("ID Bill:");
        mIdBill = this.inputString();

        while (true) {
            System.out.println("Day:");
            mDate.setmDay(this.inputInteger());
            System.out.println("Month");
            mDate.setmMonth(this.inputInteger());
            System.out.println("Year:");
            mDate.setmYear(this.inputInteger());
            if (mDate.checkDate()) break;
            else {
                System.out.println("Input day is not legal! Please input again!");
            }
        }

        System.out.println("Name of Customer:");
        this.skipSpace();
        mNameCustomer = this.inputString();

        System.out.println("ID Room:");
        mIdRoom = this.inputString();

        while (true) {
            System.out.println("Price:");
            mPrice = this.inputDouble();
            if (checkPrice()) break;
            else {
                System.out.println("Input price is not legal! Please input again!");
            }
        }
    }

    public void displayBill() {
        System.out.println("ID Bill: " + mIdBill);
        System.out.println("Date: " + mDate.getmDay() + "/" + mDate.getmMonth() + "/" + mDate.getmYear());
        System.out.println("Nam of Customer: " + mNameCustomer);
        System.out.println("ID Room: " + mIdRoom);
        System.out.println("Price: " + mPrice);
    }

    public Date getmDate() {
        return mDate;
    }

    public String getmIdBill() {
        return mIdBill;
    }

    public double getmPrice() {
        return mPrice;
    }

    public String getmIdRoom() {
        return mIdRoom;
    }

    public String getmNameCustomer() {
        return mNameCustomer;
    }

}
