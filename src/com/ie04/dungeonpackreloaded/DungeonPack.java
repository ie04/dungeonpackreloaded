/*     */ package de.stuuupiiid.dungeonpack;
/*     */ 
/*     */ import net.minecraftforge.common.config.Configuration;
/*     */ import net.minecraftforge.common.config.Property;
/*     */ import net.minecraftforge.fml.common.Mod;
/*     */ import net.minecraftforge.fml.common.Mod.EventHandler;
/*     */ import net.minecraftforge.fml.common.Mod.Instance;
/*     */ import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
/*     */ import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
/*     */ import net.minecraftforge.fml.common.registry.GameRegistry;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Mod(modid="dungeonpack", name="Dungeon Pack", version="v1", acceptedMinecraftVersions="[1.12.2]")
/*     */ public class DungeonPack
/*     */ {
/*     */   public boolean barn;
/*     */   public boolean creepercoloss;
/*     */   public boolean fort;
/*     */   public boolean icefort;
/*     */   public boolean graveyard;
/*     */   public boolean helpship;
/*     */   public boolean mystery;
/*     */   public boolean mysteryrooms;
/*     */   public boolean obsidiantower;
/*     */   public boolean forestprison;
/*     */   public boolean desertprison;
/*     */   public boolean netherprison;
/*     */   public boolean pyramide;
/*     */   public boolean ship;
/*     */   public boolean spiderbox;
/*     */   public boolean deathtemple;
/*     */   public boolean swamptemple;
/*     */   public boolean treehouse;
/*     */   public boolean smalltemple;
/*     */   public boolean nethertemple;
/*     */   public boolean igloo;
/*     */   public boolean island;
/*     */   public boolean treasure;
/*     */   public boolean shipBoss;
/*     */   public boolean pq2;
/*     */   public boolean npcfly;
/*     */   public boolean npctown;
/*     */   public int npcflyheight;
/*     */   public int rarity;
/*     */   public int rarityB;
/*     */   public int rarityN;
/*     */   public boolean cheat;
/*     */   public int treasureHeight;
/*     */   public int treasureWidth;
/*     */   @Mod.Instance("DungeonPack")
/*     */   public static DungeonPack instance;
/*     */   public GeneratorRegistry generatorRegistry;
/*     */   
/*     */   @Mod.EventHandler
/*     */   public void preInit(FMLPreInitializationEvent event)
/*     */   {
/*  59 */     instance = this;
/*  60 */     Configuration config = new Configuration(event.getSuggestedConfigurationFile());
/*  61 */     config.load();
/*  62 */     this.barn = config.get("Simple Dungeons", "Barn", true).getBoolean(true);
/*  63 */     this.creepercoloss = config.get("Simple Dungeons", "Creepercoloss", true).getBoolean(true);
/*  64 */     this.fort = config.get("Simple Dungeons", "Fort", true).getBoolean(true);
/*  65 */     this.icefort = config.get("Simple Dungeons", "Ice Fort", true).getBoolean(true);
/*  66 */     this.graveyard = config.get("Simple Dungeons", "Graveyard", true).getBoolean(true);
/*  67 */     this.helpship = config.get("Simple Dungeons", "Helpship", true).getBoolean(true);
/*  68 */     this.mystery = config.get("Simple Dungeons", "Mystery Dungeon", true).getBoolean(true);
/*  69 */     this.mysteryrooms = config.get("Simple Dungeons", "Mystery Rooms", true).getBoolean(true);
/*  70 */     this.obsidiantower = config.get("Simple Dungeons", "Obsidian Tower", true).getBoolean(true);
/*  71 */     this.forestprison = config.get("Simple Dungeons", "Forest Prison", true).getBoolean(true);
/*  72 */     this.desertprison = config.get("Simple Dungeons", "Desert Prison", true).getBoolean(true);
/*  73 */     this.netherprison = config.get("Simple Dungeons", "Nether Prison", true).getBoolean(true);
/*  74 */     this.pyramide = config.get("Simple Dungeons", "Pyramide", true).getBoolean(true);
/*  75 */     this.ship = config.get("Simple Dungeons", "Small Ships", true).getBoolean(true);
/*  76 */     this.spiderbox = config.get("Simple Dungeons", "Spider Box", true).getBoolean(true);
/*  77 */     this.deathtemple = config.get("Simple Dungeons", "Temple Of Death", true).getBoolean(true);
/*  78 */     this.swamptemple = config.get("Simple Dungeons", "Swamp Temple", true).getBoolean(true);
/*  79 */     this.nethertemple = config.get("Simple Dungeons", "Nether Temple", true).getBoolean(true);
/*  80 */     this.smalltemple = config.get("Simple Dungeons", "Small Temple", true).getBoolean(true);
/*  81 */     this.treehouse = config.get("Simple Dungeons", "Treehouse", true).getBoolean(true);
/*  82 */     this.igloo = config.get("Simple Dungeons", "Igloo", true).getBoolean(true);
/*  83 */     this.island = config.get("Simple Dungeons", "Floating Islands", true).getBoolean(true);
/*  84 */     this.treasure = config.get("Bosses", "Treasure Dungeon", true).getBoolean(true);
/*  85 */     this.shipBoss = config.get("Bosses", "Huge Ship", false).getBoolean(true);
/*  86 */     this.pq2 = config.get("Bosses", "Glorious Temple Of pq2", true).getBoolean(true);
/*  87 */     this.npcfly = config.get("Bosses", "NPC Floating Village", true).getBoolean(true);
/*  88 */     this.npctown = config.get("Bosses", "NPC Town", true).getBoolean(true);
/*  89 */     this.npcflyheight = config.get("Customization", "The Height Of Floating Villages", 160).getInt(160);
/*  90 */     this.rarity = config.get("Rarities", "Rarity Of Simple Dungeons", 500).getInt(500);
/*  91 */     this.rarityB = config.get("Rarities", "Rarity Of Treasure Dungeons", 750).getInt(750);
/*  92 */     this.rarityN = config.get("Rarities", "Rarity Of Bosses", 2750).getInt(2750);
/*  93 */     this.cheat = config.get("Customization", "Cheat Mode", false).getBoolean(true);
/*  94 */     this.treasureHeight = config.get("Customization", "Treasure Dungeon Max Height", 50).getInt(50);
/*  95 */     this.treasureWidth = config.get("Customization", "Treasure Dungeon Single Floor Size", 5).getInt(6);
/*  96 */     config.save();
/*     */     
/*  98 */     this.generatorRegistry = new GeneratorRegistry();
/*  99 */     GameRegistry.registerWorldGenerator(this.generatorRegistry, 0);
/*     */   }
/*     */   
/*     */ 
/*     */   @Mod.EventHandler
/*     */   public void serverStarting(FMLServerStartingEvent event)
/*     */   {
/* 106 */     this.generatorRegistry.addDungeons();
/*     */   }
/*     */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\DungeonPack.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */