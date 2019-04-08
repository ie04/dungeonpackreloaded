/*     */ package de.stuuupiiid.dungeonpack;
/*     */ 
/*     */ import java.util.Random;
/*     */ 
/*     */ public class NPCTownHouse1
/*     */   extends NPCTownBase
/*     */ {
/*     */   public boolean generate(Random r, int par1, int par2, int par3)
/*     */   {
/*  10 */     par2 = getTop(par1, par3);
/*  11 */     generateHouse(r, par1, par2, par3);
/*  12 */     generateHouse(r, par1 + 5, par2, par3 + 7);
/*  13 */     generateHouse(r, par1 + 6, par2, par3 + 2);
/*  14 */     generateHouse(r, par1 + 1, par2, par3 - 4);
/*  15 */     generateHouse(r, par1 - 8, par2, par3 - 3);
/*  16 */     generateHouse(r, par1 - 5, par2, par3 + 2);
/*  17 */     generateHouse(r, par1 + 4, par2, par3 - 9);
/*  18 */     spawnVillager(par1 + 10, getTop(par1 + 10, par3 + 10), par3 + 10, 7, 0);
/*  19 */     spawnGolem(par1 + 10, getTop(par1 + 10, par3 + 10), par3 + 10);
/*  20 */     spawnGolem(par1 + 10, getTop(par1 + 10, par3 + 10), par3 + 10);
/*  21 */     return true;
/*     */   }
/*     */   
/*     */   public boolean generateHouse(Random r, int par1, int par2, int par3) {
/*  25 */     par2 = getTop(par1, par3);
/*  26 */     if ((getBlock(par1, par2 - 1, par3) != 8) && (getBlock(par1 + 3, getTop(par1 + 3, par3 + 3) - 1, par3 + 3) != 8) && (getBlock(par1 + 3, getTop(par1 + 3, par3) - 1, par3) != 8) && (getBlock(par1, getTop(par1, par3 + 3) - 1, par3 + 3) != 8))
/*     */     {
/*     */ 
/*  29 */       for (int v1 = 0; v1 < 4; v1++) {
/*  30 */         for (int v2 = 0; v2 < 4; v2++) {
/*  31 */           addBlock(par1 + v1, par2 - 1, par3 + v2, 5);
/*     */           
/*     */ 
/*  34 */           for (int v3 = 0; v3 < 10; v3++) {
/*  35 */             addAir(par1 + v1, par2 + v3, par3 + v2);
/*     */           }
/*     */           
/*  38 */           for (int v3 = -5; v3 < 0; v3++) {
/*  39 */             if (isAir(par1 + v1, par2 + v3, par3 + v2)) {
/*  40 */               addBlock(par1 + v1, par2 + v3, par3 + v2, 5);
/*     */             }
/*     */             
/*  43 */             if (isAir(par1, par2 + v3, par3)) {
/*  44 */               addBlock(par1, par2 + v3, par3, 17);
/*     */             }
/*     */             
/*  47 */             if (isAir(par1 + 3, par2 + v3, par3)) {
/*  48 */               addBlock(par1 + 3, par2 + v3, par3, 17);
/*     */             }
/*     */             
/*  51 */             if (isAir(par1, par2 + v3, par3 + 3)) {
/*  52 */               addBlock(par1, par2 + v3, par3 + 3, 17);
/*     */             }
/*     */             
/*  55 */             if (isAir(par1 + 3, par2 + v3, par3 + 3)) {
/*  56 */               addBlock(par1 + 3, par2 + v3, par3 + 3, 17);
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*  62 */       addBlock(par1 + 3, par2 - 1, par3 + 3, 17);
/*  63 */       addBlock(par1 + 3, par2 - 1, par3, 17);
/*  64 */       addBlock(par1, par2 - 1, par3 + 3, 17);
/*  65 */       addBlock(par1, par2 - 1, par3, 17);
/*     */       
/*  67 */       for (int v1 = 0; v1 < 5; v1++) {
/*  68 */         addBlock(par1, par2 + v1, par3, 17);
/*  69 */         addBlock(par1 + 3, par2 + v1, par3, 17);
/*  70 */         addBlock(par1, par2 + v1, par3 + 3, 17);
/*  71 */         addBlock(par1 + 3, par2 + v1, par3 + 3, 17);
/*     */         
/*  73 */         for (int v2 = 1; v2 < 3; v2++) {
/*  74 */           addBlock(par1 + v2, par2 + v1, par3, 5);
/*  75 */           addBlock(par1, par2 + v1, par3 + v2, 5);
/*  76 */           addBlock(par1 + v2, par2 + v1, par3 + 3, 5);
/*  77 */           addBlock(par1 + 3, par2 + v1, par3 + v2, 5);
/*     */         }
/*     */       }
/*     */       
/*  81 */       addBlock(par1 + 1, par2 + 4, par3 + 1, 20);
/*  82 */       addBlock(par1 + 1, par2 + 4, par3 + 2, 20);
/*  83 */       addBlock(par1 + 2, par2 + 4, par3 + 1, 20);
/*  84 */       addBlock(par1 + 2, par2 + 4, par3 + 2, 20);
/*  85 */       addAir(par1, par2, par3 + 1);
/*  86 */       addAir(par1, par2 + 1, par3 + 1);
/*     */       
/*  88 */       for (int v1 = 0; v1 < 10; v1++) {
/*  89 */         addAir(par1 - 1, par2 + v1, par3 + 1);
/*     */       }
/*     */       
/*  92 */       addChestWithCustomLoot(r, par1 + 2, par2, par3 + 2, loot(r), 1);
/*  93 */       return true;
/*     */     }
/*  95 */     return false;
/*     */   }
/*     */   
/*     */   private int loot(Random r)
/*     */   {
/* 100 */     int v1 = r.nextInt(5);
/* 101 */     return v1 == 3 ? 4 : v1 == 2 ? 3 : v1 == 1 ? 265 : v1 == 0 ? 297 : (v1 == 4 ? Integer.valueOf(17) : null).intValue();
/*     */   }
/*     */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\NPCTownHouse1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */