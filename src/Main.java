import JavaCore.HomeWork2.Hogwarts.*;

public class Main {
    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor("Гарри Поттер", 34,21,43,53,22);
        Griffindor germionGrager = new Griffindor("Гермиона Грейнджер", 21,32,5,86,3);
        Griffindor ronUizly = new Griffindor("Рон Уизли",21,76,86,3,6);
        Slytherin drakoMalfoi = new Slytherin("Драко Малфой", 75,23,56,78,99,44,2);
        Slytherin grehamMontegu = new Slytherin("Грэхэм Монтегю",32,55,77,22,1,4,6);
        Slytherin gregoryGoil = new Slytherin("Грегори Гойл",54,77,66,22,44,77,86);
        Kogtevran chzouChang = new Kogtevran("Чжоу Чанг",83,21,4,63,2,1);
        Kogtevran padmaPatil = new Kogtevran("Падма Патил", 22,44,55,78,32,6);
        Kogtevran marcusBelby = new Kogtevran("Маркус Белби",22,1,4,6,8,9);
        Puffinduy zahariaSmith = new Puffinduy("Захария Смит", 65,23,65,32,23);
        Puffinduy cedrickDiggory = new Puffinduy("Седрик Диггори", 32,57,90,4,2);
        Puffinduy dzhastinFinFletcher = new Puffinduy("Джастин Финч-Флетчли",43,24,75,28,32);
        harryPotter.studentDiscription();
        ronUizly.compare(ronUizly,germionGrager);
        drakoMalfoi.compareWith(drakoMalfoi,padmaPatil);
    }

}