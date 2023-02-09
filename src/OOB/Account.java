package OOB;

abstract   class Account implements BaseInterestRate {
    protected String name;
    protected String ssn;
    protected double balance;
    protected String accountNumber;
    protected String routingNumber;
    protected double interestRate;
    protected String type;

    public Account(String name, String ssn, double balance) {
        this.name = name;
        this.ssn = ssn;
        this.balance = balance;
        this.accountNumber = generateAccountNumber();
        this.routingNumber = generateRoutingNumber();
        this.interestRate = getBaseInterestRate();

    }



    public String generateAccountNumber(){

        String lastFour = ssn.substring(ssn.length()-4, ssn.length()-1);

        int randomSeven = (int)(1000000+Math.random() * 9000000);

        return lastFour + randomSeven;
    }
    public String generateRoutingNumber(){

        return "00" + ((int)(1000000+Math.random() * 9000000));
    }

    public void deposit(double b){
        double newBalance = b + balance;
        System.out.println(newBalance);

    }
    public void withdraw(double c){
        double newBal = balance - c;
        if (c > balance){
            System.out.println("You do ot have a sufficient balance to withdraw.");
        }
        else System.out.println(newBal);

    }
    public String showInfo(){

        return "NAME: " + name + "\n" + "SSN: " + ssn + "\n" + "ACCOUNT NUMBER: " + accountNumber + "\n" +
                "ROUTING NUMBER: " + routingNumber + "\n" + "BALANCE: " + balance;

    }
}
