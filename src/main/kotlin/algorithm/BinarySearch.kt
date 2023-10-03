package algorithm

class BinarySearch {
    fun task(arr: IntArray, target: Int): Int = arr.binarySearch(target).let {
           when {
               it < 0 -> -1
               else -> it
           }
       }
}