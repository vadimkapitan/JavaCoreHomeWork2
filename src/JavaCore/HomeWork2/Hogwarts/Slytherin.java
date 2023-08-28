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

    public void compare(Slytherin student1, Slytherin student2) {
        int sum1 = student1.cunning + student1.determination + student1.ambition + student1.resourceful + student1.wishPower;
        int sum2 = student2.cunning + student2.determination + student2.ambition + student2.resourceful + student2.wishPower;
        if (sum1 > sum2) {
            System.out.println("Студент: " + student1.getFullName() + " лучше, чем - " + student2.getFullName());
        } else
            System.out.println("Студент: " + student2.getFullName() + " лучше, чем - " + student1.getFullName());
    }

    public void studentDiscription() {
        System.out.println("Студент: " + getFullName() + " Колдовство: " + getWishPower() + " Трансгрессия: " + getTransgression()
                + " Хитрость: " + getCunning() + " Решительность: " + getDetermination() + " Амбициозность" + getAmbition() + " Находчивость: "
                + getTransgression() + " Жажда власти: " + getWishPower());
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
}
