
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        System.out.println("Задание 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        System.out.println("задание 3");
        dog = (int) (dog - 3.5);
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println("Задание 6");
        var  firstboxerWeight = 78.2;
        var secondboxerWeight = 82.7;
        var boxerWeight = firstboxerWeight + secondboxerWeight;
        System.out.println("Общий вес боксеров" + boxerWeight);
        var boxersWeight = secondboxerWeight - firstboxerWeight;
        System.out.println("Разница в весе между боксерами составляет" + boxersWeight);
        System.out.println("Задание 7");
        var boxWeight = secondboxerWeight % firstboxerWeight;
        System.out.println("Остаток от деления между двумя весами составляет" + boxWeight);
        System.out.println("Задание 8");
        var openingHours = 640;
        var workHours = 8;
        var empLyees = openingHours / workHours;
        System.out.println("Всего работников в компании - " + empLyees + " сотрудников");
        empLyees =  empLyees + 94;
        var wHours = empLyees * 8;
        System.out.println("Если в компании работает " + empLyees + " человек, то всего" + wHours + " часов работы может быть поделено между сотрудниками" );







    }
}






