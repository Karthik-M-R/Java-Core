package package2;

import package1.Student;

public class DifferentPackageTest {

    public static void main(String[] args) {

        Student s = new Student();

        // System.out.println(s.password);     ERROR

        // System.out.println(s.department);   ERROR

        // System.out.println(s.college);      ERROR

        System.out.println(s.name);
    }
}

/**
 Output

Karthik

Explanation

Different package (without inheritance)

Can access only

✅ public
 */