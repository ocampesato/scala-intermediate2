import Stream._
import scala.collection.immutable.Stream
 
// http://www.scala-lang.org/api/2.7.2/scala/Stream.html
// http://alvinalexander.com/scala/how-to-use-stream-class-lazy-list-scala-cookbook
// http://alvinalexander.com/scala/how-to-add-elements-to-list-in-scala-append-prepend

object StreamOperators1 {
  def main(args: Array[String]): Unit = {
    val stream = (1 to 10).toStream

    val take1 = stream.take(4)
    val filt1 = stream.filter(_ < 7)
    val filt2 = stream.map { _ * 2 }

    println("take1:  "+take1)
    println("filt1:  "+filt1)
    println("filt2:  "+filt2)

    val take11 = take1.toList;
    val filt11 = filt1.toList;
    val filt22 = filt2.toList;

    println("take11:  "+take11)
    println("filt11:  "+filt11)
    println("filt22:  "+filt22)

/*
    val range = stream.range(1, 5);
    Stream[Integer] range = Streams.range(1, times);
    Stream[Integer] rangeFlatMapJust = raRange.flatMap(Streams::just);
 
    Stream[Integer] rangeFlatMapRange = raRange
      .flatMap(v -> Streams.range(v, 2));
*/
  }
}
