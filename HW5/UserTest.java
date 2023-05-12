public class UserTest {
    public void test() {
        // User 1
        User dima = new User("Dima Bagrov", "Testtest");
        System.out.println(dima);
        dima.makePurchase(245);
        dima.makePurchase(200);
        dima.printTotalAmountOfSpentMoney();
        System.out.println();

        // User 2
        User roma = new User("Roma Chirko", 39, "test@gmail.com", "Test12345", true, 500);
        System.out.println(roma);
        roma.makePurchase(750);
        roma.printTotalAmountOfSpentMoney();
        System.out.println();

        // User 3
        User vika = new User("Vika Popova");
        System.out.println(vika);
        vika.makePurchase(1000);
        vika.printTotalAmountOfSpentMoney();
    }
}
