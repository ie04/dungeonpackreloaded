/*     */ package de.stuuupiiid.dungeonpack;
/*     */ 
/*     */ import java.util.Random;

import net.minecraft.util.ResourceLocation;
/*     */ 
/*     */ public class DungeonGeneratorFort
/*     */   extends DungeonGenerator
/*     */ {
/*     */   public boolean generate(Random random, int par1, int par2, int par3)
/*     */   {
/*  10 */     for (int v1 = 0; v1 < 2 + random.nextInt(2); v1++) {
/*  11 */       generateFort(random, par1 + random.nextInt(24) - 12, par2, par3 + random.nextInt(24) - 12);
/*     */     }
/*     */     
/*  14 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean generateFort(Random random, int par1, int par2, int par3)
/*     */   {
/*  20 */     for (int v1 = -7; v1 < 11; v1++) {
/*  21 */       for (int v2 = -7; v2 < 11; v2++) {
/*  22 */         addAir(par1 + v1, getTop(par1 + v1, par3 + v2) - 1, par3 + v2);
/*  23 */         addAir(par1 + v1, getTop(par1 + v1, par3 + v2), par3 + v2);
/*  24 */         addAir(par1 + v1, getTop(par1 + v1, par3 + v2) + 1, par3 + v2);
/*  25 */         addAir(par1 + v1, getTop(par1 + v1, par3 + v2) + 2, par3 + v2);
/*  26 */         addAir(par1 + v1, getTop(par1 + v1, par3 + v2) + 3, par3 + v2);
/*  27 */         addAir(par1 + v1, getTop(par1 + v1, par3 + v2) + 4, par3 + v2);
/*  28 */         byte v3 = 0;
/*  29 */         if (random.nextInt(3) == 0) {
/*  30 */           v3 = 1;
/*     */         }
/*     */         
/*  33 */         addBlockAndMetadata(par1 + v1, getTop(par1 + v1, par3 + v2) - 1, par3 + v2, 98, v3);
/*  34 */         addBlockAndMetadata(par1 + v1, getTop(par1 + v1, par3 + v2) - 2, par3 + v2, 98, v3);
/*  35 */         addBlockAndMetadata(par1 + v1, getTop(par1 + v1, par3 + v2) - 3, par3 + v2, 98, v3);
/*  36 */         addBlockAndMetadata(par1 + v1, getTop(par1 + v1, par3 + v2) - 4, par3 + v2, 98, v3);
/*  37 */         addBlockAndMetadata(par1 + v1, getTop(par1 + v1, par3 + v2) - 5, par3 + v2, 98, v3);
/*     */       }
/*     */     }
/*     */     
/*  41 */     for (int v1 = -7; v1 < 8; v1++) {
/*  42 */       generateWallPartX(random, par1 + 9, getTop(par1 + 9, par3 + v1) - 6, par3 + v1);
/*  43 */       generateWallPartX(random, par1 - 9, getTop(par1 - 9, par3 + v1) - 6, par3 + v1);
/*  44 */       generateWallPartZ(random, par1 + v1, getTop(par1 + v1, par3 + 9) - 6, par3 + 9);
/*  45 */       generateWallPartZ(random, par1 + v1, getTop(par1 + v1, par3 - 9) - 6, par3 - 9);
/*     */     }
/*     */     
/*  48 */     generateTower(random, par1 + 9, getTop(par1 + 9, par3 + 9) - 6, par3 + 9);
/*  49 */     generateTower(random, par1 - 9, getTop(par1 - 9, par3 + 9) - 6, par3 + 9);
/*  50 */     generateTower(random, par1 + 9, getTop(par1 + 9, par3 - 9) - 6, par3 - 9);
/*  51 */     generateTower(random, par1 - 9, getTop(par1 - 9, par3 - 9) - 6, par3 - 9);
/*     */     
/*     */ 
/*  54 */     for (int v1 = 0; v1 < 1 + random.nextInt(3); v1++) {
/*  55 */       int v2 = random.nextInt(12) - 6;
/*  56 */       int var8 = random.nextInt(12) - 6;
/*  57 */       addMobSpawner(par1 + v2, getTop(par1 + v2, par3 + var8), par3 + var8, new ResourceLocation(getMob(random)));
/*     */     }
/*     */     
/*  60 */     for (int v1 = 0; v1 < 1 + random.nextInt(4); v1++) {
/*  61 */       int v2 = random.nextInt(12) - 6;
/*  62 */       int var8 = random.nextInt(12) - 6;
/*  63 */       if (random.nextInt(3) == 0) {
/*  64 */         addChestWithDefaultLoot(random, par1 + v2, getTop(par1 + v2, par3 + var8), par3 + var8);
/*     */       }
/*     */     }
/*     */     
/*  68 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean generateWallPartX(Random random, int par1, int par2, int par3)
/*     */   {
/*  74 */     for (int v1 = -6; v1 < 11; v1++) {
/*  75 */       byte id = 0;
/*  76 */       if (random.nextInt(3) == 0) {
/*  77 */         id = 1;
/*     */       }
/*     */       
/*  80 */       addBlockAndMetadata(par1, par2 + v1, par3, 98, id);
/*     */     }
/*     */     
/*  83 */     for (int v1 = -6; v1 < 12; v1++) {
/*  84 */       byte id = 0;
/*  85 */       if (random.nextInt(3) == 0) {
/*  86 */         id = 1;
/*     */       }
/*     */       
/*  89 */       addBlockAndMetadata(par1 + 1, par2 + v1, par3, 98, id);
/*  90 */       addBlockAndMetadata(par1 - 1, par2 + v1, par3, 98, id);
/*     */     }
/*     */     
/*  93 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean generateWallPartZ(Random random, int par1, int par2, int par3)
/*     */   {
/*  99 */     for (int v1 = -6; v1 < 11; v1++) {
/* 100 */       byte id = 0;
/* 101 */       if (random.nextInt(3) == 0) {
/* 102 */         id = 1;
/*     */       }
/*     */       
/* 105 */       addBlockAndMetadata(par1, par2 + v1, par3, 98, id);
/*     */     }
/*     */     
/* 108 */     for (int v1 = -6; v1 < 12; v1++) {
/* 109 */       byte id = 0;
/* 110 */       if (random.nextInt(3) == 0) {
/* 111 */         id = 1;
/*     */       }
/*     */       
/* 114 */       addBlockAndMetadata(par1, par2 + v1, par3 + 1, 98, id);
/* 115 */       addBlockAndMetadata(par1, par2 + v1, par3 - 1, 98, id);
/*     */     }
/*     */     
/* 118 */     return true;
/*     */   }
/*     */   
/*     */   public boolean generateTower(Random random, int par1, int par2, int par3) {
/* 122 */     for (int v1 = -6; v1 < 16; v1++) {
/* 123 */       for (int v2 = -1; v2 < 2; v2++) {
/* 124 */         for (int v3 = -1; v3 < 2; v3++) {
/* 125 */           byte id = 0;
/* 126 */           if (random.nextInt(3) == 0) {
/* 127 */             id = 1;
/*     */           }
/*     */           
/* 130 */           addBlockAndMetadata(par1 + v2, par2 + v1, par3 + v3, 98, id);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 135 */     addAir(par1, par2 + 14, par3);
/* 136 */     addAir(par1, par2 + 15, par3);
/* 137 */     addAir(par1 + 1, par2 + 15, par3);
/* 138 */     addAir(par1 - 1, par2 + 15, par3);
/* 139 */     addAir(par1, par2 + 15, par3 + 1);
/* 140 */     addAir(par1, par2 + 15, par3 - 1);
/* 141 */     return true;
/*     */   }
/*     */   
/*     */   private String getMob(Random random) {
/* 145 */     int var2 = random.nextInt(4);
/* 146 */     return var2 == 3 ? "Spider" : var2 == 2 ? "Zombie" : var2 == 1 ? "Zombie" : var2 == 0 ? "Skeleton" : "";
/*     */   }
/*     */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\DungeonGeneratorFort.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */