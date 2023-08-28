package JavaCore.HomeWork2.Hogwarts;

public class Griffindor extends Hogwarts {
    private int nobility; // благородство
    private int honor; // честь
    private int bravery; // храбрость

    public Griffindor(String fullName, int witchcraft, int transgression, int nobility, int honor, int bravery) {
        super(fullName, witchcraft, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void compare(Griffindor student1, Griffindor student2) {
        int sum1 = student1.nobility + student1.honor + student1.bravery;
        int sum2 = student2.nobility + student2.honor + student2.bravery;
        if (sum1 > sum2) {
            System.out.println("Студент: " + student1.getFullName() + " лучше, чем - " + student2.getFullName());
        } else
            System.out.println("Студент: " + student2.getFullName() + " лучше, чем - " + student1.getFullName());
    }
    public void studentDiscription() {
        System.out.println("Студент: " + getFullName() + " Колдовство: " + getWitchcraft() + " Трансгрессия: " + getTransgression() +
                " Благородство: " + getNobility() + " Честь: " + getHonor() + " Храбрость: " + getBravery());
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }
}
