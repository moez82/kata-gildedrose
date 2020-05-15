package code.kata.gildedrose;

public class AgedBrie extends Item {

    public AgedBrie(int sellIn, int quality) {
        super(AGED_BRIE, sellIn, quality);
    }

    @Override
    protected void update() {
        increaseQualityIfLessThan50(this);
        decrementSellIn(this);

        if (this.getSellIn() < 0) {
            increaseQualityIfLessThan50(this);
        }
    }
}
