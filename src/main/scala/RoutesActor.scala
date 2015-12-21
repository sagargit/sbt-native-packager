import akka.actor.{Actor, ActorRefFactory}
import services.{CrmService, HrmService}

/**
 * Created by sagarhp on 12/21/15.
 */

class RoutesActor extends Actor with Routes {
  override val actorRefFactory: ActorRefFactory = context
  def receive = runRoute(routes)
}

trait Routes extends HrmService with CrmService  {
  val routes = {
    crmRoutes ~
      hrmRoutes
  }
}
