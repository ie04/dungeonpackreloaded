/*    */ package de.stuuupiiid.dungeonpack;
/*    */ 
/*    */ import java.util.Random;
/*    */ 
/*    */ public class NPCFlyHouse2
/*    */   extends NPCFlyBase
/*    */ {
/*    */   public boolean generate(Random r, int par1, int par2, int par3)
/*    */   {
/* 10 */     ebene13(r, par1, par2 - 1, par3, 121);
/*    */     
/*    */ 
/*    */ 
/* 14 */     for (int v1 = -4; v1 < 5; v1++) {
/* 15 */       for (int v2 = -4; v2 < 5; v2++) {
/* 16 */         addBlock(par1 + v1, par2 + 6, par3 + v2, 121);
/*    */       }
/*    */     }
/*    */     
/* 20 */     for (int v1 = 0; v1 < 8; v1++) {
/* 21 */       for (int v2 = -3; v2 < 4; v2++) {
/* 22 */         addBlock(par1 + 4, par2 + v1, par3 + v2, 121);
/* 23 */         addBlock(par1 - 4, par2 + v1, par3 + v2, 121);
/* 24 */         addBlock(par1 + v2, par2 + v1, par3 + 4, 121);
/* 25 */         addBlock(par1 + v2, par2 + v1, par3 - 4, 121);
/*    */       }
/*    */       
/* 28 */       addBlock(par1 + 4, par2 + v1, par3 + 4, 49);
/* 29 */       addBlock(par1 - 4, par2 + v1, par3 + 4, 49);
/* 30 */       addBlock(par1 + 4, par2 + v1, par3 - 4, 49);
/* 31 */       addBlock(par1 - 4, par2 + v1, par3 - 4, 49);
/*    */     }
/*    */     
/* 34 */     for (int v1 = 0; v1 < 2; v1++) {
/* 35 */       addAir(par1 + 4, par2 + v1, par3);
/* 36 */       addAir(par1 - 4, par2 + v1, par3);
/* 37 */       addAir(par1, par2 + v1, par3 + 4);
/* 38 */       addAir(par1, par2 + v1, par3 - 4);
/*    */     }
/*    */     
/* 41 */     for (int v1 = -1; v1 < 2; v1++) {
/* 42 */       addAir(par1 + 4, par2 + 5, par3 + v1);
/* 43 */       addAir(par1 - 4, par2 + 5, par3 + v1);
/* 44 */       addAir(par1 + v1, par2 + 5, par3 + 4);
/* 45 */       addAir(par1 + v1, par2 + 5, par3 - 4);
/*    */     }
/*    */     
/* 48 */     if (r.nextInt(5) == 0) {
/* 49 */       addBlock(par1, par2, par3, 41);
/*    */     } else {
/* 51 */       addChestWithDefaultLoot(r, par1, par2, par3);
/*    */     }
/*    */     
/* 54 */     spawnVillager(par1, par2, par3, 3, 0);
/* 55 */     spawnGolem(par1, par2, par3);
/* 56 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\NPCFlyHouse2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */