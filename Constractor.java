/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constractor;

/**
 *
 * @author Lenovo
 */
public class Constractor {
    int id;
    String name,course;
    
    Constractor(int i,String n,String c){
        id=i;
        name=n;
        course=c;
    }
    void display(){
            System.out.println(id);
            System.out.println(name);
            System.out.println(course);
    }
    public static void main(String[] args){
        Constractor s1=new Constractor(1,"chinmayi","MCA");
        s1.display();
        Constractor s2=new Constractor(2,"Chetan","BCA");
        s2.display();
        
    }
    
}
