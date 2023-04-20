import java.util.Objects;

public class Hogwards {
    public Hogwards(int magicPower, int transgressionDistance) {
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }
    private int magicPower;
    private int transgressionDistance;
    public void printInfo() {
    System.out.print(magicPower + " " + transgressionDistance);
}

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void comparisonStudents(Hogwards student){}
}
