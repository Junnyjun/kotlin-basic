import org.junit.jupiter.api.Test
import java.awt.Color
import java.awt.Color.red

class Basic_1 {

    @Test
    fun `테스트하기`(){
        println("HELLO WORLD")
    }

    @Test
    fun `변수 선언`(){
        val strVal = "value"
        val intVal = 42
        println("$strVal:$intVal")
    }

    @Test
    fun `배열 선언`(){
        val languages = arrayListOf("Java")
        languages.add("Kotlin")

        println(languages)
    }

    @Test
    fun `조건문`(){
        val color: Color = red

        when (color) {
            Color.RED -> print("Richard")
            Color.ORANGE -> print("Of")
            Color.YELLOW -> print("York")
            Color.GREEN -> print("GAVE")
        }
    }

    @Test
    fun `if 조건문`(){
        val cond = true
        val a = if(cond) println(1) else println(0)

    }

    @Test
    fun `When 조건문`(){
        val a = true
        when (a) {

            is true ->
                e.value
            is Sum ->
                eval(e.right) + eval(e.left)
            else ->
                throw IllegalArgumentException("Unknown expression")
        }
    }

}