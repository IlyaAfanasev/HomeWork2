public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
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
        var defferenceWeight =boxerWeight2 % boxerWeight1;
        System.out.println("Разница в весе между боксерами " + defferenceWeight + " кг");
    }


}