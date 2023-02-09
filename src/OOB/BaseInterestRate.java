package OOB;

public interface BaseInterestRate {
    double BASE_INTEREST_RATE = 2.5;
    default double getBaseInterestRate(){


        return BASE_INTEREST_RATE;
    }

    public static void setInterestRate(double a) {

    }


}



