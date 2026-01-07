class Student {
    String name;
    int marks;
    int rollno;
}
public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alice";
        s1.marks = 45;
        s1.rollno = 12;

        Student s2 = new Student();
        s2.name = "Sukumar";
        s2.marks = 23;
        s2.rollno = 13;

        Student s3 = new Student();
        s3.name = "Shelby";
        s3.marks = 43;
        s3.rollno = 3;

       Student student[] = new Student[3];

       student[0] = s1;
       student[1] = s2;
       student[2] = s3;

       for(Student stud: student) {
        System.out.println(stud.name + ":" + stud.marks);
       }
    }
}
