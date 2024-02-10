package designPatterns.prototype.firstApproach;

public class Client {
    
    public static void fillRegistry(StudentRegistry studentRegistry)
    {
        Student jan23Prototype = new Student();
        jan23Prototype.setBatchName("jan23");
        jan23Prototype.setAvgBatchPsp(85.0);

        studentRegistry.register("jan23", jan23Prototype);

        IntelligentStudent jan24Proto = new IntelligentStudent();
        jan24Proto.setIq(120);
        jan24Proto.setAvgBatchPsp(95.0);
        jan24Proto.setBatchName("jan24");

        studentRegistry.register("jan24", jan24Proto);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student rohan = studentRegistry.get("jan23").clone();
        rohan.setName("Rohan");
        rohan.setAge(33);
        rohan.setPss(90.0);

        Student igpt = studentRegistry.get("jan24").clone();
        igpt.setName("iGPT");
        igpt.setAge(10);
        igpt.setPss(99.0);

        System.out.println("Debug");
    }
}
