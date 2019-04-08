/*    */ package de.stuuupiiid.dungeonpack;
/*    */ 
/*    */ import java.util.Random;
/*    */ 
/*    */ public class NPCTownPlant
/*    */   extends NPCTownBase
/*    */ {
/*    */   public boolean generate(Random r, int par1, int par2, int par3)
/*    */   {
/* 10 */     generatePlant(r, par1 + 5, par2, par3 + 5);
/* 11 */     generatePlant(r, par1 - 5, par2, par3 - 5);
/* 12 */     generatePlant(r, par1 + 5, par2, par3 - 5);
/* 13 */     generatePlant(r, par1 - 5, par2, par3 + 5);
/* 14 */     spawnVillager(par1, par2 + 2, par3, 3, 0);
/* 15 */     spawnGolem(par1, par2 + 2, par3);
/* 16 */     return true;
/*    */   }
/*    */   
/*    */   public boolean generatePlant(Random r, int par1, int par2, int par3) {
/* 20 */     for (int v1 = -4; v1 < 5; v1++) {
/* 21 */       for (int v2 = -4; v2 < 5; v2++) {
/* 22 */         addBlock(par1 + v1, par2, par3 + v2, 60);
/* 23 */         addBlock(par1 + v1, par2 - 1, par3 + v2, 17);
/* 24 */         addBlockAndMetadata(par1 + v1, par2 + 1, par3 + v2, 59, r.nextInt(3) + 4);
/*    */         
/*    */ 
/* 27 */         for (int v3 = -7; v3 < -1; v3++) {
/* 28 */           if (isAir(par1 + v1, par2 + v3, par3 + v2)) {
/* 29 */             addBlock(par1 + v1, par2 + v3, par3 + v2, 17);
/*    */           }
/*    */         }
/*    */         
/* 33 */         for (int v3 = 2; v3 < 10; v3++) {
/* 34 */           addAir(par1 + v1, par2 + v3, par3 + v2);
/*    */         }
/*    */       }
/*    */       
/* 38 */       addBlock(par1 + 5, par2, par3 + v1, 17);
/* 39 */       addBlock(par1 - 5, par2, par3 + v1, 17);
/* 40 */       addBlock(par1 + v1, par2, par3 + 5, 17);
/* 41 */       addBlock(par1 + v1, par2, par3 - 5, 17);
/*    */     }
/*    */     
/* 44 */     addBlock(par1 + 5, par2, par3 + 5, 17);
/* 45 */     addBlock(par1 - 5, par2, par3 + 5, 17);
/* 46 */     addBlock(par1 + 5, par2, par3 - 5, 17);
/* 47 */     addBlock(par1 - 5, par2, par3 - 5, 17);
/* 48 */     addBlock(par1, par2, par3, 8);
/* 49 */     addAir(par1, par2 + 1, par3);
/* 50 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\NPCTownPlant.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */