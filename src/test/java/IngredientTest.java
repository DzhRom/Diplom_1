import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class IngredientTest {

    private String expectedName = "BigKing";
    private float expectedPrice = 411.65f;
    private Ingredient ingredient;

    @Mock
    private IngredientType mockIngredientType;

    @Before
    public void setUp() {
        ingredient = new Ingredient(mockIngredientType, "BigKing", 411.65f);
    }

    @Test
    public void getPriceTest() {
        assertEquals("Ожидаемая цена не соответствует актуальной цене", expectedPrice, ingredient.getPrice(), 0);
    }

    @Test
    public void getNameTest() {
        assertEquals("Ожидаемое имя не соответствует актуальному имени", expectedName, ingredient.getName());
    }

    @Test
    public void getIngredientTypeTest() {
        assertEquals(mockIngredientType, ingredient.getType());
    }

}
