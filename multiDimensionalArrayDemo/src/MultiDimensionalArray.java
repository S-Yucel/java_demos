public class MultiDimensionalArray {
    public static void main(String[] args) {
        String[][] cities = new String[3][3];

        cities[0][0] = "Amsterdam";
        cities[0][1] = "London";
        cities[0][2] = "Paris";

        cities[1][0] = "New York";
        cities[1][1] = "Las Vegas";
        cities[1][2] = "Washington";

        cities[2][0] = "Istanbul";
        cities[2][1] = "Baku";
        cities[2][2] = "Bagdat";

        for (int i = 0; i < cities.length; i++) {

            for (int j = 0; j < cities.length; j++) {

                System.out.println(cities[i][j]);
            }
            System.out.println("***********");
        }

    }
}
