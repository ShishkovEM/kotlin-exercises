import kotlin.test.Test
import kotlin.test.assertTrue

import java.io.ByteArrayOutputStream
import java.io.PrintStream

import ru.eshishkov.kotlin.exercises.main

class FirstTest {
    @Test
    fun testMainOutput() {
        val originalOut = System.out
        try {
            // Перенаправляем стандартный поток вывода
            val outputStreamCaptor = ByteArrayOutputStream()
            System.setOut(PrintStream(outputStreamCaptor))

            // Вызываем функцию main
            main()

            // Восстанавливаем стандартный поток вывода
            val output = outputStreamCaptor.toString().trim()
            assertTrue { output.contains("Hello, Kotlin!") }
            (1..5).forEach {
                assertTrue { output.contains("i = $it") }
            }
        } finally {
            // Возвращаем стандартный поток вывода на место
            System.setOut(originalOut)
        }
    }
}
