package OOB;

public class Savings extends Account {

    int safetyDepositBoxID;
    int safetyDepositBoxPin;

    public Savings(String name, String ssn, double balance) {
        super(name, ssn, balance);
        this.accountNumber = "2" + accountNumber;
        this.safetyDepositBoxID = 100 + (int)(Math.random() * 900);
        this.safetyDepositBoxPin = 1000 + (int)(Math.random() * 9000);
        setInterestRate(getBaseInterestRate());
    }


    public void setInterestRate(double a){

        this.interestRate = super.interestRate - 0.25;
    }


    public String showInfo(){

        return super.showInfo() + "ACCOUNT TYPE: " + "Savings" + "\n" + "Checking SAFETY DEPOSIT BOX ID: " + safetyDepositBoxID +
                "\n" + "SAFETY DEPOSIT BOX PIN: " + safetyDepositBoxPin + "\n" + "INTEREST RATE: " + interestRate;
    }

}