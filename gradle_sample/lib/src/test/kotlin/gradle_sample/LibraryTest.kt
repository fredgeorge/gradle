/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package gradle_sample

import kotlin.test.Test
import kotlin.test.assertTrue

class LibraryTest {
    @Test fun `some test`() {
        val classUnderTest = Library()
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'")
    }
}