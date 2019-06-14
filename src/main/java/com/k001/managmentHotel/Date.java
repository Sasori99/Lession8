package com.k001.managmentHotel;

public class Date {
    private int mDay;
    private int mMonth;
    private int mYear;

    Date(){
        mDay = 0;
        mMonth = 0;
        mYear = 0;
    }

    public boolean checkDate(){
        if (mDay <= 0 || mMonth <= 0 || mYear <= 0) return false;
        if (mMonth == 1 || mMonth == 3 || mMonth == 5 || mMonth == 7 || mMonth == 8 || mMonth == 10 || mMonth == 12) {
            if (mDay > 31) return false;
        }
        if (mMonth == 4 || mMonth == 6 || mMonth == 9 || mMonth == 11){
            if (mDay > 30) return false;
        }
        if (mMonth == 2){
            if ((mYear % 4 == 0 && mYear % 100 != 0) || (mYear % 400 == 0)){
                if (mDay > 29) return false;
            }
            else{
                if (mDay > 28) return false;
            }
        }
        if (mMonth > 12) return false;
        return true;
    }

    public int getmDay() {
        return mDay;
    }

    public int getmMonth() {
        return mMonth;
    }

    public int getmYear() {
        return mYear;
    }

    public void setmDay(int mDay) {
        this.mDay = mDay;
    }

    public void setmMonth(int mMonth) {
        this.mMonth = mMonth;
    }

    public void setmYear(int mYear) {
        this.mYear = mYear;
    }
}
