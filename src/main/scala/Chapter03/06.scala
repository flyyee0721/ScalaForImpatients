import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting.quickSort

def ReverseSort(a: Array[Int]): Array[Int]= {
    a.sortWith(_ > _)
}

def ReverseSortArrayBuffer(a: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    a.sortWith(_ > _)
}

//Both the sort of array and array buffer creats a new array/arraybuffer.
//To rearrange the elements of array[Int], i.e in place, use built in quicksort
//Quick sort for array is in place.

def ReverseSortInPlace(a: Array[Int]): Array[Int] = {
    quickSort(a)
    a.reverse
}

def ReverseSortBufferInPlace(a: ArrayBuffer[Int]): Buffer[Int] = {
    var arr = a.toArray
    quickSort(arr)
    arr.reverse.toBuffer
}
