import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.css.CSSBuilder
import kotlinx.css.margin
import kotlinx.css.padding
import kotlinx.css.px
import kotlinx.html.DIV
import kotlinx.html.InputType
import kotlinx.html.div
import kotlinx.html.dom.append
import kotlinx.html.h1
import kotlinx.html.style
import kotlinx.html.table
import kotlinx.html.td
import kotlinx.html.tr
import org.w3c.dom.Element

fun main() {

    val rootDiv: Element = document.getElementById("root")!!
    window.onload = {
        rootDiv.append {
            div {
                usersPage()
            }
        }

    }


//
//    window.onload = {
//        render(document.getElementById("root")) {
//            child(Welcome::class) {
//                attrs {
//                    name = "Kotlin/JS"
//                }
//            }
//        }
//    }


}


data class User(
    val id: Int,
    val userName: String,
    val firstName: String,
    val lastName: String
)


fun DIV.usersPage() {

    val users: List<User> = listOf(
        User(1, "dford", "David", "Ford"),
        User(2, "kford", "Kellie", "Ford"),
        User(3, "jblow", "Joe", "Blow")
    )

//    div{
//        css{
//            margin(10.px)
//            padding(10.px)
//        }
//    }
//
//    h1{
//        css{
//           color = Color()
//        }
//    }

    div {

        val b = CSSBuilder()
        b.margin(10.px)
        b.padding(10.px)
        style = b.toString().filter { it != '\n' }



        usersTable(users)
    }


}

fun f1(): Unit {
    val cssBuilder = CSSBuilder()
}

fun DIV.usersTable(users: List<User>) {
    div {
        h1 { +"Users" }

        table {
            users.forEach {
                tr {
                    td { +it.id.toString() }
                    td { +it.userName }
                    td { +it.firstName }
                    td { +it.lastName }
                }
            }
        }

    }

}

