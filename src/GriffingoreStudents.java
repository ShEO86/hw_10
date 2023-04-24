public class GriffingoreStudents extends HogwardsStudents {
    private int nobility;
    private int honor;
    private int bravery;

    public GriffingoreStudents(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public void printInfo() {
        System.out.print("Студент Гриффиндора, ");
        super.printInfo();
        System.out.println(" " + nobility + " " + honor + " " + bravery);
    }
    public void compareStrudents(HogwardsStudents student) {
        if (!(student instanceof GriffingoreStudents)) {
            System.out.println("Нельзя сравнивать студентов разных факультетов");
        } else {
            if (this == student) {
                System.out.println("Нельзя сравнивать студента с самим собой");
            } else {
                int first = this.nobility + this.honor + this.bravery + super.getMagicPower() + super.getTransgressionDistance();
                GriffingoreStudents griffingore = (GriffingoreStudents) student;
                int second = griffingore.nobility + griffingore.honor + griffingore.bravery + griffingore.getMagicPower() + griffingore.getTransgressionDistance();
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
