/*    */ package de.stuuupiiid.dungeonpack;
/*    */ 
/*    */ import java.util.Random;

import net.minecraft.util.ResourceLocation;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DungeonGeneratorGraveyard
/*    */   extends DungeonGenerator
/*    */ {
/*    */   public boolean generate(Random random, int par1, int par2, int par3)
/*    */   {
/* 13 */     for (int v1 = -6; v1 < 7; v1++) {
/* 14 */       for (int v2 = 0; v2 < 3; v2++) {
/* 15 */         for (int v3 = -6; v3 < 7; v3++) {
/* 16 */           addAir(par1 + v1, par2 + v2, par3 + v3);
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 21 */     for (int v1 = -6; v1 < 7; v1++) {
/* 22 */       for (int v2 = -6; v2 < 7; v2++) {
/* 23 */         addBlock(par1 + v1, par2 - 1, par3 + v2, 3);
/*    */       }
/*    */     }
/*    */     
/* 27 */     for (int v1 = -6; v1 < 7; v1++) {
/* 28 */       for (int v2 = 1; v2 < 3; v2++) {
/* 29 */         addBlockAndMetadata(par1 + v1, par2 + v2 - 2, par3 + 6, 98, 1);
/* 30 */         addBlockAndMetadata(par1 + v1, par2 + v2 - 2, par3 - 6, 98, 1);
/* 31 */         addBlockAndMetadata(par1 + 6, par2 + v2 - 2, par3 + v1, 98, 1);
/* 32 */         addBlockAndMetadata(par1 - 6, par2 + v2 - 2, par3 + v1, 98, 1);
/* 33 */         addBlock(par1 + v1, par2 + v2, par3 + 6, 101);
/* 34 */         addBlock(par1 + v1, par2 + v2, par3 - 6, 101);
/* 35 */         addBlock(par1 + 6, par2 + v2, par3 + v1, 101);
/* 36 */         addBlock(par1 - 6, par2 + v2, par3 + v1, 101);
/*    */       }
/*    */     }
/*    */     
/* 40 */     for (int v1 = -6; v1 < 7; v1++) {
/* 41 */       addBlockAndMetadata(par1 + v1, par2 + 3, par3 + 6, 98, 1);
/* 42 */       addBlockAndMetadata(par1 + v1, par2 + 3, par3 - 6, 98, 1);
/* 43 */       addBlockAndMetadata(par1 + 6, par2 + 3, par3 + v1, 98, 1);
/* 44 */       addBlockAndMetadata(par1 - 6, par2 + 3, par3 + v1, 98, 1);
/*    */     }
/*    */     
/* 47 */     for (int v1 = 0; v1 < 3 + random.nextInt(3); v1++) {
/* 48 */       int v2 = par1 + random.nextInt(8) - 4;
/* 49 */       int v3 = par3 + random.nextInt(10) - 5;
/* 50 */       int v4 = getTop(v2, v3);
/* 51 */       addBlock(v2, v4 - 1, v3, 88);
/* 52 */       addBlock(v2 + 1, v4 - 1, v3, 88);
/* 53 */       addBlockAndMetadata(v2 - 1, v4, v3, 43, 0);
/* 54 */       if (random.nextInt(4) == 0) {
/* 55 */         addAir(v2, v4 - 1, v3);
/* 56 */         addAir(v2 + 1, v4 - 1, v3);
/* 57 */         addMobSpawner(v2 - 1, v4 - 1, v3, new ResourceLocation("Skeleton"));
/* 58 */       } else if (random.nextInt(4) == 0) {
/* 59 */         addAir(v2, v4 - 1, v3);
/* 60 */         addAir(v2 + 1, v4 - 1, v3);
/* 61 */         addChestWithDefaultLoot(random, v2 - 1, v4 - 1, v3);
/*    */       }
/*    */     }
/*    */     
/* 65 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\DungeonGeneratorGraveyard.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */