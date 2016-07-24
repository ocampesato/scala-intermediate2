import rx.lang.scala.Observable
import scala.concurrent.duration._
import scala.language.postfixOps

object ObservableSum {
  def main(args: Array[String]): Unit = {
    // #1: display a simple message: 
    val hello = Observable.just("Hello, world!");
    hello.subscribe(str => println("message: "+str))  

    // #2: add a set of numbers: 
    val o1 = Observable.just(1,2,3,4,5).reduce(_ + _)
    o1.subscribe(n => println("sum of first 5 integers = " + n))

    // #3: display a set of numbers: 
    val o2 = Observable.interval(200 millis).take(5)
    o2.subscribe(n => println("n = " + n))

  //prevent program from exiting before o fires:
  //Thread.sleep(1000)
    o2.toBlocking.last
  }
}

