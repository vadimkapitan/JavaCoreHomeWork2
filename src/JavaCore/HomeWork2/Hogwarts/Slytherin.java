package JavaCore.HomeWork2.Hogwarts;

public class Slytherin extends Hogwarts {
    private int cunning; // хитрость
    private int determination; // решительность
    private int ambition; // амбициозность
    private int resourceful; // находчивость
    private int wishPower; // жажда власти

    public Slytherin(String fullName, int witchcraft, int transgression, int cunning, int determination, int ambition, int resourceful, int wishPower) {
        super(fullName, witchcraft, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourceful = resourceful;
        this.wishPower = wishPower;
    }
    public int calculateSum() {
        int sum = getCunning() + getDetermination() + getAmbition() + getResourceful() + getWishPower();
        return sum;
    }
    public void compare(Slytherin student2) {
        if (this.calculateSum() > student2.calculateSum()) {
            System.out.println("Студент: " + this.getFullName() + " лучше, чем - " + student2.getFullName());
        } else
            System.out.println("Студент: " + student2.getFullName() + " лучше, чем - " + this.getFullName());
    }
    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourceful() {
        return resourceful;
    }

    public int getWishPower() {
        return wishPower;
    }
    public void studentDiscription() {
        System.out.println(super.toString() + ", Хитрость: " + getCunning() + ", Решительность: " + getDetermination()
                + ", Амбициозность " + getAmbition() + ", Находчивость: " + getResourceful() + ", Жажда власти: " + getWishPower() + ".");
    }
}
