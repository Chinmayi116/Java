class Test{
public static void main(String args[]){

try{

try{
int a=10/0;
}
catch(Exception e){
System.out.println("Inner Catch");
}

int b[]=new int[3];
System.out.println(b[5]);

}
catch(Exception e){
System.out.println("Outer Catch");
}

}  
}
