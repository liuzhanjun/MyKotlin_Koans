import java.util.*
import kotlin.collections.ArrayList

fun <T,C:MutableCollection<T>> Collection<T>.partitionTo(first: C, second: C, predicate: (T) -> Boolean):Pair<C,C>{
    this.forEach {
        if (predicate(it)){
            first.add(it)
        }else{
            second.add(it)
        }
    }
    return Pair(first,second)
}

fun partitionWordsAndLines() {
    val (words, lines) = listOf("a", "a b", "c", "d e").
            partitionTo(ArrayList<String>(), ArrayList()) { s -> !s.contains(" ") }
    words == listOf("a", "c")
    lines == listOf("a b", "d e")
}

fun partitionLettersAndOtherSymbols() {
    val (letters, other) = setOf('a', '%', 'r', '}').
            partitionTo(HashSet<Char>(), HashSet()) { c -> c in 'a'..'z' || c in 'A'..'Z'}
    letters == setOf('a', 'r')
    other == setOf('%', '}')
}
