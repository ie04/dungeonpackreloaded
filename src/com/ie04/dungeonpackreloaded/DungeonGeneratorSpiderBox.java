/*    */ package de.stuuupiiid.dungeonpack;
/*    */ 
/*    */ import java.util.Random;

import net.minecraft.util.ResourceLocation;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DungeonGeneratorSpiderBox
/*    */   extends DungeonGenerator
/*    */ {
/*    */   public boolean generate(Random random, int par1, int par2, int par3)
/*    */   {
/* 13 */     for (int v1 = -4; v1 < 5; v1++) {
/* 14 */       for (int v2 = -4; v2 < 5; v2++) {
/* 15 */         addBlock(par1 + v1, par2 - 1, par3 + v2, 2);
/*    */         
/* 17 */         for (int v3 = -7; v3 < -1; v3++) {
/* 18 */           if (isAir(par1 + v1, par2 + v3, par3 + v2)) {
/* 19 */             addBlock(par1 + v1, par2 + v3, par3 + v2, 3);
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 25 */     for (int v1 = -3; v1 < 4; v1++) {
/* 26 */       for (int v2 = -3; v2 < 4; v2++) {
/* 27 */         for (int v3 = -5; v3 < -2; v3++) {
/* 28 */           addAir(par1 + v1, par2 + v3, par3 + v2);
/* 29 */           addAir(par1, par2 + v1, par3);
/* 30 */           if ((isAir(par1 + v1, par2 + v3, par3 + v2)) && (random.nextInt(4) == 0)) {
/* 31 */             addBlock(par1 + v1, par2 + v3, par3 + v2, 30);
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 37 */     for (int v1 = -1; v1 < 2; v1++) {
/* 38 */       addBlock(par1 + v1, par2, par3 + 1, 4);
/* 39 */       addBlock(par1 + v1, par2, par3 - 1, 4);
/* 40 */       addBlock(par1 + 1, par2, par3 + v1, 4);
/* 41 */       addBlock(par1 - 1, par2, par3 + v1, 4);
/* 42 */       addBlock(par1 + v1, par2 + 1, par3 + 1, 4);
/* 43 */       addBlock(par1 + v1, par2 + 1, par3 - 1, 4);
/* 44 */       addBlock(par1 + 1, par2 + 1, par3 + v1, 4);
/* 45 */       addBlock(par1 - 1, par2 + 1, par3 + v1, 4);
/*    */     }
/*    */     
/* 48 */     addBlock(par1 + 1, par2 + 2, par3, 4);
/* 49 */     addBlock(par1 - 1, par2 + 2, par3, 4);
/* 50 */     addBlock(par1, par2 + 2, par3 + 1, 4);
/* 51 */     addBlock(par1, par2 + 2, par3 - 1, 4);
/* 52 */     addBlock(par1 + 1, par2, par3 + 2, 4);
/* 53 */     addBlock(par1 + 1, par2, par3 - 2, 4);
/* 54 */     addBlock(par1 - 1, par2, par3 + 2, 4);
/* 55 */     addBlock(par1 - 1, par2, par3 - 2, 4);
/* 56 */     addBlock(par1 + 2, par2, par3 + 1, 4);
/* 57 */     addBlock(par1 - 2, par2, par3 + 1, 4);
/* 58 */     addBlock(par1 + 2, par2, par3 - 1, 4);
/* 59 */     addBlock(par1 - 2, par2, par3 - 1, 4);
/* 60 */     addMobSpawner(par1 - 3, par2 - 5, par3 + 3, new ResourceLocation("CaveSpider"));
/* 61 */     addMobSpawner(par1 + 3, par2 - 5, par3 - 3, new ResourceLocation("CaveSpider"));
/* 62 */     addChestWithDefaultLoot(random, par1 + 3, par2 - 5, par3 + 3);
/* 63 */     addChestWithDefaultLoot(random, par1 - 3, par2 - 5, par3 - 3);
/* 64 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\DungeonGeneratorSpiderBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */