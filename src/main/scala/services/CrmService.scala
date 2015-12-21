package services

import spray.routing._
import spray.http._

/**
 * Created by sagarhp on 12/21/15.
 */

trait CrmService extends HttpService {
  val crmRoutes =
    path("contacts") {
      get {
        complete("ok")
        // dispatch to CRM project
      }
    } ~
      path("leads") {
        get {
          complete("ok")
        }
      }
}