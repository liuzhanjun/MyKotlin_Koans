// 返回所有交付的产品中最贵的产品
// (use the Order.isDelivered flag)
fun Customer.getMostExpensiveDeliveredProduct(): Product? {
    //获得交付的订单
    return this.orders.filter {
        it.isDelivered
    }.flatMap {
        //取订单中的产品
        it.products
    }.maxBy {
        //取产品中最贵的
        it.price
    }
}

//返回给定产品的订购次数。
//注:同一产品可多次订购。
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    //获得所有的客户的所有订单
    return this.customers.flatMap {
        it.orders
    }.flatMap {
        //获得订单中的所有产品
        it.products
    }.count {
        //统计给定产品的订购次数
        it == product
    }


}

/* TODO */
