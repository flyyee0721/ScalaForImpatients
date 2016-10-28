
def MyDistinct(a: Array[Int]): Array[Int] =  {
    a.distinct
}

print(MyDistinct(Array(1, 2, 4, 4, 2, 6, 89, 9, 9)).mkString(","))
