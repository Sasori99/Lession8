package com.k001.informationPeople;

public class Employee extends Information {
    private double salary;
    private String postion;
    public void inputPostion(){
        System.out.println("Input Postion: ");
        this.postion = this.inputString();
    }
    public void inputSalary(){
        System.out.println("Input Salary: ");
        this.salary = this.inputDouble();
    }
    public void inputInformation(){
        super.inputInformation();
        this.inputPostion();
        this.inputSalary();
    }
    public void displayInformation(){
        super.displayInformation();
        System.out.println("Potions: " + this.postion);
        System.out.println("Salary: " + this.salary);
    }
    public void update(Employee newEmployee){
        this.name = newEmployee.name;
        this.address = newEmployee.address;
        this.salary = newEmployee.salary;
        this.postion = newEmployee.postion;
    }
    public void changeInformation(){
        int options;
        do {
            System.out.println("0-Change salary");
            System.out.println("1-Change postion");
            options = this.inputInteger();
            if (options < 0 || options > 1) System.out.println("ERROR!!! Please make a choose!!!");
        } while (options < 0 || options > 1);
        if (options == 1){
            this.postion =  this.inputString();
        } else {
            this.salary = this.inputDouble();
        }
    }
}
