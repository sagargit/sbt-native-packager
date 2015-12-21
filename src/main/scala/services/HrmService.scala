package services

import spray.routing._
import spray.http._


/**
 * Created by sagarhp on 12/21/15.
 */

trait HrmService extends HttpService {
  val hrmRoutes =
    path("employee") {
      get {
        complete("ok")
        // dispatch to HRM project
      }
    } ~
      path("attendance") {
        get {
          complete("ok")
        }
      }
}
