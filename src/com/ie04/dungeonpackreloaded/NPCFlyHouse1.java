/*    */ package de.stuuupiiid.dungeonpack;
/*    */ 
/*    */ import java.util.Random;
/*    */ 
/*    */ public class NPCFlyHouse1
/*    */   extends NPCFlyBase
/*    */ {
/*    */   public boolean generate(Random r, int par1, int par2, int par3)
/*    */   {
/* 10 */     ebene9(r, par1, par2 - 1, par3, 121);
/*    */     
/*    */ 
/*    */ 
/* 14 */     for (int random = 0; random < 6; random++) {
/* 15 */       for (int v2 = -1; v2 < 2; v2++) {
/* 16 */         addBlock(par1 + 2, par2 + random, par3 + v2, 121);
/* 17 */         addBlock(par1 + v2, par2 + random, par3 + 2, 121);
/* 18 */         addBlock(par1 - 2, par2 + random, par3 + v2, 121);
/* 19 */         addBlock(par1 + v2, par2 + random, par3 - 2, 121);
/*    */         
/* 21 */         for (int v3 = -1; v3 < 2; v3++) {
/* 22 */           addBlock(par1 + v2, par2 + 4, par3 + v3, 121);
/*    */         }
/*    */       }
/*    */       
/* 26 */       addBlock(par1 + 2, par2 + random, par3 + 2, 49);
/* 27 */       addBlock(par1 - 2, par2 + random, par3 + 2, 49);
/* 28 */       addBlock(par1 + 2, par2 + random, par3 - 2, 49);
/* 29 */       addBlock(par1 - 2, par2 + random, par3 - 2, 49);
/*    */     }
/*    */     
/* 32 */     for (int random = 0; random < 2; random++) {
/* 33 */       addAir(par1 + 2, par2 + random, par3);
/* 34 */       addAir(par1 - 2, par2 + random, par3);
/* 35 */       addAir(par1, par2 + random, par3 + 2);
/* 36 */       addAir(par1, par2 + random, par3 - 2);
/*    */     }
/*    */     
/* 39 */     for (int random = -2; random < 3; random++) {
/* 40 */       for (int v2 = -2; v2 < 3; v2++) {
/* 41 */         addBlock(par1 + random, par2 - 1, par3 + v2, 121);
/*    */       }
/*    */     }
/*    */     
/* 45 */     int random = r.nextInt(2);
/* 46 */     if (random == 1) {
/* 47 */       addChestWithCustomLoot(r, par1, par2 + 5, par3, chestItems2(r), 1);
/*    */     }
/*    */     
/* 50 */     addChestWithCustomLoot(r, par1, par2, par3, chestItems1(r), 4);
/* 51 */     spawnVillager(par1, par2, par3, 1, 0);
/* 52 */     spawnGolem(par1, par2, par3);
/* 53 */     return true;
/*    */   }
/*    */   
/*    */   public int chestItems1(Random r) {
/* 57 */     int random = r.nextInt(5);
/* 58 */     return random == 5 ? 5 : random == 4 ? 4 : random == 3 ? 290 : random == 2 ? 295 : random == 1 ? 262 : random == 0 ? 263 : 0;
/*    */   }
/*    */   
/*    */   public int chestItems2(Random r) {
/* 62 */     int random = r.nextInt(3);
/* 63 */     return random == 3 ? 368 : random == 2 ? 381 : random == 1 ? 42 : random == 0 ? 264 : 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\NPCFlyHouse1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */