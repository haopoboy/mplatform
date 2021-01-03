package io.github.haopoboy

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Profile

/**
 * Only run on failing a test to see report with profile failure.
 */
@SpringBootTest
@Profile(Profiles.CI_FAILURE)
class CiFailureTests {

    @Test
    fun omg() {
        throw NullPointerException()
    }

}
