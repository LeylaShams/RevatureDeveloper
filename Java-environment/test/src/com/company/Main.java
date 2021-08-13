package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Child c = new Child(5, 2);
        System.out.println("Leyla Shams");
        System.out.println("The result is: " + c.Addition(5, 2));

    }
}
class ParentTest {

    public int a = 5;
    public int b = 10;

    ParentTest(int a, int b) {

        System.out.println("Testing" + a + "tasting again" + b);

    }
}

public class Child extends ParentTest{


    Child(int a, int b) {
        super(a, b);
    }

    public int Addition(int a, int b) {
       return a + b;
    }

}


