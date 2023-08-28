package JavaCore.HomeWork2.Hogwarts;

public class Hogwarts {
    private String fullName; // Полное имя студента
    private int witchcraft; // Умение колдовать
    private int transgression;// Умение трансгрессировать

    public Hogwarts(String fullName, int witchcraft, int transgression) {
        this.fullName = fullName;
        this.witchcraft = witchcraft;
        this.transgression = transgression;
    }

    public void studentDiscription() {
        System.out.println("Студент: " + getFullName() + " Умение колдовать: " + getWitchcraft()
                + " Умение трансгрессировать: " + getTransgression());
    }

    public void compareWith(Hogwarts student1, Hogwarts student2) {
        if (student1.witchcraft > student2.witchcraft) {
            System.out.println("Студент: " + student1.fullName + " обладает бОльшей мощностью магии, чем - " + student2.fullName);
        } else
            System.out.println("Студент: " + student2.fullName + " обладает бОльшей мощностью магии, чем - " + student1.fullName);
        if (student1.transgression > student2.transgression) {
            System.out.println("Студент:" + student1.fullName + " обладает бОльшей трансгрессией, чем - " + student2.fullName);
        } else
            System.out.println("Студент:" + student2.fullName + " обладает бОльшей трансгрессией, чем - " + student1.fullName);
    }

    public String getFullName() {
        return fullName;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public int getTransgression() {
        return transgression;
    }
}
