package designPatterns.prototype.optimizedVersion;

public class Client {
    public static void fillRegistry(StudentRegistry studentRegistry)
    {
        Student student = new Student();
        student.setBatchName("jan23");
        student.setAvgBatchPsp(85.0);

        studentRegistry.register("jan23", student);

        IntelligentStudent ist = new IntelligentStudent();
        ist.setBatchName("jan24");
        ist.setAvgBatchPsp(90.0);
        ist.setIq(120);

        studentRegistry.register("jan24", ist);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student st = studentRegistry.get("jan23").clone();
        st.setName("Rohan");
        st.setAge(33);

        Student st1 = studentRegistry.get("jan24").clone();
        st1.setName("iGPT");
        st1.setAge(10);

        System.out.println("DEBUG");
    }
}
