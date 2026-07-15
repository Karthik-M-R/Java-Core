/*
===============================================================================
                    CLASSES & OBJECTS IN JAVA
===============================================================================

Topics Covered
--------------
1. What is a Class?
2. What is an Object?
3. Instance Variables
4. Instance Methods
5. Object Creation
6. Memory Representation (High Level)
7. Example Classes
      - Student
      - Car
      - BankAccount

===============================================================================
                                INTERVIEW THEORY
===============================================================================

Q1) What is a Class?

Definition:

A Class is a blueprint, template, or user-defined data type that defines
the properties (variables) and behaviors (methods) that objects of that
class will have.

A class itself does NOT occupy memory for instance variables until an object
is created.

Think of a class like an architectural blueprint of a house.
The blueprint describes:

• Number of rooms
• Color
• Size
• Door positions

But you cannot live inside the blueprint.

Only after constructing the actual house can you use it.

Similarly,

Class -> Blueprint
Object -> Real House

Syntax

class Student{

}

Interview Definition:

"A class is a logical blueprint that groups related data members and methods
into a single unit. It does not represent a real entity until objects are
created."

===============================================================================

Q2) What is an Object?

Definition:

An Object is a real-world entity and an instance of a class.

When an object is created:

• Memory gets allocated.
• Instance variables get memory.
• Constructors execute.
• Methods become usable.

Example

Student s1 = new Student();

Student -> Class
s1      -> Reference Variable
new     -> Allocates memory in Heap
Student()-> Constructor

Interview Definition:

"An object is a runtime instance of a class having its own state and behavior."

State -> Variable values
Behavior -> Methods

===============================================================================

Q3) Difference Between Class and Object

Class
------
Blueprint
Logical entity
No memory for instance variables
Created once

Object
-------
Instance
Physical entity
Occupies memory
Multiple objects possible

===============================================================================

Q4) Instance Variables

Definition

Variables declared inside a class but outside methods are called
Instance Variables.

Each object gets its OWN COPY.

Example

Student s1
name = Karthik

Student s2
name = Rahul

Changing s1.name does NOT affect s2.name.

===============================================================================

Q5) Instance Methods

Methods that belong to an object.

Need object creation before calling.

Example

student.display();

===============================================================================

Q6) Object Creation

Syntax

ClassName reference = new ClassName();

Example

Student s1 = new Student();

Steps

Step 1
-------
Student

Compiler knows object type.

Step 2
-------
s1

Reference variable created.

Stored inside Stack Memory.

Step 3
-------
new Student()

Creates object in Heap Memory.

Step 4

Constructor executes.

Step 5

Reference variable stores object's address.

===============================================================================

Q7) High Level Memory Representation

Stack Memory

--------------------------
| s1 | -----------|------|
--------------------------|
                           |
                           V

Heap Memory

------------------------------
Student Object
------------------------------
name = Karthik
age = 21
marks = 95
------------------------------

Reference variable stores only address.

Actual object lives inside Heap.

===============================================================================
*/

public class ClassesAndObjects {

    public static void main(String[] args) {

        System.out.println("============== STUDENT OBJECTS ==============\n");

        /*
        Creating first Student object.

        Here,

        Student -> Class

        student1 -> Reference Variable

        new Student() -> Creates actual object inside Heap Memory.
        */

        Student student1 = new Student();

        /*
        Assigning values to instance variables.
        */

        student1.name = "Karthik";
        student1.age = 21;
        student1.usn = "1BI23CS001";
        student1.cgpa = 9.12;

        /*
        Calling instance method.
        */

        student1.displayStudent();

        System.out.println();

        /*
        Creating second object.

        Notice both objects have separate memory.
        */

        Student student2 = new Student();

        student2.name = "Rahul";
        student2.age = 20;
        student2.usn = "1BI23CS045";
        student2.cgpa = 8.85;

        student2.displayStudent();

        System.out.println("\n================ CAR OBJECT ================\n");

        Car car1 = new Car();

        car1.brand = "BMW";
        car1.model = "M4";
        car1.year = 2025;
        car1.price = 9200000;

        car1.displayCar();

        car1.startEngine();

        System.out.println("\n============= BANK ACCOUNT ==============\n");

        BankAccount account = new BankAccount();

        account.accountNumber = "123456789";
        account.accountHolder = "Karthik";
        account.balance = 25000;

        account.displayAccount();

        account.deposit(5000);

        account.withdraw(2000);

        account.displayAccount();
    }
}

/*
===============================================================================
                                STUDENT CLASS
===============================================================================

This class represents a Student.

Properties

name
age
usn
cgpa

Methods

displayStudent()

Notice:

Variables declared here are Instance Variables.

Every object gets its own copy.
*/

class Student {

    // Instance Variables

    String name;
    int age;
    String usn;
    double cgpa;

    /*
    Instance Method

    Can access all instance variables directly.
    */

    void displayStudent() {

        System.out.println("Student Details");

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("USN : " + usn);
        System.out.println("CGPA : " + cgpa);
    }
}

/*
===============================================================================
                                CAR CLASS
===============================================================================

Represents a Car.

State

brand
model
year
price

Behavior

displayCar()

startEngine()

This is exactly how OOP models real-world entities.

State + Behavior = Object
*/

class Car {

    String brand;
    String model;
    int year;
    double price;

    void displayCar() {

        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
        System.out.println("Price : " + price);
    }

    void startEngine() {

        System.out.println(model + " Engine Started.");
    }
}

/*
===============================================================================
                            BANK ACCOUNT CLASS
===============================================================================

Represents Bank Account.

Instance Variables

accountNumber
accountHolder
balance

Methods

deposit()

withdraw()

displayAccount()

Encapsulation will later improve this class by making variables private.

Currently kept public/default only to understand Classes & Objects.
*/

class BankAccount {

    String accountNumber;
    String accountHolder;
    double balance;

    void deposit(double amount) {

        balance += amount;

        System.out.println("Deposited : " + amount);
    }

    void withdraw(double amount) {

        if (amount <= balance) {

            balance -= amount;

            System.out.println("Withdrawn : " + amount);

        } else {

            System.out.println("Insufficient Balance");
        }
    }

    void displayAccount() {

        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
    }
}