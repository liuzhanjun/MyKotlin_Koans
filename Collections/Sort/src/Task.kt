// Return a list of customers, sorted by the ascending number of orders they made
fun Shop.getCustomersSortedByNumberOfOrders(): List<Customer> {
    return this.customers.sortedBy {
        it.orders.size
    }
}
