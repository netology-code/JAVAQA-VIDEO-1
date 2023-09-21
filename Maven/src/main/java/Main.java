public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();

        int expected = 150;
        int actual = service.calcBonus(5_000, true);
        System.out.println("1. " + expected + " == ? == " + actual);

        expected = 50;
        actual = service.calcBonus(5_000, false);
        System.out.println("2, " + expected + " == ? == " + actual);
    }
}
