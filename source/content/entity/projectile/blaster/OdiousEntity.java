package net.tslat.aoa3.content.entity.projectile.blaster;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableProjectile;
import net.minecraft.world.level.Level;
import net.tslat.aoa3.common.registration.entity.AoAProjectiles;
import net.tslat.aoa3.content.entity.projectile.staff.BaseEnergyShot;
import net.tslat.aoa3.content.item.EnergyProjectileWeapon;

public class OdiousEntity extends BaseEnergyShot {
	public OdiousEntity(EntityType<? extends ThrowableProjectile> entityType, Level world) {
		super(entityType, world);
	}

	public OdiousEntity(Level world) {
		super(AoAProjectiles.ODIOUS_SHOT.get(), world);
	}

	public OdiousEntity(LivingEntity shooter, EnergyProjectileWeapon weapon, int maxAge) {
		super(AoAProjectiles.ODIOUS_SHOT.get(), shooter, weapon, maxAge);
	}

	public OdiousEntity(Level world, double x, double y, double z) {
		super(AoAProjectiles.ODIOUS_SHOT.get(), world, x, y, z);
	}
}
