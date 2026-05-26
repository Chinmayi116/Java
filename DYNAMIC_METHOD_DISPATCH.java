class Animal {
void sound() {
System.out.println(&quot;Animal makes sound&quot;);
}
}

class Dog extends Animal {
void sound() {
System.out.println(&quot;Dog barks&quot;);
}
}

public class Test {
public static void main(String[] args) {

Animal a; // Reference variable

a = new Dog(); // Object

a.sound(); // Method call
}
}
