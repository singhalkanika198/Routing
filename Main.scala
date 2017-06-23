import spray.routing.SimpleRoutingApp
import akka.actor.Actor
import spray.routing._
import spray.http._
import MediaTypes._
import akka.actor.{ActorSystem, Props}


object Main extends App with SimpleRoutingApp {
  implicit val system = ActorSystem("my-system")

  startServer(interface = "localhost", port = 8180) {
    path("") {
      get {
        complete{
          <h1> hello to spray</h1>
        }
      }
    }
  }
}

