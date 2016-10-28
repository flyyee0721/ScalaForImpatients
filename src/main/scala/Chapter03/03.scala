//Write a function to swap the adjacent two elements of an integer array
//Generate a new array
def swap(a:Array[Int]): Array[Int] = {
    for (a <- 0 until (a.size - 1, 2)) yield a(i + 1), a(i)
}
