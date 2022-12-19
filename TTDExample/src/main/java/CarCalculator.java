public class CarCalculator {

    public double calculateBrandValue(String carBrand) {

        if (carBrand.equalsIgnoreCase("toyota")) {
            return 5000;
        } else if (carBrand.equalsIgnoreCase("bmw")) {
            return 8000;
        } else if (carBrand.equalsIgnoreCase("vw")) {
            return 3000;
        } else {
            return 1000;
        }
    }

}
