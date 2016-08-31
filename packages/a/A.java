package a;
import b.*;
public class A{

  public A(){
	    System.out.println("A created");
	    new B();
	}

  public static void main(String[] args){
	new A();
  }

}