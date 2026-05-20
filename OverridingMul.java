/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overridingmul;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class OverridingMul {
    static int mul(int a,int b){
        return a*b;
    }
    static int mul(int a,int b,int c){
        return a*b*c;
    }
    
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        a=sc.nextInt();
        System.out.println("Enter b value");
        b=sc.nextInt();
        System.out.println("Enter c value");
        c=sc.nextInt();
        System.out.println("Multiplication of two number is "+mul(a,b));
        System.out.println("Multiplication of three number is "+mul(a,b,c));
        
    }
    
}
