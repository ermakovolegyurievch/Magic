public class Slytherin extends Hogwarts {
    private int cunning, determination, ambition, resourcefulness, lustForPower;


    public Slytherin(String studentName, int witchcraft, int transgress, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(studentName, witchcraft, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public int SumSkillsSlytherin(){
       return this.cunning+this.determination+this.ambition+ this.resourcefulness+this.lustForPower;
    }


    @Override
    public String toString() {
        return getStudentName() +
                ", faculty Slytherin" +
                ", witchcraft = " + getWitchcraft() +
                ", transgress = " + getTransgress() +
                ", cunning = " + cunning +
                ", determination = " + determination +
                ", ambition = " + ambition +
                ", resourcefulness = " + resourcefulness +
                ", lustForPower = " + lustForPower;
    }
}
