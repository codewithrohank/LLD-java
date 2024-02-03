package oops1;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student();
        
        s1.setAge(32);
        s1.setName("Rohan");

        System.out.println("Name: " + s1.getName() + " AGE: " + s1.getAge());
    }
}
