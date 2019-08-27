// 返回所有客户订购的产品
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    val allProduct = this.customers.flatMap { it.orders.flatMap { it.products } }.toSet()
    return this.customers.fold(allProduct){
        //allProduct是product的初始集，每次通过intersect交集产生的结果都在这个product中
        //ements是调用fold方法的集合中的元素
        product,ements->
        //intersect方法是返回每个客户与所有产品的交集，这就是这个客户订购的产品
        product.intersect(ements.orders.flatMap { it.products }).toSet()
    }
}
