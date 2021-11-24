package squeek.applecore.mixins.minecraft;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;
import squeek.applecore.client.TooltipOverlayHandler;

import java.util.List;

@Mixin(GuiScreen.class)
public class GuiScreenMixin {

    @Inject(method = "drawHoveringText",
            at = @At(
                    value = "INVOKE",
                    target = "Ljava/util/List;size()I",
                    shift = At.Shift.BEFORE),
            slice = @Slice(
                    from = @At(
                            value = "INVOKE",
                            target = "Lnet/minecraft/client/gui/GuiScreen;drawGradientRect(IIIIII)V",
                            ordinal = 0)), locals = LocalCapture.PRINT)
    private void onDrawHoveringText(List stringLines, int pixelX, int pixelY, FontRenderer fontRenderer, CallbackInfo callbackInfo) {
        // TODO
        /*
        "j2" -> x
        "k2" -> y
        "k", -> w
        "i1" -> h
         */
        TooltipOverlayHandler.toolTipX = 0;
        TooltipOverlayHandler.toolTipY = 0;
        TooltipOverlayHandler.toolTipW = 0;
        TooltipOverlayHandler.toolTipH = 0;
    }
}
