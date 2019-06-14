package com.k001.informationPeople;

public class Customer extends Information{
    private String typeOfCar;
    private double cost;
    public void inputTypeOfCar(){
        System.out.println("Input type of car: ");
        this.typeOfCar = this.inputString();
    }
    public void inputCost(){
        System.out.println("Input cost: ");
        this.cost = this.inputDouble();
    }

    public void inputInformation(){
        super.inputInformation();
        this.inputTypeOfCar();
        this.inputCost();
    }
    public void exportBill(){
        System.out.println("Car: " + this.typeOfCar);
        System.out.println("Cost: " + this.cost);
    }
    public void displayInformation(){
        super.displayInformation();
        this.exportBill();
    }
}
