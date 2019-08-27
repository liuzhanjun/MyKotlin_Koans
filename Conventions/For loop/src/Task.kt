class DateRange(override val start: MyDate, override val endInclusive: MyDate) : ClosedRange<MyDate>, Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        return DateIterator(this)
    }
}

class DateIterator(val dateRange: DateRange) : Iterator<MyDate> {
    var current = dateRange.start
    override fun next(): MyDate {
        val result = current
        current = current.nextDay()
        return result
    }

    override fun hasNext(): Boolean {
        return current <= dateRange.endInclusive
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    var date: MyDate = MyDate(1, 1, 1)
    for (date in firstDate..secondDate) {
        handler(date)
    }

}
