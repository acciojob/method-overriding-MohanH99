package com.driver;

public class Main {
    public static void main(String[] args) {
        A obj= new B();
        obj.meth();
    }
}
class A{
    void meth(){
        System.out.println("Invoking method from class A");
    }
}
class B extends A{
    void meth(){
        super.meth();
        System.out.println("Method is overridden in Extendend class B");
    }
}




class Vehicle{
    //defining a method
    void run(){System.out.println("Vehicle is running");}
}
//Creating a child class
class Bike2 extends Vehicle{
    //defining the same method as in the parent class
    void run(){System.out.println("Bike is running safely");}

    public static void main(String args[]){
        Bike2 obj = new Bike2();//creating object
        obj.run();//calling method
    }
}