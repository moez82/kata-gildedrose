package code.kata.gildedrose;

public class ItemDefault extends Item {
    public ItemDefault(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void update() {
        decrementQuality(this);
        decrementSellIn(this);
        if (this.getSellIn() < 0) {
            decrementQuality(this);
        }
    }

}
