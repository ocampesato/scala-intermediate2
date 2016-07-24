//import Stream._
import scala.collection.immutable.Stream
 
object StreamBasics1 {
  def main(args: Array[String]): Unit = {
    val stream = (1 to 10).toStream
    val head   = stream.head
    val tail   = stream.tail
    val max1   = stream.max
    val size1  = stream.size
    val sum1   = stream.sum

    println("head: "+head)
    println("tail: "+tail)
    println("max:  "+max1)
    println("size: "+size1)
    println("sum:  "+sum1)
  }
}

