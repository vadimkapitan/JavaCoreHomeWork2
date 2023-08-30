package JavaCore.HomeWork2.Hogwarts;

abstract class Hogwarts {
    private String fullName; // Полное имя студента
    private int witchcraft; // Умение колдовать
    private int transgression;// Умение трансгрессировать

     public Hogwarts(String fullName, int witchcraft, int transgression) {
        this.fullName = fullName;
        this.witchcraft = witchcraft;
        this.transgression = transgression;
    }
    public void compareWith(Hogwarts student2) {
        if (this.witchcraft > student2.witchcraft) {
            System.out.println("Студент: " + this.fullName + " обладает бОльшей мощностью магии, чем - " + student2.fullName);
        } else
            System.out.println("Студент: " + student2.fullName + " обладает бОльшей мощностью магии, чем - " + this.fullName);
        if (this.transgression > student2.transgression) {
            System.out.println("Студент: " + this.fullName + " обладает бОльшей трансгрессией, чем - " + student2.fullName);
        } else
            System.out.println("Студент: " + student2.fullName + " обладает бОльшей трансгрессией, чем - " + this.fullName);
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
    @Override
    public String toString() {
        return "Cтудент: " + fullName  +
                ": Колдовство: " + witchcraft +
                ", Трансгрессия: " + transgression;
    }
}
