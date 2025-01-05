package kg.attractor.java.task1;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
        Printer.print(cats);

        System.out.println("Sort by breed");
        cats.sort((s1, s2) -> Cat.breedSort(s1, s2));
        Printer.print(cats);

        System.out.println("Sort by name");
        cats.sort(Comparator.comparing(Cat::getName));
        Printer.print(cats);

        System.out.println("Sort by age");
        cats.sort((Comparator.comparing(Cat::getAge)));
        Printer.print(cats);

        System.out.println("Remove by color");
        Cat.Color colorForRemove = Cat.Color.SILVER;
        cats.removeIf(cat -> cat.getColor() == colorForRemove);
        System.out.println("Removed color: "+colorForRemove);
        Printer.print(cats);

        System.out.println("Remove by number length 5");
        cats.removeIf(cat -> cat.getName().length() == 5);
        Printer.print(cats);
    }

        // А сюда добавьте код, который будет сортировать коллекцию котов
        // используйте лямбда-выражения и ссылки на методы
        // cats.sort(?);
        // Printer.print(cats);
    }


