fun task(): List<Boolean> {
    val isEven: Int.() -> Boolean = {
       this and 1==0
    }
    val isOdd: Int.() -> Boolean = {
        this and 1==1
    }

    return listOf(42.isOdd(), 239.isOdd(), 294823098.isEven())
}
