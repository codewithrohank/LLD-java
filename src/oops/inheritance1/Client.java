package oops.inheritance1;

public class Client {
    public static void main(String[] args) {
        Student st = new Student(10, "Rohan");
        ProStudent prSt = new ProStudent(100, "PRohan", 100);

        // ProStudent prSt1 = st; // Error : cannot convert from Student to ProStudent

        Student st1 = st;
        System.out.println(st1.name);

        Student st2 = prSt;
        System.out.println(st2.name);

        Student st3 = new ProStudent();
        System.out.println(st3.name + st3.id);

        Student st4 = st2;
        // ProStudent prSt1 = new Student(); // Error : cannot convert from Student to ProStudent
    }
}
