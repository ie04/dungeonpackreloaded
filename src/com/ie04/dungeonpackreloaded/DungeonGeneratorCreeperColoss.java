/*     */ package de.stuuupiiid.dungeonpack;
/*     */ 
/*     */ import java.util.Random;

import net.minecraft.util.ResourceLocation;
/*     */ 
/*     */ public class DungeonGeneratorCreeperColoss
/*     */   extends DungeonGenerator
/*     */ {
/*     */   public boolean generate(Random random, int par1, int par2, int par3)
/*     */   {
/*  10 */     byte data = 2;
/*     */     
/*     */ 
/*     */ 
/*  14 */     for (int var6 = -3; var6 < 4; var6++) {
/*  15 */       for (int var7 = -3; var7 < 4; var7++) {
/*  16 */         for (int v = 0; v < 6; v++) {
/*  17 */           addAir(par1 + var6, par2 + v, par3 + var7);
/*  18 */           addAir(par1 + var6, par2 + v + 2, par3 + var7);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  23 */     for (int var6 = -2; var6 < 3; var6++) {
/*  24 */       for (int var7 = 0; var7 < 3; var7++) {
/*  25 */         addBlockAndMetadata(par1 - 4, par2 + var7, par3 + var6, 24, data);
/*  26 */         addBlockAndMetadata(par1 + var6, par2 + var7, par3 + 4, 24, data);
/*  27 */         addBlockAndMetadata(par1 + var6, par2 + var7, par3 - 4, 24, data);
/*     */       }
/*     */       
/*  30 */       for (int var7 = 3; var7 < 5; var7++) {
/*  31 */         addBlockAndMetadata(par1 - 3, par2 + var7, par3 + var6, 24, data);
/*  32 */         addBlockAndMetadata(par1 + var6, par2 + var7, par3 + 3, 24, data);
/*  33 */         addBlockAndMetadata(par1 + var6, par2 + var7, par3 - 3, 24, data);
/*     */       }
/*     */       
/*  36 */       for (int var7 = 5; var7 < 7; var7++) {
/*  37 */         addBlockAndMetadata(par1 - 4, par2 + var7, par3 + var6, 24, data);
/*  38 */         addBlockAndMetadata(par1 + var6, par2 + var7, par3 + 4, 24, data);
/*  39 */         addBlockAndMetadata(par1 + var6, par2 + var7, par3 - 4, 24, data);
/*     */       }
/*     */       
/*  42 */       addBlockAndMetadata(par1 + 4, par2, par3 + var6, 24, data);
/*  43 */       addBlockAndMetadata(par1 - 3, par2 + 7, par3 + var6, 24, data);
/*  44 */       addBlockAndMetadata(par1 + 3, par2 + 7, par3 + var6, 24, data);
/*  45 */       addBlockAndMetadata(par1 + var6, par2 + 7, par3 + 3, 24, data);
/*  46 */       addBlockAndMetadata(par1 + var6, par2 + 7, par3 - 3, 24, data);
/*     */     }
/*     */     
/*  49 */     for (int var6 = 0; var6 < 3; var6++) {
/*  50 */       addBlockAndMetadata(par1 + 4, par2 + var6, par3 + 2, 24, data);
/*  51 */       addBlockAndMetadata(par1 + 4, par2 + var6, par3 - 2, 24, data);
/*  52 */       addBlockAndMetadata(par1 - 3, par2 + var6, par3 + 3, 24, data);
/*  53 */       addBlockAndMetadata(par1 - 3, par2 + var6, par3 - 3, 24, data);
/*  54 */       addBlockAndMetadata(par1 + 3, par2 + var6, par3 + 3, 24, data);
/*  55 */       addBlockAndMetadata(par1 + 3, par2 + var6, par3 - 3, 24, data);
/*     */     }
/*     */     
/*  58 */     for (int var6 = 3; var6 < 5; var6++) {
/*  59 */       addBlockAndMetadata(par1 + 4, par2 + var6, par3 - 1, 24, data);
/*  60 */       addBlockAndMetadata(par1 + 3, par2 + var6, par3 - 2, 24, data);
/*  61 */       addBlockAndMetadata(par1 + 4, par2 + var6, par3 + 1, 24, data);
/*  62 */       addBlockAndMetadata(par1 + 3, par2 + var6, par3 + 2, 24, data);
/*     */     }
/*     */     
/*  65 */     for (int var6 = 5; var6 < 7; var6++) {
/*  66 */       addBlockAndMetadata(par1 + 4, par2 + var6, par3 + 2, 24, data);
/*  67 */       addBlockAndMetadata(par1 + 4, par2 + var6, par3 - 2, 24, data);
/*  68 */       addBlockAndMetadata(par1 - 3, par2 + var6, par3 + 3, 24, data);
/*  69 */       addBlockAndMetadata(par1 - 3, par2 + var6, par3 - 3, 24, data);
/*  70 */       addBlockAndMetadata(par1 + 3, par2 + var6, par3 + 3, 24, data);
/*  71 */       addBlockAndMetadata(par1 + 3, par2 + var6, par3 - 3, 24, data);
/*  72 */       addBlockAndMetadata(par1 + 4, par2 + var6, par3, 24, data);
/*     */     }
/*     */     
/*  75 */     for (int var6 = -1; var6 < 2; var6++) {
/*  76 */       addBlockAndMetadata(par1 - 2, par2 + 8, par3 + var6, 24, data);
/*  77 */       addBlockAndMetadata(par1 + 2, par2 + 8, par3 + var6, 24, data);
/*  78 */       addBlockAndMetadata(par1 + var6, par2 + 8, par3 - 2, 24, data);
/*  79 */       addBlockAndMetadata(par1 + var6, par2 + 8, par3 + 2, 24, data);
/*     */       
/*  81 */       for (int var7 = -1; var7 < 2; var7++) {
/*  82 */         addBlockAndMetadata(par1 + var6, par2 + 8, par3 + var7, 24, data);
/*     */       }
/*     */     }
/*     */     
/*  86 */     for (int var6 = -5; var6 < 6; var6++) {
/*  87 */       for (int var7 = -5; var7 < 6; var7++) {
/*  88 */         addBlock(par1 + var6, par2 - 1, par3 + var7, 12);
/*     */       }
/*     */     }
/*     */     
/*  92 */     addBlockAndMetadata(par1 + 4, par2 + 1, par3, 24, data);
/*  93 */     addBlockAndMetadata(par1 + 4, par2 + 4, par3, 24, data);
/*  94 */     addBlockAndMetadata(par1 + 4, par2 + 6, par3 + 1, 24, data);
/*  95 */     addBlockAndMetadata(par1 + 4, par2 + 6, par3 - 1, 24, data);
/*  96 */     addBlockAndMetadata(par1 - 2, par2 + 7, par3 - 2, 24, data);
/*  97 */     addBlockAndMetadata(par1 + 2, par2 + 7, par3 - 2, 24, data);
/*  98 */     addBlockAndMetadata(par1 - 2, par2 + 7, par3 + 2, 24, data);
/*  99 */     addBlockAndMetadata(par1 + 2, par2 + 7, par3 + 2, 24, data);
/* 100 */     addChestWithDefaultLoot(random, par1 + 1, par2, par3);
/* 101 */     addMobSpawner(par1, par2, par3, new ResourceLocation("Creeper"));
/* 102 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\DungeonGeneratorCreeperColoss.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */