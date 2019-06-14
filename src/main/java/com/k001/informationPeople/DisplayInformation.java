package com.k001.informationPeople;
class DisplayInformation extends CheckInputValue{
    private Information human;
    public void inputInformation(){
        int options;
        do {
            System.out.println("Choose an option:");
            System.out.println("1-Student");
            System.out.println("2-Employee");
            System.out.println("3-Customer");
            options = this.inputInteger();
            if (options < 1 || options > 3) System.out.println("ERROR!!! Please make a choose!!!");
        } while (options < 1 || options > 3);
        switch (options){
            case 1:{
                human = new Student();
                break;
            }
            case 2:{
                human = new Employee();
                break;
            }
            case 3:{
                human = new Customer();
                break;
            }
        }
        human.inputInformation();
        human.displayInformation();
    }
}
