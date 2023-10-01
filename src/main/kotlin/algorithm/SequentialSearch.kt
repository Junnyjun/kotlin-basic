package algorithm

class SequentialSearch {
    fun task(arr: IntArray, target: Int): Int = arr.find { it == target }
            ?.let { arr.indexOf(it) }
            ?: -1
}