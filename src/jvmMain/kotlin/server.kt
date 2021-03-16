import io.ktor.application.call
import io.ktor.html.respondHtml
import io.ktor.http.HttpStatusCode
import io.ktor.http.content.resources
import io.ktor.http.content.static
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import kotlinx.css.CSSBuilder
import kotlinx.css.margin
import kotlinx.css.padding
import kotlinx.css.px
import kotlinx.html.HTML
import kotlinx.html.body
import kotlinx.html.div
import kotlinx.html.head
import kotlinx.html.id
import kotlinx.html.script
import kotlinx.html.title

//import kotlinx.css.

fun HTML.index() {
    CSSBuilder()
    head {
        title("Hello from Ktor!")
    }
    body {
        div {
            +"Hello from Ktor"
        }
        div {
            id = "root"
        }
        script(src = "/static/output.js") {}
    }
}


fun HTML.envelope() {







    head {
        title("Title Goes Here 1")
    }
    body {
        div { id = "root" }
        script(src = "/static/output.js") {}
    }
}


fun main() {
    embeddedServer(Netty, port = 8080, host = "127.0.0.1") {
        routing {
            get("/") {
                call.respondHtml(HttpStatusCode.OK, HTML::index)
            }
            get("/envelope") {
                call.respondHtml(HttpStatusCode.OK, HTML::envelope)
            }
            static("/static") {
                resources()
            }
        }
    }.start(wait = true)
}