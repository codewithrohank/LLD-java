package designPatterns.builder.improvedVersion;

public class Builder {
    private int id;
    private String name;
    private int age;
    private double psp;
    private String universityName;
    private String batch;
    private int gradYear;
    private String phoneNumber;

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBatch() {
        return batch;
    }

    public int getGradYear() {
        return gradYear;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getPsp() {
        return psp;
    }

    public String getUniversityName() {
        return universityName;
    }

    //Setters
    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public Builder setBatch(String batch) {
        this.batch = batch;
        return this;
    }

    public Builder setGradYear(int gradYear) {
        this.gradYear = gradYear;
        return this;
    }

    public Builder setId(int id) {
        this.id = id;
        return this;
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public Builder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Builder setPsp(double psp) {
        this.psp = psp;
        return this;
    }

    public Builder setUniversityName(String universityName) {
        this.universityName = universityName;
        return this;
    }

    // Methods
    public static Builder getBuilder()
    {
        return new Builder();
    }

    public Student build()
    {
        return new Student(this);
    }
}
