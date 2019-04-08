/*     */ package de.stuuupiiid.dungeonpack;
/*     */ 
/*     */ import java.util.Random;

import net.minecraft.util.ResourceLocation;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DungeonGeneratorBarn
/*     */   extends DungeonGenerator
/*     */ {
/*     */   public boolean generate(Random random, int par1, int par2, int par3)
/*     */   {
/*  12 */     for (int var = -10; var < 11; var++) {
/*  13 */       for (int var3 = -10; var3 < 11; var3++) {
/*  14 */         for (int va = 0; va < 6; va++) {
/*  15 */           addAir(par1 + var, par2 + va, par3 + var3);
/*     */         }
/*     */       }
/*     */       
/*  19 */       addBlock(par1 + var, par2 + 14, par3, 17);
/*  20 */       addBlock(par1 + var, par2 + 13, par3 + 1, 17);
/*  21 */       addBlock(par1 + var, par2 + 13, par3 - 1, 17);
/*  22 */       addBlock(par1 + var, par2 + 12, par3 + 2, 17);
/*  23 */       addBlock(par1 + var, par2 + 12, par3 - 2, 17);
/*  24 */       addBlock(par1 + var, par2 + 11, par3 + 3, 17);
/*  25 */       addBlock(par1 + var, par2 + 11, par3 - 3, 17);
/*  26 */       addBlock(par1 + var, par2 + 10, par3 + 4, 17);
/*  27 */       addBlock(par1 + var, par2 + 10, par3 - 4, 17);
/*  28 */       addBlock(par1 + var, par2 + 9, par3 + 5, 17);
/*  29 */       addBlock(par1 + var, par2 + 9, par3 - 5, 17);
/*  30 */       addBlock(par1 + var, par2 + 8, par3 + 6, 17);
/*  31 */       addBlock(par1 + var, par2 + 8, par3 - 6, 17);
/*  32 */       addBlock(par1 + var, par2 + 7, par3 + 7, 17);
/*  33 */       addBlock(par1 + var, par2 + 7, par3 - 7, 17);
/*  34 */       addBlock(par1 + var, par2 + 6, par3 + 8, 17);
/*  35 */       addBlock(par1 + var, par2 + 6, par3 - 8, 17);
/*  36 */       addBlock(par1 + var, par2 + 5, par3 + 9, 17);
/*  37 */       addBlock(par1 + var, par2 + 5, par3 - 9, 17);
/*  38 */       addBlock(par1 + var, par2 + 4, par3 + 10, 17);
/*  39 */       addBlock(par1 + var, par2 + 4, par3 - 10, 17);
/*     */     }
/*     */     
/*  42 */     for (int var = -9; var < 10; var++) {
/*  43 */       addBlock(par1 + 9, par2 + 5, par3 + var, 17);
/*  44 */       addBlock(par1 - 9, par2 + 5, par3 + var, 17);
/*     */       
/*  46 */       for (int var3 = -9; var3 < 10; var3++) {
/*  47 */         if (random.nextInt(3) == 0) {
/*  48 */           addBlock(par1 + var, par2 - 1, par3 + var3, 48);
/*     */         } else {
/*  50 */           addBlock(par1 + var, par2 - 1, par3 + var3, 4);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  55 */     for (int var = 0; var < 5; var++) {
/*  56 */       for (int var3 = -2; var3 < 3; var3++) {
/*  57 */         addBlock(par1 - 9, par2 + var, par3 - 6 + var3, 5);
/*  58 */         addBlock(par1 - 9, par2 + var, par3 + 6 + var3, 5);
/*  59 */         addBlock(par1 + 9, par2 + var, par3 - 6 + var3, 5);
/*  60 */         addBlock(par1 + 9, par2 + var, par3 + 6 + var3, 5);
/*  61 */         addBlock(par1 + var3, par2 + var, par3 + 9, 5);
/*  62 */         addBlock(par1 - 6 + var3, par2 + var, par3 + 9, 5);
/*  63 */         addBlock(par1 + 6 + var3, par2 + var, par3 + 9, 5);
/*  64 */         addBlock(par1 + var3, par2 + var, par3 - 9, 5);
/*  65 */         addBlock(par1 - 6 + var3, par2 + var, par3 - 9, 5);
/*  66 */         addBlock(par1 + 6 + var3, par2 + var, par3 - 9, 5);
/*     */       }
/*     */       
/*  69 */       addBlock(par1 + 9, par2 + var, par3 - 3, 17);
/*  70 */       addBlock(par1 - 9, par2 + var, par3 - 3, 17);
/*  71 */       addBlock(par1 + 9, par2 + var, par3 + 3, 17);
/*  72 */       addBlock(par1 - 9, par2 + var, par3 + 3, 17);
/*  73 */       addBlock(par1 + 3, par2 + var, par3 - 9, 17);
/*  74 */       addBlock(par1 - 3, par2 + var, par3 - 9, 17);
/*  75 */       addBlock(par1 + 3, par2 + var, par3 + 9, 17);
/*  76 */       addBlock(par1 - 3, par2 + var, par3 + 9, 17);
/*  77 */       addBlock(par1 + 9, par2 + var, par3 - 9, 17);
/*  78 */       addBlock(par1 - 9, par2 + var, par3 - 9, 17);
/*  79 */       addBlock(par1 + 9, par2 + var, par3 + 9, 17);
/*  80 */       addBlock(par1 - 9, par2 + var, par3 + 9, 17);
/*     */     }
/*     */     
/*  83 */     addBlock(par1 + 9, par2 + 6, par3 + 3, 17);
/*  84 */     addBlock(par1 + 9, par2 + 7, par3 + 3, 17);
/*  85 */     addBlock(par1 + 9, par2 + 8, par3 + 3, 17);
/*  86 */     addBlock(par1 + 9, par2 + 9, par3 + 3, 17);
/*  87 */     addBlock(par1 + 9, par2 + 10, par3 + 3, 17);
/*  88 */     addBlock(par1 + 9, par2 + 6, par3 + 4, 17);
/*  89 */     addBlock(par1 + 9, par2 + 7, par3 + 4, 17);
/*  90 */     addBlock(par1 + 9, par2 + 8, par3 + 4, 17);
/*  91 */     addBlock(par1 + 9, par2 + 9, par3 + 4, 17);
/*  92 */     addBlock(par1 + 9, par2 + 6, par3 + 5, 17);
/*  93 */     addBlock(par1 + 9, par2 + 7, par3 + 5, 17);
/*  94 */     addBlock(par1 + 9, par2 + 8, par3 + 5, 17);
/*  95 */     addBlock(par1 + 9, par2 + 6, par3 + 6, 17);
/*  96 */     addBlock(par1 + 9, par2 + 7, par3 + 6, 17);
/*  97 */     addBlock(par1 + 9, par2 + 6, par3 + 7, 17);
/*  98 */     addBlock(par1 + 9, par2 + 6, par3 - 3, 17);
/*  99 */     addBlock(par1 + 9, par2 + 7, par3 - 3, 17);
/* 100 */     addBlock(par1 + 9, par2 + 8, par3 - 3, 17);
/* 101 */     addBlock(par1 + 9, par2 + 9, par3 - 3, 17);
/* 102 */     addBlock(par1 + 9, par2 + 10, par3 - 3, 17);
/* 103 */     addBlock(par1 + 9, par2 + 6, par3 - 4, 17);
/* 104 */     addBlock(par1 + 9, par2 + 7, par3 - 4, 17);
/* 105 */     addBlock(par1 + 9, par2 + 8, par3 - 4, 17);
/* 106 */     addBlock(par1 + 9, par2 + 9, par3 - 4, 17);
/* 107 */     addBlock(par1 + 9, par2 + 6, par3 - 5, 17);
/* 108 */     addBlock(par1 + 9, par2 + 7, par3 - 5, 17);
/* 109 */     addBlock(par1 + 9, par2 + 8, par3 - 5, 17);
/* 110 */     addBlock(par1 + 9, par2 + 6, par3 - 6, 17);
/* 111 */     addBlock(par1 + 9, par2 + 7, par3 - 6, 17);
/* 112 */     addBlock(par1 + 9, par2 + 6, par3 - 7, 17);
/* 113 */     addBlock(par1 - 9, par2 + 6, par3 + 3, 17);
/* 114 */     addBlock(par1 - 9, par2 + 7, par3 + 3, 17);
/* 115 */     addBlock(par1 - 9, par2 + 8, par3 + 3, 17);
/* 116 */     addBlock(par1 - 9, par2 + 9, par3 + 3, 17);
/* 117 */     addBlock(par1 - 9, par2 + 10, par3 + 3, 17);
/* 118 */     addBlock(par1 - 9, par2 + 6, par3 + 4, 17);
/* 119 */     addBlock(par1 - 9, par2 + 7, par3 + 4, 17);
/* 120 */     addBlock(par1 - 9, par2 + 8, par3 + 4, 17);
/* 121 */     addBlock(par1 - 9, par2 + 9, par3 + 4, 17);
/* 122 */     addBlock(par1 - 9, par2 + 6, par3 + 5, 17);
/* 123 */     addBlock(par1 - 9, par2 + 7, par3 + 5, 17);
/* 124 */     addBlock(par1 - 9, par2 + 8, par3 + 5, 17);
/* 125 */     addBlock(par1 - 9, par2 + 6, par3 + 6, 17);
/* 126 */     addBlock(par1 - 9, par2 + 7, par3 + 6, 17);
/* 127 */     addBlock(par1 - 9, par2 + 6, par3 + 7, 17);
/* 128 */     addBlock(par1 - 9, par2 + 6, par3 - 3, 17);
/* 129 */     addBlock(par1 - 9, par2 + 7, par3 - 3, 17);
/* 130 */     addBlock(par1 - 9, par2 + 8, par3 - 3, 17);
/* 131 */     addBlock(par1 - 9, par2 + 9, par3 - 3, 17);
/* 132 */     addBlock(par1 - 9, par2 + 10, par3 - 3, 17);
/* 133 */     addBlock(par1 - 9, par2 + 6, par3 - 4, 17);
/* 134 */     addBlock(par1 - 9, par2 + 7, par3 - 4, 17);
/* 135 */     addBlock(par1 - 9, par2 + 8, par3 - 4, 17);
/* 136 */     addBlock(par1 - 9, par2 + 9, par3 - 4, 17);
/* 137 */     addBlock(par1 - 9, par2 + 6, par3 - 5, 17);
/* 138 */     addBlock(par1 - 9, par2 + 7, par3 - 5, 17);
/* 139 */     addBlock(par1 - 9, par2 + 8, par3 - 5, 17);
/* 140 */     addBlock(par1 - 9, par2 + 6, par3 - 6, 17);
/* 141 */     addBlock(par1 - 9, par2 + 7, par3 - 6, 17);
/* 142 */     addBlock(par1 - 9, par2 + 6, par3 - 7, 17);
/*     */     
/* 144 */     for (int var = -2; var < 3; var++) {
/* 145 */       addBlock(par1 - 9, par2 + 8, par3 + var, 17);
/* 146 */       addBlock(par1 - 9, par2 + 8 + var, par3, 17);
/* 147 */       addBlock(par1 - 9, par2 + 11, par3 + var, 17);
/* 148 */       addBlock(par1 + 9, par2 + 8, par3 + var, 17);
/* 149 */       addBlock(par1 + 9, par2 + 8 + var, par3, 17);
/* 150 */       addBlock(par1 + 9, par2 + 11, par3 + var, 17);
/*     */     }
/*     */     
/* 153 */     addBlock(par1 - 9, par2 + 12, par3, 17);
/* 154 */     addBlock(par1 - 9, par2 + 12, par3 + 1, 17);
/* 155 */     addBlock(par1 - 9, par2 + 12, par3 - 1, 17);
/* 156 */     addBlock(par1 - 9, par2 + 13, par3, 17);
/* 157 */     addBlock(par1 + 9, par2 + 12, par3, 17);
/* 158 */     addBlock(par1 + 9, par2 + 12, par3 + 1, 17);
/* 159 */     addBlock(par1 + 9, par2 + 12, par3 - 1, 17);
/* 160 */     addBlock(par1 + 9, par2 + 13, par3, 17);
/*     */     
/* 162 */     for (int var = 0; var < 11; var++) {
/* 163 */       addBlock(par1 + 3, par2 + var, par3 + 3, 85);
/* 164 */       addBlock(par1 + 3, par2 + var, par3 - 3, 85);
/* 165 */       addBlock(par1 - 3, par2 + var, par3 + 3, 85);
/* 166 */       addBlock(par1 - 3, par2 + var, par3 - 3, 85);
/*     */     }
/*     */     
/* 169 */     for (int var = 0; var < 3; var++) {
/* 170 */       addBlock(par1 + 3, par2, par3 + 3 + var, 85);
/* 171 */       addBlock(par1 + 3, par2, par3 - 3 - var, 85);
/* 172 */       addBlock(par1 - 3, par2, par3 + 3 + var, 85);
/* 173 */       addBlock(par1 - 3, par2, par3 - 3 - var, 85);
/* 174 */       addBlock(par1 + 3 + var, par2, par3 + 3, 85);
/* 175 */       addBlock(par1 - 3 - var, par2, par3 + 3, 85);
/* 176 */       addBlock(par1 + 3 + var, par2, par3 - 3, 85);
/* 177 */       addBlock(par1 - 3 - var, par2, par3 - 3, 85);
/* 178 */       addBlock(par1 + 3, par2 + 8, par3 + 1 + var, 85);
/* 179 */       addBlock(par1 + 3, par2 + 8, par3 - 1 - var, 85);
/* 180 */       addBlock(par1 - 3, par2 + 8, par3 + 1 + var, 85);
/* 181 */       addBlock(par1 - 3, par2 + 8, par3 - 1 - var, 85);
/* 182 */       addBlock(par1 - 3, par2 + 8 + var, par3, 85);
/* 183 */       addBlock(par1 + 3, par2 + 8 + var, par3, 85);
/*     */     }
/*     */     
/* 186 */     for (int var = -9; var < 10; var++) {
/* 187 */       addBlock(par1 + var, par2 + 8, par3, 17);
/*     */     }
/*     */     
/* 190 */     addMobSpawner(par1, par2, par3 + 6, new ResourceLocation("CaveSpider"));
/* 191 */     addMobSpawner(par1, par2, par3 - 6, new ResourceLocation("CaveSpider"));
/* 192 */     addChestWithDefaultLoot(random, par1, par2, par3);
/* 193 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\DungeonGeneratorBarn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */