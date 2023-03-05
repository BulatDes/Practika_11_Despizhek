import WeekDays.*
fun main(){
    try {
        println("Введите число")
        var num: Int = readLine()!!.toInt()
        when {
            (num<=0 || num >31)->throw Exception("Error")
        }
        //if(num==0)throw Exception("Error")
        num = num % 7
        val day:Day
        when (num) {
            1 -> {
                day = Day.Monday
            }
            2 -> {
                day = Day.Tuesday
            }
            3 -> {
                day = Day.Wednesday
            }
            4 -> {
                day = Day.Thursday
            }
            5 -> {
                day = Day.Friday
            }
            6 -> {
                day = Day.Saturday
            }
            0 -> {
                day = Day.Sunday
            }
            else ->throw Exception("Error")
        }
        println(day.Getday(day))
        day.Weekend(day)
        println("${day.Yesterday(day)}")
        println("${day.Tomorrow(day)}")

        val colorRed = ColorType.RED
        println(colorRed.name)
        println(colorRed.ordinal)

    }catch (ex:Exception){
        println(ex.message)
    }
}