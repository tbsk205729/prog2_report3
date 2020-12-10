/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package jp.ac.uryukyu.ie.e205729;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EnemyTest {
    @Test
    void attackTest() {
    int defaultHeroHp = 100;
    Hero demoHero = new Hero("デモ勇者", defaultHeroHp, 100);
    Enemy slime = new Enemy("スライムもどき", 10, 100);
    demoHero.attack(slime);
    slime.attack(demoHero);
    assertEquals(defaultHeroHp, demoHero.getHitPoint());
}
}
