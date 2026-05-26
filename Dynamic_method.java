// Base class
class Payment {
void processPayment(double amount) {
System.out.println(&quot;Processing a generic payment of $&quot; + amount);
}

}
// Derived class for CreditCard
class CreditCardPayment extends Payment {
@Override
void processPayment(double amount) {
System.out.println(&quot;Processing a credit card payment of $&quot; + amount);
}
}
// Derived class for DebitCard
class DebitCardPayment extends Payment {
@Override
void processPayment(double amount) {
System.out.println(&quot;Processing a debit card payment of $&quot; + amount);
}
}
// Derived class for PayPal
class PayPalPayment extends Payment {
@Override
void processPayment(double amount) {
System.out.println(&quot;Processing a PayPal payment of $&quot; + amount);
}
}
public class PaymentSystem {
public static void main(String[] args) {
// Creating objects of different payment types
Payment creditCard = new CreditCardPayment();
Payment debitCard = new DebitCardPayment();
Payment payPal = new PayPalPayment();
// Dynamic method dispatch in action
creditCard.processPayment(150.75);
debitCard.processPayment(85.50);
payPal.processPayment(99.99);

}
}
