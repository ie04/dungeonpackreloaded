/*    */ package de.stuuupiiid.dungeonpack;
/*    */ 
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ public class DungeonGeneratorHelpShip
/*    */   extends DungeonGenerator
/*    */ {
/*    */   public boolean generate(Random random, int par1, int par2, int par3)
/*    */   {
/* 11 */     for (int data = -1; data < 4; data++) {
/* 12 */       addBlock(par1 + data, par2 - 1, par3, 5);
/* 13 */       addBlock(par1 + data, par2 - 1, par3 + 1, 5);
/*    */     }
/*    */     
/* 16 */     addBlock(par1 + 1, par2, par3, 85);
/* 17 */     int data = random.nextInt(15);
/*    */     
/* 19 */     for (int list = 1; list < 4; list++) {
/* 20 */       addBlockAndMetadata(par1 + 1, par2 + list, par3, 35, data);
/* 21 */       addBlockAndMetadata(par1 + 1, par2 + list, par3 - 1, 35, data);
/*    */     }
/*    */     
/* 24 */     addBlock(par1, par2, par3, 91);
/* 25 */     int[] var7 = { 297 };
/* 26 */     addChestWithCustomLoot(random, par1 + 2, par2, par3, var7, 8);
/* 27 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\DungeonGeneratorHelpShip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */