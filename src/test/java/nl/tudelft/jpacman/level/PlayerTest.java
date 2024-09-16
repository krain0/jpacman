package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;

public class PlayerTest {
    @Test
    void testIsAlive() {
        Player p = (new PlayerFactory(new PacManSprites())).createPacMan();
        assertThat(p.isAlive()).isTrue();
    }
}
