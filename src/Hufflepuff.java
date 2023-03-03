public class Hufflepuff extends Hogwarts{
    final int hardWork,loyalty,honesty;


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
}
