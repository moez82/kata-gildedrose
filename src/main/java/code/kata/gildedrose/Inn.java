package code.kata.gildedrose;

import java.util.ArrayList;
import java.util.List;

public class Inn {

    private List<Item> items;

    public Inn() {
        items = new ArrayList<Item>();
        /*items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item(AGED_BRIE, 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item(SULFURAS_HAND_OF_RAGNAROS, 0, 80));
        items.add(new Item(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, 15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));*/
    }

    public List<Item> getItems() {
        return items;
    }

    public void updateQuality() {
        for (Item item : items) {
            item.update();
        }
    }

    public static void main(String[] args) {
        System.out.println("OMGHAI!");
        new Inn().updateQuality();
    }
}
