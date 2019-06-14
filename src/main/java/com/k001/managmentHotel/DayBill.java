package com.k001.managmentHotel;

class DayBill extends CommonInformation {
    private int mNumberOfDay;
    private double mMoney;

    DayBill() {
        mNumberOfDay = 0;
        mMoney = 0;
    }

    @Override
    public void addBill() {
        super.addBill();
        System.out.println("Number of Rental Day:");
        mNumberOfDay = super.inputInteger();
        mMoney = mNumberOfDay * super.getmPrice();
    }

    @Override
    public void displayBill() {
        super.displayBill();
        System.out.println("Number of Rental Day: " + mNumberOfDay);
        System.out.println("Bill: " + mMoney);
    }

    public double getmMoney() {
        return mMoney;
    }

    public int getmNumberOfDay() {
        return mNumberOfDay;
    }
}
