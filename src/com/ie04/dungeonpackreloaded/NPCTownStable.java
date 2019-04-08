/*    */ package de.stuuupiiid.dungeonpack;
/*    */ 
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class NPCTownStable
/*    */   extends NPCTownBase
/*    */ {
/*    */   public boolean generate(Random r, int par1, int par2, int par3)
/*    */   {
/* 13 */     for (int v1 = -7; v1 < 8; v1++) {
/* 14 */       for (int v2 = -7; v2 < 8; v2++) {
/* 15 */         for (int v3 = 0; v3 < 10; v3++) {
/* 16 */           addAir(par1 + v1, par2 + v3, par3 + v2);
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 21 */     for (int v1 = -7; v1 < 8; v1++) {
/* 22 */       for (int v2 = -7; v2 < 8; v2++) {
/* 23 */         for (int v3 = -8; v3 < 0; v3++) {
/* 24 */           if ((isAir(par1 + v1, par2 + v3, par3 + v2)) || (getBlock(par1 + v1, par2 + v3, par3 + v2) == 8) || (getBlock(par1 + v1, par2 + v3, par3 + v2) == 9) || (getBlock(par1 + v1, par2 + v3, par3 + v2) == 31)) {
/* 25 */             addBlock(par1 + v1, par2 + v3, par3 + v2, 3);
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 31 */     for (int v1 = -7; v1 < 8; v1++) {
/* 32 */       addBlock(par1 + v1, par2, par3 + 7, 85);
/* 33 */       addBlock(par1 + v1, par2, par3 - 7, 85);
/* 34 */       addBlock(par1 + 7, par2, par3 + v1, 85);
/* 35 */       addBlock(par1 - 7, par2, par3 + v1, 85);
/*    */     }
/*    */     
/* 38 */     for (int v1 = 0; v1 < 18; v1++) {
/* 39 */       spawnCow(par1, par2, par3);
/* 40 */       spawnPig(par1, par2, par3);
/*    */     }
/*    */     
/* 43 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\NPCTownStable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */