public class Ravenclaw extends Hogwarts {
    private int smart, wise, witty, creativity;


    public Ravenclaw(String studentName, int witchcraft, int transgress, int smart, int wise, int witty, int creativity) {
        super(studentName, witchcraft, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public int SumSkillsRavenclaw() {
        return this.smart + this.wise + this.witty + this.creativity;
    }

    @Override
    public String toString() {
        return getStudentName() +
                ", faculty Ravenclaw" +
                ", witchcraft = " + getWitchcraft() +
                ", transgress = " + getTransgress() +
                ", smart = " + smart +
                ", wise = " + wise +
                ", witty = " + witty +
                ", creativity = " + creativity;
    }
}
