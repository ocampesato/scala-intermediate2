import Stream._
import scala.language.postfixOps

// compile with -feature option

object Sieve1 {
  def main(args: Array[String]): Unit = {
  
     def from(n: Int): Stream[Int] =
       Stream.cons(n, from(n + 1))
  
     def sieve(s: Stream[Int]): Stream[Int] =
       Stream.cons(s.head, sieve(s.tail filter { _ % s.head != 0 }))
  
     def primes = sieve(from(2))
  
     primes take 10 print
  }
}

