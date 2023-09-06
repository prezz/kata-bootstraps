import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ThingTest {

    @Test
    fun fail() {
        val thing = Thing()
        val value = thing.callForAction()
        assertThat(value).isEqualTo("Food")
    }

    @Test
    fun it_should_not_fail() {
        assertThat(42).isEqualTo(42)
    }
}