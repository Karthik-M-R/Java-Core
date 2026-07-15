package package1;

public class SamePackageTest {

    public static void main(String[] args) {

        Student s = new Student();

        // System.out.println(s.password);   // ERROR

        System.out.println(s.department);

        System.out.println(s.college);

        System.out.println(s.name);
    }
}

/**
 
Output
CSE
BIT
Karthik

Explanation

Same package can access

✅ default
✅ protected
✅ public

Cannot access

❌ private
 */