package designPatterns.builder.firstApproach;

public class Student {
    private int id;
    private String name;
    private int age;
    private double psp;
    private String universityName;
    private String batch;
    private int gradYear;
    private String phoneNumber;

    Student (Builder builder)
    {
        if (builder.getGradYear() >= 2022)
        {
            throw new IllegalArgumentException("Grad Year should be less than 2022");
        }

        this.id = builder.getId();
        this.name = builder.getName();
        this.age = builder.getAge();
        this.psp  = builder.getPsp();
        this.batch = builder.getBatch();
        this.universityName = builder.getUniversityName();
        this.gradYear = builder.getGradYear();
        this.phoneNumber = builder.getPhoneNumber();
    }
}
