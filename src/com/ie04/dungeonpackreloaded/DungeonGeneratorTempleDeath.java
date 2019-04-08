/*    */ package de.stuuupiiid.dungeonpack;
/*    */ 
/*    */ import java.util.Random;

import net.minecraft.util.ResourceLocation;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DungeonGeneratorTempleDeath
/*    */   extends DungeonGenerator
/*    */ {
/*    */   public boolean generate(Random random, int par1, int par2, int par3)
/*    */   {
/* 13 */     for (int v1 = 0; v1 < 15; v1++) {
/* 14 */       for (int v2 = 0; v2 < 8; v2++) {
/* 15 */         for (int v3 = -3; v3 < 4; v3++) {
/* 16 */           addBlockAndMetadata(par1 + v1, par2 + v3, par3 + v2, 98, data(random));
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 21 */     for (int v1 = 1; v1 < 14; v1++) {
/* 22 */       for (int v2 = 0; v2 < 2; v2++) {
/* 23 */         for (int v3 = 1; v3 < 7; v3++) {
/* 24 */           addAir(par1 + v1, par2 + v2 - 2, par3 + v3);
/* 25 */           addAir(par1 + v1, par2 + v2 + 1, par3 + v3);
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 30 */     for (int v1 = 0; v1 < 2; v1++) {
/* 31 */       for (int v2 = 0; v2 < 2; v2++) {
/* 32 */         addAir(par1 + 10 + v1, par2, par3 + 3 + v2);
/* 33 */         addAir(par1, par2 + v2 + 1, par3 + 3 + v1);
/* 34 */         addBlockAndMetadata(par1 + 7, par2 + v1 - 2, par3 + 1 + v2, 98, data(random));
/* 35 */         addBlockAndMetadata(par1 + 7, par2 + v1 - 2, par3 + 5 + v2, 98, data(random));
/*    */       }
/*    */     }
/*    */     
/* 39 */     addChestWithDefaultLoot(random, par1 + 1, par2 - 2, par3 + 3);
/* 40 */     addChestWithDefaultLoot(random, par1 + 1, par2 - 2, par3 + 4);
/* 41 */     addChestWithDefaultLoot(random, par1 + 3, par2 - 2, par3 + 1);
/* 42 */     addChestWithDefaultLoot(random, par1 + 4, par2 - 2, par3 + 1);
/* 43 */     addChestWithDefaultLoot(random, par1 + 3, par2 - 2, par3 + 6);
/* 44 */     addChestWithDefaultLoot(random, par1 + 4, par2 - 2, par3 + 6);
/* 45 */     addMobSpawner(par1 + 9, par2 + 1, par3 + 2, new ResourceLocation("Zombie"));
/* 46 */     addMobSpawner(par1 + 12, par2 + 1, par3 + 2, new ResourceLocation("Zombie"));
/* 47 */     addMobSpawner(par1 + 9, par2 + 1, par3 + 5, new ResourceLocation("Zombie"));
/* 48 */     addMobSpawner(par1 + 12, par2 + 1, par3 + 5, new ResourceLocation("Zombie"));
/* 49 */     addMobSpawner(par1 + 12, par2 - 2, par3 + 2, new ResourceLocation("Zombie"));
/* 50 */     addMobSpawner(par1 + 12, par2 - 2, par3 + 5, new ResourceLocation("Zombie"));
/* 51 */     setTNT(random, par1 + 5, par2, par3 + 1);
/* 52 */     setTNT(random, par1 + 6, par2, par3 + 1);
/* 53 */     setTNT(random, par1 + 6, par2, par3 + 2);
/* 54 */     setTNT(random, par1 + 5, par2, par3 + 6);
/* 55 */     setTNT(random, par1 + 6, par2, par3 + 6);
/* 56 */     setTNT(random, par1 + 6, par2, par3 + 5);
/* 57 */     setTNT(random, par1 + 8, par2, par3 + 1);
/* 58 */     setTNT(random, par1 + 9, par2, par3 + 1);
/* 59 */     setTNT(random, par1 + 8, par2, par3 + 2);
/* 60 */     setTNT(random, par1 + 8, par2, par3 + 6);
/* 61 */     setTNT(random, par1 + 9, par2, par3 + 6);
/* 62 */     setTNT(random, par1 + 8, par2, par3 + 5);
/* 63 */     return true;
/*    */   }
/*    */   
/*    */   public int data(Random r) {
/* 67 */     int v = r.nextInt(5);
/* 68 */     return (v != 0) && (v != 1) ? 0 : v == 4 ? 3 : v == 3 ? 2 : v == 2 ? 1 : 0;
/*    */   }
/*    */   
/*    */   public boolean setTNT(Random r, int par1, int par2, int par3) {
/* 72 */     addBlock(par1, par2 - 2, par3, 70);
/* 73 */     addBlock(par1, par2 - 4, par3, 46);
/* 74 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\DungeonGeneratorTempleDeath.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */