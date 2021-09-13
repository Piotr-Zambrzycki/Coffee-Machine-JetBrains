class ManufacturingController {

    public static int numberOfProducts = 0;

    public static String requestProduct(String product) {
        ManufacturingController.numberOfProducts++;
        return numberOfProducts + ". Requested " + product;
    }

    public static int getNumberOfProducts() {
        return numberOfProducts;
    }
}