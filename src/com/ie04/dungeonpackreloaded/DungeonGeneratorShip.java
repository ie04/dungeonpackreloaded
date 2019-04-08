/*    */ package de.stuuupiiid.dungeonpack;
/*    */ 
/*    */ import java.util.Random;

import net.minecraft.util.ResourceLocation;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DungeonGeneratorShip
/*    */   extends DungeonGenerator
/*    */ {
/*    */   public boolean generate(Random random, int par1, int par2, int par3)
/*    */   {
/* 12 */     for (int v1 = 0; v1 < 15; v1++) {
/* 13 */       for (int v2 = -2; v2 < 3; v2++) {
/* 14 */         for (int v3 = 0; v3 < 8; v3++) {
/* 15 */           addAir(par1 + v1, par2 + v3, par3 + v2);
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 20 */     for (int v1 = -1; v1 < 2; v1++) {
/* 21 */       addBlock(par1, par2 + 1, par3 + v1, 17);
/* 22 */       addBlock(par1 + 1, par2 + 1, par3 + v1, 17);
/* 23 */       addBlock(par1 + 1, par2, par3 + v1, 17);
/* 24 */       addBlock(par1 + 2, par2, par3 + v1, 17);
/* 25 */       addBlock(par1 + 3, par2, par3 + v1, 17);
/* 26 */       addBlock(par1 + 9, par2, par3 + v1, 17);
/* 27 */       addBlock(par1 + 9, par2 + 1, par3 + v1, 17);
/* 28 */       addBlock(par1 + 10, par2, par3 + v1, 17);
/* 29 */       addBlock(par1 + 10, par2 + 1, par3 + v1, 17);
/*    */     }
/*    */     
/* 32 */     for (int v1 = 2; v1 < 9; v1++) {
/* 33 */       for (int v2 = -1; v2 < 2; v2++) {
/* 34 */         addBlock(par1 + v1, par2 - 1, par3 + v2, 5);
/*    */       }
/*    */     }
/*    */     
/* 38 */     for (int v1 = 2; v1 < 10; v1++) {
/* 39 */       addBlock(par1 + v1, par2, par3 + 2, 5);
/* 40 */       addBlock(par1 + v1, par2, par3 - 2, 5);
/*    */     }
/*    */     
/* 43 */     for (int v1 = 10; v1 < 15; v1++) {
/* 44 */       addBlock(par1 + v1, par2 + 1, par3, 5);
/*    */     }
/*    */     
/* 47 */     for (int v1 = 0; v1 < 3; v1++) {
/* 48 */       addBlock(par1 + 4, par2 + v1, par3, 17);
/*    */     }
/*    */     
/* 51 */     for (int v1 = 0; v1 < 3; v1++) {
/* 52 */       addBlock(par1 + 7, par2 + v1, par3, 17);
/*    */     }
/*    */     
/* 55 */     for (int v1 = -3; v1 < 4; v1++) {
/* 56 */       for (int v2 = 3; v2 < 8; v2++) {
/* 57 */         addBlock(par1 + 4, par2 + v2, par3 + v1, 35);
/*    */       }
/*    */     }
/*    */     
/* 61 */     for (int v1 = -2; v1 < 3; v1++) {
/* 62 */       for (int v2 = 3; v2 < 7; v2++) {
/* 63 */         addBlock(par1 + 7, par2 + v2, par3 + v1, 35);
/*    */       }
/*    */     }
/*    */     
/* 67 */     addBlock(par1 + 2, par2 + 1, par3 + 1, 5);
/* 68 */     addBlock(par1 + 2, par2 + 1, par3 - 1, 5);
/* 69 */     addBlock(par1, par2 + 2, par3, 54);
/* 70 */     addBlock(par1 + 8, par2, par3 + 1, 54);
/* 71 */     addBlock(par1 + 8, par2, par3 - 1, 54);
/* 72 */     addChestWithDefaultLoot(random, par1 + 2, par2 + 1, par3);
/* 73 */     addMobSpawner(par1 + 5, par2, par3, new ResourceLocation("Zombie"));
/* 74 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\DungeonGeneratorShip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */