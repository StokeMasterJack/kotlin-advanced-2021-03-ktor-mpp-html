import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.html.DIV
import kotlinx.html.div
import kotlinx.html.dom.append
import kotlinx.html.h1
import kotlinx.html.table
import kotlinx.html.td
import kotlinx.html.tr
import org.w3c.dom.Element

fun main() {

    val users: List<User> = listOf(
        User(1, "dford", "David", "Ford"),
        User(2, "kford", "Kellie", "Ford"),
        User(3, "jblow", "Joe", "Blow")
    )

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


    window.onload = {
        mkDivWithTable(users)
    }


}


data class User(
    val id: Int,
    val userName: String,
    val firstName: String,
    val lastName: String
)


fun mkDivWithTable(users: List<User>) {

    val rootDiv: Element = document.getElementById("root")!!

    rootDiv.append {

        div {
            +"ddd"

            blockOfHtml()

            div { +"11" }
            div { +"11" }

            headerPanel(users)
        }

    }

}

private fun DIV.blockOfHtml() {
    div {
        +"11"
    }
    div { +"11" }
    div { +"11" }
    div { +"11" }
}


fun DIV.headerPanel(users: List<User>) {

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
