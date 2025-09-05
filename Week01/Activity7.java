public class Activity7 {
    public static void main(String[] args) {
        System.out.println("Population projection for the next five years:");

        System.out.println("Year 1 Population: " + (int) (312032486.0 + ((365.0 * 24 * 60 * 60) / 7.0) - ((365.0 * 24 * 60 * 60) / 13.0) + ((365.0 * 24 * 60 * 60) / 45.0)));

        System.out.println("Year 2 Population: " + (int) (312032486.0 + (((365.0 * 24 * 60 * 60) / 7.0) - ((365.0 * 24 * 60 * 60) / 13.0) + ((365.0 * 24 * 60 * 60) / 45.0)) * 2));

        System.out.println("Year 3 Population: " + (int) (312032486.0 + (((365.0 * 24 * 60 * 60) / 7.0) - ((365.0 * 24 * 60 * 60) / 13.0) + ((365.0 * 24 * 60 * 60) / 45.0)) * 3));

        System.out.println("Year 4 Population: " + (int) (312032486.0 + (((365.0 * 24 * 60 * 60) / 7.0) - ((365.0 * 24 * 60 * 60) / 13.0) + ((365.0 * 24 * 60 * 60) / 45.0)) * 4));

        System.out.println("Year 5 Population: " + (int) (312032486.0 + (((365.0 * 24 * 60 * 60) / 7.0) - ((365.0 * 24 * 60 * 60) / 13.0) + ((365.0 * 24 * 60 * 60) / 45.0)) * 5));
    }
}
