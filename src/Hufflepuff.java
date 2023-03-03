public class Hufflepuff extends Hogwarts {
    private int hardWork, loyalty, honesty;


    public Hufflepuff(String studentName, int witchcraft, int transgress, int hardWork, int loyalty, int honesty) {
        super(studentName, witchcraft, transgress);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int SumSkillsHufflepuff() {
        return this.hardWork + this.loyalty + this.honesty;
    }

    @Override
    public String toString() {
        return getStudentName() +
                ", faculty Hufflepuff" +
                ", witchcraft = " + getWitchcraft() +
                ", transgress = " + getTransgress() +
                ", hardWork = " + hardWork +
                ", loyalty = " + loyalty +
                ", honesty = " + honesty;
    }
}
