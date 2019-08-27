fun renderProductTable(): String {
    val products = getProducts()
    return html {
        table {
            products.forEachIndexed { index, product ->
                tr(getTitleColor()) {
                    td(getCellColor(index, 0)) {
                        text("Product:" + product.description)
                    }
                    td(getCellColor(index, 1)) {
                        text("Price:" + product.price)
                    }
                    td(getCellColor(index, 2)) {
                        text("Popularity:" + product.popularity)
                    }
                }

            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, row: Int) = if ((index + row) % 2 == 0) "#dce4ff" else "#eff2ff"
