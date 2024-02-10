package designPatterns.prototype.optimizedVersion;

public class IntelligentStudent extends Student {
    private int iq;

    public void setIq(int iq) {
        this.iq = iq;
    }

    IntelligentStudent(){}

    IntelligentStudent(IntelligentStudent ist){
        // call copy constructor of Student class to set the private attributes of Student
        super(ist);
        // Now copy private attributes of IntelligentStudent
        this.iq = ist.iq;
    }

    @Override
    public Student clone() {
        // IntelligentStudent ist = new IntelligentStudent();
        // ist.setIq(this.iq);
        // return ist;

        // As setters are not provided by Student class, 
        // we need to call copy constructor of Student class to set the private attributes of Student 
        // Let's do that via copy constructor of IntelligentStudent
        return new IntelligentStudent(this);
    }
}
