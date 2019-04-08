/*    */ package de.stuuupiiid.dungeonpack;
/*    */ 
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class NPCTownBase
/*    */   extends DungeonGenerator
/*    */ {
/*    */   public boolean generate(Random r, int par1, int par2, int par3)
/*    */   {
/* 17 */     NPCTownBaseWall walls = new NPCTownBaseWall();
/* 18 */     walls.generate(r, par1, par2, par3);
/* 19 */     generatePart(r, par1 + 13, par2, par3 + 13);
/* 20 */     generatePart(r, par1 - 13, par2, par3 + 13);
/* 21 */     generatePart(r, par1 + 13, par2, par3 - 13);
/* 22 */     generatePart(r, par1 - 13, par2, par3 - 13);
/* 23 */     generatePart(r, par1 + 38, par2, par3 + 13);
/* 24 */     generatePart(r, par1 - 38, par2, par3 + 13);
/* 25 */     generatePart(r, par1 + 38, par2, par3 - 13);
/* 26 */     generatePart(r, par1 - 38, par2, par3 - 13);
/* 27 */     generatePart(r, par1 + 13, par2, par3 + 38);
/* 28 */     generatePart(r, par1 - 13, par2, par3 + 38);
/* 29 */     generatePart(r, par1 + 13, par2, par3 - 38);
/* 30 */     generatePart(r, par1 - 13, par2, par3 - 38);
/* 31 */     generatePart(r, par1 + 38, par2, par3 + 38);
/* 32 */     generatePart(r, par1 - 38, par2, par3 + 38);
/* 33 */     generatePart(r, par1 + 38, par2, par3 - 38);
/* 34 */     generatePart(r, par1 - 38, par2, par3 - 38);
/* 35 */     return false;
/*    */   }
/*    */   
/*    */   public boolean generatePart(Random r, int par1, int par2, int par3) {
/* 39 */     int y = getTop(par1, par3);
/* 40 */     if ((getBlock(par1, y - 1, par3) != 17) && (getBlock(par1, y - 1, par3) != 121) && (getBlock(par1, y - 1, par3) != 18) && (getBlock(par1, y - 1, par3) != 8)) {
/* 41 */       choosePart(r).generate(r, par1, par2, par3);
/*    */     }
/*    */     
/* 44 */     return true;
/*    */   }
/*    */   
/*    */   public NPCTownBase choosePart(Random r) {
/* 48 */     int v1 = r.nextInt(6);
/* 49 */     return r.nextInt(3) == 0 ? new NPCTownStable() : (v1 != 0) && (v1 != 4) ? new NPCTownHouse4() : v1 == 3 ? new NPCTownHouse3() : v1 == 2 ? new NPCTownHouse2() : v1 == 1 ? new NPCTownHouse1() : new NPCTownPlant();
/*    */   }
/*    */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\NPCTownBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */