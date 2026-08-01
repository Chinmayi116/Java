interface Account {
    void calculateInterest();
}

class SavingsAccount implements Account {

    public void calculateInterest() {
        double principal = 10000;
        double rate = 4;
        double interest = principal * rate / 100;

        System.out.println("Savings Interest = " + interest);
    }
}

class CurrentAccount implements Account {

    public void calculateInterest() {
        System.out.println("Current Account Interest = 0");
    }
}

class FixedDepositAccount implements Account {

    public void calculateInterest() {
        double principal = 10000;
        double rate = 7;
        double interest = principal * rate / 100;

        System.out.println("FD Interest = " + interest);
    }
}

public class InterfaceDemo {

    public static void main(String args[]) {

        SavingsAccount s = new SavingsAccount();
        CurrentAccount c = new CurrentAccount();
        FixedDepositAccount f = new FixedDepositAccount();

        s.calculateInterest();
        c.calculateInterest();
        f.calculateInterest();
    }
}
