/*    */ package de.stuuupiiid.dungeonpack;
/*    */ 
/*    */ import java.util.Random;
/*    */ 
/*    */ public class NPCFlyField
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
/*    */     }
/*    */     
/* 20 */     for (int v1 = -3; v1 < 4; v1++) {
/* 21 */       for (int v2 = -3; v2 < 4; v2++) {
/* 22 */         addBlock(par1 + v1, par2, par3 + v2, 60);
/* 23 */         addBlock(par1 + v1, par2 + 1, par3 + v2, 59);
/*    */       }
/*    */     }
/*    */     
/* 27 */     addBlock(par1, par2, par3, 8);
/* 28 */     addAir(par1, par2 + 1, par3);
/* 29 */     spawnVillager(par1, par2, par3, 2, 0);
/* 30 */     spawnGolem(par1, par2, par3);
/* 31 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\NPCFlyField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */