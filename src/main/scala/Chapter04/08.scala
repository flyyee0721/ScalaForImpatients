//Write a function minmax(values: Array[Int]) that returns a pair containing the smallest and largest value in the array.

import util.Random
def randomArray(n: Int): Array[Int] = {
    var arr = new Array[Int](n)
    (0 until n).foreach(arr(_) = Random.nextInt(n))
    arr
}
def minmax(values: Array[Int]) = {
    (values.min, values.max)
}

var arr = randomArray(10)
println(arr.mkString(",") + " is the input")
println(minmax(arr) + "is the output")
