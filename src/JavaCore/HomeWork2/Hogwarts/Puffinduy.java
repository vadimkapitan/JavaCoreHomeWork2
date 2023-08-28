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

    public void compare(Puffinduy student1, Puffinduy student2) {
        int sum1 = student1.hardLove + student1.loyalty + student1.honesty;
        int sum2 = student2.hardLove + student2.loyalty + student2.honesty;
        if (sum1 > sum2) {
            System.out.println("Студент: " + student1.getFullName() + " лучше, чем - " + student2.getFullName());
        } else
            System.out.println("Студент: " + student2.getFullName() + " лучше, чем - " + student1.getFullName());
    }
    public void studentDiscription() {
        System.out.println("Студент: " + getFullName() + " Колдовство:" + getWitchcraft() + " Трансгрессия: " + getTransgression() +
                " Трудолюбие: " + getHardLove() + " Верность: " + getLoyalty() + " Честность: " + getHonesty());
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
}
