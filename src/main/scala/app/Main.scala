package app

import cats.effect.{IO, Sync}
import cats.syntax.flatMap._
import cats.syntax.functor._

import scala.language.higherKinds

object Main {

  case class Service(x: Int, y: Int)

  case class Builder[F[_] : Sync](x: F[Int], y: F[Int]) {
    def result: F[Service] =
      for {
        xV <- x
        yV <- y
      } yield Service(xV, yV)
  }

  def newBuilder[F[_] : Sync]: Builder[F] = {
    val F = Sync[F]
    Builder(F.delay(longInt(5)), F.delay(longInt(10)))
  }

  def longInt(x: Int): Int = {
    Thread.sleep(10000)
    x
  }

  def main(args: Array[String]): Unit =
    newBuilder[IO]
      .copy(IO(100), IO(200))
      .result
      .map { x =>
        println(s"service = $x")
      }
      .unsafeRunSync()
}
