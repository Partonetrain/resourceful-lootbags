package tech.thatgravyboat.lootbags.common.registry;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.core.Registry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import org.apache.commons.lang3.NotImplementedException;
import tech.thatgravyboat.lootbags.common.items.LootBagItem;
import tech.thatgravyboat.lootbags.common.recipe.LootRecipe;
import tech.thatgravyboat.lootbags.common.recipe.LootRecipeSerializer;

import java.util.function.Supplier;

public class McRegistry {

    public static final CreativeModeTab TAB = createTab();
    public static final Supplier<Item> LOOT_BAG = register(Registry.ITEM, "loot_bag", () -> new LootBagItem(new Item.Properties().tab(TAB)));
    public static final Supplier<RecipeType<LootRecipe>> LOOT_RECIPE = register(Registry.RECIPE_TYPE, "loot", () -> new RecipeType<>() {
        @Override
        public String toString() {
            return "loot";
        }
    });
    public static final Supplier<RecipeSerializer<LootRecipe>> LOOT_SERIALIZER = register(Registry.RECIPE_SERIALIZER, "loot", LootRecipeSerializer::new);


    public static void register() {
        //Init class
    }

    @ExpectPlatform
    public static  <V, T extends V> Supplier<T> register(Registry<V> registry, String id, Supplier<T> entry) {
        throw new NotImplementedException("Not yet implemented");
    }

    @ExpectPlatform
    public static CreativeModeTab createTab() {
        throw new NotImplementedException("Not yet implemented");
    }


}