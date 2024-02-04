package designPatterns.builder.mostOptimizedVersion;

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

        System.out.println("Most Optimized Code - DEBUG");
    }
}
