package terranexcorp.blocks;


import com.bioxx.tfc.Blocks.BlockMetalSheet;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import terranexcorp.core.TNCDetails;
import terranexcorp.core.TNCTextures;

public class BlockTNCMetalSheet extends BlockMetalSheet
{
    public String[]  metalNames = {"Ferrochrome","Stainless_Steel","Titanium","Ferromanganese","Manganese"};

    public BlockTNCMetalSheet()
    {
        super();

        icons = new IIcon[metalNames.length];
        this.setBlockBounds(0, 0, 0, 1, 1, 1);
        this.setHardness(80.0F);
    }

    @Override
    public void registerBlockIcons(IIconRegister registerer)
    {
        for(int i = 0; i < icons.length; i++)
        {
            icons[i] = registerer.registerIcon(TNCDetails.ModID + ":" + "metal/" + metalNames[i]);
        }
        TNCTextures.sheetFerrochrome = icons[0];
        TNCTextures.sheetStainlessSteel = icons[1];
        TNCTextures.sheetTitanium = icons[2];

    }
}