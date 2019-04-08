/*     */ package de.stuuupiiid.dungeonpack;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Random;


/*     */ import net.minecraft.util.math.BlockPos;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraft.world.WorldProvider;
/*     */ import net.minecraft.world.biome.Biome;
/*     */ import net.minecraft.world.chunk.IChunkProvider;
		import net.minecraft.world.gen.IChunkGenerator;
/*     */ import net.minecraftforge.fml.common.IWorldGenerator;
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
/*     */ public class GeneratorRegistry
/*     */   implements IWorldGenerator
/*     */ {
/*  43 */   public ArrayList plains = new ArrayList();
/*  44 */   public ArrayList icePlains = new ArrayList();
/*  45 */   public ArrayList forest = new ArrayList();
/*  46 */   public ArrayList desert = new ArrayList();
/*  47 */   public ArrayList beach = new ArrayList();
/*  48 */   public ArrayList swamp = new ArrayList();
/*  49 */   public ArrayList ocean = new ArrayList();
/*  50 */   public ArrayList river = new ArrayList();
/*  51 */   public ArrayList frozenOcean = new ArrayList();
/*  52 */   public ArrayList frozenRiver = new ArrayList();
/*  53 */   public ArrayList jungle = new ArrayList();
/*  54 */   public ArrayList mountain = new ArrayList();
/*  55 */   public ArrayList nether = new ArrayList();
/*     */   
/*     */   private int rarity;
/*     */   private int rarityB;
/*     */   private int rarityN;
/*     */   
/*     */   public GeneratorRegistry()
/*     */   {
/*  63 */     this.rarity = DungeonPack.instance.rarity;
/*  64 */     this.rarityB = DungeonPack.instance.rarityB;
/*  65 */     this.rarityN = DungeonPack.instance.rarityN;
/*     */   }
/*     */   
/*     */   public boolean spawnDungeon(World world, Random random, DungeonGenerator dungeon, int par1, int par3) {
/*  69 */     int par2 = world.getTopSolidOrLiquidBlock(new BlockPos(par1, 0, par3)).getY();
/*  70 */     boolean v2 = false;
/*  71 */     Random rand = new Random();
/*  72 */     par1 += rand.nextInt(32) - 16;
/*  73 */     par3 += rand.nextInt(32) - 16;
/*  74 */     if ((noLeafes(world, par1, par2, par3)) && (dungeon != null)) {
/*  75 */       dungeon.generate(random, par1, par2, par3);
/*  76 */       if (DungeonPack.instance.cheat) {
/*  77 */         DungeonGeneratorCheat cheat = new DungeonGeneratorCheat();
/*  78 */         cheat.generate(random, par1, par2, par3);
/*     */       }
/*  80 */       return true;
/*     */     }
/*  82 */     for (int v1 = 0; v1 > 25; v1++) {
/*  83 */       if ((noLeafes(world, par1, par2 - v1, par3)) && (dungeon != null)) {
/*  84 */         dungeon.generate(random, par1, par2 - v1, par3);
/*  85 */         if (DungeonPack.instance.cheat) {
/*  86 */           DungeonGeneratorCheat cheat = new DungeonGeneratorCheat();
/*  87 */           cheat.generate(random, par1, par2, par3);
/*     */         }
/*  89 */         return true;
/*     */       }
/*     */     }
/*     */     
/*  93 */     return false;
/*     */   }
/*     */   
/*     */   private boolean noLeafes(World world, int par1, int par2, int par3) {
/*  97 */     return true;
/*     */   }
/*     */   
/*     */   public void addDungeons() {
/* 101 */     if (DungeonPack.instance.igloo) {
/* 102 */       this.icePlains.add(new DungeonGeneratorIgloo());
/* 103 */       this.icePlains.add(new DungeonGeneratorIgloo());
/* 104 */       this.frozenOcean.add(new DungeonGeneratorIgloo());
/* 105 */       this.frozenOcean.add(new DungeonGeneratorIgloo());
/*     */     }
/*     */     
/* 108 */     if (DungeonPack.instance.smalltemple) {
/* 109 */       this.jungle.add(new DungeonGeneratorTempleSmall());
/* 110 */       this.jungle.add(new DungeonGeneratorTempleSmall());
/*     */     }
/*     */     
/* 113 */     if (DungeonPack.instance.swamptemple) {
/* 114 */       this.swamp.add(new DungeonGeneratorTempleSwamp());
/* 115 */       this.swamp.add(new DungeonGeneratorTempleSwamp());
/*     */     }
/*     */     
/* 118 */     if (DungeonPack.instance.barn) {
/* 119 */       this.plains.add(new DungeonGeneratorBarn());
/* 120 */       this.plains.add(new DungeonGeneratorBarn());
/* 121 */       this.icePlains.add(new DungeonGeneratorBarn());
/* 122 */       this.icePlains.add(new DungeonGeneratorBarn());
/*     */     }
/*     */     
/* 125 */     if (DungeonPack.instance.fort) {
/* 126 */       this.plains.add(new DungeonGeneratorFort());
/* 127 */       this.plains.add(new DungeonGeneratorFort());
/* 128 */       this.desert.add(new DungeonGeneratorFort());
/* 129 */       this.desert.add(new DungeonGeneratorFort());
/* 130 */       this.beach.add(new DungeonGeneratorFort());
/* 131 */       this.beach.add(new DungeonGeneratorFort());
/*     */     }
/*     */     
/* 134 */     if (DungeonPack.instance.graveyard) {
/* 135 */       this.plains.add(new DungeonGeneratorGraveyard());
/* 136 */       this.plains.add(new DungeonGeneratorGraveyard());
/* 137 */       this.icePlains.add(new DungeonGeneratorGraveyard());
/* 138 */       this.icePlains.add(new DungeonGeneratorGraveyard());
/*     */     }
/*     */     
/* 141 */     if (DungeonPack.instance.icefort) {
/* 142 */       this.icePlains.add(new DungeonGeneratorFortIce());
/* 143 */       this.icePlains.add(new DungeonGeneratorFortIce());
/* 144 */       this.frozenOcean.add(new DungeonGeneratorFortIce());
/* 145 */       this.frozenOcean.add(new DungeonGeneratorFortIce());
/* 146 */       this.frozenRiver.add(new DungeonGeneratorFortIce());
/* 147 */       this.frozenRiver.add(new DungeonGeneratorFortIce());
/*     */     }
/*     */     
/* 150 */     if (DungeonPack.instance.forestprison) {
/* 151 */       this.forest.add(new DungeonGeneratorPrison(17, 5, 85));
/* 152 */       this.forest.add(new DungeonGeneratorPrison(17, 5, 85));
/*     */     }
/*     */     
/* 155 */     if (DungeonPack.instance.mystery) {
/* 156 */       this.forest.add(new DungeonGeneratorMystery());
/* 157 */       this.forest.add(new DungeonGeneratorMystery());
/*     */     }
/*     */     
/* 160 */     if (DungeonPack.instance.deathtemple) {
/* 161 */       this.forest.add(new DungeonGeneratorTempleDeath());
/* 162 */       this.forest.add(new DungeonGeneratorTempleDeath());
/* 163 */       this.swamp.add(new DungeonGeneratorTempleDeath());
/* 164 */       this.swamp.add(new DungeonGeneratorTempleDeath());
/*     */     }
/*     */     
/* 167 */     if (DungeonPack.instance.creepercoloss) {
/* 168 */       this.desert.add(new DungeonGeneratorCreeperColoss());
/* 169 */       this.desert.add(new DungeonGeneratorCreeperColoss());
/* 170 */       this.beach.add(new DungeonGeneratorCreeperColoss());
/* 171 */       this.beach.add(new DungeonGeneratorCreeperColoss());
/*     */     }
/*     */     
/* 174 */     if (DungeonPack.instance.desertprison) {
/* 175 */       this.desert.add(new DungeonGeneratorPrison(121, 24, 102));
/* 176 */       this.desert.add(new DungeonGeneratorPrison(121, 24, 102));
/*     */     }
/*     */     
/* 179 */     if (DungeonPack.instance.pyramide) {
/* 180 */       this.desert.add(new DungeonGeneratorPyramide());
/*     */     }
/*     */     
/* 183 */     if (DungeonPack.instance.spiderbox) {
/* 184 */       this.swamp.add(new DungeonGeneratorSpiderBox());
/* 185 */       this.swamp.add(new DungeonGeneratorSpiderBox());
/*     */     }
/*     */     
/* 188 */     if (DungeonPack.instance.ship) {
/* 189 */       this.ocean.add(new DungeonGeneratorShip());
/* 190 */       this.ocean.add(new DungeonGeneratorShip());
/*     */     }
/*     */     
/* 193 */     if (DungeonPack.instance.helpship) {
/* 194 */       this.ocean.add(new DungeonGeneratorHelpShip());
/* 195 */       this.ocean.add(new DungeonGeneratorHelpShip());
/*     */     }
/*     */     
/* 198 */     if (DungeonPack.instance.obsidiantower) {
/* 199 */       this.ocean.add(new DungeonGeneratorObsidianTower());
/* 200 */       this.river.add(new DungeonGeneratorObsidianTower());
/* 201 */       this.river.add(new DungeonGeneratorObsidianTower());
/* 202 */       this.frozenOcean.add(new DungeonGeneratorObsidianTower());
/*     */     }
/*     */     
/* 205 */     if (DungeonPack.instance.treehouse) {
/* 206 */       this.jungle.add(new DungeonGeneratorTreeHouse());
/* 207 */       this.jungle.add(new DungeonGeneratorTreeHouse());
/* 208 */       this.mountain.add(new DungeonGeneratorTreeHouse());
/*     */     }
/*     */     
/* 211 */     if (DungeonPack.instance.mysteryrooms) {
/* 212 */       this.plains.add(new DungeonGeneratorMysteryRooms());
/* 213 */       this.icePlains.add(new DungeonGeneratorMysteryRooms());
/* 214 */       this.forest.add(new DungeonGeneratorMysteryRooms());
/* 215 */       this.desert.add(new DungeonGeneratorMysteryRooms());
/* 216 */       this.beach.add(new DungeonGeneratorMysteryRooms());
/* 217 */       this.swamp.add(new DungeonGeneratorMysteryRooms());
/* 218 */       this.ocean.add(new DungeonGeneratorMysteryRooms());
/* 219 */       this.river.add(new DungeonGeneratorMysteryRooms());
/* 220 */       this.frozenRiver.add(new DungeonGeneratorMysteryRooms());
/* 221 */       this.frozenOcean.add(new DungeonGeneratorMysteryRooms());
/* 222 */       this.jungle.add(new DungeonGeneratorMysteryRooms());
/* 223 */       this.mountain.add(new DungeonGeneratorMysteryRooms());
/*     */     }
/*     */     
/* 226 */     if (DungeonPack.instance.island) {
/* 227 */       this.plains.add(new DungeonGeneratorFloatingIsland());
/* 228 */       this.icePlains.add(new DungeonGeneratorFloatingIsland());
/* 229 */       this.forest.add(new DungeonGeneratorFloatingIsland());
/* 230 */       this.desert.add(new DungeonGeneratorFloatingIsland());
/* 231 */       this.beach.add(new DungeonGeneratorFloatingIsland());
/* 232 */       this.swamp.add(new DungeonGeneratorFloatingIsland());
/* 233 */       this.ocean.add(new DungeonGeneratorFloatingIsland());
/* 234 */       this.river.add(new DungeonGeneratorFloatingIsland());
/* 235 */       this.frozenRiver.add(new DungeonGeneratorFloatingIsland());
/* 236 */       this.frozenOcean.add(new DungeonGeneratorFloatingIsland());
/* 237 */       this.jungle.add(new DungeonGeneratorFloatingIsland());
/* 238 */       this.mountain.add(new DungeonGeneratorFloatingIsland());
/*     */     }
/*     */     
/* 241 */     if (DungeonPack.instance.netherprison) {
/* 242 */       this.nether.add(new DungeonGeneratorPrison(112, 87, 113));
/*     */     }
/*     */     
/* 245 */     if (DungeonPack.instance.nethertemple) {
/* 246 */       this.nether.add(new DungeonGeneratorTempleNether());
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   private boolean temperatureRight(World world, int par1, int par3, float temperature)
/*     */   {
/* 253 */     if ((world.getBiome(new BlockPos(par1, 0, par3)).getTemperature(new BlockPos(par1, 0, par3)) + 0.6F > temperature) && (world.getBiome(new BlockPos(par1, 0, par3)).getTemperature(new BlockPos(par1, 0, par3)) - 0.6F < temperature))
/*     */     {
/* 255 */       return true;
/*     */     }
/*     */     
/*     */ 
/* 259 */     return false;
/*     */   }
/*     */   
/*     */   private boolean plains(World world, Random random, int par1, int par2, int par3)
/*     */   {
/* 264 */     if ((temperatureRight(world, par1, par3, Biome.getBiome(1).getTemperature(new BlockPos(par1, 0, par3)))) && 
/* 265 */       (this.plains.size() != 0)) {
/* 266 */       return spawnDungeon(world, random, plains(random), par1, par3);
/*     */     }
/*     */     
/* 269 */     return false;
/*     */   }
/*     */   
/*     */   private boolean icePlains(World world, Random random, int par1, int par2, int par3) {
/* 273 */     if ((temperatureRight(world, par1, par3, Biome.getBiome(12).getTemperature(new BlockPos(par1, 0, par3)))) && 
/* 274 */       (this.icePlains.size() != 0)) {
/* 275 */       return spawnDungeon(world, random, icePlains(random), par1, par3);
/*     */     }
/*     */     
/* 278 */     return false;
/*     */   }
/*     */   
/*     */   private boolean forest(World world, Random random, int par1, int par2, int par3) {
/* 282 */     if ((temperatureRight(world, par1, par3, Biome.getBiome(4).getTemperature(new BlockPos(par1, 0, par3)))) && 
/* 283 */       (this.forest.size() != 0)) {
/* 284 */       return spawnDungeon(world, random, forest(random), par1, par3);
/*     */     }
/*     */     
/* 287 */     return false;
/*     */   }
/*     */   
/*     */   private boolean desert(World world, Random random, int par1, int par2, int par3) {
/* 291 */     if ((temperatureRight(world, par1, par3, Biome.getBiome(2).getTemperature(new BlockPos(par1, 0, par3)))) && 
/* 292 */       (this.desert.size() != 0)) {
/* 293 */       return spawnDungeon(world, random, desert(random), par1, par3);
/*     */     }
/*     */     
/* 296 */     return false;
/*     */   }
/*     */   
/*     */   private boolean beach(World world, Random random, int par1, int par2, int par3) {
/* 300 */     if ((temperatureRight(world, par1, par3, Biome.getBiome(16).getTemperature(new BlockPos(par1, 0, par3)))) && 
/* 301 */       (this.beach.size() != 0)) {
/* 302 */       return spawnDungeon(world, random, beach(random), par1, par3);
/*     */     }
/*     */     
/* 305 */     return false;
/*     */   }
/*     */   
/*     */   private boolean swamp(World world, Random random, int par1, int par2, int par3) {
/* 309 */     if ((temperatureRight(world, par1, par3, Biome.getBiome(6).getTemperature(new BlockPos(par1, 0, par3)))) && 
/* 310 */       (this.swamp.size() != 0)) {
/* 311 */       return spawnDungeon(world, random, swamp(random), par1, par3);
/*     */     }
/*     */     
/* 314 */     return false;
/*     */   }
/*     */   
/*     */   private boolean ocean(World world, Random random, int par1, int par2, int par3) {
/* 318 */     if ((Biome.getBiome(0) == world.getBiome(new BlockPos(par1, 0, par3))) && 
/* 319 */       (this.ocean.size() != 0)) {
/* 320 */       return ocean(random).generate(random, par1, par2, par3);
/*     */     }
/*     */     
/* 323 */     return false;
/*     */   }
/*     */   
/*     */   private boolean river(World world, Random random, int par1, int par2, int par3) {
/* 327 */     if ((Biome.getBiome(7) == world.getBiome(new BlockPos(par1, 0, par3))) && 
/* 328 */       (this.river.size() != 0)) {
/* 329 */       return river(random).generate(random, par1, par2, par3);
/*     */     }
/*     */     
/* 332 */     return false;
/*     */   }
/*     */   
/*     */   private boolean frozenOcean(World world, Random random, int par1, int par2, int par3) {
/* 336 */     if ((Biome.getBiome(10) == world.getBiome(new BlockPos(par1, 0, par3))) && 
/* 337 */       (this.frozenOcean.size() != 0)) {
/* 338 */       return frozenOcean(random).generate(random, par1, par2, par3);
/*     */     }
/*     */     
/* 341 */     return false;
/*     */   }
/*     */   
/*     */   private boolean frozenRiver(World world, Random random, int par1, int par2, int par3) {
/* 345 */     if ((Biome.getBiome(11) == world.getBiome(new BlockPos(par1, 0, par3))) && 
/* 346 */       (this.frozenRiver.size() != 0)) {
/* 347 */       return frozenRiver(random).generate(random, par1, par2, par3);
/*     */     }
/*     */     
/* 350 */     return false;
/*     */   }
/*     */   
/*     */   private boolean jungle(World world, Random random, int par1, int par2, int par3) {
/* 354 */     if ((temperatureRight(world, par1, par3, Biome.getBiome(21).getTemperature(new BlockPos(par1, 0, par3)))) && 
/* 355 */       (this.jungle.size() != 0)) {
/* 356 */       DungeonGenerator gen = jungle(random);
/*     */       
/* 358 */       if ((gen instanceof DungeonGeneratorTreeHouse))
/*     */       {
/* 360 */         gen.generate(random, par1, par2, par3);
/* 361 */         return true;
/*     */       }
/*     */       
/*     */ 
/* 365 */       return spawnDungeon(world, random, jungle(random), par1, par3);
/*     */     }
/*     */     
/*     */ 
/* 369 */     return false;
/*     */   }
/*     */   
/*     */   private boolean mountain(World world, Random random, int par1, int par2, int par3) {
/* 373 */     if ((temperatureRight(world, par1, par3, Biome.getBiome(3).getTemperature(new BlockPos(par1, 0, par3)))) && 
/* 374 */       (this.mountain.size() != 0)) {
/* 375 */       return spawnDungeon(world, random, mountain(random), par1, par3);
/*     */     }
/*     */     
/* 378 */     return false;
/*     */   }
/*     */   
/*     */   private void nether(World world, Random random, int par1, int par2, int par3) {
/* 382 */     if ((Biome.getBiome(8) == world.getBiome(new BlockPos(par1, 0, par3))) && 
/* 383 */       (this.nether.size() != 0)) {
/* 384 */       nether(random).generateNether(random, par1, par2, par3);
/*     */     }
/*     */   }
/*     */   
/*     */   private DungeonGenerator plains(Random random)
/*     */   {
/* 390 */     return (DungeonGenerator)this.plains.get(random.nextInt(this.plains.size()));
/*     */   }
/*     */   
/*     */   private DungeonGenerator icePlains(Random random) {
/* 394 */     return (DungeonGenerator)this.icePlains.get(random.nextInt(this.icePlains.size()));
/*     */   }
/*     */   
/*     */   private DungeonGenerator forest(Random random) {
/* 398 */     return (DungeonGenerator)this.forest.get(random.nextInt(this.forest.size()));
/*     */   }
/*     */   
/*     */   private DungeonGenerator desert(Random random) {
/* 402 */     return (DungeonGenerator)this.desert.get(random.nextInt(this.desert.size()));
/*     */   }
/*     */   
/*     */   private DungeonGenerator beach(Random random) {
/* 406 */     return (DungeonGenerator)this.beach.get(random.nextInt(this.beach.size()));
/*     */   }
/*     */   
/*     */   private DungeonGenerator swamp(Random random) {
/* 410 */     return (DungeonGenerator)this.swamp.get(random.nextInt(this.swamp.size()));
/*     */   }
/*     */   
/*     */   private DungeonGenerator ocean(Random random) {
/* 414 */     return (DungeonGenerator)this.ocean.get(random.nextInt(this.ocean.size()));
/*     */   }
/*     */   
/*     */   private DungeonGenerator river(Random random) {
/* 418 */     return (DungeonGenerator)this.river.get(random.nextInt(this.river.size()));
/*     */   }
/*     */   
/*     */   private DungeonGenerator frozenOcean(Random random) {
/* 422 */     return (DungeonGenerator)this.frozenOcean.get(random.nextInt(this.frozenOcean.size()));
/*     */   }
/*     */   
/*     */   private DungeonGenerator frozenRiver(Random random) {
/* 426 */     return (DungeonGenerator)this.frozenRiver.get(random.nextInt(this.frozenRiver.size()));
/*     */   }
/*     */   
/*     */   private DungeonGenerator jungle(Random random) {
/* 430 */     return (DungeonGenerator)this.jungle.get(random.nextInt(this.jungle.size()));
/*     */   }
/*     */   
/*     */   private DungeonGenerator mountain(Random random) {
/* 434 */     return (DungeonGenerator)this.mountain.get(random.nextInt(this.mountain.size()));
/*     */   }
/*     */   
/*     */   private DungeonGenerator nether(Random random) {
/* 438 */     return (DungeonGenerator)this.nether.get(random.nextInt(this.nether.size()));
/*     */   }
/*     */   
/*     */   private void generateTreasure(World world, Random random, int x, int z) {
/* 442 */     if (DungeonPack.instance.treasure) {
/* 443 */       TreasureBase treasure1 = new TreasureBase();
/* 444 */       treasure1.generate(random, x, 10, z);
/* 445 */       if (DungeonPack.instance.cheat) {
/* 446 */         DungeonGeneratorCheat treasure = new DungeonGeneratorCheat();
/* 447 */         treasure.generate(random, x, 10, z);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   private void generateBosses(World world, Random random, int x, int z)
/*     */   {
/* 455 */     NPCFlyBase npcFly = new NPCFlyBase();
/* 456 */     NPCTownBase npcTown = new NPCTownBase();
/* 457 */     Ship ship = new Ship();
/* 458 */     TemplePQ2 pq2 = new TemplePQ2();
/* 459 */     int par2 = world.getTopSolidOrLiquidBlock(new BlockPos(x, 0, z)).getY();
/* 460 */     Biome biome = world.getBiome(new BlockPos(x, 0, z));
/*     */     
/* 462 */     if (((biome == Biome.getBiome(1)) || (biome == Biome.getBiome(2)) || (biome == Biome.getBiome(12))) && (DungeonPack.instance.npctown))
/*     */     {
/* 464 */       if (npcTown.generate(random, x, par2, z))
/*     */       {
/* 466 */         if (DungeonPack.instance.cheat) {
/* 467 */           DungeonGeneratorCheat cheat = new DungeonGeneratorCheat();
/* 468 */           cheat.generate(random, x, par2, z);
/*     */         }
/*     */       }
/* 471 */     } else if ((biome == Biome.getBiome(0)) && (DungeonPack.instance.shipBoss))
/*     */     {
/* 473 */       if (ship.generateShip(random, x, par2, z))
/*     */       {
/* 475 */         if (DungeonPack.instance.cheat) {
/* 476 */           DungeonGeneratorCheat cheat = new DungeonGeneratorCheat();
/* 477 */           cheat.generate(random, x, par2, z);
/*     */         }
/*     */       }
/* 480 */     } else if (((biome == Biome.getBiome(6)) || (biome == Biome.getBiome(1))) && (DungeonPack.instance.pq2)) {
/* 481 */       if (DungeonPack.instance.cheat) {
/* 482 */         DungeonGeneratorCheat cheat = new DungeonGeneratorCheat();
/* 483 */         cheat.generate(random, x, par2, z);
/*     */       }
/* 485 */       spawnDungeon(world, random, pq2, x, z);
/* 486 */     } else if (DungeonPack.instance.npcfly)
/*     */     {
/* 488 */       if (npcFly.generate(random, x, 160, z))
/*     */       {
/* 490 */         if (DungeonPack.instance.cheat) {
/* 491 */           DungeonGeneratorCheat cheat = new DungeonGeneratorCheat();
/* 492 */           cheat.generate(random, x, par2, z);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private void generateSimples(World world, Random random, int x, int z)
/*     */   {
/* 500 */     int par2 = world.getTopSolidOrLiquidBlock(new BlockPos(x, 0, z)).getY();
/*     */     
/* 502 */     if ((ocean(world, random, x, par2, z)) || (frozenOcean(world, random, x, par2, z)) || (river(world, random, x, par2, z)) || (frozenRiver(world, random, x, par2, z)))
/*     */     {
/* 504 */       return;
/*     */     }
/*     */     
/* 507 */     for (int v1 = 0; v1 < 16; v1++)
/*     */     {
/* 509 */       int rand = random.nextInt(8);
/*     */       
/* 511 */       switch (rand) {
/*     */       case 0: 
/* 513 */         if (plains(world, random, x, par2, z))
/*     */           return;
/*     */         break; case 1:  if (icePlains(world, random, x, par2, z))
/*     */           return;
/*     */         break; case 2:  if (forest(world, random, x, par2, z))
/*     */           return;
/*     */         break; case 3:  if (desert(world, random, x, par2, z))
/*     */           return;
/*     */         break; case 4:  if (beach(world, random, x, par2, z))
/*     */           return;
/*     */         break; case 5:  if (swamp(world, random, x, par2, z))
/*     */           return;
/*     */         break; case 6:  if (jungle(world, random, x, par2, z))
/*     */           return;
/*     */         break; case 7:  if (mountain(world, random, x, par2, z))
/*     */           return;
/*     */         break;
/*     */       }
/*     */     }
/* 532 */     for (int rand = 0; rand < 9; rand++)
/*     */     {
/* 534 */       switch (rand) {
/*     */       case 0: 
/* 536 */         if (plains(world, random, x, par2, z))
/*     */           return;
/*     */         break; case 1:  if (icePlains(world, random, x, par2, z))
/*     */           return;
/*     */         break; case 2:  if (forest(world, random, x, par2, z))
/*     */           return;
/*     */         break; case 3:  if (desert(world, random, x, par2, z))
/*     */           return;
/*     */         break; case 4:  if (beach(world, random, x, par2, z))
/*     */           return;
/*     */         break; case 5:  if (swamp(world, random, x, par2, z))
/*     */           return;
/*     */         break; case 6:  if (jungle(world, random, x, par2, z))
/*     */           return;
/*     */         break; case 7:  if (mountain(world, random, x, par2, z))
/*     */           return;
/*     */         break;
/*     */       } }
/*     */   }
/*     */   
/*     */   private void generateNether(World world, Random random, int x, int z) {
/* 557 */     if (random.nextInt(this.rarity) == 0) {
/* 558 */       int par2 = 40 + random.nextInt(20);
/* 559 */       nether(world, random, x, par2, z);
/*     */     }
/*     */   }
/*     */   
/*     */   private void generateEnd(World world, Random random, int x, int z) {}
/*     */   
/*     */   public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
/*     */   {
/*     */     try
/*     */     {
/* 569 */       switch (world.provider.getDimension()) {
/*     */       case -1: 
/* 571 */         generateNether(world, random, chunkX * 16, chunkZ * 16);
/* 572 */         break;
/*     */       case 0: 
/* 574 */         if (random.nextInt(this.rarityB) == 0) {
/* 575 */           generateTreasure(world, random, chunkX * 16, chunkZ * 16);
/*     */         }
/*     */         
/* 578 */         if (random.nextInt(this.rarityN * 2) == 0) {
/* 579 */           generateBosses(world, random, chunkX * 16, chunkZ * 16);
/* 580 */         } else if (random.nextInt(this.rarity) == 0)
/* 581 */           generateSimples(world, random, chunkX * 16, chunkZ * 16);
/*     */         break;
/*     */       }
/*     */     } catch (Exception var9) {
/* 585 */       System.err.println("DungeonPack ERROR REPORT");
/* 586 */       var9.printStackTrace();
/* 587 */       System.err.println("Please backup your world before going on!");
/*     */     }
/*     */   }
/*     */
@Override
public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
		IChunkProvider chunkProvider) {
	// TODO Auto-generated method stub
	
} }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\GeneratorRegistry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */