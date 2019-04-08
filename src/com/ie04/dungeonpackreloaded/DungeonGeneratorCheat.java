/*    */ package de.stuuupiiid.dungeonpack;
/*    */ 
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ public class DungeonGeneratorCheat
/*    */   extends DungeonGenerator
/*    */ {
/*    */   public boolean generate(Random random, int par1, int par2, int par3)
/*    */   {
/* 11 */     if (!DungeonPack.instance.cheat) {
/* 12 */       return false;
/*    */     }
/* 14 */     for (int v1 = 4; v1 < 256; v1++)
/*    */     {
/* 16 */       if (isAir(par1, v1, par3))
/*    */       {
/* 18 */         addBlock(par1, v1, par3, 20);
/*    */       }
/*    */     }
/*    */     
/* 22 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\DungeonGeneratorCheat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */