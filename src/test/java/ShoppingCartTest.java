import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {
    ShoppingCart shoppingCart;

    @BeforeEach
    void setUp() {
       shoppingCart = new ShoppingCart();
    }

    //first test
    @Test
    @DisplayName("Running a test")
    void isAppleInShoppingCartTest () {
        assertTrue(shoppingCart.isAppleInShoppingCart("Apple"));
    }

    //fourth test
    @Test
    void isNotAppleInShoppingCartTest() {
        assertFalse(shoppingCart.isAppleInShoppingCart("Orange"));
    }

    //second test
    @Test
    void totalCostTest() {
        assertEquals(20,shoppingCart.sumTotal(), 0.5);
    }

    //third test
    @Test
    void numberOfFruitsInShoppingCartTest() {
        assertEquals(4,shoppingCart.NumberOfFruitsInShoppingCart());
    }

    //@Test
    //void addAnotherFruitToShoppingCartTest() {
    //    assertNotEquals((shoppingCart.createShoppingCart().size()==5),shoppingCart.addFruitToShoppingCart("Pear", 1));

    //}
}
