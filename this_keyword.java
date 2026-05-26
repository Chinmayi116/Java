class Student {
String name;
int age;

Student() {
this(&quot;Unknown&quot;, 0); // calls another constructor
}

Student(String name, int age) {
this.name = name;
this.age = age;
}
}
