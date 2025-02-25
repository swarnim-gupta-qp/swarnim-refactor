class Order {
    Customer customer;
    List<String> items;
    List<Double> prices;

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
        this.prices = new ArrayList<>();
    }

    public void addItem(String item, double price) {
        items.add(item);
        prices.add(price);
    }

    public void printOrder() {
        System.out.println("Customer: " + customer.name);
        System.out.println("Items: " + items);
        double totalPrice = getTotalPrice();
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Discounted Price: " + getDiscountedPrice(totalPrice));
    }


    public void generateInvoice() {
        System.out.println("Generating Invoice...");
        System.out.println("Customer: " + customer.name);
        double totalPrice = getTotalPrice();
        System.out.println("Total: $" + totalPrice);
        System.out.println("Discounted Total: $" + getDiscountedPrice(totalPrice));
        System.out.println("Items: " + items);
        System.out.println("Thank you for shopping with us!");
    }

    private double getTotalPrice() {
        double totalPrice = 0;
        for (double price : prices) {
            totalPrice += price;
        }
        return totalPrice;
    }

    private double getDiscountedPrice(double totalPrice) {
        return totalPrice - (totalPrice * customer.customerType.getDiscount());
    }
}
