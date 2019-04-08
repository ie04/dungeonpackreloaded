/*     */ package de.stuuupiiid.dungeonpack;
/*     */ 
/*     */ import java.util.Random;

import net.minecraft.util.ResourceLocation;
/*     */ 
/*     */ 
/*     */ public class DungeonGeneratorPrison
/*     */   extends DungeonGenerator
/*     */ {
/*     */   public int corner;
/*     */   public int side;
/*     */   public int window;
/*     */   
/*     */   public DungeonGeneratorPrison(int cor, int sid, int win)
/*     */   {
/*  15 */     this.corner = cor;
/*  16 */     this.side = sid;
/*  17 */     this.window = win;
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean generate(Random random, int par1, int par2, int par3)
/*     */   {
/*     */     
/*     */     
/*  25 */     for (int v1 = -5; v1 < 6; v1++) {
/*  26 */       for (int v2 = -5; v2 < 6; v2++) {
/*  27 */         for (int block = 0; block < 8; block++) {
/*  28 */           addAir(par1 + v1, par2 + block, par3 + v2);
/*     */         }
/*     */         
/*  31 */         byte var8 = 4;
/*  32 */         if (random.nextInt(3) == 0) {
/*  33 */           var8 = 48;
/*     */         }
/*     */         
/*  36 */         addBlock(par1 + v1, par2 - 1, par3 + v2, var8);
/*     */       }
/*     */     }
/*     */     
/*  40 */     for (int v1 = -4; v1 < 5; v1++) {
/*  41 */       for (int v2 = 0; v2 < 6; v2++) {
/*  42 */         addBlock(par1 + v1, par2 + v2, par3 + 5, this.side);
/*  43 */         addBlock(par1 + v1, par2 + v2, par3 - 5, this.side);
/*  44 */         addBlock(par1 + 5, par2 + v2, par3 + v1, this.side);
/*  45 */         addBlock(par1 - 5, par2 + v2, par3 + v1, this.side);
/*     */       }
/*     */     }
/*     */     
/*  49 */     for (int v1 = 0; v1 < 8; v1++) {
/*  50 */       addBlock(par1 + 5, par2 + v1, par3 + 5, this.corner);
/*  51 */       addBlock(par1 - 5, par2 + v1, par3 - 5, this.corner);
/*  52 */       addBlock(par1 + 5, par2 + v1, par3 - 5, this.corner);
/*  53 */       addBlock(par1 - 5, par2 + v1, par3 + 5, this.corner);
/*     */     }
/*     */     
/*  56 */     for (int v1 = -3; v1 < 4; v1++) {
/*  57 */       addBlock(par1 + v1, par2 + 6, par3 + 5, this.corner);
/*  58 */       addBlock(par1 + v1, par2 + 6, par3 - 5, this.corner);
/*  59 */       addBlock(par1 + 5, par2 + 6, par3 + v1, this.corner);
/*  60 */       addBlock(par1 - 5, par2 + 6, par3 + v1, this.corner);
/*  61 */       v1++;
/*     */     }
/*     */     
/*  64 */     for (int v1 = 0; v1 < 2; v1++) {
/*  65 */       addBlock(par1 + v1 + 3, par2, par3 + 5, this.corner);
/*  66 */       addBlock(par1 + v1 - 4, par2, par3 + 5, this.corner);
/*  67 */       addBlock(par1 + v1 + 3, par2, par3 - 5, this.corner);
/*  68 */       addBlock(par1 + v1 - 4, par2, par3 - 5, this.corner);
/*  69 */       addBlock(par1 + 5, par2, par3 + 3 + v1, this.corner);
/*  70 */       addBlock(par1 + 5, par2, par3 - 4 + v1, this.corner);
/*  71 */       addBlock(par1 - 5, par2, par3 + 3 + v1, this.corner);
/*  72 */       addBlock(par1 - 5, par2, par3 - 4 + v1, this.corner);
/*     */     }
/*     */     
/*  75 */     addBlock(par1 + 5, par2 + 1, par3 + 4, this.corner);
/*  76 */     addBlock(par1 + 5, par2 + 1, par3 - 4, this.corner);
/*  77 */     addBlock(par1 - 5, par2 + 1, par3 + 4, this.corner);
/*  78 */     addBlock(par1 - 5, par2 + 1, par3 - 4, this.corner);
/*  79 */     addBlock(par1 + 4, par2 + 1, par3 + 5, this.corner);
/*  80 */     addBlock(par1 - 4, par2 + 1, par3 + 5, this.corner);
/*  81 */     addBlock(par1 + 4, par2 + 1, par3 - 5, this.corner);
/*  82 */     addBlock(par1 - 4, par2 + 1, par3 - 5, this.corner);
/*     */     
/*  84 */     for (int v1 = -1; v1 < 2; v1++) {
/*  85 */       addBlock(par1 + 2 + v1, par2 + 3, par3 + 5, this.window);
/*  86 */       addBlock(par1 + 2 + v1, par2 + 3, par3 - 5, this.window);
/*  87 */       addBlock(par1 + 2, par2 + 3 + v1, par3 + 5, this.window);
/*  88 */       addBlock(par1 + 2, par2 + 3 + v1, par3 - 5, this.window);
/*     */       
/*  90 */       for (int v2 = 0; v2 < 3; v2++) {
/*  91 */         addBlock(par1 + 5, par2 + v2, par3 + v1, this.window);
/*     */       }
/*     */     }
/*     */     
/*  95 */     for (int v1 = -4; v1 < 5; v1++) {
/*  96 */       addBlock(par1 - 4, par2 + 3, par3 + v1, this.side);
/*  97 */       addBlock(par1 - 3, par2 + 3, par3 + v1, this.side);
/*     */     }
/*     */     
/* 100 */     for (int v1 = -1; v1 < 2; v1++) {
/* 101 */       addBlock(par1 - 2, par2 + 3, par3 + v1 + 3, this.side);
/* 102 */       addBlock(par1 - 2, par2 + 3, par3 + v1 - 3, this.side);
/* 103 */       addBlock(par1 - 1 + v1, par2 + 3, par3 + 4, this.side);
/* 104 */       addBlock(par1 - 1 + v1, par2 + 3, par3 - 4, this.side);
/*     */     }
/*     */     
/* 107 */     addBlock(par1 - 1, par2 + 3, par3 + 3, this.side);
/* 108 */     addBlock(par1 - 1, par2 + 3, par3 - 3, this.side);
/* 109 */     addMobSpawner(par1 - 3, par2, par3 + 3, new ResourceLocation("Zombie"));
/* 110 */     addMobSpawner(par1 - 3, par2, par3 - 3, new ResourceLocation("Zombie"));
/* 111 */     addChestWithDefaultLoot(random, par1 - 4, par2 + 4, par3);
/* 112 */     addBlock(par1 - 4, par2, par3, 54);
/* 113 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\DungeonGeneratorPrison.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */