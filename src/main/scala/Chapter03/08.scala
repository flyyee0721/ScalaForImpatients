//Rewrite the example at the end of section 4 using the drop method for dropping
//the index of the first match. Look the method up in ScalaDoc

//Given a sequence of integers, remove all but the first negative number.

//Delete and insert can only happen in arraybuffer because array is fix size
//for ... yield generate a new array/arraybuffer.
//Remove from the end is more efficient.
def KeepOnlyFirstNegative(a: Array[Int]): Array[Int] = {
    var buffer = a.toBuffer
    (for (i <- 0 until a.size if a(i) < 0) yield i).reverse.dropRight(1).foreach(buffer.remove(_))
    buffer.toArray
}

print(KeepOnlyFirstNegative(Array(1, 3, -2, 5, 9, -1 ,-5, 6, -10)).mkString(","))
