/*
Write a program that reads words from a file. Use an immutable map to count how
often each word appears. To read the words, simply use a java.util.Scanner:
val in = new java.util.Scanner(java.io.File("myfile.txt"))
while (in.hasNext()) process in.next()
    Or look at the “Files and Regular Expressions” chapter for a Scalaesque way.
    At the end, print out all words and their counts.

*/

import java.util.Scanner
import java.io.File
val in = new Scanner(new File("data.txt"))
//Default map is immutable
var m = Map[String, Int]()
while (in.hasNext()) {
    var word = in.next
    //Since the map is immutable, the value itself cannot be update
    //m(word) = m.getOrElse(word, 0) + 1
    m += (word -> (m.getOrElse(word, 0) + 1))
}
m
for ((k, v) <- m) printf("%s -- %d\n", k, v)

