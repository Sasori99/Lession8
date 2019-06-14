package com.k001.informationPeople;

class Student extends Information{
    private double scoreSubject1;
    private double scoreSubject2;

    public void inputScore() {
        double score;
        System.out.println("Input score subject 1: ");
        score = this.inputDouble();
        this.scoreSubject1 = score;
        System.out.println("Input score subject 2: ");
        score = this.inputDouble();
        this.scoreSubject2 = score;
    }
    public double sumScore(){
        return this.scoreSubject1 + this.scoreSubject2;
    }
    public void inputInformation(){
        super.inputInformation();
        this.inputScore();
    }
    public void displayInformation(){
        super.displayInformation();
        System.out.println("Score subject 1: " + this.scoreSubject1);
        System.out.println("Score subject 2: " + this.scoreSubject2);
    }
    public void update(Student newStudent){
        this.name = newStudent.name;
        this.address = newStudent.address;
        this.scoreSubject1 = newStudent.scoreSubject1;
        this.scoreSubject2 = newStudent.scoreSubject2;
    }
    public void changeScore() {
        int options;
        do {
            System.out.println("0-Change score subject 1");
            System.out.println("1-Change score subject 2");
            options = this.inputInteger();
            if (options < 0 || options > 1) System.out.println("ERROR!!! Please make a choose!!!");
        } while (options < 0 || options > 1);
        double value = this.inputDouble();
        if (options == 0) this.scoreSubject1 = value;
        else this.scoreSubject2 = value;
    }
}
