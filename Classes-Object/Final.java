/*
===============================================================================
                            FINAL KEYWORD IN JAVA
===============================================================================

Topics Covered
--------------
1. What is final?
2. Final Variable
3. Final Method
4. Final Class

===============================================================================
1. WHAT IS final?
===============================================================================

Definition

The final keyword is used to restrict modification.

Depending on where it is used, its meaning changes.

1. final variable -> Value cannot be changed.
2. final method   -> Cannot be overridden.
3. final class    -> Cannot be inherited.

Interview Definition

"The final keyword is used to restrict modification of variables,
methods, and classes."

===============================================================================
*/

public class Final {

    public static void main(String[] args) {

        Student s = new Student();

        s.display();

        Dog d = new Dog();
        d.sound();
    }
}

/*
===============================================================================
                        FINAL VARIABLE
===============================================================================

A final variable can be assigned only once.

After assigning a value, it cannot be changed.

Example:
final int age = 20;

age = 25;   // Compile-Time Error
*/

class Student {

    final String COLLEGE = "BIT"; // Constant

    void display() {

        System.out.println("College : " + COLLEGE);

        // COLLEGE = "MIT";   // Error
    }
}

/*
===============================================================================
                        FINAL METHOD
===============================================================================

A final method cannot be overridden by a child class.

Parent class
*/

class Animal {

    final void sound() {

        System.out.println("Animal makes sound");
    }
}

/*
Child class

Trying to override sound() will give a Compile-Time Error.
*/

class Dog extends Animal {

    /*
    // Not Allowed

    void sound(){

    }

    */
}

/*
===============================================================================
                        FINAL CLASS
===============================================================================

A final class cannot be inherited.

Example

final class Vehicle{

}

class Car extends Vehicle{

}

This will give a Compile-Time Error.
*/

final class Vehicle {

    void start() {

        System.out.println("Vehicle Started");
    }
}

/*

// Not Allowed

class Car extends Vehicle{

}




The final keyword is used to restrict modification. A final variable cannot be reassigned,
 a final method cannot be overridden,
  and a final class cannot be inherited.
  
  
  A final method can be inherited, but it cannot be overridden*/