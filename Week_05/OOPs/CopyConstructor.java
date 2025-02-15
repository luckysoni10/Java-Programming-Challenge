public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "lucky";
        s1.roll = 42;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 69;
        s1.marks[2] = 99;

        Student s2 = new Student(s1); //copy constructor
        s2.password = "xyz";
        
        s1.marks[2] = 0; //are are changing the marks in first obj but when we will print the marks it will show change in copy cons. marks, bcz we are giving the reference of memory in copy cons. not value that's why when we change the value so it will affect copy cons vlue. (to overcome this we study shallow and deep copy).

        for(int i=0; i<3; i++) {
            System.out.println(s2.marks[i]);
        }

        //Output- 100, 69, 0
    }   
}

class Student {
    String name ;
    int roll;
    String password;
    int marks[];

    Student(){
        marks = new int[3];
    }
    //copy constructor 
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    } 
}
