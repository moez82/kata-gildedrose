package code.kata.gildedrose;

public abstract class Item {
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras; Hand of Ragnaros";

    public static final int VERY_SHORT_TERM = 6;
    public static final int SHORT_TERM = 11;

    private String name;
    private int sellIn;
    private int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    protected abstract void update();

    protected void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    protected void setQuality(int quality) {
        this.quality = quality;
    }

    protected String getName() {
        return name;
    }

    protected int getSellIn() {
        return sellIn;
    }

    protected int getQuality() {
        return quality;
    }

    protected void increaseQuality(Item item) {
        int amount = 1;
        if (item.getSellIn() < VERY_SHORT_TERM) {
            amount = 3;
        } else if (item.getSellIn() < SHORT_TERM) {
            amount = 2;
        }
        increaseQualityIfLessThan50(item, amount);
    }

    protected void decrementQuality(Item item) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }
    }

    protected void decrementSellIn(Item item) {
        item.setSellIn(item.getSellIn() - 1);
    }

    protected void increaseQualityIfLessThan50(Item item, int amount) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + amount);
        }
    }

    protected void increaseQualityIfLessThan50(Item item) {
        increaseQualityIfLessThan50(item, 1);
    }

}
