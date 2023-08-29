package JavaCore.HomeWork2.Hogwarts;

public class Puffinduy extends Hogwarts{
    private int hardLove; // Трудолюбие
    private int loyalty; // Верность
    private int  honesty; // Честность

    public Puffinduy(String fullName, int witchcraft, int transgression, int hardLove, int loyalty, int honesty) {
        super(fullName, witchcraft, transgression);
        this.hardLove = hardLove;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    public int calculateSum() {
        int sum = getHardLove() + getLoyalty() + getHonesty();
        return sum;
    }

    public void compare(Puffinduy student2) {
        if (this.calculateSum() > student2.calculateSum()) {
            System.out.println("Студент: " + this.getFullName() + " лучше, чем - " + student2.getFullName());
        } else
            System.out.println("Студент: " + student2.getFullName() + " лучше, чем - " + this.getFullName());
    }
    public int getHardLove() {
        return hardLove;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }
    public void studentDiscription() {
        System.out.println(super.toString() + ", Трудолюбие: " + getHardLove() + ", Верность: " + getLoyalty()
                + ", Честность: " + getHonesty() + ".");
    }
}
