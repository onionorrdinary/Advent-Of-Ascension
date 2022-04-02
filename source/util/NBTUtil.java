package net.tslat.aoa3.util;

import net.minecraft.nbt.*;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public final class NBTUtil {
	public static class NBTBuilder<T extends Tag> {
		private final T tag;
		private HashMap<String, NBTBuilder<?>> childTags;

		public NBTBuilder(T nbtBase) {
			this.tag = nbtBase;
		}

		public NBTBuilder<T> putTag(@Nullable String key, NBTBuilder<?> tag) {
			if (childTags == null)
				childTags = new HashMap<String, NBTBuilder<?>>();

			childTags.put(key, tag);

			return this;
		}

		public NBTBuilder<T> putString(@Nullable String key, String value) {
			if (tag.getType() == CompoundTag.TYPE && key != null) {
				((CompoundTag)tag).put(key, StringTag.valueOf(value));
			}
			else if (tag.getType() == ListTag.TYPE) {
				((ListTag)tag).add(StringTag.valueOf(value));
			}

			return this;
		}

		public NBTBuilder<T> putInteger(@Nullable String key, int value) {
			if (tag.getType() == CompoundTag.TYPE && key != null) {
				((CompoundTag)tag).put(key, IntTag.valueOf(value));
			}
			else if (tag.getType() == ListTag.TYPE) {
				((ListTag)tag).add(IntTag.valueOf(value));
			}

			return this;
		}

		public NBTBuilder<T> putFloat(@Nullable String key, float value) {
			if (tag.getType() == CompoundTag.TYPE && key != null) {
				((CompoundTag)tag).put(key, FloatTag.valueOf(value));
			}
			else if (tag.getType() == ListTag.TYPE) {
				((ListTag)tag).add(FloatTag.valueOf(value));
			}

			return this;
		}

		public NBTBuilder<T> putLong(@Nullable String key, long value) {
			if (tag.getType() == CompoundTag.TYPE && key != null) {
				((CompoundTag)tag).put(key, LongTag.valueOf(value));
			}
			else if (tag.getType() == ListTag.TYPE) {
				((ListTag)tag).add(LongTag.valueOf(value));
			}

			return this;
		}

		public T build() {
			if (childTags != null && !childTags.isEmpty()) {
				if (tag.getType() == CompoundTag.TYPE) {
					Map.Entry<String, NBTBuilder<?>> firstEntry = childTags.entrySet().stream().findFirst().get();

					((CompoundTag)tag).put(firstEntry.getKey(), firstEntry.getValue().build());
				}
				else if (tag.getType() == ListTag.TYPE) {
					for (Map.Entry<String, NBTBuilder<?>> childEntry : childTags.entrySet()) {
						((ListTag)tag).add(childEntry.getValue().build());
					}
				}
			}

			return tag;
		}
	}
}
