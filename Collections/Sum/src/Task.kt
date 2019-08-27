// Return the sum of prices of all products that a customer has ordered.
// Note: the customer may order the same product for several times.
fun Customer.getTotalOrderPrice(): Double {
    return this.getAllProduct().sumByDouble {
        it.price
    }
}

fun Customer.getAllProduct(): Set<Product> {
    return this.orders.flatMap {
        it.products
    }.toSet()
}
