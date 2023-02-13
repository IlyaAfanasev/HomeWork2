public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
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

}