public class SalesTaxCalculator {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java SalesTaxCalculator <state> <sale amount>");
            return;
        }

        String stateName = args[0];
        double saleAmount = Double.parseDouble(args[1]);

        State state;
        switch (stateName.toLowerCase()) {
            case "alaska":
                state = new Alaska();
                break;
            case "indiana":
                state = new Indiana();
                break;
            case "hawaii":
                state = new Hawaii();
                break;
            default:
                System.out.println("Invalid state. Please choose Alaska, Indiana, or Hawaii.");
                return;
        }

        state.showTax(saleAmount);
    }
}
