package WeekDays
enum class Day {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday;

    public fun Getday(day: Day): String {
        return when (day) {
            Day.Monday -> "Понедельник"
            Day.Tuesday -> "Вторник"
            Day.Wednesday -> "Среда"
            Day.Thursday -> "Четверг"
            Day.Friday -> "Пятница"
            Day.Saturday -> "Суббота"
            Day.Sunday -> "Воскресенье"
        }
    }

    public fun Weekend(day: Day) {
        when (day.ordinal) {
            in 0..4 -> println("Рабочий день")
            else -> println("Выходной день")
        }
    }

    public fun Yesterday(day:Day):String{
        val yesterday:Day
        var vyvod:String
    when(day){
        Day.Monday -> {
            yesterday=Day.Sunday
        }
        Day.Tuesday -> {
            yesterday=Day.Monday
        }
        Day.Wednesday -> {
            yesterday=Day.Tuesday
        }
        Day.Thursday -> {
            yesterday=Day.Wednesday
        }
        Day.Friday -> {
            yesterday=Day.Thursday
        }
        Day.Saturday -> {
            yesterday=Day.Friday
        }
        Day.Sunday -> {
            yesterday=Day.Saturday
        }
    }

        when(yesterday.ordinal){
            in 0..1->vyvod="Вчера был ${yesterday.Getday(yesterday)}"
            2->vyvod="Вчера былa ${yesterday.Getday(yesterday)}"
            3->vyvod="Вчера был ${yesterday.Getday(yesterday)}"
            4->vyvod="Вчера была ${yesterday.Getday(yesterday)}"
            5->vyvod="Вчера была ${yesterday.Getday(yesterday)}"
            6->vyvod="Вчера было ${yesterday.Getday(yesterday)}"
            else->throw Exception("Error")
        }
        return vyvod
    }

    public fun Tomorrow(day:Day):String{
        val tomorrow:Day
        var vyvod:String
        when(day){
            Day.Monday -> {
                tomorrow=Day.Tuesday
            }
            Day.Tuesday -> {
                tomorrow=Day.Wednesday
            }
            Day.Wednesday -> {
                tomorrow=Day.Thursday
            }
            Day.Thursday -> {
                tomorrow=Day.Friday
            }
            Day.Friday -> {
                tomorrow=Day.Saturday
            }
            Day.Saturday -> {
                tomorrow=Day.Sunday
            }
            Day.Sunday -> {
                tomorrow=Day.Monday
            }
        }

        when(tomorrow.ordinal){
            in 0..6->vyvod="Завтра будет ${tomorrow.Getday(tomorrow)}"
            else->throw Exception("Error")
        }
        return vyvod
    }
}
