abstract class Bank {
    abstract void getInterestRate();   // abstract method
}

// SBI class
class SBI extends Bank {
    void getInterestRate() {
        System.out.println("SBI Interest Rate: 6%");
    }
}

// HDFC class
class HDFC extends Bank {
    void getInterestRate() {
        System.out.println("HDFC Interest Rate: 7%");
    }
}

// ICICI class
class ICICI extends Bank {
    void getInterestRate() {
        System.out.println("ICICI Interest Rate: 6.5%");
    }
}

public class Main {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        b.getInterestRate();

        b = new HDFC();
        b.getInterestRate();

        b = new ICICI();
        b.getInterestRate();
    }
}
