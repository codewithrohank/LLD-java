package designPatterns.builder.firstApproach;

public class Client {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setId(1);
        builder.setName("Rohan");
        builder.setAge(33);
        builder.setPsp(95.0);
        builder.setGradYear(2021);
        builder.setBatch("Mar23");

        Student s1 = new Student(builder);

        System.out.println("DEBUG");
    }
}
