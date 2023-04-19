public class Slizeren extends Hogwards{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slizeren(int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }
    public void printInfo() {
        System.out.print("Студент Слизерина, ");
        super.printInfo();
        System.out.println(" " + cunning + " " + determination + " " + ambition + " " + resourcefulness + " " + thirstForPower);
    }
    public void comparisonStudents(Hogwards student) {
        if (!(student instanceof Slizeren)) {
            System.out.println("Нельзя сравнивать студентов разных факультетов");
        } else {
            if (this == student) {
                System.out.println("Нельзя сравнивать студента с самим собой");
            } else {
                int first = this.cunning + this.determination + this.ambition + this.resourcefulness + this.thirstForPower;
                Slizeren slizeren = (Slizeren) student;
                int second = slizeren.cunning + slizeren.determination + slizeren.ambition + slizeren.resourcefulness + slizeren.thirstForPower;
                if (first > second) {
                    System.out.println("Первый студент превосходит второго по баллам");
                } else if (first < second) {
                    System.out.println("Второй студент превосходит первого по баллам");
                } else {
                    System.out.println("Студенты равны по своим баллам");
                }
            }
        }
    }
}
