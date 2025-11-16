package ecology.krucz3ek.com.item;

import ecology.krucz3ek.com.Ecology;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item WRENCH = registerItem("wrench", new Item(new Item.Settings()));
    public static final Item CHIMNEY_BRICK = registerItem("chimney_brick", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Ecology.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Ecology.LOGGER.info("Adding items to " + Ecology.MOD_ID);
    }
}
