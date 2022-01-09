/* 

You are given a pair of integers (x,y). You may perform either of the two operations below,in any order, zero or more times.

1. (x,y) -> (x+y,y)
2. (x,y) -> (x,y+x)

For example, you can start with (1, 4), change it to (5, 4), change that to (5, 9), and then change that again to (5, 14).
You are given four integers: a, b, c, and d. Return “Yes” (without quotes) if it is possible to start with the pair (a, b) and end with the pair (c, d). Otherwise, return “No”.

Method signature: String isitpossible(int a, int b, int c, int d)

*/
   private val posibilities = LinkedList<Pair<Int, Int>>()

   fun isItPossible(a: Int, b: Int, c: Int, d: Int): String {
        posibilities.addLast(Pair(a, b))
        while (posibilities.isNotEmpty()) {
            posibilities.poll()?.let {

                val first = it.first
                val second = it.second
                if (first == c && second == d) {
                    return "YES"
                }
                val sum = first + second
                if (sum <= c) {
                    posibilities.addLast(Pair(sum, second))
                }
                if (sum <= d) {
                    posibilities.addLast(Pair(first, sum))
                }
            }
        }
        return "NO"
    }
