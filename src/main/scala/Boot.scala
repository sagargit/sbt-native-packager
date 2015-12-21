import akka.actor.{Props, ActorSystem}
import akka.io.IO
import akka.util.Timeout
import spray.can.Http
import akka.pattern.ask
import akka.util.Timeout
import scala.concurrent.duration._

/**
 * Created by sagarhp on 12/21/15.
 */

object Boot extends App {
  implicit val system = ActorSystem("demo")

  val service = system.actorOf(Props[RoutesActor], "services")

  implicit val timeout = Timeout(5.seconds)
  IO(Http) ? Http.Bind(service, interface = "0.0.0.0", port = 8080)

}
