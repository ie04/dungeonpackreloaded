/*     */ package de.stuuupiiid.dungeonpack;
/*     */ 
/*     */ import java.util.Random;

import net.minecraft.util.ResourceLocation;
/*     */ 
/*     */ public class DungeonGeneratorMysteryRooms
/*     */   extends DungeonGenerator
/*     */ {
/*     */   public boolean generate(Random random, int par1, int par2, int par3)
/*     */   {
/*  10 */     par1 -= 6;
/*  11 */     par3 -= 6;
/*  12 */     byte var8 = 30;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*  17 */     for (int v1 = -1; v1 < 28; v1++) {
/*  18 */       for (int v2 = -1; v2 < 19; v2++) {
/*  19 */         for (int v3 = -2; v3 < 9; v3++) {
/*  20 */           addBlock(par1 + v2, var8 + v3, par3 + v1, 1);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  25 */     for (int v1 = 1; v1 < 4; v1++) {
/*  26 */       for (int v2 = 1; v2 < 4; v2++) {
/*  27 */         for (int v3 = 1; v3 < 4; v3++) {
/*  28 */           addAir(par1 + v1, var8 + v2, par3 + v3);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  33 */     addChestWithCustomLoot(random, par1 + 2, var8 + 1, par3 + 4, getArmor(random), 1);
/*  34 */     addAir(par1 + 2, var8 + 2, par3 + 4);
/*  35 */     addAir(par1 + 4, var8 + 1, par3 + 2);
/*  36 */     addAir(par1 + 4, var8 + 2, par3 + 2);
/*     */     
/*  38 */     for (int v1 = 5; v1 < 8; v1++) {
/*  39 */       for (int v2 = 1; v2 < 4; v2++) {
/*  40 */         for (int v3 = 1; v3 < 4; v3++) {
/*  41 */           addAir(par1 + v1, var8 + v2, par3 + v3);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  46 */     for (int v1 = 5; v1 < 8; v1++) {
/*  47 */       for (int v2 = 1; v2 < 4; v2++) {
/*  48 */         for (int v3 = 5; v3 < 8; v3++) {
/*  49 */           addAir(par1 + v1, var8 + v2, par3 + v3);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  54 */     addAir(par1 + 6, var8 + 1, par3 + 4);
/*  55 */     addAir(par1 + 6, var8 + 2, par3 + 4);
/*  56 */     addAir(par1 + 8, var8 + 1, par3 + 6);
/*  57 */     addAir(par1 + 8, var8 + 2, par3 + 6);
/*  58 */     addSpawner(random, par1 + 6, var8 + 6, par3 + 6);
/*  59 */     addAir(par1 + 6, var8 + 5, par3 + 6);
/*  60 */     addAir(par1 + 6, var8 + 4, par3 + 6);
/*  61 */     addBlock(par1 + 8, var8 + 1, par3 + 6, 70);
/*  62 */     addBlock(par1 + 8, var8, par3 + 7, 46);
/*  63 */     addBlock(par1 + 8, var8, par3 + 5, 46);
/*  64 */     addBlock(par1 + 10, var8 + 1, par3 + 4, 87);
/*  65 */     addBlock(par1 + 10, var8 + 2, par3 + 4, 51);
/*  66 */     addAir(par1 + 10, var8 + 3, par3 + 4);
/*  67 */     addAir(par1 + 10, var8 + 4, par3 + 6);
/*  68 */     addAir(par1 + 10, var8 + 5, par3 + 6);
/*     */     
/*  70 */     for (int v1 = 9; v1 < 12; v1++) {
/*  71 */       for (int v2 = 1; v2 < 4; v2++) {
/*  72 */         for (int v3 = 5; v3 < 8; v3++) {
/*  73 */           addAir(par1 + v1, var8 + v2, par3 + v3);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  78 */     addSpawner(random, par1 + 2, var8, par3 + 2);
/*  79 */     addSpawner(random, par1 + 2, var8 + 4, par3 + 2);
/*     */     
/*  81 */     for (int v1 = 14; v1 < 17; v1++) {
/*  82 */       for (int v2 = 1; v2 < 4; v2++) {
/*  83 */         for (int v3 = 5; v3 < 8; v3++) {
/*  84 */           addAir(par1 + v1, var8 + v2, par3 + v3);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  89 */     addAir(par1 + 12, var8 + 1, par3 + 6);
/*  90 */     addAir(par1 + 12, var8 + 2, par3 + 6);
/*  91 */     addAir(par1 + 13, var8 + 1, par3 + 6);
/*  92 */     addAir(par1 + 13, var8 + 2, par3 + 6);
/*  93 */     addAir(par1 + 10, var8 + 1, par3 + 8);
/*  94 */     addAir(par1 + 10, var8 + 2, par3 + 8);
/*  95 */     addAir(par1 + 10, var8 + 1, par3 + 9);
/*  96 */     addAir(par1 + 10, var8 + 2, par3 + 9);
/*  97 */     addAir(par1 + 10, var8 + 1, par3 + 10);
/*  98 */     addAir(par1 + 10, var8 + 2, par3 + 10);
/*  99 */     addAir(par1 + 10, var8 + 1, par3 + 11);
/* 100 */     addAir(par1 + 10, var8 + 2, par3 + 11);
/*     */     
/* 102 */     for (int v1 = 9; v1 < 12; v1++) {
/* 103 */       for (int v2 = 1; v2 < 4; v2++) {
/* 104 */         for (int v3 = 12; v3 < 15; v3++) {
/* 105 */           addAir(par1 + v1, var8 + v2, par3 + v3);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 110 */     addAir(par1 + 12, var8 + 1, par3 + 13);
/* 111 */     addAir(par1 + 12, var8 + 2, par3 + 13);
/* 112 */     addAir(par1 + 13, var8 + 1, par3 + 13);
/* 113 */     addAir(par1 + 13, var8 + 2, par3 + 13);
/*     */     
/* 115 */     for (int v1 = 14; v1 < 17; v1++) {
/* 116 */       for (int v2 = 1; v2 < 4; v2++) {
/* 117 */         for (int v3 = 12; v3 < 15; v3++) {
/* 118 */           addAir(par1 + v1, var8 + v2, par3 + v3);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 123 */     addSpawner(random, par1 + 17, var8 + 2, par3 + 13);
/* 124 */     addSpawner(random, par1 + 15, var8 + 2, par3 + 11);
/* 125 */     addSpawner(random, par1 + 15, var8 + 2, par3 + 15);
/* 126 */     addChestWithCustomLoot(random, par1 + 16, var8 + 1, par3 + 13, getDisc(random), 1);
/* 127 */     addAir(par1 + 10, var8 + 1, par3 + 15);
/* 128 */     addAir(par1 + 10, var8 + 2, par3 + 15);
/* 129 */     addAir(par1 + 10, var8 + 1, par3 + 16);
/* 130 */     addAir(par1 + 10, var8 + 2, par3 + 16);
/* 131 */     addAir(par1 + 10, var8 + 1, par3 + 17);
/* 132 */     addAir(par1 + 10, var8 + 2, par3 + 17);
/*     */     
/* 134 */     for (int v1 = 8; v1 < 13; v1++) {
/* 135 */       for (int v2 = 1; v2 < 4; v2++) {
/* 136 */         for (int v3 = 18; v3 < 23; v3++) {
/* 137 */           addAir(par1 + v1, var8 + v2, par3 + v3);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 142 */     addBlock(par1 + 12, var8 + 1, par3 + 20, 87);
/* 143 */     addBlock(par1 + 12, var8 + 2, par3 + 20, 51);
/* 144 */     addBlock(par1 + 11, var8 + 1, par3 + 20, 101);
/* 145 */     addBlock(par1 + 11, var8 + 1, par3 + 19, 101);
/* 146 */     addBlock(par1 + 11, var8 + 1, par3 + 21, 101);
/* 147 */     addBlock(par1 + 12, var8 + 1, par3 + 19, 101);
/* 148 */     addBlock(par1 + 12, var8 + 1, par3 + 21, 101);
/* 149 */     addAir(par1 + 10, var8 + 1, par3 + 23);
/* 150 */     addAir(par1 + 10, var8 + 2, par3 + 23);
/* 151 */     addAir(par1 + 10, var8 + 1, par3 + 24);
/* 152 */     addAir(par1 + 10, var8 + 2, par3 + 24);
/* 153 */     addChestWithCustomLoot(random, par1 + 10, var8 + 2, par3 + 25, getSword(random), 1);
/* 154 */     addAir(par1 + 10, var8 + 3, par3 + 25);
/* 155 */     addAir(par1 + 7, var8 + 1, par3 + 20);
/* 156 */     addAir(par1 + 7, var8 + 2, par3 + 20);
/* 157 */     addAir(par1 + 6, var8 + 1, par3 + 20);
/* 158 */     addAir(par1 + 6, var8 + 2, par3 + 20);
/* 159 */     addAir(par1 + 5, var8 + 1, par3 + 20);
/* 160 */     addAir(par1 + 5, var8 + 2, par3 + 20);
/*     */     
/* 162 */     for (int v1 = 2; v1 < 5; v1++) {
/* 163 */       for (int v2 = 1; v2 < 4; v2++) {
/* 164 */         for (int v3 = 19; v3 < 22; v3++) {
/* 165 */           addAir(par1 + v1, var8 + v2, par3 + v3);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 170 */     addSpawner(random, par1 + 12 - 9, var8, par3 + 20);
/* 171 */     return true;
/*     */   }
/*     */   
/*     */   public boolean addSpawner(Random random, int par1, int par2, int par3) {
/* 175 */     addMobSpawner(par1, par2, par3, new ResourceLocation(getMob(random)));
/* 176 */     return true;
/*     */   }
/*     */   
/*     */   public String getMob(Random random) {
/* 180 */     int v = random.nextInt(2);
/* 181 */     return v == 1 ? "Zombie" : v == 0 ? "CaveSpider" : "Zombie";
/*     */   }
/*     */   
/*     */   private int getDisc(Random par1Random) {
/* 185 */     int var2 = par1Random.nextInt(11);
/* 186 */     return var2 == 9 ? 2265 : var2 == 8 ? 2264 : var2 == 7 ? 2263 : var2 == 6 ? 2262 : var2 == 5 ? 2261 : var2 == 4 ? 2260 : var2 == 3 ? 2259 : var2 == 2 ? 2258 : var2 == 1 ? 2257 : var2 == 0 ? 2256 : (var2 == 10 ? Integer.valueOf(2266) : null).intValue();
/*     */   }
/*     */   
/*     */   private int getSword(Random random) {
/* 190 */     int v = random.nextInt(3);
/* 191 */     return v == 2 ? 267 : v == 1 ? 276 : v == 0 ? 283 : 283;
/*     */   }
/*     */   
/*     */   private int getArmor(Random random) {
/* 195 */     int v = random.nextInt(4);
/* 196 */     return v == 3 ? 313 : v == 2 ? 312 : v == 1 ? 311 : v == 0 ? 310 : 310;
/*     */   }
/*     */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\DungeonGeneratorMysteryRooms.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */