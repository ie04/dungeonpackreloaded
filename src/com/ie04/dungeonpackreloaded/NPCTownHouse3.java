/*     */ package de.stuuupiiid.dungeonpack;
/*     */ 
/*     */ import java.util.Random;
/*     */ 
/*     */ public class NPCTownHouse3
/*     */   extends NPCTownHouse1
/*     */ {
/*     */   public boolean generate(Random r, int par1, int par2, int par3)
/*     */   {
/*  10 */     spawnVillager(par1 - 4, par2, par3 - 4, 2, 1);
/*  11 */     spawnGolem(par1 - 2, par2, par3 - 2);
/*  12 */     par1 -= 4;
/*  13 */     par3 -= 4;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*  18 */     for (int v1 = -5; v1 < 6; v1++) {
/*  19 */       for (int v2 = -5; v2 < 6; v2++) {
/*  20 */         for (int v3 = 0; v3 < 10; v3++) {
/*  21 */           addAir(par1 + v2, par2 + v3, par3 + v1);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  26 */     addBlock(par1, par2, par3, 4);
/*  27 */     addBlock(par1, par2 + 1, par3, 117);
/*     */     
/*  29 */     for (int v1 = -4; v1 < 5; v1++) {
/*  30 */       addBlock(par1 + v1, par2, par3 + 4, 17);
/*  31 */       addBlock(par1 + v1, par2, par3 - 4, 17);
/*  32 */       addBlock(par1 + 4, par2, par3 + v1, 17);
/*  33 */       addBlock(par1 - 4, par2, par3 + v1, 17);
/*     */       
/*  35 */       for (int v2 = 1; v2 < 5; v2++) {
/*  36 */         addBlock(par1 + v1, par2 + v2, par3 + 4, 5);
/*  37 */         addBlock(par1 + v1, par2 + v2, par3 - 4, 5);
/*  38 */         addBlock(par1 + 4, par2 + v2, par3 + v1, 5);
/*  39 */         addBlock(par1 - 4, par2 + v2, par3 + v1, 5);
/*     */       }
/*     */       
/*  42 */       for (int v2 = -4; v2 < 5; v2++) {
/*  43 */         addBlock(par1 + v1, par2 - 1, par3 + v2, 4);
/*     */         
/*  45 */         for (int v3 = -5; v3 < -1; v3++) {
/*  46 */           if (isAir(par1 + v1, par2 + v3, par3 + v2)) {
/*  47 */             addBlock(par1 + v1, par2 + v3, par3 + v2, 4);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  53 */     for (int v1 = -5; v1 < 6; v1++) {
/*  54 */       for (int v2 = -5; v2 < 6; v2++) {
/*  55 */         addBlock(par1 + v1, par2 + 5, par3 + v2, 17);
/*     */       }
/*     */     }
/*     */     
/*  59 */     for (int v1 = -4; v1 < 5; v1++) {
/*  60 */       for (int v2 = -4; v2 < 5; v2++) {
/*  61 */         addBlock(par1 + v1, par2 + 6, par3 + v2, 17);
/*     */       }
/*     */     }
/*     */     
/*  65 */     for (int v1 = -3; v1 < 4; v1++) {
/*  66 */       for (int v2 = -3; v2 < 4; v2++) {
/*  67 */         addBlock(par1 + v1, par2 + 7, par3 + v2, 17);
/*     */       }
/*     */     }
/*     */     
/*  71 */     for (int v1 = -2; v1 < 3; v1++) {
/*  72 */       for (int v2 = -2; v2 < 3; v2++) {
/*  73 */         addBlock(par1 + v1, par2 + 8, par3 + v2, 17);
/*     */       }
/*     */     }
/*     */     
/*  77 */     for (int v1 = -1; v1 < 2; v1++) {
/*  78 */       for (int v2 = -1; v2 < 2; v2++) {
/*  79 */         addBlock(par1 + v1, par2 + 9, par3 + v2, 17);
/*     */       }
/*     */     }
/*     */     
/*  83 */     for (int v1 = -1; v1 < 2; v1++) {
/*  84 */       for (int v2 = 0; v2 < 3; v2++) {
/*  85 */         addAir(par1 + 4, par2 + v2, par3 + v1);
/*     */       }
/*     */     }
/*     */     
/*  89 */     for (int v1 = 0; v1 < 5; v1++) {
/*  90 */       for (int v2 = -2; v2 < 4; v2++) {
/*  91 */         addBlock(par1 - 3, par2 + v1, par3 + v2, 47);
/*  92 */         addBlock(par1 + v2, par2 + v1, par3 + 3, 47);
/*  93 */         addBlock(par1 + v2, par2 + v1, par3 - 3, 47);
/*     */       }
/*     */     }
/*     */     
/*  97 */     addChestWithMagicalLoot(r, par1, par2, par3);
/*  98 */     generateHouse(r, par1 + 7, par2, par3 + 9);
/*  99 */     generateHouse(r, par1 + 9, par2, par3 + 2);
/* 100 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\NPCTownHouse3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */