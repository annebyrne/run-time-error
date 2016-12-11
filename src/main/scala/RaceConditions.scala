import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

case class GirlDeveloper(years: Int) extends Experience with Doubt {
  def goodEnough = years > minimum
  def internalised(self: String): Option[String] = {
    self match {
      case "assertion" => Some("confrontation")
      case "idea" => Some("other opinion")
      case "expert" => Some("more effort")
      case  _ => None
    }
  }
}

case class Developer(years: Int) extends Experience with Success {
  def goodEnough = years > 0
  def internalised(self: String): Future[String] = {
    self match {
    case "assertion" => Future("confidence")
    case "opinion" => Future("valid")
    case "expert" => Future("trusted")
    case _ => Future("potential")
  }
  }
}
  