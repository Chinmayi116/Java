/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switch_statement;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Switch_statement {

    
    public static void main(String[] args) {
        int a ,b,ch ,c;
        Scanner sc=new Scanner (System.in);
        System.out.println("Eneter a first number");
        a=sc.nextInt();
        System.out.println("Eneter a second number");
        b=sc.nextInt();
        System.out.println("Eneter your choice");
        ch=sc.nextInt();
        switch(ch){
                case 1:
                    c= a+b;
                    System.out.println("sum of two number is"+c);
                    break;
                case 2:
                    c=a-b;
                    System.out.println("Substract of two number is"+c);
                    break;
                case 3:
                    c=a*b;
                    System.out.println("Multiplication of two number is"+c);
                    break;
                case 4:
                    c=a/b;
                    System.out.println("Division of two number is"+c);
                    break;
                }
        }
    
}
