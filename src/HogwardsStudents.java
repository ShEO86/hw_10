public abstract class HogwardsStudents {
    private int magicPower;
    private int transgressionDistance;
    private String name;
    public HogwardsStudents(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
    System.out.print(name + " " + magicPower + " " + transgressionDistance);
}

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void comparisonStudents(HogwardsStudents student){}
    private int abilities() {
        return magicPower + transgressionDistance;
    }
    public void compareHogwardsStrudents(HogwardsStudents hogwardsStudents) {
        int abilityOne = abilities();
        int abilityTwo = hogwardsStudents.abilities();
        if (abilityOne > abilityTwo) {
            System.out.printf("Студент %s лучше, чем %s: %d VS %d\n", getName(), hogwardsStudents.getName(), abilityOne, abilityTwo);
        } else if (abilityOne > abilityTwo) {
            System.out.printf("Студент %s лучше, чем %s: %d VS %d\n", hogwardsStudents.getName(), getName(), abilityTwo, abilityOne);
        } else {
            System.out.printf("Студент %s и %s равны\n", getName(), hogwardsStudents.getName());
        }
    }
}
