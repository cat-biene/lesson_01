package practice.part1;
// Метод main вызывает method1. method1 вызывает method2. method2 вызывает method3.
// В каждом методе должно происходить следующее:
// Печатает в консоль информацию, что метод такой-то стартовал
// Вызывает следующий метод
// Печатает в консоль, что метод такой-то финишировал
public class Cook {

    public static void main(String[] args) {
        method1();
        System.out.println();
    }

    private static void method1() {
        System.out.println("Method1 started.");
        toBuyProduct();
        System.out.println("Method1 finish.");
        System.out.println();
        method2();
    }

    private static void method2() {
        System.out.println("Method2 started.");
        toCookDinner();
        System.out.println("Method2 finish.");
        System.out.println();
        method3();
    }

    private static void method3() {
        System.out.println("Method3 started.");
        toEat();
        System.out.println("Method3 finish.");
        System.out.println();
        System.out.println();
    }

    private static void toEat() {
        System.out.println("Enjoy your meal!");
    }

    private static void toCookDinner() {
        System.out.println("I make to salad, ");
        System.out.println("soup ");
        System.out.println("and orange juice.");
    }

    private static void toBuyProduct() {
        System.out.println("Here is the money.");
        System.out.println("You need to buy the products.");
        System.out.println("Here a list of products: ");
        System.out.println("- meat; ");
        System.out.println("- orange; ");
        System.out.println("- onion; ");
        System.out.println("- carrot; ");
        System.out.println("- parsley. ");
    }

}
