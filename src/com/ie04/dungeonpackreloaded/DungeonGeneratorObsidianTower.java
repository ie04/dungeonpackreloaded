/*    */ package de.stuuupiiid.dungeonpack;
/*    */ 
/*    */ import java.util.Random;

import net.minecraft.util.ResourceLocation;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DungeonGeneratorObsidianTower
/*    */   extends DungeonGenerator
/*    */ {
/*    */   public boolean generate(Random random, int par1, int par2, int par3)
/*    */   {
/* 12 */     for (int v1 = 4; v1 < 80; v1++) {
/* 13 */       for (int v2 = -2; v2 < 3; v2++) {
/* 14 */         for (int v3 = -2; v3 < 3; v3++) {
/* 15 */           addAir(par1 + v2, v1, par3 + v3);
/*    */         }
/*    */       }
/*    */       
/* 19 */       addBlock(par1 + 3, v1, par3, 49);
/* 20 */       addBlock(par1 - 3, v1, par3, 49);
/* 21 */       addBlock(par1, v1, par3 + 3, 49);
/* 22 */       addBlock(par1, v1, par3 - 3, 49);
/* 23 */       addBlock(par1 + 3, v1, par3 + 1, 49);
/* 24 */       addBlock(par1 + 3, v1, par3 - 1, 49);
/* 25 */       addBlock(par1 - 3, v1, par3 + 1, 49);
/* 26 */       addBlock(par1 - 3, v1, par3 - 1, 49);
/* 27 */       addBlock(par1 + 1, v1, par3 + 3, 49);
/* 28 */       addBlock(par1 - 1, v1, par3 + 3, 49);
/* 29 */       addBlock(par1 + 1, v1, par3 - 3, 49);
/* 30 */       addBlock(par1 - 1, v1, par3 - 3, 49);
/* 31 */       addBlock(par1 + 2, v1, par3 + 2, 49);
/* 32 */       addBlock(par1 - 2, v1, par3 - 2, 49);
/* 33 */       addBlock(par1 + 2, v1, par3 - 2, 49);
/* 34 */       addBlock(par1 - 2, v1, par3 + 2, 49);
/*    */     }
/*    */     
/* 37 */     for (int v1 = -2; v1 < 3; v1++) {
/* 38 */       for (int v2 = -2; v2 < 3; v2++) {
/* 39 */         addBlock(par1 + v1, 5, par3 + v2, 49);
/* 40 */         addBlock(par1 + v1, 6, par3 + v2, 49);
/*    */       }
/*    */     }
/*    */     
/* 44 */     addChestWithDefaultLoot(random, par1, 6, par3);
/* 45 */     generateSpawner(par1, 7, par3);
/* 46 */     generateSpawner(par1, 27, par3);
/* 47 */     generateSpawner(par1, 47, par3);
/* 48 */     generateSpawner(par1, 67, par3);
/* 49 */     return true;
/*    */   }
/*    */   
/*    */   public boolean generateSpawner(int par1, int par2, int par3) {
/* 53 */     addMobSpawner(par1, par2, par3, new ResourceLocation("CaveSpider"));
/* 54 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\DungeonGeneratorObsidianTower.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */