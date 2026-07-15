package package1;

/*
In Java, a package is essentially a folder on your computer used to organize
 related classes and interfaces, preventing naming conflicts and structuring your codebase.
Access Modifiers are keywords that control the visibility (accessibility) 
of classes, variables, methods, and constructors in Java.

They help achieve Encapsulation by deciding who can access what.

Java provides 4 access modifiers:

private
default (package-private)
protected
public
===============================================================================
                    ACCESS MODIFIERS EXAMPLE
===============================================================================

This class contains variables with all four access modifiers.
*/

public class Student {

    private String password = "abc123";

    String department = "CSE";          // default

    protected String college = "BIT";

    public String name = "Karthik";

    public void display() {

        System.out.println(password);
        System.out.println(department);
        System.out.println(college);
        System.out.println(name);
    }
}

