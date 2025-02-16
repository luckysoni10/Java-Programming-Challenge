public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "SRIT";

        Student s2 = new Student();
        System.out.println(s2.schoolName); //it will remain same or all object. (SRIT)

        Student s3 = new Student();
        s3.schoolName = "new school"; //it will change the school name for all obj

        System.out.println(s2.schoolName);
    }
}

class Student {
    String name;
    int roll;

    static String schoolName; //static properties

    static int returnPercentage(int math, int phy, int chem) { //static functions, it will create only onces in the memory for all students.
        return (math+phy+chem) /3;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

// Output-
// SRIT
// new school
