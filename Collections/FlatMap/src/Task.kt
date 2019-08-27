// Return all products this customer has ordered
fun Customer.getOrderedProducts(): Set<Product> {
  return orders.flatMap {
        it.products
    }.toSet()

}

// Return all products that were ordered by at least one customer
fun Shop.getAllOrderedProducts(): Set<Product> {
    return customers.flatMap {
        it.getOrderedProducts()
    }.toSet()
}


