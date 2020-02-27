package com.test.kotlinactivity1

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */


fun <T> encode(list: List<T>): List<Pair<Int, T>> =
    pack(list).map { Pair(it.size, it.first()) }


class ExampleUnitTest {
    @Test fun `run-length encoding of a list`() {
        assertThat(encode("aaaabccaadeeee".toList()), equalTo(listOf(
            Pair(4, 'a'), Pair(1, 'b'), Pair(2, 'c'), Pair(2, 'a'), Pair(1, 'd'), Pair(4, 'e')
        )))
    }
}
