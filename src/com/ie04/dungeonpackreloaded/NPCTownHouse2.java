/*    */ package de.stuuupiiid.dungeonpack;
/*    */ 
/*    */ import java.util.Random;
/*    */ 
/*    */ public class NPCTownHouse2
/*    */   extends NPCTownHouse1
/*    */ {
/*    */   public boolean generate(Random r, int par1, int par2, int par3)
/*    */   {
/* 10 */     spawnVillager(par1 - 2, par2, par3 - 2, 3, 0);
/* 11 */     spawnGolem(par1 - 2, par2, par3 - 2);
/* 12 */     par1 -= 3;
/* 13 */     par3 -= 3;
/*    */     
/*    */ 
/*    */ 
/*    */ 
/* 18 */     for (int loot = -5; loot < 6; loot++) {
/* 19 */       for (int v2 = -5; v2 < 6; v2++) {
/* 20 */         for (int v3 = 0; v3 < 10; v3++) {
/* 21 */           addAir(par1 + v2, par2 + v3, par3 + loot);
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 26 */     for (int loot = -4; loot < 5; loot++) {
/* 27 */       addBlock(par1 + loot, par2, par3 + 4, 17);
/* 28 */       addBlock(par1 + loot, par2, par3 - 4, 17);
/* 29 */       addBlock(par1 + 4, par2, par3 + loot, 17);
/* 30 */       addBlock(par1 - 4, par2, par3 + loot, 17);
/*    */       
/* 32 */       for (int v2 = 1; v2 < 5; v2++) {
/* 33 */         addBlock(par1 + loot, par2 + v2, par3 + 4, 5);
/* 34 */         addBlock(par1 + loot, par2 + v2, par3 - 4, 5);
/* 35 */         addBlock(par1 + 4, par2 + v2, par3 + loot, 5);
/* 36 */         addBlock(par1 - 4, par2 + v2, par3 + loot, 5);
/*    */       }
/*    */       
/* 39 */       for (int v2 = -4; v2 < 5; v2++) {
/* 40 */         addBlock(par1 + loot, par2 - 1, par3 + v2, 4);
/*    */         
/* 42 */         for (int v3 = -5; v3 < -1; v3++) {
/* 43 */           if (isAir(par1 + loot, par2 + v3, par3 + v2)) {
/* 44 */             addBlock(par1 + loot, par2 + v3, par3 + v2, 4);
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 50 */     for (int loot = -2; loot < 3; loot++) {
/* 51 */       addBlock(par1 - 4, par2 + 2, par3 + loot, 102);
/* 52 */       addBlock(par1 + loot, par2 + 2, par3 + 4, 102);
/* 53 */       addBlock(par1 + loot, par2 + 2, par3 - 4, 102);
/* 54 */       addBlock(par1 - 4, par2 + 3, par3 + loot, 102);
/* 55 */       addBlock(par1 + loot, par2 + 3, par3 + 4, 102);
/* 56 */       addBlock(par1 + loot, par2 + 3, par3 - 4, 102);
/*    */     }
/*    */     
/* 59 */     for (int loot = -5; loot < 6; loot++) {
/* 60 */       for (int v2 = -5; v2 < 6; v2++) {
/* 61 */         addBlock(par1 + loot, par2 + 5, par3 + v2, 17);
/*    */       }
/*    */     }
/*    */     
/* 65 */     for (int loot = -4; loot < 5; loot++) {
/* 66 */       for (int v2 = -4; v2 < 5; v2++) {
/* 67 */         addBlock(par1 + loot, par2 + 6, par3 + v2, 17);
/*    */       }
/*    */     }
/*    */     
/* 71 */     for (int loot = -3; loot < 4; loot++) {
/* 72 */       for (int v2 = -3; v2 < 4; v2++) {
/* 73 */         addBlock(par1 + loot, par2 + 7, par3 + v2, 17);
/*    */       }
/*    */     }
/*    */     
/* 77 */     for (int loot = -2; loot < 3; loot++) {
/* 78 */       for (int v2 = -2; v2 < 3; v2++) {
/* 79 */         addBlock(par1 + loot, par2 + 8, par3 + v2, 17);
/*    */       }
/*    */     }
/*    */     
/* 83 */     for (int loot = -1; loot < 2; loot++) {
/* 84 */       for (int v2 = -1; v2 < 2; v2++) {
/* 85 */         addBlock(par1 + loot, par2 + 9, par3 + v2, 17);
/*    */       }
/*    */     }
/*    */     
/* 89 */     for (int loot = -1; loot < 2; loot++) {
/* 90 */       for (int v2 = 0; v2 < 3; v2++) {
/* 91 */         addAir(par1 + 4, par2 + v2, par3 + loot);
/*    */       }
/*    */     }
/*    */     
/* 95 */     int[] var8 = { 297, 360, 260, 364, 320 };
/* 96 */     addChestWithCustomLoot(r, par1, par2, par3 + 3, var8, 8);
/* 97 */     addChestWithCustomLoot(r, par1, par2, par3 - 3, var8, 8);
/* 98 */     generateHouse(r, par1 + 6, par2, par3 + 6);
/* 99 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\NPCTownHouse2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */