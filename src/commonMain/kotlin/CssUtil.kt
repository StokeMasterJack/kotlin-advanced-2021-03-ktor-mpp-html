import kotlinx.css.CSSBuilder
import kotlinx.html.CommonAttributeGroupFacade
import kotlinx.html.style

val CSSBuilder.serInline: String get() = toString().filter { it != '\n' }
val CSSBuilder.ser: String get() = serInline

fun buildCss(builderAction: CSSBuilder.() -> Unit): String = CSSBuilder().apply(builderAction).ser


fun CommonAttributeGroupFacade.css(builderAction: CSSBuilder.() -> Unit) {
    this.style = buildCss(builderAction)
}