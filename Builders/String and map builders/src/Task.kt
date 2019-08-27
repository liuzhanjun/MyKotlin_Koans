import java.util.HashMap

/* TODO */
fun buildMap(build:MutableMap<Int,String>.()->Unit):Map<Int,String>{
    val mutableMapOf = mutableMapOf<Int, String>()
    mutableMapOf.build()
    return mutableMapOf
}

fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
