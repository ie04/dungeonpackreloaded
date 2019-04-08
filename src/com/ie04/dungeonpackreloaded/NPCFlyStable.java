/*    */ package de.stuuupiiid.dungeonpack;
/*    */ 
/*    */ import java.util.Random;
/*    */ 
/*    */ public class NPCFlyStable
/*    */   extends NPCFlyBase
/*    */ {
/*    */   public boolean generate(Random r, int par1, int par2, int par3)
/*    */   {
/* 10 */     ebene13(r, par1, par2 - 1, par3, 121);
/*    */     
/*    */ 
/* 13 */     for (int v1 = -4; v1 < 5; v1++) {
/* 14 */       addBlock(par1 + v1, par2, par3 + 4, 121);
/* 15 */       addBlock(par1 + v1, par2, par3 - 4, 121);
/* 16 */       addBlock(par1 + 4, par2, par3 + v1, 121);
/* 17 */       addBlock(par1 - 4, par2, par3 + v1, 121);
/* 18 */       addBlock(par1 + v1, par2 + 1, par3 + 4, 85);
/* 19 */       addBlock(par1 + v1, par2 + 1, par3 - 4, 85);
/* 20 */       addBlock(par1 + 4, par2 + 1, par3 + v1, 85);
/* 21 */       addBlock(par1 - 4, par2 + 1, par3 + v1, 85);
/*    */     }
/*    */     
/* 24 */     for (int v1 = 0; v1 < 2; v1++) {
/* 25 */       spawnCow(par1, par2, par3);
/* 26 */       spawnPig(par1, par2, par3);
/* 27 */       spawnSheep(par1, par2, par3);
/*    */     }
/*    */     
/* 30 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\NPCFlyStable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */