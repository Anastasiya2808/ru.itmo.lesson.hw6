package ru.itmo.lesson.lesson6.hw6;

public class Application {
    public static void main(String[] args) {
        // альпинисты
        Alphinist [] alpinists1 = new Alphinist[3];
        alpinists1[0] = new Alphinist("Руслан");
        alpinists1[1] = new Alphinist("Иван");
        alpinists1[2] = new Alphinist("Степан");

        Alphinist [] alpinists2 = new Alphinist[3];
        alpinists2[0] = new Alphinist("Наталья");
        alpinists2[1] = new Alphinist("Олег");

        Alphinist [] alpinists3 = new Alphinist[3];
        alpinists3[0] = new Alphinist("Виктор");
        alpinists3[1] = new Alphinist("Лилия");

        // горы
        Mountain mountain1 = new Mountain("Чогори", "Китай", 8611);
        Mountain mountain2 = new Mountain("Эльбрус","Россия",5642);
        Mountain mountain3 = new Mountain("Лхоцзе", "Гималаи", 8516);

        // группы
        Groups groupName1 = new Groups(false, alpinists1);
        groupName1.getGroupName("One");
        groupName1.setGoMountain(mountain1);

        Groups groupName2 = new Groups(true, alpinists2);
        groupName2.getGroupName("Two");
        groupName2.setGoMountain(mountain2);

        Groups groupName3 = new Groups(true, alpinists3);
        groupName3.getGroupName("Three");
        groupName3.setGoMountain(mountain3);
    }
    }
}
