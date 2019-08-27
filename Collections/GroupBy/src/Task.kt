// 返回对应城市的客户映射map
fun Shop.groupCustomersByCity(): Map<City, List<Customer>> {
    return this.customers.groupBy {
        it.city
    }
}


