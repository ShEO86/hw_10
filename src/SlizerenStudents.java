public class SlizerenStudents extends HogwardsStudents {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public SlizerenStudents(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magicPower, transgressionDistance);
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
    public void compareStrudents(HogwardsStudents student) {
        if (!(student instanceof SlizerenStudents)) {
            System.out.println("Нельзя сравнивать студентов разных факультетов");
        } else {
            if (this == student) {
                System.out.println("Нельзя сравнивать студента с самим собой");
            } else {
                int first = this.cunning + this.determination + this.ambition + this.resourcefulness + this.thirstForPower + super.getMagicPower() + super.getTransgressionDistance();
                SlizerenStudents slizeren = (SlizerenStudents) student;
                int second = slizeren.cunning + slizeren.determination + slizeren.ambition + slizeren.resourcefulness + slizeren.thirstForPower + slizeren.getMagicPower() + slizeren.getTransgressionDistance();
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
