package net.tslat.aoa3.integration.tinkersconstruct.trait;

import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.nbt.IToolStackView;
import slimeknights.tconstruct.library.utils.RomanNumeralHelper;

public class CounterweightTrait extends Modifier {
	@Override
	public Component getDisplayName(int level) {
		return applyStyle(new TranslatableComponent(getTranslationKey())
				.append(" ")
				.append(RomanNumeralHelper.getNumeral(level))
				.withStyle(Style.EMPTY.withColor(TextColor.fromRgb(0xFF8CBF))));
	}

	@Override
	public void onBreakSpeed(IToolStackView tool, int level, PlayerEvent.BreakSpeed event, Direction sideHit, boolean isEffective, float miningSpeedModifier) {
		if (!event.getPlayer().isOnGround() && isEffective)
			event.setNewSpeed(event.getOriginalSpeed() * level * 1.5f);
	}
}
