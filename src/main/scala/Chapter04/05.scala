//Repeat the preceding exercise with a java.util.TreeMap that you adapt to the Scala API.
import java.util.Scanner
import java.io.File
import scala.collection.JavaConversions._
val in = new Scanner(new File("data.txt"))
var m:scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int]()
while(in.hasNext()) {
  var word = in.next()
  m(word) = m.getOrElse(word, 0) + 1
}
m
for ((k, v) <- m) printf("%s -- %d\n", k, v)
