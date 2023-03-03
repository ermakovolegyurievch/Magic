public class Gryffindor extends Hogwarts {
    final int nobility, honor, courage;

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
}
