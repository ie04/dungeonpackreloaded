/*     */ package de.stuuupiiid.dungeonpack;
/*     */ 
/*     */ import java.util.Random;
/*     */ 
/*     */ public class NPCTownBaseWall
/*     */   extends NPCTownBase
/*     */ {
/*     */   public boolean generateSingleWallPartX(Random r, int par1, int par2, int par3)
/*     */   {
/*  10 */     par2 = getTop(par1, par3) - 1;
/*  11 */     if ((getBlock(par1, par2, par3) != 18) && (getBlock(par1, par2, par3) != 17) && (getBlock(par1, par2, par3) != 8) && (getBlock(par1, par2, par3) != 121)) {
/*  12 */       par2++;
/*     */       
/*     */ 
/*  15 */       for (int v1 = -4; v1 < 5; v1++) {
/*  16 */         for (int v2 = -1; v2 < 2; v2++) {
/*  17 */           addBlock(par1, par2 + v1, par3 + v2, 98);
/*     */         }
/*     */       }
/*     */       
/*  21 */       for (int v1 = -4; v1 < 6; v1++) {
/*  22 */         addBlock(par1, par2 + v1, par3 + 2, 98);
/*  23 */         addBlock(par1, par2 + v1, par3 - 2, 98);
/*     */       }
/*     */       
/*  26 */       addBlock(par1, par2 + 8, par3 + 2, 5);
/*  27 */       addBlock(par1, par2 + 8, par3 - 2, 5);
/*  28 */       addBlock(par1, par2 + 8, par3 + 1, 5);
/*  29 */       addBlock(par1, par2 + 8, par3 - 1, 5);
/*  30 */       addBlock(par1, par2 + 8, par3, 5);
/*  31 */       return true;
/*     */     }
/*  33 */     return false;
/*     */   }
/*     */   
/*     */   public boolean generateSingleWallPartZ(Random r, int par1, int par2, int par3)
/*     */   {
/*  38 */     par2 = getTop(par1, par3) - 1;
/*  39 */     if ((getBlock(par1, par2, par3) != 18) && (getBlock(par1, par2, par3) != 17) && (getBlock(par1, par2, par3) != 8) && (getBlock(par1, par2, par3) != 121)) {
/*  40 */       par2++;
/*     */       
/*     */ 
/*  43 */       for (int v1 = -4; v1 < 5; v1++) {
/*  44 */         for (int v2 = -1; v2 < 2; v2++) {
/*  45 */           addBlock(par1 + v2, par2 + v1, par3, 98);
/*     */         }
/*     */       }
/*     */       
/*  49 */       for (int v1 = -4; v1 < 6; v1++) {
/*  50 */         addBlock(par1 + 2, par2 + v1, par3, 98);
/*  51 */         addBlock(par1 - 2, par2 + v1, par3, 98);
/*     */       }
/*     */       
/*  54 */       addBlock(par1 + 2, par2 + 8, par3, 5);
/*  55 */       addBlock(par1 - 2, par2 + 8, par3, 5);
/*  56 */       addBlock(par1 + 1, par2 + 8, par3, 5);
/*  57 */       addBlock(par1 - 1, par2 + 8, par3, 5);
/*  58 */       addBlock(par1, par2 + 8, par3, 5);
/*  59 */       return true;
/*     */     }
/*  61 */     return false;
/*     */   }
/*     */   
/*     */   public boolean generateWallPartX(Random r, int par1, int par2, int par3)
/*     */   {
/*  66 */     for (int v1 = -4; v1 < 5; v1++) {
/*  67 */       generateSingleWallPartX(r, par1 + v1, par2, par3);
/*     */     }
/*     */     
/*  70 */     par2 = getTop(par1, par3);
/*  71 */     if (getBlock(par1, par2 - 4, par3 - 2) == 98) {
/*  72 */       addBlock(par1, par2 - 2, par3 + 2, 85);
/*  73 */       addBlock(par1, par2 - 2, par3 - 2, 85);
/*  74 */       addBlock(par1, par2 - 3, par3 + 2, 85);
/*  75 */       addBlock(par1, par2 - 3, par3 - 2, 85);
/*     */     }
/*     */     
/*  78 */     return true;
/*     */   }
/*     */   
/*     */   public boolean generateWallPartZ(Random r, int par1, int par2, int par3) {
/*  82 */     for (int v1 = -4; v1 < 5; v1++) {
/*  83 */       generateSingleWallPartZ(r, par1, par2, par3 + v1);
/*     */     }
/*     */     
/*  86 */     par2 = getTop(par1, par3);
/*  87 */     if (getBlock(par1 - 2, par2 - 4, par3) == 98) {
/*  88 */       addBlock(par1 + 2, par2 - 3, par3, 85);
/*  89 */       addBlock(par1 - 2, par2 - 3, par3, 85);
/*  90 */       addBlock(par1 + 2, par2 - 2, par3, 85);
/*  91 */       addBlock(par1 - 2, par2 - 2, par3, 85);
/*     */     }
/*     */     
/*  94 */     return true;
/*     */   }
/*     */   
/*     */   public boolean generateTower(Random r, int par1, int par2, int par3) {
/*  98 */     par2 = getTop(par1, par3) - 1;
/*  99 */     if ((getBlock(par1, par2, par3) != 18) && (getBlock(par1, par2, par3) != 17) && (getBlock(par1, par2, par3) != 8) && (getBlock(par1, par2, par3) != 121)) {
/* 100 */       par2++;
/*     */       
/*     */ 
/*     */ 
/* 104 */       for (int v1 = -3; v1 < 4; v1++) {
/* 105 */         for (int v2 = -3; v2 < 4; v2++) {
/* 106 */           for (int v11 = -4; v11 < 5; v11++) {
/* 107 */             addBlock(par1 + v1, par2 + v11, par3 + v2, 98);
/*     */           }
/*     */           
/* 110 */           addBlock(par1 + v1, par2 + 8, par3 + v2, 5);
/*     */         }
/*     */       }
/*     */       
/* 114 */       for (int v1 = -2; v1 < 3; v1++) {
/* 115 */         for (int v2 = -2; v2 < 3; v2++) {
/* 116 */           addBlock(par1 + v1, par2 + 9, par3 + v2, 5);
/*     */         }
/*     */       }
/*     */       
/* 120 */       for (int v1 = -1; v1 < 2; v1++) {
/* 121 */         for (int v2 = -1; v2 < 2; v2++) {
/* 122 */           addBlock(par1 + v1, par2 + 10, par3 + v2, 5);
/*     */         }
/*     */       }
/*     */       
/* 126 */       addBlock(par1 + 3, par2 + 5, par3 + 3, 98);
/* 127 */       addBlock(par1 + 3, par2 + 5, par3 + 2, 98);
/* 128 */       addBlock(par1 + 2, par2 + 5, par3 + 3, 98);
/* 129 */       addBlock(par1 - 3, par2 + 5, par3 + 3, 98);
/* 130 */       addBlock(par1 - 3, par2 + 5, par3 + 2, 98);
/* 131 */       addBlock(par1 - 2, par2 + 5, par3 + 3, 98);
/* 132 */       addBlock(par1 + 3, par2 + 5, par3 - 3, 98);
/* 133 */       addBlock(par1 + 3, par2 + 5, par3 - 2, 98);
/* 134 */       addBlock(par1 + 2, par2 + 5, par3 - 3, 98);
/* 135 */       addBlock(par1 - 3, par2 + 5, par3 - 3, 98);
/* 136 */       addBlock(par1 - 3, par2 + 5, par3 - 2, 98);
/* 137 */       addBlock(par1 - 2, par2 + 5, par3 - 3, 98);
/* 138 */       addBlock(par1 + 3, par2 + 6, par3 + 3, 85);
/* 139 */       addBlock(par1 + 3, par2 + 7, par3 + 3, 85);
/* 140 */       addBlock(par1 - 3, par2 + 6, par3 + 3, 85);
/* 141 */       addBlock(par1 - 3, par2 + 7, par3 + 3, 85);
/* 142 */       addBlock(par1 + 3, par2 + 6, par3 - 3, 85);
/* 143 */       addBlock(par1 + 3, par2 + 7, par3 - 3, 85);
/* 144 */       addBlock(par1 - 3, par2 + 6, par3 - 3, 85);
/* 145 */       addBlock(par1 - 3, par2 + 7, par3 - 3, 85);
/* 146 */       return true;
/*     */     }
/* 148 */     return false;
/*     */   }
/*     */   
/*     */   public boolean generateBigWallPartX(Random r, int par1, int par2, int par3)
/*     */   {
/* 153 */     generateTower(r, par1, par2, par3);
/* 154 */     generateWallPartX(r, par1 + 8, par2, par3);
/* 155 */     generateWallPartX(r, par1 - 8, par2, par3);
/* 156 */     generateWallPartX(r, par1 + 17, par2, par3);
/* 157 */     generateWallPartX(r, par1 - 17, par2, par3);
/* 158 */     return true;
/*     */   }
/*     */   
/*     */   public boolean generateBigWallPartZ(Random r, int par1, int par2, int par3) {
/* 162 */     generateTower(r, par1, par2, par3);
/* 163 */     generateWallPartZ(r, par1, par2, par3 + 8);
/* 164 */     generateWallPartZ(r, par1, par2, par3 - 8);
/* 165 */     generateWallPartZ(r, par1, par2, par3 + 17);
/* 166 */     generateWallPartZ(r, par1, par2, par3 - 17);
/* 167 */     return true;
/*     */   }
/*     */   
/*     */   public boolean generateWallX(Random r, int par1, int par2, int par3) {
/* 171 */     generateTower(r, par1, par2, par3);
/* 172 */     generateBigWallPartX(r, par1 + 25, par2, par3);
/* 173 */     generateBigWallPartX(r, par1 - 25, par2, par3);
/* 174 */     return true;
/*     */   }
/*     */   
/*     */   public boolean generateWallZ(Random r, int par1, int par2, int par3) {
/* 178 */     generateTower(r, par1, par2, par3);
/* 179 */     generateBigWallPartZ(r, par1, par2, par3 + 25);
/* 180 */     generateBigWallPartZ(r, par1, par2, par3 - 25);
/* 181 */     return true;
/*     */   }
/*     */   
/*     */   public boolean generateWay(Random r, int par1, int par2, int par3) {
/* 185 */     for (int v1 = -44; v1 < 45; v1++) {
/* 186 */       for (int v2 = -1; v2 < 2; v2++) {
/* 187 */         if ((getBlock(par1 + v1, getTop(par1 + v1, par3 + v2) - 1, par3 + v2) != 18) && (getBlock(par1 + v1, getTop(par1 + v1, par3 + v2) - 1, par3 + v2) != 8)) {
/* 188 */           addBlock(par1 + v1, getTop(par1 + v1, par3 + v2) - 1, par3 + v2, 13);
/*     */         }
/*     */         
/* 191 */         if ((getBlock(par1 + v1, getTop(par1 + v1, par3 + v2 + 25) - 1, par3 + v2 + 25) != 18) && (getBlock(par1 + v1, getTop(par1 + v1, par3 + v2 + 25) - 1, par3 + v2 + 25) != 8)) {
/* 192 */           addBlock(par1 + v1, getTop(par1 + v1, par3 + v2 + 25) - 1, par3 + v2 + 25, 13);
/*     */         }
/*     */         
/* 195 */         if ((getBlock(par1 + v1, getTop(par1 + v1, par3 + v2 - 25) - 1, par3 + v2 - 25) != 18) && (getBlock(par1 + v1, getTop(par1 + v1, par3 + v2 - 25) - 1, par3 + v2 - 25) != 8)) {
/* 196 */           addBlock(par1 + v1, getTop(par1 + v1, par3 + v2 - 25) - 1, par3 + v2 - 25, 13);
/*     */         }
/*     */         
/* 199 */         if ((getBlock(par1 + v2, getTop(par1 + v2, par3 + v1) - 1, par3 + v1) != 18) && (getBlock(par1 + v2, getTop(par1 + v2, par3 + v1) - 1, par3 + v1) != 8)) {
/* 200 */           addBlock(par1 + v2, getTop(par1 + v2, par3 + v1) - 1, par3 + v1, 13);
/*     */         }
/*     */         
/* 203 */         if ((getBlock(par1 + v2 + 25, getTop(par1 + v2 + 25, par3 + v1) - 1, par3 + v1) != 18) && (getBlock(par1 + v2 + 25, getTop(par1 + v2 + 25, par3 + v1) - 1, par3 + v1) != 8)) {
/* 204 */           addBlock(par1 + v2 + 25, getTop(par1 + v2 + 25, par3 + v1) - 1, par3 + v1, 13);
/*     */         }
/*     */         
/* 207 */         if ((getBlock(par1 + v2 - 25, getTop(par1 + v2 - 25, par3 + v1) - 1, par3 + v1) != 18) && (getBlock(par1 + v2 - 25, getTop(par1 + v2 - 25, par3 + v1) - 1, par3 + v1) != 8)) {
/* 208 */           addBlock(par1 + v2 - 25, getTop(par1 + v2 - 25, par3 + v1) - 1, par3 + v1, 13);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 213 */     return true;
/*     */   }
/*     */   
/*     */   public boolean generate(Random r, int par1, int par2, int par3) {
/* 217 */     generateWallX(r, par1, par2, par3 + 50);
/* 218 */     generateWallX(r, par1, par2, par3 - 50);
/* 219 */     generateWallZ(r, par1 + 50, par2, par3);
/* 220 */     generateWallZ(r, par1 - 50, par2, par3);
/* 221 */     generateTower(r, par1 + 50, par2, par3 + 50);
/* 222 */     generateTower(r, par1 - 50, par2, par3 + 50);
/* 223 */     generateTower(r, par1 + 50, par2, par3 - 50);
/* 224 */     generateTower(r, par1 - 50, par2, par3 - 50);
/* 225 */     generateWay(r, par1, par2, par3);
/* 226 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\NPCTownBaseWall.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */