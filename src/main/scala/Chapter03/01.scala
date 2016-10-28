import util.Random

def RandomArray(n: Int): Array[Int] = {
    var arr = new Array[Int](n)
    for (i <- 0 until n) arr(i) = Random.nextInt(n)
    arr
}

def RandomArrayNew(n: Int): Array[Int] = {
    var arr = new Array[Int](n)
    (0 until n).foreach(arr(_) = Random.nextInt(n))
    arr
}

println(RandomArray(10).mkString("<", ",", ">"))
//Random.nextInt generates an integer between 0 and n
// util.Random is random library in scala.
