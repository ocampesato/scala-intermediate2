import rx.lang.scala.Observable
import scala.concurrent.duration._
import scala.language.postfixOps

object Simple {
  def main(args: Array[String]): Unit = {
   //Observable.range(0, 5)
   //          .map(x => println("x squared: "+x*x))

   //Observable.interval(200 millis)
     val o2 = Observable
               .interval(200 millis)
               .take(10)
             //.map(x => x*x) 

     o2.subscribe(s   => println("s = "+s),
                  err => println("err = "+err), 
                  ()  => println("done")
               )

     //prevent program from exiting before o fires:
   //o2.toBlocking.last
  }
}

