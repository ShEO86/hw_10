public class Main {

    public static void main(String[] args) {


        Hogwards harryPotter = new Griffingore(70, 64,94,90,80);
        harryPotter.printInfo();
        Hogwards harmonyGrainger = new Griffingore(90, 60, 78, 50, 95);
        Hogwards dracoMalphoy = new Slizeren(68, 44, 60, 80,90, 75, 95);
        Hogwards grehamMontegy = new Slizeren(58, 34, 62, 73,70, 65, 35);
        Hogwards zakhariaSmith = new Hufflepuff(61, 30, 60, 75, 38);
        Hogwards sedrikDiggory = new Hufflepuff(81, 70, 77, 85, 88);
        Hogwards justinFintchPhletchly = new Hufflepuff(64, 23, 48, 56, 44);
        Hogwards chjouChang = new RavenClaw(55, 48, 56, 60, 49);
        Hogwards markusBaybly = new RavenClaw(63, 59, 66, 67, 58);
        chjouChang.comparisonStudents(markusBaybly);
        dracoMalphoy.comparisonStudents(harmonyGrainger);
        harryPotter.comparisonStudents(harryPotter);
        justinFintchPhletchly.comparisonStudents(sedrikDiggory);
    }


}