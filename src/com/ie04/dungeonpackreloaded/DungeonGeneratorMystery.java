/*     */ package de.stuuupiiid.dungeonpack;
/*     */ 
/*     */ import java.util.Random;

import net.minecraft.util.ResourceLocation;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DungeonGeneratorMystery
/*     */   extends DungeonGenerator
/*     */ {
/*     */   public boolean generate(Random random, int par1, int par2, int par3)
/*     */   {
/*  13 */     for (int var8 = -7; var8 < 8; var8++) {
/*  14 */       for (int var9 = -7; var9 < 8; var9++) {
/*  15 */         for (int var10 = -5; var10 < 30; var10++) {
/*  16 */           addAir(par1 + var8, par2 + var10, par3 + var9);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  21 */     for (int var8 = -1; var8 < 2; var8++) {
/*  22 */       for (int var9 = -6; var9 < 7; var9++) {
/*  23 */         addBlock(par1 + 7, par2 + var8, par3 + var9, 98);
/*  24 */         addBlock(par1 - 7, par2 + var8, par3 + var9, 98);
/*  25 */         addBlock(par1 + var9, par2 + var8, par3 + 7, 98);
/*  26 */         addBlock(par1 + var9, par2 + var8, par3 - 7, 98);
/*  27 */         addBlock(par1 + 7, par2 + var8, par3 + 7, 98);
/*  28 */         addBlock(par1 - 7, par2 + var8, par3 - 7, 98);
/*  29 */         addBlock(par1 - 7, par2 + var8, par3 + 7, 98);
/*  30 */         addBlock(par1 + 7, par2 + var8, par3 - 7, 98);
/*     */       }
/*     */     }
/*     */     
/*  34 */     for (int var8 = -6; var8 < 7; var8++) {
/*  35 */       for (int var9 = -6; var9 < 7; var9++) {
/*  36 */         addBlock(par1 + var9, par2 - 1, par3 + var8, 98);
/*     */       }
/*     */     }
/*     */     
/*  40 */     for (int var8 = -6; var8 < 7; var8++) {
/*  41 */       for (int var9 = 0; var9 < 2; var9++) {
/*  42 */         addBlock(par1 + 5 + var9, par2, par3 + var8, 98);
/*  43 */         addBlock(par1 - 5 - var9, par2, par3 + var8, 98);
/*  44 */         addBlock(par1 + var8, par2, par3 - 5 - var9, 98);
/*  45 */         addBlock(par1 + var8, par2, par3 + 5 + var9, 98);
/*     */       }
/*     */     }
/*     */     
/*  49 */     for (int var8 = -6; var8 < -1; var8++) {
/*  50 */       for (int var9 = -5; var9 < 6; var9++) {
/*  51 */         addBlock(par1 + 5, par2 + var8, par3 + var9, 98);
/*  52 */         addBlock(par1 - 5, par2 + var8, par3 + var9, 98);
/*  53 */         addBlock(par1 + var9, par2 + var8, par3 + 5, 98);
/*  54 */         addBlock(par1 + var9, par2 + var8, par3 - 5, 98);
/*     */         
/*  56 */         for (int var10 = -5; var10 < 6; var10++) {
/*  57 */           byte id = 0;
/*  58 */           if (random.nextInt(4) == 0) {
/*  59 */             id = 1;
/*     */           }
/*     */           
/*  62 */           addBlockAndMetadata(par1 + var9, par2 - 6, par3 + var10, 98, id);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  67 */     addBlock(par1 + 7, par2 + 2, par3 + 1, 98);
/*  68 */     addBlock(par1 + 7, par2 + 2, par3 - 1, 98);
/*  69 */     addBlock(par1 + 7, par2 + 2, par3 + 3, 98);
/*  70 */     addBlock(par1 + 7, par2 + 2, par3 + 5, 98);
/*  71 */     addBlock(par1 + 7, par2 + 2, par3 + 7, 98);
/*  72 */     addBlock(par1 + 7, par2 + 2, par3 - 3, 98);
/*  73 */     addBlock(par1 + 7, par2 + 2, par3 - 5, 98);
/*  74 */     addBlock(par1 + 7, par2 + 2, par3 - 7, 98);
/*  75 */     addBlock(par1 - 7, par2 + 2, par3 + 1, 98);
/*  76 */     addBlock(par1 - 7, par2 + 2, par3 - 1, 98);
/*  77 */     addBlock(par1 - 7, par2 + 2, par3 + 3, 98);
/*  78 */     addBlock(par1 - 7, par2 + 2, par3 + 5, 98);
/*  79 */     addBlock(par1 - 7, par2 + 2, par3 + 7, 98);
/*  80 */     addBlock(par1 - 7, par2 + 2, par3 - 3, 98);
/*  81 */     addBlock(par1 - 7, par2 + 2, par3 - 5, 98);
/*  82 */     addBlock(par1 - 7, par2 + 2, par3 - 7, 98);
/*  83 */     addBlock(par1 + 1, par2 + 2, par3 + 7, 98);
/*  84 */     addBlock(par1 - 1, par2 + 2, par3 + 7, 98);
/*  85 */     addBlock(par1 + 3, par2 + 2, par3 + 7, 98);
/*  86 */     addBlock(par1 + 5, par2 + 2, par3 + 7, 98);
/*  87 */     addBlock(par1 + 7, par2 + 2, par3 + 7, 98);
/*  88 */     addBlock(par1 - 3, par2 + 2, par3 + 7, 98);
/*  89 */     addBlock(par1 - 5, par2 + 2, par3 + 7, 98);
/*  90 */     addBlock(par1 - 7, par2 + 2, par3 + 7, 98);
/*  91 */     addBlock(par1 + 1, par2 + 2, par3 - 7, 98);
/*  92 */     addBlock(par1 - 1, par2 + 2, par3 - 7, 98);
/*  93 */     addBlock(par1 + 3, par2 + 2, par3 - 7, 98);
/*  94 */     addBlock(par1 + 5, par2 + 2, par3 - 7, 98);
/*  95 */     addBlock(par1 + 7, par2 + 2, par3 - 7, 98);
/*  96 */     addBlock(par1 - 3, par2 + 2, par3 - 7, 98);
/*  97 */     addBlock(par1 - 5, par2 + 2, par3 - 7, 98);
/*  98 */     addBlock(par1 - 7, par2 + 2, par3 - 7, 98);
/*  99 */     addMobSpawner(par1 - 5, par2 - 1, par3 - 5, new ResourceLocation("Skeleton"));
/* 100 */     addMobSpawner(par1 + 5, par2 - 1, par3 + 5, new ResourceLocation("Skeleton"));
/* 101 */     addMobSpawner(par1 + 5, par2 - 1, par3 - 5, new ResourceLocation("Skeleton"));
/* 102 */     addMobSpawner(par1 - 5, par2 - 1, par3 + 5, new ResourceLocation("Skeleton"));
/* 103 */     addMobSpawner(par1 - 3, par2 - 5, par3 - 3, new ResourceLocation("Skeleton"));
/* 104 */     addMobSpawner(par1 + 3, par2 - 5, par3 + 3, new ResourceLocation("Skeleton"));
/* 105 */     addMobSpawner(par1 + 3, par2 - 5, par3 - 3, new ResourceLocation("Skeleton"));
/* 106 */     addMobSpawner(par1 - 3, par2 - 5, par3 + 3, new ResourceLocation("Skeleton"));
/* 107 */     addChestWithMagicalLoot(random, par1, par2 - 5, par3);
/* 108 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\DungeonGeneratorMystery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */