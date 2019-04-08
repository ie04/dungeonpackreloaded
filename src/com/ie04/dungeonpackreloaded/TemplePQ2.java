/*    */ package de.stuuupiiid.dungeonpack;
/*    */ 
/*    */ import java.util.Random;

import net.minecraft.util.ResourceLocation;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TemplePQ2
/*    */   extends DungeonGenerator
/*    */ {
/*    */   public boolean generate(Random rand, int i, int j, int k)
/*    */   {
/* 24 */     TemplePQ2Part1 part1 = new TemplePQ2Part1();
/* 25 */     TemplePQ2Part2 part2 = new TemplePQ2Part2();
/* 26 */     TemplePQ2Part3 part3 = new TemplePQ2Part3();
/* 27 */     TemplePQ2Part4 part4 = new TemplePQ2Part4();
/* 28 */     TemplePQ2Part5 part5 = new TemplePQ2Part5();
/* 29 */     TemplePQ2Part6 part6 = new TemplePQ2Part6();
/* 30 */     TemplePQ2Part7 part7 = new TemplePQ2Part7();
/* 31 */     TemplePQ2Part8 part8 = new TemplePQ2Part8();
/* 32 */     TemplePQ2Part9 part9 = new TemplePQ2Part9();
/* 33 */     TemplePQ2Part10 part10 = new TemplePQ2Part10();
/* 34 */     TemplePQ2Part11 part11 = new TemplePQ2Part11();
/* 35 */     TemplePQ2Part12 part12 = new TemplePQ2Part12();
/* 36 */     TemplePQ2Part13 part13 = new TemplePQ2Part13();
/* 37 */     TemplePQ2Part14 part14 = new TemplePQ2Part14();
/* 38 */     part1.generate(rand, i, j, k);
/* 39 */     part2.generate(rand, i, j, k);
/* 40 */     part3.generate(rand, i, j, k);
/* 41 */     part4.generate(rand, i, j, k);
/* 42 */     part5.generate(rand, i, j, k);
/* 43 */     part6.generate(rand, i, j, k);
/* 44 */     part7.generate(rand, i, j, k);
/* 45 */     part8.generate(rand, i, j, k);
/* 46 */     part9.generate(rand, i, j, k);
/* 47 */     part10.generate(rand, i, j, k);
/* 48 */     part11.generate(rand, i, j, k);
/* 49 */     part12.generate(rand, i, j, k);
/* 50 */     part13.generate(rand, i, j, k);
/* 51 */     part14.generate(rand, i, j, k);
/* 52 */     addMobSpawner(i + 10, j + 25, k + 6, new ResourceLocation("Blaze"));
/* 53 */     addMobSpawner(i + 10, j + 25, k + 15, new ResourceLocation("Blaze"));
/* 54 */     spawnWitch(i + 9, j + 34, k + 10);
/* 55 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\TemplePQ2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */