package com.farestr06.fromtheashes.mixin.item;

import com.farestr06.fromtheashes.util.ModTags;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.registry.tag.TagKey;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(BucketItem.class)
public class BucketItemMixin {

    // Make Sludge Bucket usable in the Nether
    @SuppressWarnings("deprecation")
    @Redirect(method = "placeFluid", at = @At(value = "INVOKE", target = "Lnet/minecraft/fluid/Fluid;isIn(Lnet/minecraft/registry/tag/TagKey;)Z"))
    private boolean redirected(Fluid instance, TagKey<Fluid> tag) {
        return instance.isIn(FluidTags.WATER) && !instance.isIn(ModTags.Fluids.SLUDGE);
    }
}
