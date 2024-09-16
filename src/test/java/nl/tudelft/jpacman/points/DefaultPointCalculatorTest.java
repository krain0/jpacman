package nl.tudelft.jpacman.points;

import nl.tudelft.jpacman.level.Pellet;
import nl.tudelft.jpacman.level.Player;
import nl.tudelft.jpacman.level.PlayerFactory;
import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DefaultPointCalculatorTest {
    @Test
    /**
     * Verifies that the score calculation for consuming a pellet adds the
     * correct number of points
     */
    void consumedAPelletTest() {
        PacManSprites pacManSprites = new PacManSprites();
        Player player = new PlayerFactory(pacManSprites).createPacMan();
        int originalScore = player.getScore();

        int pelletValue = 1;
        Pellet pellet = new Pellet(pelletValue, pacManSprites.getPelletSprite());

        DefaultPointCalculator pointCalculator = new DefaultPointCalculator();
        pointCalculator.consumedAPellet(player, pellet);
        assertThat(player.getScore()).isEqualTo(originalScore + pelletValue);
    }
}
