package designPatterns.builder.firstApproach;

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
    public void setAge(int age) {
        this.age = age;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

}
