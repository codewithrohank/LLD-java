package designPatterns.prototype.firstApproach;

public class IntelligentStudent extends Student {
    private int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public IntelligentStudent clone() {
        IntelligentStudent ist = new IntelligentStudent();
        ist.setIq(this.getIq());
        ist.setBatchName(this.getBatchName());
        ist.setAvgBatchPsp(this.getAvgBatchPsp());
        return ist;
    }
}
