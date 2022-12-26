public class Main {
    public static void main(String[] args) {
        WomanPlayerGameCalculator womanPlayerGameCalculator = new WomanPlayerGameCalculator();
        womanPlayerGameCalculator.calculate();
        womanPlayerGameCalculator.gameOver();

        GameCalculator[] gameCalculator = new KidsGameCalculator[]{new KidsGameCalculator()};

    }
}
