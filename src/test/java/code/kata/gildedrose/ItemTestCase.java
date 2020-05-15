package code.kata.gildedrose;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ItemTestCase {

    @ParameterizedTest
    @CsvFileSource(resources = "/parameterizedTests.csv", delimiter = ',')
    public void test(String initialName, int initialSellin, int initialQuality,
                     String finalName, int finalSellin, int finalQuality) {

        Item initialItem = ItemFactory.create(initialName, initialSellin, initialQuality);

        Inn myApp = new Inn();
        myApp.getItems().clear();
        myApp.getItems().add(initialItem);
        myApp.updateQuality();

        Item finalItem = myApp.getItems().get(0);

        Item expectedItem = ItemFactory.create(finalName, finalSellin, finalQuality);
        assertThat(finalItem).isEqualToComparingFieldByField(expectedItem);

    }

}
