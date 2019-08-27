fun foo(name: String, number: Int, toUpperCase: Boolean): String {
    if (toUpperCase) {
        return name.toUpperCase() + number
    } else {
        return name + number
    }
}

fun foo(name: String, number: Int): String {
    return foo(name, number, false)
}
fun foo(name: String, toUpperCase: Boolean): String {
    return foo(name, 42, false)
}

fun foo(name: String):String{
    return foo(name,42)
}
fun useFoo() = listOf(
        foo("a"),
        foo("b", number = 1),
        foo("c", toUpperCase = true),
        foo(name = "d", number = 2, toUpperCase = true)
)
