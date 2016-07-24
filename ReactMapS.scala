import rx.lang.scala.Observable
import scala.concurrent.duration._
import scala.language.postfixOps

object ReactMapS {
  def main(args: Array[String]): Unit = {
    val numbers: Observable[Long] = Observable.interval(100 millis).take(8) 

    val times10 = numbers.map(_ * 10)
    times10.subscribe(n => println("multiple of 10:  "+n))  

  //prevent program from exiting before Observable fires:
    numbers.toBlocking.last
  }
}

