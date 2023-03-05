package WeekDays
enum class ColorType/*(val r:Int, val g:Int, val b:Int)*/ {
    /*Red(255,0,0),
    Blue(0,0,255),
    Yellow(	255,255,0),
    Purple(	128,0,128),
    Green(0,255,0),
    Pink(255,192,203),
    Orange(255,165,0);*/
    RED{
        override fun colorName() = "Красный"
        override val rgb = "0xFF0000"
    },
    BLUE {
        override fun colorName() = "Голубой"
        override val rgb = "0x0000FF"
    },
    GREEN {
        override fun colorName() = "Зелёный"
        override val rgb = "0x00FF00"
    };
    abstract fun colorName(): String
    abstract val rgb: String
}