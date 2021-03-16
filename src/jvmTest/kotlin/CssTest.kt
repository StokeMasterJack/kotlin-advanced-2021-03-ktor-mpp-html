import kotlinx.css.CSSBuilder
import kotlinx.css.margin
import kotlinx.css.padding
import kotlinx.css.px
import kotlin.test.Test
import kotlin.test.assertEquals

class CssTest {

    @Test
    fun test() {
        val b = CSSBuilder()
        b.margin(10.px)
        b.padding(10.px)
        assertEquals("margin: 10px;\npadding: 10px;\n", b.toString())

    }
}