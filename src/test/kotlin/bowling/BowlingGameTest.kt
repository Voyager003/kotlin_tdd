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

        rollMany(20, 0)
        assertThat(game.score()).isEqualTo(0)
    }

    @Test
    fun `all ones`() {

        rollMany(20, 1)
        assertThat(game.score()).isEqualTo(20)
    }

    private fun rollMany(n: Int, pins: Int) {
        repeat(20) {
            game.roll(pins)
        }
    }

}