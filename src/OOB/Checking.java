package OOB;

public class Checking extends Account {
    String debitCardNo;
    int debitCardPIN;

    public Checking(String name, String ssn, double balance) {
        super(name, ssn, balance);
        this.accountNumber = "1" + super.accountNumber;
        this.debitCardNo = generateDebitCardNo();
        this.debitCardPIN = 1000 + (int)(Math.random()*9000);
        setInterestRate(getBaseInterestRate());

    }



    public void setInterestRate(double a) {

        this.interestRate = super.interestRate * 15 / 100;
    }
    public String generateDebitCardNo(){

        return ("9" + 10000000000000L + (long)(Math.random() * 900000000000000L));
    }

    public String showInfo(){

        return super.showInfo() + "ACCOUNT TYPE: " + "Checking" + "\n" + "DEBIT CARD NUMBER: " + debitCardNo + "\n"
                + "DEBIT CARD PIN: " + debitCardPIN + "\n" +
                "INTEREST RATE: " + interestRate;

    }

}