enum CustomerType {

    REGULAR(0.05),
    PREMIUM(0.1),
    VIP(0.2);

    private double discount;

    private CustomerType(double discount){
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}
