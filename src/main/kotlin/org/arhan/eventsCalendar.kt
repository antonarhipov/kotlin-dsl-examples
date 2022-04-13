package org.arhan

import org.arhan.events.Calendar
import org.arhan.events.Event
import org.arhan.model.ClientBuilder
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.Month

//region months

typealias LD = LocalDate

context (ClientBuilder)
@DateDsl
infix fun Int.January(n: Int): LD = LD.of(n, Month.JANUARY, this)

context (ClientBuilder)
@DateDsl
infix fun Int.February(n: Int): LD = LD.of(n, Month.FEBRUARY, this)

context (ClientBuilder)
@DateDsl
infix fun Int.March(n: Int): LD = LD.of(n, Month.MARCH, this)

context (ClientBuilder)
@DateDsl
infix fun Int.April(n: Int): LD = LD.of(n, Month.APRIL, this)

context (ClientBuilder)
@DateDsl
infix fun Int.May(n: Int): LD = LD.of(n, Month.MAY, this)

context (ClientBuilder)
@DateDsl
infix fun Int.June(n: Int): LD = LD.of(n, Month.JUNE, this)

context (ClientBuilder)
@DateDsl
infix fun Int.July(n: Int): LD = LD.of(n, Month.JULY, this)

context (ClientBuilder)
@DateDsl
infix fun Int.August(n: Int): LD = LD.of(n, Month.AUGUST, this)

context (ClientBuilder)
@DateDsl
infix fun Int.September(n: Int): LD = LD.of(n, Month.SEPTEMBER, this)

context (ClientBuilder)
@DateDsl
infix fun Int.October(n: Int): LD = LD.of(n, Month.OCTOBER, this)

context (ClientBuilder)
@DateDsl
infix fun Int.November(n: Int): LD = LD.of(n, Month.NOVEMBER, this)

context (ClientBuilder)
@DateDsl
infix fun Int.December(n: Int): LD = LD.of(n, Month.DECEMBER, this)

context (ClientBuilder)
@DateDsl
infix fun LD.at(hours: Int): LocalDateTime = atTime(hours, 0)

context (ClientBuilder)
@DateDsl
infix fun LD.at(lt: LocalTime): LocalDateTime = atTime(lt)

context (ClientBuilder)
@DateDsl
infix fun LocalDateTime.h(minutes: Int): LocalDateTime = withMinute(minutes)

context (ClientBuilder)
@DateDsl
infix fun LocalDateTime.min(seconds: Int): LocalDateTime = withSecond(seconds)

context (ClientBuilder)
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