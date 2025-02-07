package net.tslat.aoa3.common.registration.worldgen;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraftforge.registries.RegistryObject;
import net.tslat.aoa3.common.registration.AoARegistries;
import net.tslat.aoa3.common.registration.block.AoABlocks;
import net.tslat.aoa3.content.world.genold.feature.features.trees.*;
import net.tslat.aoa3.content.world.genold.feature.placement.config.BlockStatePlacementConfig;

import java.util.function.Supplier;

public final class AoAFeatures {
	public static final RegistryObject<AchonyTreeFeature> ACHONY_TREE = register("achony_tree", () -> new AchonyTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.ACHONY_SAPLING));
	public static final RegistryObject<BloodtwisterTreeFeature> BLOODTWISTER_TREE = register("bloodtwister_tree", () -> new BloodtwisterTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.BLOODTWISTER_SAPLING));
	public static final RegistryObject<BlueCelevusTreeFeature> BLUE_CELEVUS_TREE = register("blue_celevus_tree", () -> new BlueCelevusTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.BLUE_CELEVUS_SAPLING));
	public static final RegistryObject<BlueHavenTreeFeature> BLUE_HAVEN_TREE = register("blue_haven_tree", () -> new BlueHavenTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.BLUE_HAVEN_SAPLING));
	public static final RegistryObject<BrightShyreTreeFeature> BRIGHT_SHYRE_TREE = register("bright_shyre_tree", () -> new BrightShyreTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.BRIGHT_SHYRE_SAPLING));
	public static final RegistryObject<ChurryTreeFeature> CHURRY_TREE = register("churry_tree", () -> new ChurryTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.CHURRY_SAPLING));
	public static final RegistryObject<CreepTreeFeature> CREEP_TREE = register("creep_tree", () -> new CreepTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.CREEP_SAPLING));
	public static final RegistryObject<DawnwoodTreeFeature> DAWNWOOD_TREE = register("dawnwood_tree", () -> new DawnwoodTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.DAWNWOOD_SAPLING));
	public static final RegistryObject<EyebushTreeFeature> EYEBUSH_TREE = register("eyebush_tree", () -> new EyebushTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.EYEBUSH_SAPLING));
	public static final RegistryObject<EyeHangerTreeFeature> EYE_HANGER_TREE = register("eye_hanger_tree", () -> new EyeHangerTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.GREEN_CELEVUS_SAPLING));
	public static final RegistryObject<GreenCelevusTreeFeature> GREEN_CELEVUS_TREE = register("green_celevus_tree", () -> new GreenCelevusTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.GREEN_CELEVUS_SAPLING));
	public static final RegistryObject<HauntedTreeFeature> HAUNTED_TREE = register("haunted_tree", () -> new HauntedTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.HAUNTED_SAPLING));
	public static final RegistryObject<InvertedAchonyTreeFeature> INVERTED_ACHONY_TREE = register("inverted_achony_tree", () -> new InvertedAchonyTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.ACHONY_SAPLING));
	public static final RegistryObject<InvertedChurryTreeFeature> INVERTED_CHURRY_TREE = register("inverted_churry_tree", () -> new InvertedChurryTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.CHURRY_SAPLING));
	public static final RegistryObject<IrodustTreeFeature> IRODUST_TREE = register("irodust_tree", () -> new IrodustTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.IRODUST_SAPLING));
	public static final RegistryObject<IrogoldTreeFeature> IROGOLD_TREE = register("irogold_tree", () -> new IrogoldTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.IROGOLD_SAPLING));
	public static final RegistryObject<LucalusTreeFeature> LUCALUS_TREE = register("lucalus_tree", () -> new LucalusTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.LUCALUS_SAPLING));
	public static final RegistryObject<LuniciaTreeFeature> LUNICIA_TREE = register("lunicia_tree", () -> new LuniciaTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.LUNICIA_SAPLING));
	public static final RegistryObject<LunossoTreeFeature> LUNOSSO_TREE = register("lunosso_tree", () -> new LunossoTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.LUNOSSO_SAPLING));
	public static final RegistryObject<NormalShyreTreeFeature> NORMAL_SHYRE_TREE = register("normal_shyre_tree", () -> new NormalShyreTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.SHYRE_SAPLING));
	public static final RegistryObject<PinkHavenTreeFeature> PINK_HAVEN_TREE = register("pink_haven_tree", () -> new PinkHavenTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.PINK_HAVEN_SAPLING));
	public static final RegistryObject<PurpleCelevusTreeFeature> PURPLE_CELEVUS_TREE = register("purple_celevus_tree", () -> new PurpleCelevusTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.PURPLE_CELEVUS_SAPLING));
	public static final RegistryObject<PurpleHavenTreeFeature> PURPLE_HAVEN_TREE = register("purple_haven_tree", () -> new PurpleHavenTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.PURPLE_HAVEN_SAPLING));
	public static final RegistryObject<RedCelevusTreeFeature> RED_CELEVUS_TREE = register("red_celevus_tree", () -> new RedCelevusTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.RED_CELEVUS_SAPLING));
	public static final RegistryObject<RedHavenTreeFeature> RED_HAVEN_TREE = register("red_haven_tree", () -> new RedHavenTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.RED_HAVEN_SAPLING));
	public static final RegistryObject<RunicTreeFeature> RUNIC_TREE = register("runic_tree", () -> new RunicTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.RUNIC_SAPLING));
	public static final RegistryObject<ShadowTreeFeature> SHADOW_TREE = register("shadow_tree", () -> new ShadowTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.SHADOW_SAPLING));
	public static final RegistryObject<StranglewoodTreeFeature> STRANGLEWOOD_TREE = register("stranglewood_tree", () -> new StranglewoodTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.STRANGLEWOOD_SAPLING));
	public static final RegistryObject<TurquoiseHavenTreeFeature> TURQUOISE_HAVEN_TREE = register("turquoise_haven_tree", () -> new TurquoiseHavenTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.TURQUOISE_HAVEN_SAPLING));
	public static final RegistryObject<YellowCelevusTreeFeature> YELLOW_CELEVUS_TREE = register("yellow_celevus_tree", () -> new YellowCelevusTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.YELLOW_CELEVUS_SAPLING));
	public static final RegistryObject<YellowHavenTreeFeature> YELLOW_HAVEN_TREE = register("yellow_haven_tree", () -> new YellowHavenTreeFeature(BlockStatePlacementConfig.CODEC, AoABlocks.YELLOW_HAVEN_SAPLING));

	private static <C extends FeatureConfiguration, F extends Feature<C>> RegistryObject<F> register(String id, Supplier<F> feature) {
		return AoARegistries.FEATURES.register(id, feature);
	}
}
