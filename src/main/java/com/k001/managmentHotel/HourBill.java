package com.k001.managmentHotel;

class HourBill extends CommonInformation {
    private int mNumberOfHour;
    private double mMoney;

    HourBill(){
        mNumberOfHour = 0;
        mMoney = 0;
    }

    @Override
    public void addBill(){
        super.addBill();
        System.out.println("Number of Rental Hour:");
        mNumberOfHour = this.inputInteger();
        mMoney = mNumberOfHour * super.getmPrice();
    }

    @Override
    public void displayBill() {
        super.displayBill();
        System.out.println("Number of Rental Hour:" + mNumberOfHour);
        System.out.println("Bill: " + mMoney);
    }

    public int getmNumberOfHour() {
        return mNumberOfHour;
    }

    public double getmMoney() {
        return mMoney;
    }
}
