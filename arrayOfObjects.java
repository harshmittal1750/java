class Student {

    int marks;
    String name;

}

public class arrayOfObjects {
    public static void main(String[] args) {
        Student s1 = new Student();// assigning the properties of student class to new instance
        s1.marks = 100;
        s1.name = "1234";
        // System.out.println(s1.name + " : " + s1.marks);
        Student s2 = new Student();
        s2.marks = 90;
        s2.name = "harsh";
        // System.out.println(s2.name + " : " + s2.marks);
        Student students[] = new Student[2];
        students[0] = s1;
        students[1] = s2;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " : " + students[i].marks);

        }
    }
}