package designPatterns.prototype.optimizedVersion;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private double pss;
    private String batchName;
    private double avgBatchPsp;
    
    // Getters are not available for Student class
    Student() {}

    Student(Student student)
    {
        this.setAvgBatchPsp(student.avgBatchPsp);
        this.setBatchName(student.batchName);
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

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public void setPss(double pss) {
        this.pss = pss;
    }

    @Override
    public Student clone()
    {
        // Student st = new Student();
        // st.setBatchName(this.batchName);
        // st.setAvgBatchPsp(this.avgBatchPsp);
        // return st;
        return new Student(this);
    }
}
