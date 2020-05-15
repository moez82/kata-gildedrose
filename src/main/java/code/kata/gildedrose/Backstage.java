package code.kata.gildedrose;

public class Backstage extends Item {

    public Backstage(int sellIn, int quality) {
        super(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, sellIn, quality);
    }

    @Override
    protected void update() {
        increaseQuality(this);

        decrementSellIn(this);

        if (this.getSellIn() < 0) {
            this.setQuality(0);
        }
    }
}
