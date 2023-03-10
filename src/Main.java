public class Main {
    public static void BestHogwarts(Hogwarts hogwarts1, Hogwarts hogwarts2) {
        if (hogwarts1.SumSkillsHogwarts() > hogwarts2.SumSkillsHogwarts()) {
            System.out.println(hogwarts1.getStudentName() + " способнее, чем " + hogwarts2.getStudentName());
        } else if (hogwarts1.SumSkillsHogwarts() < hogwarts2.SumSkillsHogwarts()){
            System.out.println(hogwarts2.getStudentName() + " способнее, чем " + hogwarts1.getStudentName());
        }else {
            System.out.println("Ученики по способностям равны.");
        }
    }

    public static void BestSlytherin(Slytherin slytherin1, Slytherin slytherin2) {
        if (slytherin1.SumSkillsSlytherin() > slytherin2.SumSkillsSlytherin()) {
            System.out.println(slytherin1.getStudentName() + " способнее, чем " + slytherin2.getStudentName());
        } else if (slytherin1.SumSkillsHogwarts() < slytherin2.SumSkillsHogwarts()){
            System.out.println(slytherin2.getStudentName() + " способнее, чем " + slytherin1.getStudentName());
        }else {
            System.out.println("Ученики по способностям равны.");
        }
    }

    public static void BestRavenclaw(Ravenclaw ravenclaw1, Ravenclaw ravenclaw2) {
        if (ravenclaw1.SumSkillsRavenclaw() > ravenclaw2.SumSkillsRavenclaw()) {
            System.out.println(ravenclaw1.getStudentName() + " способнее, чем " + ravenclaw2.getStudentName());
        } else if (ravenclaw1.SumSkillsHogwarts() < ravenclaw2.SumSkillsHogwarts()){
            System.out.println(ravenclaw2.getStudentName() + " способнее, чем " + ravenclaw1.getStudentName());
        }else {
            System.out.println("Ученики по способностям равны.");
        }
    }

    public static void BestHufflepuff(Hufflepuff hufflepuff1, Hufflepuff hufflepuff2) {
        if (hufflepuff1.SumSkillsHufflepuff() > hufflepuff2.SumSkillsHufflepuff()) {
            System.out.println(hufflepuff1.getStudentName() + " способнее, чем " + hufflepuff2.getStudentName());
        } else if (hufflepuff1.SumSkillsHogwarts() < hufflepuff2.SumSkillsHogwarts()){
            System.out.println(hufflepuff2.getStudentName() + " способнее, чем " + hufflepuff1.getStudentName());
        }else {
            System.out.println("Ученики по способностям равны.");
        }
    }

    public static void BestGryffindor(Gryffindor gryffindor1, Gryffindor gryffindor2) {
        if (gryffindor1.SumSkillsGryffindor() > gryffindor2.SumSkillsGryffindor()) {
            System.out.println(gryffindor1.getStudentName() + " способнее, чем " + gryffindor2.getStudentName());
        } else if (gryffindor1.SumSkillsHogwarts() < gryffindor2.SumSkillsHogwarts()){
            System.out.println(gryffindor2.getStudentName() + " способнее, чем " + gryffindor1.getStudentName());
        }else {
            System.out.println("Ученики по способностям равны.");
        }
    }
    public static void PrintInfo(Object obj){
        System.out.println(obj);
    }

        public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter", 65, 27, 54, 35, 43);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 36, 23, 37, 52, 45);
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley", 32, 24, 54, 17, 46);
        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith", 64, 66, 33, 12, 46);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", 14, 36, 53, 22, 26);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley", 34, 26, 43, 62, 36);
        Ravenclaw zhouChang = new Ravenclaw("Zhou Chang", 43, 65, 23, 43, 34, 42);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 43, 35, 53, 63, 14, 64);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 23, 55, 33, 23, 24, 64);
        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 45, 45, 63, 16, 34, 45, 34);
        Slytherin grahamMontague = new Slytherin("Graham Montague", 25, 35, 23, 26, 14, 65, 34);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 65, 22, 43, 16, 64, 35, 34);
        BestSlytherin(grahamMontague, dracoMalfoy);
        BestHogwarts(harryPotter,dracoMalfoy);
        PrintInfo(cedricDiggory);
    }


}