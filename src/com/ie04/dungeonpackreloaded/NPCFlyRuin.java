/*    */ package de.stuuupiiid.dungeonpack;
/*    */ 
/*    */ import java.util.Random;
/*    */ 
/*    */ public class NPCFlyRuin
/*    */   extends NPCFlyBase
/*    */ {
/*    */   public boolean generate(Random r, int par1, int par2, int par3)
/*    */   {
/* 10 */     ebene11(r, par1, par2 - 1, par3, 121);
/* 11 */     int random = 4 + r.nextInt(3);
/*    */     
/*    */ 
/* 14 */     for (int v1 = 0; v1 < random; v1++) {
/* 15 */       addBlock(par1 + 3, par2 + v1, par3 + 3, 121);
/* 16 */       addBlock(par1 - 3, par2 + v1, par3 + 3, 121);
/* 17 */       addBlock(par1 + 3, par2 + v1, par3 - 3, 121);
/* 18 */       addBlock(par1 - 3, par2 + v1, par3 - 3, 121);
/* 19 */       addBlock(par1 + 3, par2 + v1, par3, 121);
/* 20 */       addBlock(par1 - 3, par2 + v1, par3, 121);
/* 21 */       addBlock(par1, par2 + v1, par3 + 3, 121);
/* 22 */       addBlock(par1, par2 + v1, par3 - 3, 121);
/* 23 */       addBlock(par1, par2 + v1, par3, 121);
/*    */     }
/*    */     
/* 26 */     for (int v1 = -4; v1 < 5; v1++) {
/* 27 */       for (int v2 = -4; v2 < 5; v2++) {
/* 28 */         addBlock(par1 + v2, par2 + random, par3 + v1, 121);
/*    */       }
/*    */     }
/*    */     
/* 32 */     random--;
/* 33 */     if (r.nextBoolean()) {
/* 34 */       for (int v1 = -4; v1 < 5; v1++) {
/* 35 */         addBlock(par1 + 4, par2 + random + 1, par3 + v1, 121);
/* 36 */         addBlock(par1 + 3, par2 + random + 2, par3 + v1, 121);
/* 37 */         addBlock(par1 + 2, par2 + random + 3, par3 + v1, 121);
/* 38 */         addBlock(par1 + 1, par2 + random + 4, par3 + v1, 121);
/* 39 */         addBlock(par1 - 4, par2 + random + 1, par3 + v1, 121);
/* 40 */         addBlock(par1 - 3, par2 + random + 2, par3 + v1, 121);
/* 41 */         addBlock(par1 - 2, par2 + random + 3, par3 + v1, 121);
/* 42 */         addBlock(par1 - 1, par2 + random + 4, par3 + v1, 121);
/* 43 */         addBlock(par1, par2 + random + 5, par3 + v1, 121);
/*    */       }
/*    */     }
/* 46 */     for (int v1 = -4; v1 < 5; v1++) {
/* 47 */       addBlock(par1 + v1, par2 + random + 1, par3 + 4, 121);
/* 48 */       addBlock(par1 + v1, par2 + random + 2, par3 + 3, 121);
/* 49 */       addBlock(par1 + v1, par2 + random + 3, par3 + 2, 121);
/* 50 */       addBlock(par1 + v1, par2 + random + 4, par3 + 1, 121);
/* 51 */       addBlock(par1 + v1, par2 + random + 1, par3 - 4, 121);
/* 52 */       addBlock(par1 + v1, par2 + random + 2, par3 - 3, 121);
/* 53 */       addBlock(par1 + v1, par2 + random + 3, par3 - 2, 121);
/* 54 */       addBlock(par1 + v1, par2 + random + 4, par3 - 1, 121);
/* 55 */       addBlock(par1 + v1, par2 + random + 5, par3, 121);
/*    */     }
/*    */     
/*    */ 
/* 59 */     spawnVillager(par1, par2, par3, 1, 2);
/* 60 */     spawnGolem(par1, par2, par3);
/* 61 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\NPCFlyRuin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */