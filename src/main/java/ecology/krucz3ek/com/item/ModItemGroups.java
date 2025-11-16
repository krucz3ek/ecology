package ecology.krucz3ek.com.item;

import ecology.krucz3ek.com.Ecology;
import ecology.krucz3ek.com.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup ECOLOGY_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Ecology.MOD_ID, "ecology_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.CHIMNEY_BRICKS))
                    .displayName(Text.translatable("itemgroup.ecology.ecology_blocks"))
                    .entries((displayContext, entries) -> {

                        //Blocks
                        entries.add(ModBlocks.CHIMNEY_BRICKS);
                        entries.add(ModItems.CHIMNEY_BRICK);

                    }).build());

    public static final ItemGroup ECOLOGY_TOOLS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Ecology.MOD_ID, "ecology_tools"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.WRENCH))
                    .displayName(Text.translatable("itemgroup.ecology.ecology_tools"))
                    .entries((displayContext, entries) -> {

                        //Blocks
                        entries.add(ModItems.WRENCH);

                    }).build());

    public static void  registerItemGroups() {
        Ecology.LOGGER.info("Adding items gropus to " + Ecology.MOD_ID);
    }
}
