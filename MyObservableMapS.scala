import rx.lang.scala.Observable
import scala.concurrent.duration._
import scala.language.postfixOps

object MyObservableMapS {
  def main(args: Array[String]): Unit = {
    val o2 = Observable
              .interval(200 millis)
              .take(10)
              .map(x => 
                {if (x % 3 == 0)      println(x+": Multiple of 3")
                 else if (x % 5 == 0) println(x+": Multiple of 5")
                 else                 println(x+": NEITHER")
                })
  o2.subscribe()

  //prevent program from exiting before o fires:
  o2.toBlocking.last
  }
}

