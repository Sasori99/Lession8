package com.k001.informationPeople;

class Information extends CheckInputValue{
    protected String name;
    protected String address;

    public void inputName() {
        System.out.println("Input name: ");
        this.name = this.inputString();
    }

    public void inputAddress() {
        System.out.println("Input address: ");
        this.address = this.inputString();
    }
    public void inputInformation(){
        this.inputName();
        this.inputAddress();
    }
    public void displayInformation(){
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
    }
}
