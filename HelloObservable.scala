import rx.lang.scala.Observable

object HelloObservable {
  def main(args: Array[String]) { 
    def Hello(names: String*) {
      Observable.from(names) subscribe { n =>
        println(s"Hello $n!")
      }
    }
    println("strings = "+Hello("a b c"))
  }
}

