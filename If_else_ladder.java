/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package if_else_ladder;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class If_else_ladder {

    public static void main(String[] args) {
        int marks1 ,marks2,marks3,total;
        String name;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter Your name");
        name=sc.nextLine();
        System.out.println("Eneter first subject marks");
        marks1=sc.nextInt();
        System.out.println("Enetr a second Subject marks");
        marks2=sc.nextInt();
        System.out.println("Enetr a 3rd Subject marks");
        marks3=sc.nextInt();
        total=((marks1+marks2+marks3)*100)/300;
        System.out.println(total);
        
        if(total>=90)
            System.out.println("A+");
        else if(total>=80)
            System.out.println("A");
        else if(total>=70)
            System.out.println("B+");
        else if(total>=60)
            System.out.println("B");
        else if(total>=35)
            System.out.println("C");
        else
            System.out.println("Better luck next time");
    }
    
}
