public class Hufflepuff extends Hogwards {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(int magicPower, int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(magicPower, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void printInfo() {
        System.out.print("Студент Хафлпафф, ");
        super.printInfo();
        System.out.println(" " + industriousness + " " + loyalty + " " + honesty);
    }
    public void comparisonStudents(Hogwards student) {
        if (!(student instanceof Hufflepuff)) {
            System.out.println("Нельзя сравнивать студентов разных факультетов");
        } else {
            if (this == student) {
                System.out.println("Нельзя сравнивать студента с самим собой");
            } else {
                int first = this.industriousness + this.loyalty + this.honesty + super.getMagicPower() + super.getTransgressionDistance();
                Hufflepuff hufflepuff = (Hufflepuff) student;
                int second = hufflepuff.industriousness + hufflepuff.loyalty + hufflepuff.honesty + hufflepuff.getMagicPower() + hufflepuff.getTransgressionDistance();;
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
