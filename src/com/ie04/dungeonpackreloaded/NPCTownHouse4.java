/*    */ package de.stuuupiiid.dungeonpack;
/*    */ 
/*    */ import java.util.Random;
/*    */ 
/*    */ public class NPCTownHouse4
/*    */   extends NPCTownHouse1
/*    */ {
/*    */   public boolean generate(Random r, int par1, int par2, int par3)
/*    */   {
/* 10 */     par1 -= 4;
/* 11 */     par3 -= 4;
/* 12 */     par2 = getTop(par1, par3);
/* 13 */     spawnVillager(par1, par2, par3, 2, 3);
/* 14 */     spawnGolem(par1, par2, par3);
/*    */     
/*    */ 
/*    */ 
/*    */ 
/* 19 */     for (int v1 = -3; v1 < 3; v1++) {
/* 20 */       for (int v2 = -3; v2 < 4; v2++) {
/* 21 */         for (int v3 = 0; v3 < 4; v3++) {
/* 22 */           addBlock(par1 + v1, par2 + v3, par3 + v2, 98);
/*    */         }
/*    */         
/* 25 */         addBlock(par1 + v1, par2 - 1, par3 + v2, 98);
/*    */         
/* 27 */         for (int v3 = -8; v3 < -1; v3++) {
/* 28 */           if (isAir(par1 + v1, par2 + v3, par3 + v2)) {
/* 29 */             addBlock(par1 + v1, par2 + v3, par3 + v2, 98);
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 35 */     for (int v1 = -2; v1 < 3; v1++) {
/* 36 */       for (int v2 = -2; v2 < 3; v2++) {
/* 37 */         for (int v3 = 0; v3 < 3; v3++) {
/* 38 */           addAir(par1 + v1, par2 + v3, par3 + v2);
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 43 */     for (int v1 = 1; v1 < 3; v1++) {
/* 44 */       for (int v2 = -3; v2 < 4; v2++) {
/* 45 */         for (int v3 = 0; v3 < 4; v3++) {
/* 46 */           addAir(par1 + v1, par2 + v3, par3 + v2);
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 51 */     for (int v1 = -2; v1 < 3; v1++) {
/* 52 */       addBlock(par1 - 2, par2, par3 + v1, 61);
/* 53 */       getTileEntity(par1 - 4, par2, par3 + v1);
/*    */     }
/*    */     
/* 56 */     addBlock(par1 - 2, par2 + 1, par3, 58);
/* 57 */     addChestWithDefaultLoot(r, par1 - 2, par2 + 1, par3 + 2);
/* 58 */     addChestWithDefaultLoot(r, par1 - 2, par2 + 1, par3 + 1);
/* 59 */     addChestWithDefaultLoot(r, par1 - 2, par2 + 1, par3 - 1);
/* 60 */     addChestWithDefaultLoot(r, par1 - 2, par2 + 1, par3 - 2);
/* 61 */     addBlock(par1 + 1, par2, par3 + 3, 85);
/* 62 */     addBlock(par1 + 1, par2, par3 - 3, 85);
/* 63 */     addBlock(par1 + 2, par2, par3 + 3, 85);
/* 64 */     addBlock(par1 + 2, par2, par3 - 3, 85);
/* 65 */     addBlock(par1 + 2, par2, par3 + 2, 85);
/* 66 */     addBlock(par1 + 2, par2, par3 - 2, 85);
/* 67 */     par1 += 4;
/* 68 */     par3 += 4;
/* 69 */     generateHouse(r, par1 + 6, par2, par3 + 7);
/* 70 */     generateHouse(r, par1 + 4, par2, par3 + 1);
/* 71 */     generateHouse(r, par1 + 6, par2, par3 - 5);
/* 72 */     generateHouse(r, par1 + 1, par2, par3 + 6);
/* 73 */     generateHouse(r, par1 + 2, par2, par3 - 9);
/* 74 */     generateHouse(r, par1 - 3, par2, par3 + 1);
/* 75 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\NPCTownHouse4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */