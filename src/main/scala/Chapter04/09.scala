//Write a function lteqgt(values: Array[Int], v: int) that returns a triple
//containing count of values less than v, equal to v, and greater than v.

def lteqgtPrimitive(values: Array[Int], v:Int) =
    (values.filter(_ < v).length, values.filter(_ == v).length, values.filter(_ > v).length)

def lteqgt(values: Array[Int], v:Int) = (
    values.count(_ < v),
    values.count(_ == v),
    values.count(_ > v)
)

