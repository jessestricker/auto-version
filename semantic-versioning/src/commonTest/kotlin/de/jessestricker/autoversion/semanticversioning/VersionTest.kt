package de.jessestricker.autoversion.semanticversioning

import io.kotest.matchers.shouldBe
import kotlin.test.Test

class VersionTest {
    @Test
    fun `toString formats version`() {
        Version(1, 2, 3).toString() shouldBe "1.2.3"
    }
}
