package org.baeldung;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class Test {
    public static void print() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.print();


    }
}

class Child extends Test {
    public static void print() {

        Test.print();

    }
}

