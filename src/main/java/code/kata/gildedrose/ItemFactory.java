package code.kata.gildedrose;

public class ItemFactory {

    public static Item create(String initialName, int initialSellin, int initialQuality) {
        Item initialItem = null;

        switch (initialName) {

            case Item.AGED_BRIE:
                initialItem = new AgedBrie(initialSellin, initialQuality);
                break;
            case Item.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT:
                initialItem = new Backstage(initialSellin, initialQuality);
                break;
            case Item.SULFURAS_HAND_OF_RAGNAROS:
                initialItem = new Sulfuras(initialSellin, initialQuality);
                break;
            default:
                initialItem = new ItemDefault(initialName, initialSellin, initialQuality);
                break;
        }
        return initialItem;
    }
}
