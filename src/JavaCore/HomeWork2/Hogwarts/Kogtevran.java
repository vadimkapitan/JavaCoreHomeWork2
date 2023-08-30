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
    public int calculateSum() {
        int sum = getMind() + getWisdom() + getFunny() + getCreation();
        return sum;
    }

    public void compare(Kogtevran student2) {
        if (this.calculateSum() > student2.calculateSum()) {
            System.out.println("Студент: " + this.getFullName() + " лучше, чем - " + student2.getFullName());
        } else
            System.out.println("Студент: " + student2.getFullName() + " лучше, чем - " + this.getFullName());
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
    public void studentDiscription() {
        System.out.println(super.toString() + ", Ум: " + getMind() + ", Мудрость:" + getWisdom() + ", Остроумие: " + getFunny()
                + ", Творчество: " + getCreation() + ".");
    }
}
