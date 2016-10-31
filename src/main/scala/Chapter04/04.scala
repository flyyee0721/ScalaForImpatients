/*

Write a program that reads words from a file. Use a java util map to count how
often each word appears. To read the words, simply use a java.util.Scanner:
val in = new java.util.Scanner(java.io.File("myfile.txt"))
while (in.hasNext()) process in.next()
    Or look at the “Files and Regular Expressions” chapter for a Scalaesque way.
    At the end, print out all words and their counts.

Repeat the preceding exercise with a sorted map, so that the words are printed in
sorted order

*/

import scala.collection.immutable.SortedMap
import java.util.Scanner
import java.io.File
val in = new Scanner(new File("data.txt"))
//SortedMap is an abstract class.
//TreeMap extends from SortedMap and Map
//HashMap doesn`t extend from SortedMap
var map = SortedMap[String, Int]()
//var map = new TreeMap[String, Int]()
while (in.hasNext()) {
  var word = in.next
  map += (word -> (map.getOrElse(word, 0) + 1))
}
map
for ((k, v) <- map) printf("%s -- %d\n", k, v)
