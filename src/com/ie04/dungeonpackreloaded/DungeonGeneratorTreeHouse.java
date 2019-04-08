/*    */ package de.stuuupiiid.dungeonpack;
/*    */ 
/*    */ import java.util.Random;

import net.minecraft.util.ResourceLocation;
/*    */ 
/*    */ public class DungeonGeneratorTreeHouse
/*    */   extends DungeonGenerator
/*    */ {
/*    */   public boolean generate(Random random, int par1, int par2, int par3)
/*    */   {
/* 10 */     par2 = getTop(par1, par3) - 1;
/*    */     
/*    */ 
/*    */ 
/* 14 */     for (int i = -3; i < 4; i++) {
/* 15 */       for (int rand = -3; rand < 4; rand++) {
/* 16 */         addBlockAndMetadata(par1 + i, par2, par3 + rand, 5, 3);
/*    */       }
/*    */     }
/*    */     
/* 20 */     for (int i = -3; i < 1; i++) {
/* 21 */       for (int rand = -3; rand < 4; rand++) {
/* 22 */         addBlockAndMetadata(par1 + 3, par2 + i + 3, par3 + rand, 5, 3);
/* 23 */         if (random.nextInt(4) == 0) {
/* 24 */           addAir(par1 + 3, par2 + i + 3, par3 + rand);
/*    */         }
/*    */         
/* 27 */         addBlockAndMetadata(par1 - 3, par2 + i + 3, par3 + rand, 5, 3);
/* 28 */         if (random.nextInt(4) == 0) {
/* 29 */           addAir(par1 - 3, par2 + i + 3, par3 + rand);
/*    */         }
/*    */         
/* 32 */         addBlockAndMetadata(par1 + rand, par2 + i + 3, par3 + 3, 5, 3);
/* 33 */         if (random.nextInt(4) == 0) {
/* 34 */           addAir(par1 + rand, par2 + i + 3, par3 + 3);
/*    */         }
/*    */         
/* 37 */         addBlockAndMetadata(par1 + rand, par2 + i + 3, par3 - 3, 5, 3);
/* 38 */         if (random.nextInt(4) == 0) {
/* 39 */           addAir(par1 + rand, par2 + i + 3, par3 - 3);
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 44 */     addMobSpawner(par1, par2 + 1, par3, new ResourceLocation("Zombie"));
/*    */     
/* 46 */     for (int i = 0; i < 2; i++) {
/* 47 */       int rand = random.nextInt(3);
/*    */       
/*    */ 
/*    */ 
/*    */ 
/* 52 */       if (rand == 0) {
/* 53 */         int kor = random.nextInt(2) - 1;
/* 54 */         int x = par1 + 2;
/* 55 */         int y = par2 + 1;
/* 56 */         int z = par3 + kor;
/* 57 */         if (isAir(x, y, z)) {
/* 58 */           addChestWithDefaultLoot(random, x, y, z);
/*    */         }
/*    */       }
/*    */       
/* 62 */       if (rand == 1) {
/* 63 */         int kor = random.nextInt(2) - 1;
/* 64 */         int x = par1 - 2;
/* 65 */         int y = par2 + 1;
/* 66 */         int z = par3 + kor;
/* 67 */         if (isAir(x, y, z)) {
/* 68 */           addChestWithDefaultLoot(random, x, y, z);
/*    */         }
/*    */       }
/*    */       
/* 72 */       if (rand == 2) {
/* 73 */         int kor = random.nextInt(2) - 1;
/* 74 */         int x = par1 + kor;
/* 75 */         int y = par2 + 1;
/* 76 */         int z = par3 + 2;
/* 77 */         if (isAir(x, y, z)) {
/* 78 */           addChestWithDefaultLoot(random, x, y, z);
/*    */         }
/*    */       }
/*    */       
/* 82 */       if (rand == 3) {
/* 83 */         int kor = random.nextInt(2) - 1;
/* 84 */         int x = par1 + kor;
/* 85 */         int y = par2 + 1;
/* 86 */         int z = par3 - 2;
/* 87 */         if (isAir(x, y, z)) {
/* 88 */           addChestWithDefaultLoot(random, x, y, z);
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 93 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\DungeonGeneratorTreeHouse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */