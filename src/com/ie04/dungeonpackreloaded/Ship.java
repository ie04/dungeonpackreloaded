/*     */ package de.stuuupiiid.dungeonpack;
/*     */ 
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Ship
/*     */   extends DungeonGenerator
/*     */ {
/*     */   public boolean generateShip(Random random, int par1, int par2, int par3)
/*     */   {
/*  67 */     par2 -= 20;
/*  68 */     ShipPart1 part1 = new ShipPart1();
/*  69 */     ShipPart2 part2 = new ShipPart2();
/*  70 */     ShipPart3 part3 = new ShipPart3();
/*  71 */     ShipPart4 part4 = new ShipPart4();
/*  72 */     ShipPart5 part5 = new ShipPart5();
/*  73 */     ShipPart6 part6 = new ShipPart6();
/*  74 */     ShipPart7 part7 = new ShipPart7();
/*  75 */     ShipPart8 part8 = new ShipPart8();
/*  76 */     ShipPart9 part9 = new ShipPart9();
/*  77 */     ShipPart10 part10 = new ShipPart10();
/*  78 */     ShipPart11 part11 = new ShipPart11();
/*  79 */     ShipPart12 part12 = new ShipPart12();
/*  80 */     ShipPart13 part13 = new ShipPart13();
/*  81 */     ShipPart14 part14 = new ShipPart14();
/*  82 */     ShipPart15 part15 = new ShipPart15();
/*  83 */     ShipPart16 part16 = new ShipPart16();
/*  84 */     ShipPart17 part17 = new ShipPart17();
/*  85 */     ShipPart18 part18 = new ShipPart18();
/*  86 */     ShipPart19 part19 = new ShipPart19();
/*  87 */     ShipPart20 part20 = new ShipPart20();
/*  88 */     ShipPart21 part21 = new ShipPart21();
/*  89 */     ShipPart22 part22 = new ShipPart22();
/*  90 */     ShipPart23 part23 = new ShipPart23();
/*  91 */     ShipPart24 part24 = new ShipPart24();
/*  92 */     ShipPart25 part25 = new ShipPart25();
/*  93 */     ShipPart26 part26 = new ShipPart26();
/*  94 */     ShipPart27 part27 = new ShipPart27();
/*  95 */     ShipPart28 part28 = new ShipPart28();
/*  96 */     ShipPart29 part29 = new ShipPart29();
/*  97 */     ShipPart30 part30 = new ShipPart30();
/*  98 */     ShipPart31 part31 = new ShipPart31();
/*  99 */     ShipPart32 part32 = new ShipPart32();
/* 100 */     ShipPart33 part33 = new ShipPart33();
/* 101 */     ShipPart34 part34 = new ShipPart34();
/* 102 */     ShipPart35 part35 = new ShipPart35();
/* 103 */     ShipPart36 part36 = new ShipPart36();
/* 104 */     ShipPart37 part37 = new ShipPart37();
/* 105 */     ShipPart38 part38 = new ShipPart38();
/* 106 */     ShipPart39 part39 = new ShipPart39();
/* 107 */     ShipPart40 part40 = new ShipPart40();
/* 108 */     ShipPart41 part41 = new ShipPart41();
/* 109 */     ShipPart42 part42 = new ShipPart42();
/* 110 */     ShipPart43 part43 = new ShipPart43();
/* 111 */     ShipPart44 part44 = new ShipPart44();
/* 112 */     ShipPart45 part45 = new ShipPart45();
/* 113 */     ShipPart46 part46 = new ShipPart46();
/* 114 */     ShipPart47 part47 = new ShipPart47();
/* 115 */     ShipPart48 part48 = new ShipPart48();
/* 116 */     ShipPart49 part49 = new ShipPart49();
/* 117 */     ShipPart50 part50 = new ShipPart50();
/* 118 */     ShipPart51 part51 = new ShipPart51();
/* 119 */     ShipPart52 part52 = new ShipPart52();
/* 120 */     ShipPart53 part53 = new ShipPart53();
/* 121 */     ShipPart54 part54 = new ShipPart54();
/* 122 */     ShipPart55 part55 = new ShipPart55();
/* 123 */     ShipPart56 part56 = new ShipPart56();
/* 124 */     ShipPart57 part57 = new ShipPart57();
/* 125 */     part1.generate(random, par1, par2, par3);
/* 126 */     part2.generate(random, par1, par2, par3);
/* 127 */     part3.generate(random, par1, par2, par3);
/* 128 */     part4.generate(random, par1, par2, par3);
/* 129 */     part5.generate(random, par1, par2, par3);
/* 130 */     part6.generate(random, par1, par2, par3);
/* 131 */     part7.generate(random, par1, par2, par3);
/* 132 */     part8.generate(random, par1, par2, par3);
/* 133 */     part9.generate(random, par1, par2, par3);
/* 134 */     part10.generate(random, par1, par2, par3);
/* 135 */     part11.generate(random, par1, par2, par3);
/* 136 */     part12.generate(random, par1, par2, par3);
/* 137 */     part13.generate(random, par1, par2, par3);
/* 138 */     part14.generate(random, par1, par2, par3);
/* 139 */     part15.generate(random, par1, par2, par3);
/* 140 */     part16.generate(random, par1, par2, par3);
/* 141 */     part17.generate(random, par1, par2, par3);
/* 142 */     part18.generate(random, par1, par2, par3);
/* 143 */     part19.generate(random, par1, par2, par3);
/* 144 */     part20.generate(random, par1, par2, par3);
/* 145 */     part21.generate(random, par1, par2, par3);
/* 146 */     part22.generate(random, par1, par2, par3);
/* 147 */     part23.generate(random, par1, par2, par3);
/* 148 */     part24.generate(random, par1, par2, par3);
/* 149 */     part25.generate(random, par1, par2, par3);
/* 150 */     part26.generate(random, par1, par2, par3);
/* 151 */     part27.generate(random, par1, par2, par3);
/* 152 */     part28.generate(random, par1, par2, par3);
/* 153 */     part29.generate(random, par1, par2, par3);
/* 154 */     part30.generate(random, par1, par2, par3);
/* 155 */     part31.generate(random, par1, par2, par3);
/* 156 */     part32.generate(random, par1, par2, par3);
/* 157 */     part33.generate(random, par1, par2, par3);
/* 158 */     part34.generate(random, par1, par2, par3);
/* 159 */     part35.generate(random, par1, par2, par3);
/* 160 */     part36.generate(random, par1, par2, par3);
/* 161 */     part37.generate(random, par1, par2, par3);
/* 162 */     part38.generate(random, par1, par2, par3);
/* 163 */     part39.generate(random, par1, par2, par3);
/* 164 */     part40.generate(random, par1, par2, par3);
/* 165 */     part41.generate(random, par1, par2, par3);
/* 166 */     part42.generate(random, par1, par2, par3);
/* 167 */     part43.generate(random, par1, par2, par3);
/* 168 */     part44.generate(random, par1, par2, par3);
/* 169 */     part45.generate(random, par1, par2, par3);
/* 170 */     part46.generate(random, par1, par2, par3);
/* 171 */     part47.generate(random, par1, par2, par3);
/* 172 */     part48.generate(random, par1, par2, par3);
/* 173 */     part49.generate(random, par1, par2, par3);
/* 174 */     part50.generate(random, par1, par2, par3);
/* 175 */     part51.generate(random, par1, par2, par3);
/* 176 */     part52.generate(random, par1, par2, par3);
/* 177 */     part53.generate(random, par1, par2, par3);
/* 178 */     part54.generate(random, par1, par2, par3);
/* 179 */     part55.generate(random, par1, par2, par3);
/* 180 */     part56.generate(random, par1, par2, par3);
/* 181 */     part57.generate(random, par1, par2, par3);
/* 182 */     return true;
/*     */   }
/*     */   
/*     */   public void addBlockAndMetadata(int par1, int par2, int par3, int par4, int par5) {
/* 186 */     if (par4 < 0) {
/* 187 */       par4 = 53;
/*     */     }
/*     */     
/* 190 */     addBlock(par1, par2, par3, par4);
/* 191 */     setMetadata(par1, par2, par3, par5);
/*     */   }
/*     */   
/*     */   public void addBlock(int par1, int par2, int par3, int par4) {
/* 195 */     if (par4 < 0) {
/* 196 */       par4 = 53;
/*     */     }
/*     */     
/* 199 */     addBlockSecond(par1, par2, par3, par4);
/*     */   }
/*     */   
/*     */   public boolean generate(Random random, int par1, int par2, int par3) {
/* 203 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\Ship.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */