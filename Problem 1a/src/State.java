public abstract class State {
    private String name;
    protected SalesTaxBehavior salesTaxBehavior;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showTax(double value) {
        double tax = salesTaxBehavior.compute(value);
        System.out.printf("The sales tax on $%.2f in %s is $%.2f.%n", value, name, tax);
    }
}