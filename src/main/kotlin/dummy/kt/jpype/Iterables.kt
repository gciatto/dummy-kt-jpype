/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package dummy.kt.jpype

fun intRange(min: Int, max: Int): Iterable<Int> =
    object : Iterable<Int> {
        override fun iterator(): Iterator<Int> =
            object : Iterator<Int> {
                private var x = min

                override fun hasNext(): Boolean = x < max

                override fun next(): Int = x++
            }
    }