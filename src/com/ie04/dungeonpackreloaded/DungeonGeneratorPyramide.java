/*    */ package de.stuuupiiid.dungeonpack;
/*    */ 
/*    */ import java.util.Random;

import net.minecraft.util.ResourceLocation;
/*    */ 
/*    */ public class DungeonGeneratorPyramide
/*    */   extends DungeonGenerator
/*    */ {
/*    */   public boolean generate(Random random, int par1, int par2, int par3)
/*    */   {
/* 10 */     int min = -60;
/* 11 */     int max = 61;
/* 12 */     par2 = 45;
/*    */     
/*    */ 
/*    */ 
/* 16 */     for (int v1 = 0; v1 < 60; v1++) {
/* 17 */       for (int v2 = min; v2 < max; v2++) {
/* 18 */         for (int v21 = min; v21 < max; v21++) {
/* 19 */           addBlock(par1 + v2, par2, par3 + v21, 24);
/*    */         }
/*    */       }
/*    */       
/* 23 */       par2++;
/* 24 */       min++;
/* 25 */       max--;
/*    */     }
/*    */     
/* 28 */     for (int v1 = -1; v1 < 2; v1++) {
/* 29 */       for (int v2 = -1; v2 < 2; v2++) {
/* 30 */         addBlock(par1 + v1, 104, par3 + v2, 42);
/*    */       }
/*    */     }
/*    */     
/* 34 */     addBlock(par1, 105, par3, 42);
/* 35 */     addMobSpawner(par1, 104, par3, new ResourceLocation("Skeleton"));
/* 36 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\DungeonGeneratorPyramide.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */