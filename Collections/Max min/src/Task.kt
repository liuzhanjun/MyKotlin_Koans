// Return a customer whose order count is the highest among all customers
fun Shop.getCustomerWithMaximumNumberOfOrders(): Customer? {
    return this.customers.maxBy {
        it.orders.size
    }
}

fun Customer.getProducts(): Set<Product> {
    return this.orders.flatMap {
        it.products
    }.toSet()
}
// Return the most expensive product which has been ordered
fun Customer.getMostExpensiveOrderedProduct(): Product? {
    return this.getProducts().maxBy {
        it.price
    }
}
