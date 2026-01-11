class Student {
    String name;
    int marks;
    int rollno;
}

public class studentarray {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Abhiram";
        s1.marks = 28;
        s1.rollno = 12;

        Student s2 = new Student();
        s2.name = "shelby";
        s2.marks = 30;
        s2.rollno = 23;

        Student s3 = new Student();
        s3.name = "Sukumar";
        s3.marks = 34;
        s3.rollno = 24;

        Student student[] = new Student[3];

        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        for(int i=0;i<student.length;i++) {
            System.out.println(student[i].name + " " + student[i].marks);
        }
    }
}