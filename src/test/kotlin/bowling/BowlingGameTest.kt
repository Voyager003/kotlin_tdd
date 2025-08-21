package bowling

import ex.bowling.Game
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat


class BowlingGameTest {
    @Test
    fun `gutter game`() {
        val game = Game()

        repeat(20) {
            game.roll(0)
        }

        assertThat(game.score()).isEqualTo(0)
    }
}