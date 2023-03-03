public class Ravenclaw extends Hogwarts {
    final int smart, wise, witty, creativity;


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
}
