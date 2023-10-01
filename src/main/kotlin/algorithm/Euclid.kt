package algorithm

class Euclid {
    tailrec fun task(a: Int, b: Int): Int = when {
        a > b -> task(a - b, b)
        a < b -> task(a, b - a)
        else -> a
    }
}