import kotlinx.css.CSSBuilder


val CSSBuilder.serInline: String get() = toString().filter { it != '\n' }
val CSSBuilder.ser: String get() = toString()

