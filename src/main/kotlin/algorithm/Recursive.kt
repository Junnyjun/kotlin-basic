package algorithm

class Recursive {
    tailrec fun task(n: Int): Int = when {
        n == 1 -> 1
        else -> n * task(n - 1)
    }
}