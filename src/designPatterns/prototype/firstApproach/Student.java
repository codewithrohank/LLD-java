package designPatterns.prototype.firstApproach;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private double pss;
    private String batchName;
    private double avgBatchPsp;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getPss() {
        return pss;
    }
    public String getBatchName() {
        return batchName;
    }
    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }
    public void setPss(double pss) {
        this.pss = pss;
    }
    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    @Override
    public Student clone()
    {
        Student stCopy = new Student();
        stCopy.setBatchName(this.batchName);
        stCopy.setAvgBatchPsp(this.avgBatchPsp);
        return stCopy;
    }
}
