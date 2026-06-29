package com.mycompany.bank; public class Bank {
public static void main(String[] args){ Account a= new Account(); Account b = new Account(5000); float balance = a.deposite(8000);
System.out.println("Ammount deposited in Account "+"A and balance = RS."+balance); try
{
balance = b.deposite(a,10000);
System.out.println("Amount deposited from acount" + " A to Account B nd balance of account b = RS."+balance);


}
catch(LessBalanceException e)
{
System.out.println("Amount transfer rejected due to less balance");
}
}
}




//FILE 02	Account.java
package com.mycompany.bank; public class Account {
 
float balance;
Account()
{
balance = 500;
}
Account(float amt)
{
balance = amt;
}
float deposite(float amt)
{
balance = balance + amt; return balance;
}
float deposite(Account a, float amt) throws LessBalanceException
{
try
{
a.withdraw(amt); balance = balance - amt; return balance;
}
catch(LessBalanceException e)
{
throw e;
}
}
private float withdraw(float amt) throws LessBalanceException
{
if(balance < amt + 500)
{
 
throw new LessBalanceException(balance);
}
else
{
balance = balance - amt; return balance;
}
}


}


//FILE 03 --- LessBalanceException.java package com.mycompany.bank;

public class LessBalanceException extends Exception { String msg;
public LessBalanceException (float balance){
msg = "Request for withdrawal is cancelled due to less balance." + "The account has a balance the account"
+ "has a balance of RS."+balance; System.out.println(msg);
}
@Override
public String toString(){
return "LessBalancException("+"msg = "+msg+")";
}
}
 

