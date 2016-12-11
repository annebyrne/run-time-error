import scala.concurrent.Future

trait Experience {
  def years: Int
  def goodEnough: Boolean
  def minimum: Int = 5
}

trait Success { def internalised(self: String): Future[String] }

trait Doubt { def internalised(self: String): Option[String] }