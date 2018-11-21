package org.arhan

import org.arhan.events.Calendar
import org.arhan.events.Event
import org.joda.time.Hours
import org.joda.time.Minutes
import org.joda.time.Seconds
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.Month

fun main(args: Array<String>) {
    val c = calendar(name = "My Calendar") {
        event(name = "Party") {
            //region dateTime
            dateTime = LocalDateTime.of(2018, Month.DECEMBER, 11, 0, 0)
            //endregion
            dateTime = 11 January 2018 at (14 hh 0.min)

        }
    }

    println(c)
}


//region time
infix fun Int.hh(minutes: Int): Pair<Int, Int> = Pair(this, minutes)

infix fun Int.hh(minutes: Minutes): LocalTime = LocalTime.of(this, 0).withMinute(minutes.minutes)


//endregion

val Int.h: Hours
    get() = Hours.hours(this)

val Int.min: Minutes
    get() = Minutes.minutes(this)

val Int.sec: Seconds
    get() = Seconds.seconds(this)


//region months

typealias LD = LocalDate

@DateDsl
infix fun Int.January(n: Int): LD  = LD.of(n, Month.JANUARY, this)

@DateDsl
infix fun Int.February(n: Int): LD = LD.of(n, Month.FEBRUARY, this)

@DateDsl
infix fun Int.March(n: Int): LD = LD.of(n, Month.MARCH, this)

@DateDsl
infix fun Int.April(n: Int): LD = LD.of(n, Month.APRIL, this)

@DateDsl
infix fun Int.May(n: Int): LD = LD.of(n, Month.MAY, this)

@DateDsl
infix fun Int.June(n: Int): LD = LD.of(n, Month.JUNE, this)

@DateDsl
infix fun Int.July(n: Int): LD = LD.of(n, Month.JULY, this)

@DateDsl
infix fun Int.August(n: Int): LD = LD.of(n, Month.AUGUST, this)

@DateDsl
infix fun Int.September(n: Int): LD = LD.of(n, Month.SEPTEMBER, this)

@DateDsl
infix fun Int.October(n: Int): LD = LD.of(n, Month.OCTOBER, this)

@DateDsl
infix fun Int.November(n: Int): LD = LD.of(n, Month.NOVEMBER, this)

@DateDsl
infix fun Int.December(n: Int): LD = LD.of(n, Month.DECEMBER, this)

@DateDsl
infix fun LD.at(hours: Int): LocalDateTime = atTime(hours, 0)

@DateDsl
infix fun LD.at(lt: LocalTime): LocalDateTime = atTime(lt)

@DateDsl
infix fun LocalDateTime.h(minutes: Int): LocalDateTime = withMinute(minutes)

@DateDsl
infix fun LocalDateTime.min(seconds: Int): LocalDateTime = withSecond(seconds)

@DateDsl
infix fun LocalDateTime.sec(a: Int): LocalDateTime = this
//endregion



//region event
@DateDsl
fun Calendar.event(name: String, e: Event.() -> Unit) {
    val event = Event(name).apply(e)
    addEvent(event)
}
//endregion

//region calendar
@DateDsl
fun calendar(name: String, c: Calendar.() -> Unit): Calendar = Calendar(name).apply(c)


//endregion

@DslMarker
annotation class DateDsl