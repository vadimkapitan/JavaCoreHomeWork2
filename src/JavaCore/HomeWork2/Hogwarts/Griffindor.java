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

    public int calculateSum() {
        int sum = getNobility() + getHonor() + getBravery();
        return sum;
    }

    public void compare(Griffindor student2) {
        if (this.calculateSum() > student2.calculateSum()) {
            System.out.println("Студент: " + this.getFullName() + " лучше, чем - " + student2.getFullName());
        } else
            System.out.println("Студент: " + student2.getFullName() + " лучше, чем - " + this.getFullName());
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
    public void studentDiscription() {
        System.out.println(super.toString() + ", Благородство: " + getNobility() + ", Честь: " + getHonor()
                + ", Храбрость: " + getBravery() + ".");
    }
}
