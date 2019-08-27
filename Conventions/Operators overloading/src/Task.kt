import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }
class RepeatedTimeInterval(val timeInterval: TimeInterval, val number: Int)
operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = this.addTimeIntervals(timeInterval,1)
operator fun TimeInterval.times(number:Int):RepeatedTimeInterval{
    return RepeatedTimeInterval(this,number)
}
operator fun MyDate.plus(repeatedTimeInterval: RepeatedTimeInterval):MyDate{
    return addTimeIntervals(repeatedTimeInterval.timeInterval,repeatedTimeInterval.number)
}
fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5

}
