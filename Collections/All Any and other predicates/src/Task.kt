// Return true if all customers are from the given city
fun Shop.checkAllCustomersAreFrom(city: City): Boolean {
    return this.customers.all {
        it.city == city
    }
}

// Return true if there is at least one customer from the given city
fun Shop.hasCustomerFrom(city: City): Boolean  {
    return this.customers.any {
        it.city==city
    }
}

// Return the number of customers from the given city
fun Shop.countCustomersFrom(city: City): Int {
    return this.customers.count {
        it.city==city

    }
}

// Return a customer who lives in the given city, or null if there is none
fun Shop.findAnyCustomerFrom(city: City): Customer? {
    return this.customers.find {
        it.city==city
    }
}
