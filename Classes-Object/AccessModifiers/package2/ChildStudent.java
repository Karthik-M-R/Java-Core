package package2;

import package1.Student;

public class ChildStudent extends Student {

    public void show() {

        System.out.println(college);
    }

    public static void main(String[] args) {

        ChildStudent obj = new ChildStudent();

        obj.show();
    }
}

/**
Output

BIT
Why does this work?

Because

ChildStudent extends Student

means

ChildStudent is a subclass (child) of Student



A protected member can be accessed inside a child class, even if that child class is in another package
 
 

 
 
 public class Test {

    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s.college);   // ❌ Error
    }
}

Why is this an error?

Because Test is not a child of Student.

It simply created an object.*/