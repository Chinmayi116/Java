package paymentgateway; import java.util.Scanner;
import javax.lang.model.SourceVersion;


//interface
interface PaymentGateway{ void processPayment();
//sttic method static void feedback(){
System.out.println("Thank you for using Payment Gateway");
}
}


//CreditCard class
class CreditCard implements PaymentGateway{ private String name;
private String Cardnumber; private int pin;

public CreditCard(String name, String Cardnumber, int pin) { this.name = name;
this.Cardnumber = Cardnumber; this.pin = pin;
}


@Override
public void processPayment(){

if(Cardnumber.length()==16 && pin==1234){ System.out.println("Credit Card Payment Successfil for" + name);
}else{
System.out.println("Invalid Card Details Or PIN");
}
}
}


//UPI calss
class UPI implements PaymentGateway{ private String name;
private String UPIid; private int pin;

public UPI(String name, String UPIid, int pin) { this.name = name;
this.UPIid = UPIid; this.pin = pin;
}


@Override
public void processPayment(){ if(UPIid.contains("@") && pin==1234){
System.out.println("UPI Payment Successfil for" + name);
}else{
System.out.println("Invalid UPI Or PIN");
}
}
}


//Wallet class
class Wallet implements PaymentGateway{ private String name;
private double balance;


public Wallet(String name, double balance) { this.name = name;
this.balance = balance;
}


@Override
public void processPayment(){ double amount=500; if(balance>=amount){
System.out.println("Wallet Payment Successful for" + name);
}else{
System.out.println("Insufficient Balance");
}
}
}




public class PaymentApp {
public static void main(String args[]) { Scanner sc=new Scanner(System.in);

//Take user name an input System.out.println("Enter User Name:"); String name= sc.nextLine();

System.out.println("Select Payment Method:"); System.out.println("1.Credit Card:");
