package Questions;

public class Q109 {
    public static void main(String[] args) {
        Customer obj = new Customer();

        obj.useElectricity(15.56);

        ElectricAccount acct = new ElectricAccount();

        System.out.println(acct.getkWh());
        System.out.println(acct.getBill());


    }
}

class Customer{

    ElectricAccount acct = new ElectricAccount();

    public void useElectricity(double kWh){
        acct.addKwh(kWh); //- only one should be displayed
//        acct.addKwh1(kWh);
//        acct.addKwh2(kWh);
//        acct.addKwh3(kWh);
    }
}

class ElectricAccount {

    private double kWh;
    private double rate = 0.07;
    private double bill;

    public double getkWh() {
        return kWh;
    }

    public double getBill() {
        return bill;
    }

    //line 1

    // A
    public void addKwh (double kWh) {
        this.kWh += kWh;
        this.bill = this.kWh * this.rate;
    }

//    // B
//    public void addKwh1 (double kWh) {
//        if(kWh > 0) {
//            this.kWh += kWh;
//            this.bill = this.kWh * this.rate;
//        }
//    }
//
//    // C
//    private void addKwh2 (double kWh) {
//        if(kWh > 0) {
//            this.kWh += kWh;
//            this.bill = this.kWh * this.rate;
//        }
//    }
//
//    // D
//    private void addKwh3 (double kWh) {
//        if(kWh > 0) {
//            this.kWh += kWh;
//            this.bill = this.kWh * this.rate;
//        }
//    }
//    public void setBill (double kWh){
//        bill = kWh * rate;
//    }

}

/*
Any amount of electricity used by a customer (represented by an instance of the Customer class) must contribute to the customer's bill (represented by the member variable bill) through the useElectricity method. An instance of the Customer class should never be able to tamper with or decrease the value of the member variable bill. How should you write methods in the ElectricAccount class at line n1 so that the member variable bill is always equal to the value of the member variable kwh multiplied by the member variable rate?

A
B
C
D
 */


