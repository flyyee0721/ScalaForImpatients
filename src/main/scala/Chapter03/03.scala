//Write a function to swap the adjacent two elements of an integer array
//Generate a new array
//yield returns scala.collection.immutable.IndexedSeq[Int]
//yield has to follow for(....), for(...) ... match yield is illegal.
def swap(a:Array[Int]) = {
    for (i <- 0 until a.size) yield
            if (i % 2 == 0)
                if (i < a.size - 1) a(i + 1) else a(i)
            else a(i- 1)
}
//Pattern match returns a value under different cases
// i match {
    //case ... => return value1
    //case <value> pattern match i with the value, cannot use case<statement/expression>
    //case ... =>  return value 2
//}
def swap(a:Array[Int]) = {
    for (i <- 0 until a.size) yield i % 2 match {
        case 0 if i < a.size - 1 => a(i + 1)
        case 0 if i == a.size - 1 => a(i)
        case _ => a(i - 1)
    }
}
