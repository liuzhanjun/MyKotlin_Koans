// Return the set of cities the customers are from
fun Shop.getCitiesCustomersAreFrom(): Set<City>{

    val map = shop.customers.map {
        it.city
    }
    return map.toSet()
}

// Return a list of the customers who live in the given city
fun Shop.getCustomersFrom(city: City): List<Customer> {
    val filter = shop.customers.filter {
        it.city == city
    }
    return filter

}
