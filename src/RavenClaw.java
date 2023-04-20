import java.util.Objects;

public class RavenClaw extends Hogwards {
    private int mind;
    private int wisdom;
    private int creativity;

    public RavenClaw(int magicPower, int transgressionDistance, int mind, int wisdom, int creativity) {
        super(magicPower, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.creativity = creativity;
    }
    public void comparisonStudents(Hogwards student) {
        if (!(student instanceof RavenClaw)) {
            System.out.println("Нельзя сравнивать студентов разных факультетов");
        } else {
            if (this == student) {
                System.out.println("Нельзя сравнивать студента с самим собой");
            } else {
                int first = this.mind + this.wisdom + this.creativity + super.getMagicPower() + super.getTransgressionDistance();
                RavenClaw ravenClaw = (RavenClaw) student;
                int second = ravenClaw.mind + ravenClaw.wisdom + ravenClaw.creativity + ravenClaw.getMagicPower() + ravenClaw.getTransgressionDistance();
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
    public void printInfo() {
        System.out.print("Студент Когтеврана, ");
        super.printInfo();
        System.out.println(" " + mind + " " + wisdom + " " + creativity);
    }
}
