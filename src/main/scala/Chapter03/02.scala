//Write a function to swap the adjacent two elements of an integer array

def swap(a:Array[Int]): Array[Int] = {
    (0 until (a.size-1, 2)).foreach(apply(a, _))
    a
}

def swapAnother(a:Array[Int]): Array[Int] = {
    for (i <- 0 until (a.size - 1, 2)) {
        var tmp = a(i)
        a(i) = a(i + 1)
        a(i + 1) = tmp
    }
    a
}

def apply(a:Array[Int], i:Int) = {
    var tmp = a(i)
    a(i) = a(i + 1)
    a(i + 1) = tmp
}
