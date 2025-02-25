enum CustomerType {

    REGULAR(0.05),
    PREMIUM(0.1),
    VIP(0.2);

    private float discount;

    private CustomerType(float discount){
        this.discount = discount;
    }

    public float getDiscount() {
        return discount;
    }
}