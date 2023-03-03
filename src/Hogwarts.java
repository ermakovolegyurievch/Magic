public class Hogwarts {

    private String studentName;

    private int witchcraft, transgress;

    public Hogwarts(String studentName, int witchcraft, int transgress ) {
        this.witchcraft = witchcraft;
        this.transgress = transgress;
        this.studentName = studentName;

    }

    public String getStudentName() {
        return studentName;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    public int SumSkillsHogwarts(){
        return  this.witchcraft+ this.transgress;
    }
}
