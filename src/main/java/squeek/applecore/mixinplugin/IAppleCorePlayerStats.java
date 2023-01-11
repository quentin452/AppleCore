package squeek.applecore.mixinplugin;

import net.minecraft.entity.player.EntityPlayer;

public interface IAppleCorePlayerStats {

    void setPlayer(EntityPlayer entityPlayer);

    void setStarveTimer(int starveTimer);
}
