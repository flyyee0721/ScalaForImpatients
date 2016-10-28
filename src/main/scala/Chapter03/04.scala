//Give an array of integers, produce an array that contains all the elements in such an order:
//all positive values, in the original order, followed by all zero values and then all negative values,
//in their original order

//Produce a new array
def shuffle(a: Array[Int]):Array[Int] = {
    var negative = ArrayBuffer[Int]()
    var zero = ArrayBuffer[Int]()
    var positive = ArrayBuffer[Int]()
    for (i <- a) i match {
        case i if i > 0 => positive += i
        case i if i < 0 => negative += i
        case _ => zero += i
    }
    positive ++= zero
    positive ++= negative
    positive.toArray
}
 var a = Array(1, 3, 3, 6, 8, -5, -1, -5, -1, 0, 9, -5, 0)
 print(shuffle(a).mkString(","))

//Filter three times
//use ++ to combine elements from multiple collections/arrays
 def advancedShuffle(a: Array[Int]):Array[Int] = {
     a.filter(_>0) ++ a.filter(_ == 0) ++ a.filter(_<0)
 }

var a =  Array(1, 3, 3, 6, 8, -5, -1, -5, -1, 0, 9, -5, 0)
print(advancedShuffle(a).mkString(","))
