//Define a linked hash map that maps "Monday" to java.util.Calendar.MONDAY, and similarly for
//the other weekdays. Demonstrate that the elements are visited in insertion order.
import scala.collection.mutable.LinkedHashMap
import java.util.Calendar._
//Specify the template parameters is optional when initializing with values,
//scala can refer to the values.
var map = LinkedHashMap(
        "Monday"-> MONDAY,
        "Tuesday" -> TUESDAY,
        "Friday" -> FRIDAY,
        "Sunday" -> SUNDAY,
        "Saturday" -> SATURDAY,
        "Wednesday" -> WEDNESDAY,
        "Thursday" -> THURSDAY)

//foreach accepts only one parameter, need to use pattern match to extract the key and value.
map.foreach({case (k,v) => printf("%s --- %d\n", k, v)})
map.foreach(x => x match {case (k,v) => printf("%s --- %d\n", k, v)})
for ((k,v) <- map) printf("%s  %d \n", k,v)
