/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overriding;

/**
 *
 * @author Lenovo
 */
public class Overriding {
    static int sum(int a,int b){
        return a+b;
    }
    static int sum1(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println("sum is "+sum(10,39));
        System.out.println("Sum is "+sum1(20,49,40));
    }
    
}
