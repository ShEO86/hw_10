public class Main {

    public static void main(String[] args) {
        HogwardsStudents harryPotter = new GriffingoreStudents("Поттер", 70, 64, 94, 90, 80);
        harryPotter.printInfo();
        HogwardsStudents harmonyGrainger = new GriffingoreStudents("Грейнджер", 90, 60, 78, 50, 95);
        HogwardsStudents dracoMalphoy = new SlizerenStudents("Малфой", 68, 44, 60, 80, 90, 75, 95);
        HogwardsStudents grehamMontegy = new SlizerenStudents("Монтегю", 58, 34, 62, 73, 70, 65, 35);
        HogwardsStudents zakhariaSmith = new HufflepuffStudents("Смит", 61, 30, 60, 75, 38);
        HogwardsStudents sedrikDiggory = new HufflepuffStudents("Диггори", 81, 70, 77, 85, 88);
        HogwardsStudents justinFintchPhletchly = new HufflepuffStudents("Флечли", 64, 23, 48, 56, 44);
        HogwardsStudents chjouChang = new RavenClawStudents("Чанг", 55, 48, 56, 60, 49);
        HogwardsStudents markusBaybly = new RavenClawStudents("Бейбли", 63, 59, 66, 67, 58);
        chjouChang.printInfo();
        chjouChang.compareHogwardsStrudents(markusBaybly);
        dracoMalphoy.compareHogwardsStrudents(harmonyGrainger);
        harryPotter.compareHogwardsStrudents(harryPotter);
        justinFintchPhletchly.compareHogwardsStrudents(sedrikDiggory);
        harryPotter.compareHogwardsStrudents(dracoMalphoy);
    }
}