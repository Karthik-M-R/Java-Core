/*
===============================================================================
                            STATIC KEYWORD IN JAVA
===============================================================================

Topics Covered
--------------
1. What is static?
2. Static Variables
3. Static Methods
4. Static Block
5. Static Nested Class

===============================================================================
1. WHAT IS STATIC?
===============================================================================

Definition

The 'static' keyword means that the member belongs to the CLASS itself,
not to any particular object.

Normally,
Every object has its own copy of instance variables.

But a static member is shared by ALL objects.

Interview Definition

"The static keyword is used to make a variable, method, block, or nested class
belong to the class rather than individual objects."

===============================================================================
MEMORY REPRESENTATION

            JVM Memory

        -------------------
        Method Area
        -------------------
        static variable
        static methods
        static block
        -------------------

        Heap
        -------------------
        Student Object 1
        Student Object 2
        Student Object 3
        -------------------

Static members are created only ONCE.

===============================================================================
*/

public class StaticKeyword {

    public static void main(String[] args) {

        System.out.println("Creating Student Objects...\n");

        Student s1 = new Student("Karthik");
        Student s2 = new Student("Rahul");
        Student s3 = new Student("Anjali");

        s1.display();
        s2.display();
        s3.display();

        System.out.println();

        // Calling static method
        Student.showCollege();

        System.out.println();

        // Static Nested Class
        Student.Address address = new Student.Address();
        address.showAddress();
    }
}

class Student {

    String name;                 // Instance Variable
    static String college;       // Static Variable
    static int studentCount = 0; // Shared by all objects

    /*
    ===========================================================================
                            STATIC BLOCK
    ===========================================================================

    Static block executes only ONCE when the class is loaded.

    It is mainly used for initializing static variables.
    */

    static {
        college = "Bangalore Institute of Technology";
        System.out.println("Static Block Executed");
    }

    Student(String name) {
        this.name = name;
        studentCount++;
    }

    /*
    ===========================================================================
                            INSTANCE METHOD
    ===========================================================================
    */

    void display() {

        System.out.println("Name : " + name);
        System.out.println("College : " + college);
        System.out.println("Total Students : " + studentCount);

        System.out.println();
    }

    /*
    ===========================================================================
                            STATIC METHOD
    ===========================================================================

    Static methods belong to the class.

    They can access ONLY static members directly.

    They cannot directly access instance variables because
    instance variables belong to objects.
    */

    static void showCollege() {

        System.out.println("College Name : " + college);
    }

    /*
    ===========================================================================
                        STATIC NESTED CLASS
    ===========================================================================

    A static class inside another class.

    It can be created without creating an outer object.
    */

    static class Address {

        void showAddress() {

            System.out.println("Static Nested Class Called");
        }
    }
}

/**| Instance Variable                       | Static Variable                                       |
| --------------------------------------- | ----------------------------------------------------- |
| Belongs to object                       | Belongs to class                                      |
| New copy for every object               | Only one copy                                         |
| Stored in Heap (as part of each object) | Stored once in class metadata (Method Area/Metaspace) |
| Access using object                     | Prefer access using class name                        |

Static Method
Example

static void display()

Call using

Student.display();

No object required



A static method belongs to the class, but age belongs to an object.
 Since no object exists when the static method is called,
 Java doesn't know which object's age to use..
 */
