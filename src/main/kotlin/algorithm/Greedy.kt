package algorithm

import java.util.stream.DoubleStream
import java.util.stream.IntStream

class Greedy {
    private var count = 0

    fun task(n: Int): Int {
        var target = n

        while (target != 1) {
            when {
                target % 5 == 0 -> target /= 5
                target % 3 == 0 -> target /= 3
                target % 2 == 0 -> target /= 2
                else -> target -= 1
            }
            count += 1
        }

        return count
    }
}