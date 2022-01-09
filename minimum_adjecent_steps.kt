// Minimum number of adjacent swaps of binary array

fun countSwaps(a: Array<Int>): Int {
        var n0 = 0
        var i0 = 0
        var n1 = 0
        var i1 = 0
        for (p in a.indices) {
            if (a[p] == 0) n0 += p - i0++ // No. of steps to move the 0 to the left
            else n1 += p - i1++ // No. of steps to move the 1 to the left
        }
        return min(n0, n1) // Choose lowest no. of steps
    }
