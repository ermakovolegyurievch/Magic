public class Gryffindor extends Hogwarts {
    private int nobility, honor, courage;

    public Gryffindor(String studentName,int witchcraft, int transgress, int nobility, int honor, int courage) {
        super(studentName, witchcraft, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public int SumSkillsGryffindor(){
       return this.nobility+this.honor+this.courage;
    }


    @Override
    public String toString() {
        return  getStudentName() +
                ", faculty Gryffindor"+
                ", witchcraft = " + getWitchcraft() +
                ", transgress = " + getTransgress() +
                ", nobility = " + nobility +
                ", honor = " + honor +
                ", courage = " + courage;
    }
}
