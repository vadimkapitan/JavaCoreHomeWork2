package JavaCore.HomeWork2.Hogwarts;

public class Kogtevran extends Hogwarts{
    private int mind; // Ум
    private int wisdom; // мудрость
    private int funny; // Остроумие
    private int creation; // Творчество

    public Kogtevran(String fullName, int witchcraft, int transgression, int mind, int wisdom, int funny, int creation) {
        super(fullName, witchcraft, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.funny = funny;
        this.creation = creation;
    }

    public void compare(Kogtevran student1, Kogtevran student2) {
        int sum1 = student1.mind + student1.wisdom + student1.funny + student1.creation;
        int sum2 = student2.mind + student2.wisdom + student2.funny + student2.creation;
        if (sum1 > sum2) {
            System.out.println("Студент: " + student1.getFullName() + " лучше, чем - " + student2.getFullName());
        } else
            System.out.println("Студент: " + student2.getFullName() + " лучше, чем - " + student1.getFullName());
    }

    public void studentDiscription() {
        System.out.println("Студент: " + getFullName() + " Колдовство: " + getWitchcraft() + " Трансгрессия: " + getTransgression() +
                " Ум: " + getMind() + " Мудрость:" + getWisdom() + " Остроумие: " + getFunny() + " Творчество: " + getCreation());
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getFunny() {
        return funny;
    }

    public int getCreation() {
        return creation;
    }
}
