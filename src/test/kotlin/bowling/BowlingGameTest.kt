package bowling

import ex.bowling.Game
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach


class BowlingGameTest {

    lateinit var game: Game

    @BeforeEach
    fun setUp() {
        game = Game() // SUT 초기화
    }

    @Test
    fun `gutter game`() {

        repeat(20) {
            game.roll(0)
        }

        assertThat(game.score()).isEqualTo(0)
    }

    @Test
    fun `all ones`() {

        repeat(20) {
            game.roll(1)
        }
        assertThat(game.score()).isEqualTo(20)
    }
}