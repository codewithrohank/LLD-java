package designPatterns.builder.optimizedVersion;

public class Client {
    public static void main(String[] args) {
        Student s1 = Student.getBuilder()
                                .setId(1)
                                .setName("Rohan")
                                .setAge(33)
                                .setPsp(95.0)
                                .setGradYear(2021)
                                .setBatch("Mar23")
                                .build();
        
        // Restricted Creating a student object directly,  by making the 
        // Student constructor private
        // Student st = new Student(null);

        // Restricted Creating a builder object directly, by making the 
        // Builder constructor private
        // Student.Builder builder = new Student.Builder();

        System.out.println("Optimized Code - DEBUG");
    }
}
