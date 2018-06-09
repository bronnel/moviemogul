package com.fractalwrench.moviemogul

import com.squareup.moshi.Moshi
import org.junit.Assert.assertNotNull
import org.junit.Test

class MovieDetailResponseTest {

    @Test
    fun testSerialisation() {

        val json = javaClass.getResource("/detail_example.json").readText()
        assertNotNull(json)

        val moshi = Moshi.Builder().build()
        val adapter = moshi.adapter(MovieDetailResponse::class.java)
        val response = adapter.fromJson(json)
        assertNotNull(response)
    }

}