// Order Management System - Handles orders
class OrderManagementSystem {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", CustomerType.VIP);
        Order order = new Order(customer);

        order.addItem("Laptop", 1000);
        order.addItem("Mouse", 50);
        order.addItem("Keyboard", 80);

        order.printOrder();

        order.generateInvoice();
    }

}
