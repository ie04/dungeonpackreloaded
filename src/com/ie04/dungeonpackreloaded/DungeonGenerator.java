    package de.stuuupiiid.dungeonpack;
    
    import java.util.Random;
    import net.minecraft.block.Block;
    import net.minecraft.block.state.IBlockState;
import net.minecraft.client.multiplayer.WorldClient;
    import net.minecraft.entity.monster.EntityIronGolem;
    import net.minecraft.entity.passive.EntityCow;
    import net.minecraft.entity.passive.EntityPig;
    import net.minecraft.entity.passive.EntitySheep;
    import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
    import net.minecraft.item.Item;
    import net.minecraft.item.ItemStack;
    import net.minecraft.server.MinecraftServer;
    import net.minecraft.tileentity.MobSpawnerBaseLogic;
    import net.minecraft.tileentity.TileEntity;
    import net.minecraft.tileentity.TileEntityChest;
    import net.minecraft.tileentity.TileEntityDispenser;
    import net.minecraft.tileentity.TileEntityMobSpawner;
		 import net.minecraft.util.ResourceLocation;
    import net.minecraft.util.math.BlockPos;
    import net.minecraft.world.World;
		  import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.loot.LootEntry;
import net.minecraft.world.storage.loot.LootEntryItem;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
    
    
    public abstract class DungeonGenerator
    {
 26   protected World world = FMLCommonHandler.instance().getMinecraftServerInstance().getWorld(0);
      
    
      public abstract boolean generate(Random paramRandom, int paramInt1, int paramInt2, int paramInt3);
      
      public boolean generateNether(Random var1, int var2, int var3, int var4)
      {
 33     this.world = FMLCommonHandler.instance().getMinecraftServerInstance().getWorld(-1);
 34     generate(var1, var2, var3, var4);
 35     this.world = FMLCommonHandler.instance().getMinecraftServerInstance().getWorld(0);
 36     return true;
      }
      
      public boolean generateEnd(Random var1, int var2, int var3, int var4)
      {
 41     this.world = FMLCommonHandler.instance().getMinecraftServerInstance().getWorld(1);
 42     generate(var1, var2, var3, var4);
 43     this.world = FMLCommonHandler.instance().getMinecraftServerInstance().getWorld(0);
 44     return true;
      }
      
      public void addBlock(int par1, int par2, int par3, int par4) {
 48     this.world.setBlockState(new BlockPos(par1, par2, par3), Block.getStateById(par4));
      }
      
      public void addBlockSecond(int par1, int par2, int par3, int par4) {
 52     this.world.setBlockState(new BlockPos(par1, par2, par3), Block.getStateById(par4));
      }
      
      public void setMetadata(int par1, int par2, int par3, int par4) {
 56     BlockPos pos = new BlockPos(par1, par2, par3);
 57     this.world.setBlockState(pos, this.world.getBlockState(pos).getBlock().getStateFromMeta(par4));
      }
      
      public int getBlock(int par1, int par2, int par3) {
 61     return Block.getIdFromBlock(this.world.getBlockState(new BlockPos(par1, par2, par3)).getBlock());
      }
      
      public void addBlockAndMetadata(int par1, int par2, int par3, int par4, int par5) {
 65     this.world.setBlockState(new BlockPos(par1, par2, par3), Block.getBlockById(par4).getStateFromMeta(par5));
      }
      
      public int getMetadata(int par1, int par2, int par3) {
 69     IBlockState state = this.world.getBlockState(new BlockPos(par1, par2, par3));
 70     return state.getBlock().getMetaFromState(state);
      }
      
      public int getTop(int par1, int par2) {
 74     return this.world.getTopSolidOrLiquidBlock(new BlockPos(par1, 0, par2)).getY();
      }
      
      public void addAir(int par1, int par2, int par3) {
 78     this.world.setBlockToAir(new BlockPos(par1, par2, par3));
      }
      
      public void addMobSpawner(int par1, int par2, int par3, ResourceLocation par4String) {
 82     addBlock(par1, par2, par3, 52);
 83     TileEntityMobSpawner mobSpawner = (TileEntityMobSpawner)this.world.getTileEntity(new BlockPos(par1, par2, par3));
 84     if (mobSpawner != null) {
 85       mobSpawner.getSpawnerBaseLogic().setEntityId(par4String);
        }
      }
	
      public void addChestWithDefaultLoot(Random random, int par1, int par2, int par3) {
 90     addBlock(par1, par2, par3, 54);
 91     TileEntityChest chest = (TileEntityChest)this.world.getTileEntity(new BlockPos(par1, par2, par3));
 92     if (chest != null) {
 93       for (int var1 = 0; var1 < ((TileEntityChest) chest).getSizeInventory() ; var1++) {
 96           ((TileEntityChest) chest).setInventorySlotContents(var1, new ItemStack(Items.DIAMOND, 1));
            
          }
        }
      }
      
      public void addChestWithMagicalLoot(Random random, int par1, int par2, int par3) {
103     addChestWithDefaultLoot(random, par1, par2, par3);
      }
      
      public void addChestWithCustomLoot(Random random, int par1, int par2, int par3, int[] par4, int par5) {
107     addChestWithDefaultLoot(random, par1, par2, par3);
      }
      
      public void addChestWithCustomLoot(Random random, int par1, int par2, int par3, int par4, int par5) {
111     addChestWithDefaultLoot(random, par1, par2, par3);
      }
      
      public boolean isAir(int par1, int par2, int par3) {
115     return this.world.isAirBlock(new BlockPos(par1, par2, par3));
      }
      
      public void spawnVillager(int par1, int par2, int par3, int par4, int par5) {
119     for (int v1 = 0; v1 < par4; v1++) {
120       EntityVillager var1 = new EntityVillager(this.world, par5);
121       var1.setPositionAndRotation(par1 + 0.5D, par2, par3 + 0.5D, 0.0F, 0.0F);
122       this.world.spawnEntity(var1);
        }
      }
      
      public void spawnCow(int par1, int par2, int par3)
      {
128     EntityCow cow = new EntityCow(this.world);
129     cow.setPositionAndRotation(par1 + 0.5D, par2, par3 + 0.5D, 0.0F, 0.0F);
130     this.world.spawnEntity(cow);
      }
      
      public void spawnPig(int par1, int par2, int par3) {
134     EntityPig cow = new EntityPig(this.world);
135     cow.setPositionAndRotation(par1 + 0.5D, par2, par3 + 0.5D, 0.0F, 0.0F);
136     this.world.spawnEntity(cow);
      }
      
      public void spawnSheep(int par1, int par2, int par3) {
140     EntitySheep cow = new EntitySheep(this.world);
141     cow.setPositionAndRotation(par1 + 0.5D, par2, par3 + 0.5D, 0.0F, 0.0F);
142     this.world.spawnEntity(cow);
      }
      
      public void spawnGolem(int par1, int par2, int par3) {
146     EntityIronGolem cow = new EntityIronGolem(this.world);
147     cow.setPositionAndRotation(par1 + 0.5D, par2, par3 + 0.5D, 0.0F, 0.0F);
148     this.world.spawnEntity(cow);
      }
      
      public void spawnWitch(int par1, int par2, int par3) {
152     EntityCow cow = new EntityCow(this.world);
153     cow.setPositionAndRotation(par1 + 0.5D, par2, par3 + 0.5D, 0.0F, 0.0F);
154     this.world.spawnEntity(cow);
      }
      
      public TileEntity getTileEntity(int par1, int par2, int par3) {
158     return this.world.getTileEntity(new BlockPos(par1, par2, par3));
      }
      
      public void addDispenserAndInv(Random random, int par1, int par2, int par3, int par4, int par5) {
162     addBlock(par1, par2, par3, 23);
163     TileEntityDispenser var1 = (TileEntityDispenser)getTileEntity(par1, par2, par3);
164     if ((par4 != 0) && (par5 != 0)) { ItemStack inv;
          
166       if (par4 < 256) {
167         inv = new ItemStack(Block.getBlockById(par5), par5);
          } else {
169         inv = new ItemStack(Item.getItemById(par4), par5);
          }
          
172       var1.setInventorySlotContents(random.nextInt(var1.getSizeInventory()), inv);
        }
      }
    }


Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\DungeonGenerator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
