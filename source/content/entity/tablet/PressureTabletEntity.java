package net.tslat.aoa3.content.entity.tablet;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.level.Level;
import net.tslat.aoa3.common.registration.item.AoAItems;
import net.tslat.aoa3.content.item.tablet.TabletItem;
import net.tslat.effectslib.api.util.EffectBuilder;
import net.tslat.aoa3.util.EntityUtil;

public class PressureTabletEntity extends SoulTabletEntity {
	public PressureTabletEntity(EntityType<? extends SoulTabletEntity> entityType, Level world) {
		this(entityType, world, null);
	}

	public PressureTabletEntity(EntityType<? extends SoulTabletEntity> entityType, Level world, ServerPlayer placer) {
		super(entityType, world, placer);
	}

	@Override
	protected void doTickEffect() {
		EntityUtil.applyPotions(getTargetsWithinRadius(LivingEntity.class, entity -> entity instanceof Enemy && entity.isAlive()), new EffectBuilder(MobEffects.MOVEMENT_SLOWDOWN, 10).level(3).isAmbient());
	}

	@Override
	public TabletItem getRelevantItem() {
		return (TabletItem)AoAItems.PRESSURE_TABLET.get();
	}
}
