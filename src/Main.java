public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        var dog=8;
        System.out.println(dog);
        dog=dog+4;
        System.out.println(dog);
        dog = (int) (dog - 3.5);
        System.out.println(dog);

    }

    public static void task2 () {
        var cat=3.6;
        System.out.println(cat);
        cat=cat+4;
        System.out.println(cat);
        cat=cat-1.6;
        System.out.println(cat);

    }

    public static void task3 () {
        var paper=763789;
        System.out.println(paper);
        paper=paper+4;
        System.out.println(paper);
        paper=paper-7639;
        System.out.println(paper);

    }
    public static void task4 () {
        var friend=19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);
    }
    public static void task5 () {
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);
    }
    public static void task6 () {
        var boxerWeight1=78.2;
        var boxerWeight2=82.7;
        var totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес боксеров " + totalWeight +" кг");
        var differenceWeight1 =boxerWeight2 - boxerWeight1;
        System.out.println("Разница в весе между боксерами (метод вычитания) " + differenceWeight1 + " кг");
        var differenceWeight2 =boxerWeight2 % boxerWeight1;
        System.out.println("Разница в весе между боксерами (метод функции остаток от деления)" + differenceWeight2 + " кг");
    }
    public static void task7 () {
        var workingHours = 640;
        var workingDay = 8;
        var totalWorkers1 = workingHours / workingDay;
        System.out.println("Всего работников в компании " + totalWorkers1 + " человек");
        var increasedStaff = 94;
        var totalWorkers2 = increasedStaff + totalWorkers1;
        var totalWorkingHours = totalWorkers2 * workingDay;
        System.out.println("Если в компании работает " + totalWorkers2 + " человек, то всего " + totalWorkingHours + " часов работы может быть поделено между сотрудниками");
    }
}