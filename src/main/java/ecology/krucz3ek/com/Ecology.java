package ecology.krucz3ek.com;

import ecology.krucz3ek.com.block.ModBlocks;
import ecology.krucz3ek.com.item.ModItemGroups;
import ecology.krucz3ek.com.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ecology implements ModInitializer {
	public static final String MOD_ID = "ecology";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}