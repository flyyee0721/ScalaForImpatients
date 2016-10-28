//Write a function to swap the adjacent two elements of an integer array

def swap(a:Array[Int]): Array[Int] = {
    (0 until (a.size-1, 2)).foreach(apply(a, _))
    a
}

def apply(a:Array[Int], i:Int) = {
    var tmp = a(i)
    a(i) = a(i + 1)
    a(i + 1) = tmp
}

def swapAnother(a:Array[Int]): Array[Int] = {
    //0, 1, 2, 3, 4, 5 => a.size = 6 => a.size - 1 = 5 => [0,4] => 0, 2, 4
    //0, 1, 2, 3, 4, 5, 6 => a.size = 7 => a.size - 1 = 6 => [0, 5] =>0, 2, 4
    for (i <- 0 until (a.size - 1, 2)) {
        var tmp = a(i)
        a(i) = a(i + 1)
        a(i + 1) = tmp
    }
    //Assignment returns Unit, need to explicitly return the array.
    a
}
