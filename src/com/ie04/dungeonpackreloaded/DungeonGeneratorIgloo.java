/*     */ package de.stuuupiiid.dungeonpack;
/*     */ 
/*     */ import java.util.Random;

import net.minecraft.util.ResourceLocation;
/*     */ 
/*     */ public class DungeonGeneratorIgloo
/*     */   extends DungeonGenerator
/*     */ {
/*     */   public boolean generate(Random rand, int i, int j, int k)
/*     */   {
/*  10 */     for (int v1 = 0; v1 < 17; v1++) {
/*  11 */       for (int v2 = 0; v2 < 17; v2++) {
/*  12 */         for (int v3 = 0; v3 < 8; v3++) {
/*  13 */           addAir(i + v1, j + v3, k + v2);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  18 */     addBlock(i + 0, j + 0, k + 6, 80);
/*  19 */     addBlock(i + 0, j + 0, k + 7, 80);
/*  20 */     addBlock(i + 0, j + 0, k + 8, 80);
/*  21 */     addBlock(i + 0, j + 0, k + 9, 80);
/*  22 */     addBlock(i + 0, j + 0, k + 10, 80);
/*  23 */     addBlock(i + 0, j + 0, k + 11, 80);
/*  24 */     addBlock(i + 0, j + 1, k + 6, 80);
/*  25 */     addBlock(i + 0, j + 1, k + 7, 80);
/*  26 */     addBlock(i + 0, j + 1, k + 8, 80);
/*  27 */     addBlock(i + 0, j + 1, k + 9, 80);
/*  28 */     addBlock(i + 0, j + 1, k + 10, 80);
/*  29 */     addBlock(i + 0, j + 1, k + 11, 80);
/*  30 */     addBlock(i + 0, j + 2, k + 6, 80);
/*  31 */     addBlock(i + 0, j + 2, k + 7, 80);
/*  32 */     addBlock(i + 0, j + 2, k + 8, 80);
/*  33 */     addBlock(i + 0, j + 2, k + 9, 80);
/*  34 */     addBlock(i + 0, j + 2, k + 10, 80);
/*  35 */     addBlock(i + 0, j + 2, k + 11, 80);
/*  36 */     addBlock(i + 0, j + 3, k + 6, 80);
/*  37 */     addBlock(i + 0, j + 3, k + 7, 80);
/*  38 */     addBlock(i + 0, j + 3, k + 8, 80);
/*  39 */     addBlock(i + 0, j + 3, k + 9, 80);
/*  40 */     addBlock(i + 0, j + 3, k + 10, 80);
/*  41 */     addBlock(i + 0, j + 3, k + 11, 80);
/*  42 */     addBlock(i + 1, j + 0, k + 5, 80);
/*  43 */     addBlock(i + 1, j + 0, k + 6, 80);
/*  44 */     addBlock(i + 1, j + 0, k + 7, 80);
/*  45 */     addBlock(i + 1, j + 0, k + 8, 80);
/*  46 */     addBlock(i + 1, j + 0, k + 9, 80);
/*  47 */     addBlock(i + 1, j + 0, k + 10, 80);
/*  48 */     addBlock(i + 1, j + 0, k + 11, 80);
/*  49 */     addBlock(i + 1, j + 0, k + 12, 80);
/*  50 */     addBlock(i + 1, j + 1, k + 5, 80);
/*  51 */     addBlockAndMetadata(i + 1, j + 1, k + 7, 54, 5);
/*  52 */     addBlockAndMetadata(i + 1, j + 1, k + 8, 54, 5);
/*  53 */     addChestWithDefaultLoot(rand, i + 1, j + 1, k + 10);
/*  54 */     addBlockAndMetadata(i + 1, j + 1, k + 11, 54, 5);
/*  55 */     addBlock(i + 1, j + 1, k + 12, 80);
/*  56 */     addBlock(i + 1, j + 2, k + 5, 80);
/*  57 */     addBlockAndMetadata(i + 1, j + 2, k + 7, 54, 5);
/*  58 */     addBlockAndMetadata(i + 1, j + 2, k + 8, 54, 5);
/*  59 */     addBlockAndMetadata(i + 1, j + 2, k + 10, 54, 5);
/*  60 */     addBlockAndMetadata(i + 1, j + 2, k + 11, 54, 5);
/*  61 */     addBlock(i + 1, j + 2, k + 12, 80);
/*  62 */     addBlock(i + 1, j + 3, k + 5, 80);
/*  63 */     addBlockAndMetadata(i + 1, j + 3, k + 7, 54, 5);
/*  64 */     addBlockAndMetadata(i + 1, j + 3, k + 8, 54, 5);
/*  65 */     addBlockAndMetadata(i + 1, j + 3, k + 10, 54, 5);
/*  66 */     addChestWithDefaultLoot(rand, i + 1, j + 3, k + 11);
/*  67 */     addBlock(i + 1, j + 3, k + 12, 80);
/*  68 */     addBlock(i + 1, j + 4, k + 6, 80);
/*  69 */     addBlock(i + 1, j + 4, k + 7, 80);
/*  70 */     addBlock(i + 1, j + 4, k + 8, 80);
/*  71 */     addBlock(i + 1, j + 4, k + 9, 80);
/*  72 */     addBlock(i + 1, j + 4, k + 10, 80);
/*  73 */     addBlock(i + 1, j + 4, k + 11, 80);
/*  74 */     addBlock(i + 2, j + 0, k + 4, 80);
/*  75 */     addBlock(i + 2, j + 0, k + 5, 80);
/*  76 */     addBlock(i + 2, j + 0, k + 6, 80);
/*  77 */     addBlock(i + 2, j + 0, k + 7, 80);
/*  78 */     addBlock(i + 2, j + 0, k + 8, 80);
/*  79 */     addBlock(i + 2, j + 0, k + 9, 80);
/*  80 */     addBlock(i + 2, j + 0, k + 10, 80);
/*  81 */     addBlock(i + 2, j + 0, k + 11, 80);
/*  82 */     addBlock(i + 2, j + 0, k + 12, 80);
/*  83 */     addBlock(i + 2, j + 0, k + 13, 80);
/*  84 */     addBlock(i + 2, j + 1, k + 4, 80);
/*  85 */     addBlockAndMetadata(i + 2, j + 1, k + 5, 54, 3);
/*  86 */     addBlockAndMetadata(i + 2, j + 1, k + 12, 54, 2);
/*  87 */     addBlock(i + 2, j + 1, k + 13, 80);
/*  88 */     addBlock(i + 2, j + 2, k + 4, 80);
/*  89 */     addBlock(i + 2, j + 2, k + 13, 80);
/*  90 */     addBlock(i + 2, j + 3, k + 4, 80);
/*  91 */     addBlock(i + 2, j + 3, k + 13, 80);
/*  92 */     addBlock(i + 2, j + 4, k + 5, 80);
/*  93 */     addBlock(i + 2, j + 4, k + 12, 80);
/*  94 */     addBlock(i + 2, j + 5, k + 6, 80);
/*  95 */     addBlock(i + 2, j + 5, k + 7, 80);
/*  96 */     addBlock(i + 2, j + 5, k + 8, 80);
/*  97 */     addBlock(i + 2, j + 5, k + 9, 80);
/*  98 */     addBlock(i + 2, j + 5, k + 10, 80);
/*  99 */     addBlock(i + 2, j + 5, k + 11, 80);
/* 100 */     addBlock(i + 3, j + 0, k + 3, 80);
/* 101 */     addBlock(i + 3, j + 0, k + 4, 80);
/* 102 */     addBlock(i + 3, j + 0, k + 5, 80);
/* 103 */     addBlock(i + 3, j + 0, k + 6, 80);
/* 104 */     addBlock(i + 3, j + 0, k + 7, 80);
/* 105 */     addBlock(i + 3, j + 0, k + 8, 80);
/* 106 */     addBlock(i + 3, j + 0, k + 9, 80);
/* 107 */     addBlock(i + 3, j + 0, k + 10, 80);
/* 108 */     addBlock(i + 3, j + 0, k + 11, 80);
/* 109 */     addBlock(i + 3, j + 0, k + 12, 80);
/* 110 */     addBlock(i + 3, j + 0, k + 13, 80);
/* 111 */     addBlock(i + 3, j + 0, k + 14, 80);
/* 112 */     addBlock(i + 3, j + 1, k + 3, 80);
/* 113 */     addBlock(i + 3, j + 1, k + 4, 80);
/* 114 */     addBlockAndMetadata(i + 3, j + 1, k + 5, 54, 3);
/* 115 */     addBlockAndMetadata(i + 3, j + 1, k + 12, 54, 2);
/* 116 */     addBlock(i + 3, j + 1, k + 13, 80);
/* 117 */     addBlock(i + 3, j + 1, k + 14, 80);
/* 118 */     addBlock(i + 3, j + 2, k + 3, 80);
/* 119 */     addBlock(i + 3, j + 2, k + 4, 80);
/* 120 */     addBlock(i + 3, j + 2, k + 13, 80);
/* 121 */     addBlock(i + 3, j + 2, k + 14, 80);
/* 122 */     addBlock(i + 3, j + 3, k + 3, 80);
/* 123 */     addBlock(i + 3, j + 3, k + 4, 80);
/* 124 */     addBlockAndMetadata(i + 3, j + 3, k + 5, 54, 3);
/* 125 */     addChestWithDefaultLoot(rand, i + 3, j + 3, k + 12);
/* 126 */     addBlock(i + 3, j + 3, k + 13, 80);
/* 127 */     addBlock(i + 3, j + 3, k + 14, 80);
/* 128 */     addBlock(i + 3, j + 4, k + 4, 80);
/* 129 */     addBlock(i + 3, j + 4, k + 13, 80);
/* 130 */     addBlock(i + 3, j + 5, k + 5, 80);
/* 131 */     addBlock(i + 3, j + 5, k + 12, 80);
/* 132 */     addBlock(i + 3, j + 6, k + 6, 80);
/* 133 */     addBlock(i + 3, j + 6, k + 7, 80);
/* 134 */     addBlock(i + 3, j + 6, k + 8, 80);
/* 135 */     addBlock(i + 3, j + 6, k + 9, 80);
/* 136 */     addBlock(i + 3, j + 6, k + 10, 80);
/* 137 */     addBlock(i + 3, j + 6, k + 11, 80);
/* 138 */     addBlock(i + 4, j + 0, k + 2, 80);
/* 139 */     addBlock(i + 4, j + 0, k + 3, 80);
/* 140 */     addBlock(i + 4, j + 0, k + 4, 80);
/* 141 */     addBlock(i + 4, j + 0, k + 5, 80);
/* 142 */     addBlock(i + 4, j + 0, k + 6, 80);
/* 143 */     addBlock(i + 4, j + 0, k + 7, 80);
/* 144 */     addBlock(i + 4, j + 0, k + 8, 80);
/* 145 */     addBlock(i + 4, j + 0, k + 9, 80);
/* 146 */     addBlock(i + 4, j + 0, k + 10, 80);
/* 147 */     addBlock(i + 4, j + 0, k + 11, 80);
/* 148 */     addBlock(i + 4, j + 0, k + 12, 80);
/* 149 */     addBlock(i + 4, j + 0, k + 13, 80);
/* 150 */     addBlock(i + 4, j + 0, k + 14, 80);
/* 151 */     addBlock(i + 4, j + 0, k + 15, 80);
/* 152 */     addBlock(i + 4, j + 1, k + 2, 80);
/* 153 */     addBlock(i + 4, j + 1, k + 5, 80);
/* 154 */     addBlock(i + 4, j + 1, k + 6, 80);
/* 155 */     addBlock(i + 4, j + 1, k + 8, 80);
/* 156 */     addBlock(i + 4, j + 1, k + 9, 80);
/* 157 */     addBlock(i + 4, j + 1, k + 10, 80);
/* 158 */     addMobSpawner(i + 4, j + 1, k + 11, new ResourceLocation("SnowMan"));
/* 159 */     addBlock(i + 4, j + 1, k + 12, 80);
/* 160 */     addBlock(i + 4, j + 1, k + 15, 80);
/* 161 */     addBlock(i + 4, j + 2, k + 2, 80);
/* 162 */     addBlock(i + 4, j + 2, k + 5, 80);
/* 163 */     addBlock(i + 4, j + 2, k + 6, 80);
/* 164 */     addBlock(i + 4, j + 2, k + 8, 80);
/* 165 */     addBlock(i + 4, j + 2, k + 9, 80);
/* 166 */     addBlock(i + 4, j + 2, k + 10, 80);
/* 167 */     addBlock(i + 4, j + 2, k + 11, 80);
/* 168 */     addBlock(i + 4, j + 2, k + 12, 80);
/* 169 */     addBlock(i + 4, j + 2, k + 15, 80);
/* 170 */     addBlock(i + 4, j + 3, k + 2, 80);
/* 171 */     addBlock(i + 4, j + 3, k + 5, 80);
/* 172 */     addBlock(i + 4, j + 3, k + 6, 80);
/* 173 */     addBlock(i + 4, j + 3, k + 7, 80);
/* 174 */     addBlock(i + 4, j + 3, k + 8, 80);
/* 175 */     addBlock(i + 4, j + 3, k + 9, 80);
/* 176 */     addBlock(i + 4, j + 3, k + 10, 80);
/* 177 */     addBlock(i + 4, j + 3, k + 11, 80);
/* 178 */     addBlock(i + 4, j + 3, k + 12, 80);
/* 179 */     addBlock(i + 4, j + 3, k + 15, 80);
/* 180 */     addBlock(i + 4, j + 4, k + 3, 80);
/* 181 */     addBlock(i + 4, j + 4, k + 5, 80);
/* 182 */     addBlock(i + 4, j + 4, k + 6, 80);
/* 183 */     addBlock(i + 4, j + 4, k + 7, 80);
/* 184 */     addBlock(i + 4, j + 4, k + 8, 80);
/* 185 */     addBlock(i + 4, j + 4, k + 9, 80);
/* 186 */     addBlock(i + 4, j + 4, k + 10, 80);
/* 187 */     addBlock(i + 4, j + 4, k + 11, 80);
/* 188 */     addBlock(i + 4, j + 4, k + 12, 80);
/* 189 */     addBlock(i + 4, j + 4, k + 14, 80);
/* 190 */     addBlock(i + 4, j + 5, k + 4, 80);
/* 191 */     addBlock(i + 4, j + 5, k + 5, 80);
/* 192 */     addBlock(i + 4, j + 5, k + 6, 80);
/* 193 */     addBlock(i + 4, j + 5, k + 7, 80);
/* 194 */     addBlock(i + 4, j + 5, k + 8, 80);
/* 195 */     addBlock(i + 4, j + 5, k + 9, 80);
/* 196 */     addBlock(i + 4, j + 5, k + 10, 80);
/* 197 */     addBlock(i + 4, j + 5, k + 11, 80);
/* 198 */     addBlock(i + 4, j + 5, k + 12, 80);
/* 199 */     addBlock(i + 4, j + 5, k + 13, 80);
/* 200 */     addBlock(i + 4, j + 6, k + 5, 80);
/* 201 */     addBlock(i + 4, j + 6, k + 6, 80);
/* 202 */     addBlock(i + 4, j + 6, k + 7, 80);
/* 203 */     addBlock(i + 4, j + 6, k + 8, 80);
/* 204 */     addBlock(i + 4, j + 6, k + 9, 80);
/* 205 */     addBlock(i + 4, j + 6, k + 10, 80);
/* 206 */     addBlock(i + 4, j + 6, k + 11, 80);
/* 207 */     addBlock(i + 4, j + 6, k + 12, 80);
/* 208 */     addBlock(i + 4, j + 7, k + 6, 80);
/* 209 */     addBlock(i + 4, j + 7, k + 7, 80);
/* 210 */     addBlock(i + 4, j + 7, k + 8, 80);
/* 211 */     addBlock(i + 4, j + 7, k + 9, 80);
/* 212 */     addBlock(i + 4, j + 7, k + 10, 80);
/* 213 */     addBlock(i + 4, j + 7, k + 11, 80);
/* 214 */     addBlock(i + 5, j + 0, k + 1, 80);
/* 215 */     addBlock(i + 5, j + 0, k + 2, 80);
/* 216 */     addBlock(i + 5, j + 0, k + 3, 80);
/* 217 */     addBlock(i + 5, j + 0, k + 4, 80);
/* 218 */     addBlock(i + 5, j + 0, k + 5, 80);
/* 219 */     addBlock(i + 5, j + 0, k + 6, 80);
/* 220 */     addBlock(i + 5, j + 0, k + 7, 80);
/* 221 */     addBlock(i + 5, j + 0, k + 8, 80);
/* 222 */     addBlock(i + 5, j + 0, k + 9, 80);
/* 223 */     addBlock(i + 5, j + 0, k + 10, 80);
/* 224 */     addBlock(i + 5, j + 0, k + 11, 80);
/* 225 */     addBlock(i + 5, j + 0, k + 12, 80);
/* 226 */     addBlock(i + 5, j + 0, k + 13, 80);
/* 227 */     addBlock(i + 5, j + 0, k + 14, 80);
/* 228 */     addBlock(i + 5, j + 0, k + 15, 80);
/* 229 */     addBlock(i + 5, j + 0, k + 16, 80);
/* 230 */     addBlock(i + 5, j + 1, k + 1, 80);
/* 231 */     addBlock(i + 5, j + 1, k + 16, 80);
/* 232 */     addBlock(i + 5, j + 2, k + 1, 80);
/* 233 */     addBlock(i + 5, j + 2, k + 16, 80);
/* 234 */     addBlock(i + 5, j + 3, k + 1, 80);
/* 235 */     addBlock(i + 5, j + 3, k + 16, 80);
/* 236 */     addBlock(i + 5, j + 4, k + 2, 80);
/* 237 */     addBlock(i + 5, j + 4, k + 15, 80);
/* 238 */     addBlock(i + 5, j + 5, k + 3, 80);
/* 239 */     addBlock(i + 5, j + 5, k + 14, 80);
/* 240 */     addBlock(i + 5, j + 6, k + 4, 80);
/* 241 */     addBlock(i + 5, j + 6, k + 13, 80);
/* 242 */     addBlock(i + 5, j + 7, k + 5, 80);
/* 243 */     addBlock(i + 5, j + 7, k + 6, 80);
/* 244 */     addBlock(i + 5, j + 7, k + 7, 80);
/* 245 */     addBlock(i + 5, j + 7, k + 8, 80);
/* 246 */     addBlock(i + 5, j + 7, k + 9, 80);
/* 247 */     addBlock(i + 5, j + 7, k + 10, 80);
/* 248 */     addBlock(i + 5, j + 7, k + 11, 80);
/* 249 */     addBlock(i + 5, j + 7, k + 12, 80);
/* 250 */     addBlock(i + 6, j + 0, k + 0, 80);
/* 251 */     addBlock(i + 6, j + 0, k + 1, 80);
/* 252 */     addBlock(i + 6, j + 0, k + 2, 80);
/* 253 */     addBlock(i + 6, j + 0, k + 3, 80);
/* 254 */     addBlock(i + 6, j + 0, k + 4, 80);
/* 255 */     addBlock(i + 6, j + 0, k + 5, 80);
/* 256 */     addBlock(i + 6, j + 0, k + 6, 80);
/* 257 */     addBlock(i + 6, j + 0, k + 7, 80);
/* 258 */     addBlock(i + 6, j + 0, k + 8, 80);
/* 259 */     addBlock(i + 6, j + 0, k + 9, 80);
/* 260 */     addBlock(i + 6, j + 0, k + 10, 80);
/* 261 */     addBlock(i + 6, j + 0, k + 11, 80);
/* 262 */     addBlock(i + 6, j + 0, k + 12, 80);
/* 263 */     addBlock(i + 6, j + 0, k + 13, 80);
/* 264 */     addBlock(i + 6, j + 0, k + 14, 80);
/* 265 */     addBlock(i + 6, j + 0, k + 15, 80);
/* 266 */     addBlock(i + 6, j + 0, k + 16, 80);
/* 267 */     addBlock(i + 6, j + 0, k + 17, 80);
/* 268 */     addBlock(i + 6, j + 1, k + 0, 80);
/* 269 */     addBlock(i + 6, j + 1, k + 16, 85);
/* 270 */     addBlock(i + 6, j + 1, k + 17, 80);
/* 271 */     addBlock(i + 6, j + 2, k + 0, 80);
/* 272 */     addBlock(i + 6, j + 2, k + 16, 85);
/* 273 */     addBlock(i + 6, j + 2, k + 17, 80);
/* 274 */     addBlock(i + 6, j + 3, k + 0, 80);
/* 275 */     addBlock(i + 6, j + 3, k + 16, 89);
/* 276 */     addBlock(i + 6, j + 3, k + 17, 80);
/* 277 */     addBlock(i + 6, j + 4, k + 1, 80);
/* 278 */     addBlock(i + 6, j + 4, k + 16, 80);
/* 279 */     addBlock(i + 6, j + 5, k + 2, 80);
/* 280 */     addBlock(i + 6, j + 5, k + 15, 80);
/* 281 */     addBlock(i + 6, j + 6, k + 3, 80);
/* 282 */     addBlock(i + 6, j + 6, k + 14, 80);
/* 283 */     addBlock(i + 6, j + 7, k + 4, 80);
/* 284 */     addBlock(i + 6, j + 7, k + 5, 80);
/* 285 */     addBlock(i + 6, j + 7, k + 6, 80);
/* 286 */     addBlock(i + 6, j + 7, k + 7, 80);
/* 287 */     addBlock(i + 6, j + 7, k + 8, 80);
/* 288 */     addBlock(i + 6, j + 7, k + 9, 80);
/* 289 */     addBlock(i + 6, j + 7, k + 10, 80);
/* 290 */     addBlock(i + 6, j + 7, k + 11, 80);
/* 291 */     addBlock(i + 6, j + 7, k + 12, 80);
/* 292 */     addBlock(i + 6, j + 7, k + 13, 80);
/* 293 */     addBlock(i + 7, j + 0, k + 0, 80);
/* 294 */     addBlock(i + 7, j + 0, k + 1, 80);
/* 295 */     addBlock(i + 7, j + 0, k + 2, 80);
/* 296 */     addBlock(i + 7, j + 0, k + 3, 80);
/* 297 */     addBlock(i + 7, j + 0, k + 4, 80);
/* 298 */     addBlock(i + 7, j + 0, k + 5, 80);
/* 299 */     addBlock(i + 7, j + 0, k + 6, 80);
/* 300 */     addBlock(i + 7, j + 0, k + 7, 80);
/* 301 */     addBlock(i + 7, j + 0, k + 8, 80);
/* 302 */     addBlock(i + 7, j + 0, k + 9, 80);
/* 303 */     addBlock(i + 7, j + 0, k + 10, 80);
/* 304 */     addBlock(i + 7, j + 0, k + 11, 80);
/* 305 */     addBlock(i + 7, j + 0, k + 12, 80);
/* 306 */     addBlock(i + 7, j + 0, k + 13, 80);
/* 307 */     addBlock(i + 7, j + 0, k + 14, 80);
/* 308 */     addBlock(i + 7, j + 0, k + 15, 80);
/* 309 */     addBlock(i + 7, j + 0, k + 16, 80);
/* 310 */     addBlock(i + 7, j + 0, k + 17, 80);
/* 311 */     addBlock(i + 7, j + 1, k + 0, 80);
/* 312 */     addBlockAndMetadata(i + 7, j + 1, k + 10, 44, 2);
/* 313 */     addBlockAndMetadata(i + 7, j + 1, k + 11, 44, 2);
/* 314 */     addBlockAndMetadata(i + 7, j + 1, k + 12, 44, 2);
/* 315 */     addBlockAndMetadata(i + 7, j + 1, k + 13, 44, 2);
/* 316 */     addBlockAndMetadata(i + 7, j + 1, k + 14, 44, 2);
/* 317 */     addBlock(i + 7, j + 1, k + 17, 80);
/* 318 */     addBlock(i + 7, j + 2, k + 0, 80);
/* 319 */     addBlock(i + 7, j + 2, k + 17, 80);
/* 320 */     addBlock(i + 7, j + 3, k + 0, 80);
/* 321 */     addBlock(i + 7, j + 3, k + 17, 80);
/* 322 */     addBlock(i + 7, j + 4, k + 1, 80);
/* 323 */     addBlock(i + 7, j + 4, k + 16, 80);
/* 324 */     addBlock(i + 7, j + 5, k + 2, 80);
/* 325 */     addBlock(i + 7, j + 5, k + 15, 80);
/* 326 */     addBlock(i + 7, j + 6, k + 3, 80);
/* 327 */     addBlock(i + 7, j + 6, k + 14, 80);
/* 328 */     addBlock(i + 7, j + 7, k + 4, 80);
/* 329 */     addBlock(i + 7, j + 7, k + 5, 80);
/* 330 */     addBlock(i + 7, j + 7, k + 6, 80);
/* 331 */     addBlock(i + 7, j + 7, k + 7, 80);
/* 332 */     addBlock(i + 7, j + 7, k + 8, 80);
/* 333 */     addBlock(i + 7, j + 7, k + 9, 80);
/* 334 */     addBlock(i + 7, j + 7, k + 10, 80);
/* 335 */     addBlock(i + 7, j + 7, k + 11, 80);
/* 336 */     addBlock(i + 7, j + 7, k + 12, 80);
/* 337 */     addBlock(i + 7, j + 7, k + 13, 80);
/* 338 */     addBlock(i + 8, j + 0, k + 0, 80);
/* 339 */     addBlock(i + 8, j + 0, k + 1, 80);
/* 340 */     addBlock(i + 8, j + 0, k + 2, 80);
/* 341 */     addBlock(i + 8, j + 0, k + 3, 80);
/* 342 */     addBlock(i + 8, j + 0, k + 4, 80);
/* 343 */     addBlock(i + 8, j + 0, k + 5, 80);
/* 344 */     addBlock(i + 8, j + 0, k + 6, 80);
/* 345 */     addBlock(i + 8, j + 0, k + 7, 80);
/* 346 */     addBlock(i + 8, j + 0, k + 8, 80);
/* 347 */     addBlock(i + 8, j + 0, k + 9, 80);
/* 348 */     addBlock(i + 8, j + 0, k + 10, 80);
/* 349 */     addBlock(i + 8, j + 0, k + 11, 80);
/* 350 */     addBlock(i + 8, j + 0, k + 12, 80);
/* 351 */     addBlock(i + 8, j + 0, k + 13, 80);
/* 352 */     addBlock(i + 8, j + 0, k + 14, 80);
/* 353 */     addBlock(i + 8, j + 0, k + 15, 80);
/* 354 */     addBlock(i + 8, j + 0, k + 16, 80);
/* 355 */     addBlock(i + 8, j + 0, k + 17, 80);
/* 356 */     addBlock(i + 8, j + 1, k + 10, 85);
/* 357 */     addBlock(i + 8, j + 1, k + 11, 85);
/* 358 */     addBlock(i + 8, j + 1, k + 12, 85);
/* 359 */     addBlock(i + 8, j + 1, k + 13, 85);
/* 360 */     addBlock(i + 8, j + 1, k + 14, 85);
/* 361 */     addBlock(i + 8, j + 1, k + 17, 80);
/* 362 */     addBlock(i + 8, j + 2, k + 17, 80);
/* 363 */     addBlock(i + 8, j + 3, k + 0, 80);
/* 364 */     addBlock(i + 8, j + 3, k + 17, 80);
/* 365 */     addBlock(i + 8, j + 4, k + 1, 80);
/* 366 */     addBlock(i + 8, j + 4, k + 16, 80);
/* 367 */     addBlock(i + 8, j + 5, k + 2, 80);
/* 368 */     addBlock(i + 8, j + 5, k + 15, 80);
/* 369 */     addBlock(i + 8, j + 6, k + 3, 80);
/* 370 */     addBlock(i + 8, j + 6, k + 14, 80);
/* 371 */     addBlock(i + 8, j + 7, k + 4, 80);
/* 372 */     addBlock(i + 8, j + 7, k + 5, 80);
/* 373 */     addBlock(i + 8, j + 7, k + 6, 80);
/* 374 */     addBlock(i + 8, j + 7, k + 7, 80);
/* 375 */     addBlock(i + 8, j + 7, k + 8, 80);
/* 376 */     addBlock(i + 8, j + 7, k + 9, 80);
/* 377 */     addBlock(i + 8, j + 7, k + 10, 80);
/* 378 */     addBlock(i + 8, j + 7, k + 11, 80);
/* 379 */     addBlock(i + 8, j + 7, k + 12, 80);
/* 380 */     addBlock(i + 8, j + 7, k + 13, 80);
/* 381 */     addBlock(i + 9, j + 0, k + 0, 80);
/* 382 */     addBlock(i + 9, j + 0, k + 1, 80);
/* 383 */     addBlock(i + 9, j + 0, k + 2, 80);
/* 384 */     addBlock(i + 9, j + 0, k + 3, 80);
/* 385 */     addBlock(i + 9, j + 0, k + 4, 80);
/* 386 */     addBlock(i + 9, j + 0, k + 5, 80);
/* 387 */     addBlock(i + 9, j + 0, k + 6, 80);
/* 388 */     addBlock(i + 9, j + 0, k + 7, 80);
/* 389 */     addBlock(i + 9, j + 0, k + 8, 80);
/* 390 */     addBlock(i + 9, j + 0, k + 9, 80);
/* 391 */     addBlock(i + 9, j + 0, k + 10, 80);
/* 392 */     addBlock(i + 9, j + 0, k + 11, 80);
/* 393 */     addBlock(i + 9, j + 0, k + 12, 80);
/* 394 */     addBlock(i + 9, j + 0, k + 13, 80);
/* 395 */     addBlock(i + 9, j + 0, k + 14, 80);
/* 396 */     addBlock(i + 9, j + 0, k + 15, 80);
/* 397 */     addBlock(i + 9, j + 0, k + 16, 80);
/* 398 */     addBlock(i + 9, j + 0, k + 17, 80);
/* 399 */     addBlock(i + 9, j + 1, k + 10, 85);
/* 400 */     addBlock(i + 9, j + 1, k + 11, 85);
/* 401 */     addBlock(i + 9, j + 1, k + 12, 85);
/* 402 */     addBlock(i + 9, j + 1, k + 13, 85);
/* 403 */     addBlock(i + 9, j + 1, k + 14, 85);
/* 404 */     addBlock(i + 9, j + 1, k + 17, 80);
/* 405 */     addBlock(i + 9, j + 2, k + 17, 80);
/* 406 */     addBlock(i + 9, j + 3, k + 0, 80);
/* 407 */     addBlock(i + 9, j + 3, k + 17, 80);
/* 408 */     addBlock(i + 9, j + 4, k + 1, 80);
/* 409 */     addBlock(i + 9, j + 4, k + 16, 80);
/* 410 */     addBlock(i + 9, j + 5, k + 2, 80);
/* 411 */     addBlock(i + 9, j + 5, k + 15, 80);
/* 412 */     addBlock(i + 9, j + 6, k + 3, 80);
/* 413 */     addBlock(i + 9, j + 6, k + 14, 80);
/* 414 */     addBlock(i + 9, j + 7, k + 4, 80);
/* 415 */     addBlock(i + 9, j + 7, k + 5, 80);
/* 416 */     addBlock(i + 9, j + 7, k + 6, 80);
/* 417 */     addBlock(i + 9, j + 7, k + 7, 80);
/* 418 */     addBlock(i + 9, j + 7, k + 8, 80);
/* 419 */     addBlock(i + 9, j + 7, k + 9, 80);
/* 420 */     addBlock(i + 9, j + 7, k + 10, 80);
/* 421 */     addBlock(i + 9, j + 7, k + 11, 80);
/* 422 */     addBlock(i + 9, j + 7, k + 12, 80);
/* 423 */     addBlock(i + 9, j + 7, k + 13, 80);
/* 424 */     addBlock(i + 10, j + 0, k + 0, 80);
/* 425 */     addBlock(i + 10, j + 0, k + 1, 80);
/* 426 */     addBlock(i + 10, j + 0, k + 2, 80);
/* 427 */     addBlock(i + 10, j + 0, k + 3, 80);
/* 428 */     addBlock(i + 10, j + 0, k + 4, 80);
/* 429 */     addBlock(i + 10, j + 0, k + 5, 80);
/* 430 */     addBlock(i + 10, j + 0, k + 6, 80);
/* 431 */     addBlock(i + 10, j + 0, k + 7, 80);
/* 432 */     addBlock(i + 10, j + 0, k + 8, 80);
/* 433 */     addBlock(i + 10, j + 0, k + 9, 80);
/* 434 */     addBlock(i + 10, j + 0, k + 10, 80);
/* 435 */     addBlock(i + 10, j + 0, k + 11, 80);
/* 436 */     addBlock(i + 10, j + 0, k + 12, 80);
/* 437 */     addBlock(i + 10, j + 0, k + 13, 80);
/* 438 */     addBlock(i + 10, j + 0, k + 14, 80);
/* 439 */     addBlock(i + 10, j + 0, k + 15, 80);
/* 440 */     addBlock(i + 10, j + 0, k + 16, 80);
/* 441 */     addBlock(i + 10, j + 0, k + 17, 80);
/* 442 */     addBlock(i + 10, j + 1, k + 0, 80);
/* 443 */     addBlockAndMetadata(i + 10, j + 1, k + 10, 44, 2);
/* 444 */     addBlockAndMetadata(i + 10, j + 1, k + 11, 44, 2);
/* 445 */     addBlockAndMetadata(i + 10, j + 1, k + 12, 44, 2);
/* 446 */     addBlockAndMetadata(i + 10, j + 1, k + 13, 44, 2);
/* 447 */     addBlockAndMetadata(i + 10, j + 1, k + 14, 44, 2);
/* 448 */     addBlock(i + 10, j + 1, k + 17, 80);
/* 449 */     addBlock(i + 10, j + 2, k + 0, 80);
/* 450 */     addBlock(i + 10, j + 2, k + 17, 80);
/* 451 */     addBlock(i + 10, j + 3, k + 0, 80);
/* 452 */     addBlock(i + 10, j + 3, k + 17, 80);
/* 453 */     addBlock(i + 10, j + 4, k + 1, 80);
/* 454 */     addBlock(i + 10, j + 4, k + 16, 80);
/* 455 */     addBlock(i + 10, j + 5, k + 2, 80);
/* 456 */     addBlock(i + 10, j + 5, k + 15, 80);
/* 457 */     addBlock(i + 10, j + 6, k + 3, 80);
/* 458 */     addBlock(i + 10, j + 6, k + 14, 80);
/* 459 */     addBlock(i + 10, j + 7, k + 4, 80);
/* 460 */     addBlock(i + 10, j + 7, k + 5, 80);
/* 461 */     addBlock(i + 10, j + 7, k + 6, 80);
/* 462 */     addBlock(i + 10, j + 7, k + 7, 80);
/* 463 */     addBlock(i + 10, j + 7, k + 8, 80);
/* 464 */     addBlock(i + 10, j + 7, k + 9, 80);
/* 465 */     addBlock(i + 10, j + 7, k + 10, 80);
/* 466 */     addBlock(i + 10, j + 7, k + 11, 80);
/* 467 */     addBlock(i + 10, j + 7, k + 12, 80);
/* 468 */     addBlock(i + 10, j + 7, k + 13, 80);
/* 469 */     addBlock(i + 11, j + 0, k + 0, 80);
/* 470 */     addBlock(i + 11, j + 0, k + 1, 80);
/* 471 */     addBlock(i + 11, j + 0, k + 2, 80);
/* 472 */     addBlock(i + 11, j + 0, k + 3, 80);
/* 473 */     addBlock(i + 11, j + 0, k + 4, 80);
/* 474 */     addBlock(i + 11, j + 0, k + 5, 80);
/* 475 */     addBlock(i + 11, j + 0, k + 6, 80);
/* 476 */     addBlock(i + 11, j + 0, k + 7, 80);
/* 477 */     addBlock(i + 11, j + 0, k + 8, 80);
/* 478 */     addBlock(i + 11, j + 0, k + 9, 80);
/* 479 */     addBlock(i + 11, j + 0, k + 10, 80);
/* 480 */     addBlock(i + 11, j + 0, k + 11, 80);
/* 481 */     addBlock(i + 11, j + 0, k + 12, 80);
/* 482 */     addBlock(i + 11, j + 0, k + 13, 80);
/* 483 */     addBlock(i + 11, j + 0, k + 14, 80);
/* 484 */     addBlock(i + 11, j + 0, k + 15, 80);
/* 485 */     addBlock(i + 11, j + 0, k + 16, 80);
/* 486 */     addBlock(i + 11, j + 0, k + 17, 80);
/* 487 */     addBlock(i + 11, j + 1, k + 0, 80);
/* 488 */     addBlock(i + 11, j + 1, k + 16, 85);
/* 489 */     addBlock(i + 11, j + 1, k + 17, 80);
/* 490 */     addBlock(i + 11, j + 2, k + 0, 80);
/* 491 */     addBlock(i + 11, j + 2, k + 16, 85);
/* 492 */     addBlock(i + 11, j + 2, k + 17, 80);
/* 493 */     addBlock(i + 11, j + 3, k + 0, 80);
/* 494 */     addBlock(i + 11, j + 3, k + 16, 89);
/* 495 */     addBlock(i + 11, j + 3, k + 17, 80);
/* 496 */     addBlock(i + 11, j + 4, k + 1, 80);
/* 497 */     addBlock(i + 11, j + 4, k + 16, 80);
/* 498 */     addBlock(i + 11, j + 5, k + 2, 80);
/* 499 */     addBlock(i + 11, j + 5, k + 15, 80);
/* 500 */     addBlock(i + 11, j + 6, k + 3, 80);
/* 501 */     addBlock(i + 11, j + 6, k + 14, 80);
/* 502 */     addBlock(i + 11, j + 7, k + 4, 80);
/* 503 */     addBlock(i + 11, j + 7, k + 5, 80);
/* 504 */     addBlock(i + 11, j + 7, k + 6, 80);
/* 505 */     addBlock(i + 11, j + 7, k + 7, 80);
/* 506 */     addBlock(i + 11, j + 7, k + 8, 80);
/* 507 */     addBlock(i + 11, j + 7, k + 9, 80);
/* 508 */     addBlock(i + 11, j + 7, k + 10, 80);
/* 509 */     addBlock(i + 11, j + 7, k + 11, 80);
/* 510 */     addBlock(i + 11, j + 7, k + 12, 80);
/* 511 */     addBlock(i + 11, j + 7, k + 13, 80);
/* 512 */     addBlock(i + 12, j + 0, k + 1, 80);
/* 513 */     addBlock(i + 12, j + 0, k + 2, 80);
/* 514 */     addBlock(i + 12, j + 0, k + 3, 80);
/* 515 */     addBlock(i + 12, j + 0, k + 4, 80);
/* 516 */     addBlock(i + 12, j + 0, k + 5, 80);
/* 517 */     addBlock(i + 12, j + 0, k + 6, 80);
/* 518 */     addBlock(i + 12, j + 0, k + 7, 80);
/* 519 */     addBlock(i + 12, j + 0, k + 8, 80);
/* 520 */     addBlock(i + 12, j + 0, k + 9, 80);
/* 521 */     addBlock(i + 12, j + 0, k + 10, 80);
/* 522 */     addBlock(i + 12, j + 0, k + 11, 80);
/* 523 */     addBlock(i + 12, j + 0, k + 12, 80);
/* 524 */     addBlock(i + 12, j + 0, k + 13, 80);
/* 525 */     addBlock(i + 12, j + 0, k + 14, 80);
/* 526 */     addBlock(i + 12, j + 0, k + 15, 80);
/* 527 */     addBlock(i + 12, j + 0, k + 16, 80);
/* 528 */     addBlock(i + 12, j + 1, k + 1, 80);
/* 529 */     addBlock(i + 12, j + 1, k + 16, 80);
/* 530 */     addBlock(i + 12, j + 2, k + 1, 80);
/* 531 */     addBlock(i + 12, j + 2, k + 16, 80);
/* 532 */     addBlock(i + 12, j + 3, k + 1, 80);
/* 533 */     addBlock(i + 12, j + 3, k + 16, 80);
/* 534 */     addBlock(i + 12, j + 4, k + 2, 80);
/* 535 */     addBlock(i + 12, j + 4, k + 15, 80);
/* 536 */     addBlock(i + 12, j + 5, k + 3, 80);
/* 537 */     addBlock(i + 12, j + 5, k + 14, 80);
/* 538 */     addBlock(i + 12, j + 6, k + 4, 80);
/* 539 */     addBlock(i + 12, j + 6, k + 13, 80);
/* 540 */     addBlock(i + 12, j + 7, k + 5, 80);
/* 541 */     addBlock(i + 12, j + 7, k + 6, 80);
/* 542 */     addBlock(i + 12, j + 7, k + 7, 80);
/* 543 */     addBlock(i + 12, j + 7, k + 8, 80);
/* 544 */     addBlock(i + 12, j + 7, k + 9, 80);
/* 545 */     addBlock(i + 12, j + 7, k + 10, 80);
/* 546 */     addBlock(i + 12, j + 7, k + 11, 80);
/* 547 */     addBlock(i + 12, j + 7, k + 12, 80);
/* 548 */     addBlock(i + 13, j + 0, k + 2, 80);
/* 549 */     addBlock(i + 13, j + 0, k + 3, 80);
/* 550 */     addBlock(i + 13, j + 0, k + 4, 80);
/* 551 */     addBlock(i + 13, j + 0, k + 5, 80);
/* 552 */     addBlock(i + 13, j + 0, k + 6, 80);
/* 553 */     addBlock(i + 13, j + 0, k + 7, 80);
/* 554 */     addBlock(i + 13, j + 0, k + 8, 80);
/* 555 */     addBlock(i + 13, j + 0, k + 9, 80);
/* 556 */     addBlock(i + 13, j + 0, k + 10, 80);
/* 557 */     addBlock(i + 13, j + 0, k + 11, 80);
/* 558 */     addBlock(i + 13, j + 0, k + 12, 80);
/* 559 */     addBlock(i + 13, j + 0, k + 13, 80);
/* 560 */     addBlock(i + 13, j + 0, k + 14, 80);
/* 561 */     addBlock(i + 13, j + 0, k + 15, 80);
/* 562 */     addBlock(i + 13, j + 1, k + 2, 80);
/* 563 */     addBlock(i + 13, j + 1, k + 15, 80);
/* 564 */     addBlock(i + 13, j + 2, k + 2, 80);
/* 565 */     addBlock(i + 13, j + 2, k + 15, 80);
/* 566 */     addBlock(i + 13, j + 3, k + 2, 80);
/* 567 */     addBlock(i + 13, j + 3, k + 15, 80);
/* 568 */     addBlock(i + 13, j + 4, k + 3, 80);
/* 569 */     addBlock(i + 13, j + 4, k + 14, 80);
/* 570 */     addBlock(i + 13, j + 5, k + 4, 80);
/* 571 */     addBlock(i + 13, j + 5, k + 13, 80);
/* 572 */     addBlock(i + 13, j + 6, k + 5, 80);
/* 573 */     addBlock(i + 13, j + 6, k + 12, 80);
/* 574 */     addBlock(i + 13, j + 7, k + 6, 80);
/* 575 */     addBlock(i + 13, j + 7, k + 7, 80);
/* 576 */     addBlock(i + 13, j + 7, k + 8, 80);
/* 577 */     addBlock(i + 13, j + 7, k + 9, 80);
/* 578 */     addBlock(i + 13, j + 7, k + 10, 80);
/* 579 */     addBlock(i + 13, j + 7, k + 11, 80);
/* 580 */     addBlock(i + 14, j + 0, k + 3, 80);
/* 581 */     addBlock(i + 14, j + 0, k + 4, 80);
/* 582 */     addBlock(i + 14, j + 0, k + 5, 80);
/* 583 */     addBlock(i + 14, j + 0, k + 6, 80);
/* 584 */     addBlock(i + 14, j + 0, k + 7, 80);
/* 585 */     addBlock(i + 14, j + 0, k + 8, 80);
/* 586 */     addBlock(i + 14, j + 0, k + 9, 80);
/* 587 */     addBlock(i + 14, j + 0, k + 10, 80);
/* 588 */     addBlock(i + 14, j + 0, k + 11, 80);
/* 589 */     addBlock(i + 14, j + 0, k + 12, 80);
/* 590 */     addBlock(i + 14, j + 0, k + 13, 80);
/* 591 */     addBlock(i + 14, j + 0, k + 14, 80);
/* 592 */     addBlock(i + 14, j + 1, k + 3, 80);
/* 593 */     addBlock(i + 14, j + 1, k + 5, 80);
/* 594 */     addBlock(i + 14, j + 1, k + 6, 80);
/* 595 */     addBlock(i + 14, j + 1, k + 8, 80);
/* 596 */     addBlock(i + 14, j + 1, k + 9, 80);
/* 597 */     addBlock(i + 14, j + 1, k + 10, 80);
/* 598 */     addMobSpawner(i + 14, j + 1, k + 11, new ResourceLocation("SnowMan"));
/* 599 */     addBlock(i + 14, j + 1, k + 12, 80);
/* 600 */     addBlock(i + 14, j + 1, k + 14, 80);
/* 601 */     addBlock(i + 14, j + 2, k + 3, 80);
/* 602 */     addBlock(i + 14, j + 2, k + 5, 80);
/* 603 */     addBlock(i + 14, j + 2, k + 6, 80);
/* 604 */     addBlock(i + 14, j + 2, k + 8, 80);
/* 605 */     addBlock(i + 14, j + 2, k + 9, 80);
/* 606 */     addBlock(i + 14, j + 2, k + 10, 80);
/* 607 */     addBlock(i + 14, j + 2, k + 11, 80);
/* 608 */     addBlock(i + 14, j + 2, k + 12, 80);
/* 609 */     addBlock(i + 14, j + 2, k + 14, 80);
/* 610 */     addBlock(i + 14, j + 3, k + 3, 80);
/* 611 */     addBlock(i + 14, j + 3, k + 5, 80);
/* 612 */     addBlock(i + 14, j + 3, k + 6, 80);
/* 613 */     addBlock(i + 14, j + 3, k + 7, 80);
/* 614 */     addBlock(i + 14, j + 3, k + 8, 80);
/* 615 */     addBlock(i + 14, j + 3, k + 9, 80);
/* 616 */     addBlock(i + 14, j + 3, k + 10, 80);
/* 617 */     addBlock(i + 14, j + 3, k + 11, 80);
/* 618 */     addBlock(i + 14, j + 3, k + 12, 80);
/* 619 */     addBlock(i + 14, j + 3, k + 14, 80);
/* 620 */     addBlock(i + 14, j + 4, k + 4, 80);
/* 621 */     addBlock(i + 14, j + 4, k + 5, 80);
/* 622 */     addBlock(i + 14, j + 4, k + 6, 80);
/* 623 */     addBlock(i + 14, j + 4, k + 7, 80);
/* 624 */     addBlock(i + 14, j + 4, k + 8, 80);
/* 625 */     addBlock(i + 14, j + 4, k + 9, 80);
/* 626 */     addBlock(i + 14, j + 4, k + 10, 80);
/* 627 */     addBlock(i + 14, j + 4, k + 11, 80);
/* 628 */     addBlock(i + 14, j + 4, k + 12, 80);
/* 629 */     addBlock(i + 14, j + 4, k + 13, 80);
/* 630 */     addBlock(i + 14, j + 5, k + 5, 80);
/* 631 */     addBlock(i + 14, j + 5, k + 6, 80);
/* 632 */     addBlock(i + 14, j + 5, k + 7, 80);
/* 633 */     addBlock(i + 14, j + 5, k + 8, 80);
/* 634 */     addBlock(i + 14, j + 5, k + 9, 80);
/* 635 */     addBlock(i + 14, j + 5, k + 10, 80);
/* 636 */     addBlock(i + 14, j + 5, k + 11, 80);
/* 637 */     addBlock(i + 14, j + 5, k + 12, 80);
/* 638 */     addBlock(i + 14, j + 6, k + 6, 80);
/* 639 */     addBlock(i + 14, j + 6, k + 7, 80);
/* 640 */     addBlock(i + 14, j + 6, k + 8, 80);
/* 641 */     addBlock(i + 14, j + 6, k + 9, 80);
/* 642 */     addBlock(i + 14, j + 6, k + 10, 80);
/* 643 */     addBlock(i + 14, j + 6, k + 11, 80);
/* 644 */     addBlock(i + 15, j + 0, k + 4, 80);
/* 645 */     addBlock(i + 15, j + 0, k + 5, 80);
/* 646 */     addBlock(i + 15, j + 0, k + 6, 80);
/* 647 */     addBlock(i + 15, j + 0, k + 7, 80);
/* 648 */     addBlock(i + 15, j + 0, k + 8, 80);
/* 649 */     addBlock(i + 15, j + 0, k + 9, 80);
/* 650 */     addBlock(i + 15, j + 0, k + 10, 80);
/* 651 */     addBlock(i + 15, j + 0, k + 11, 80);
/* 652 */     addBlock(i + 15, j + 0, k + 12, 80);
/* 653 */     addBlock(i + 15, j + 0, k + 13, 80);
/* 654 */     addBlock(i + 15, j + 1, k + 4, 80);
/* 655 */     addBlockAndMetadata(i + 15, j + 1, k + 5, 54, 3);
/* 656 */     addBlockAndMetadata(i + 15, j + 1, k + 12, 54, 2);
/* 657 */     addBlock(i + 15, j + 1, k + 13, 80);
/* 658 */     addBlock(i + 15, j + 2, k + 4, 80);
/* 659 */     addChestWithDefaultLoot(rand, i + 15, j + 2, k + 5);
/* 660 */     addChestWithDefaultLoot(rand, i + 15, j + 2, k + 12);
/* 661 */     addBlock(i + 15, j + 2, k + 13, 80);
/* 662 */     addBlock(i + 15, j + 3, k + 4, 80);
/* 663 */     addBlock(i + 15, j + 3, k + 13, 80);
/* 664 */     addBlock(i + 15, j + 4, k + 5, 80);
/* 665 */     addBlock(i + 15, j + 4, k + 12, 80);
/* 666 */     addBlock(i + 15, j + 5, k + 6, 80);
/* 667 */     addBlock(i + 15, j + 5, k + 7, 80);
/* 668 */     addBlock(i + 15, j + 5, k + 8, 80);
/* 669 */     addBlock(i + 15, j + 5, k + 9, 80);
/* 670 */     addBlock(i + 15, j + 5, k + 10, 80);
/* 671 */     addBlock(i + 15, j + 5, k + 11, 80);
/* 672 */     addBlock(i + 16, j + 0, k + 5, 80);
/* 673 */     addBlock(i + 16, j + 0, k + 6, 80);
/* 674 */     addBlock(i + 16, j + 0, k + 7, 80);
/* 675 */     addBlock(i + 16, j + 0, k + 8, 80);
/* 676 */     addBlock(i + 16, j + 0, k + 9, 80);
/* 677 */     addBlock(i + 16, j + 0, k + 10, 80);
/* 678 */     addBlock(i + 16, j + 0, k + 11, 80);
/* 679 */     addBlock(i + 16, j + 0, k + 12, 80);
/* 680 */     addBlock(i + 16, j + 1, k + 5, 80);
/* 681 */     addBlockAndMetadata(i + 16, j + 1, k + 6, 54, 4);
/* 682 */     addBlockAndMetadata(i + 16, j + 1, k + 8, 54, 4);
/* 683 */     addBlockAndMetadata(i + 16, j + 1, k + 10, 54, 4);
/* 684 */     addBlock(i + 16, j + 1, k + 12, 80);
/* 685 */     addBlock(i + 16, j + 2, k + 5, 80);
/* 686 */     addBlockAndMetadata(i + 16, j + 2, k + 6, 54, 4);
/* 687 */     addBlockAndMetadata(i + 16, j + 2, k + 8, 54, 4);
/* 688 */     addChestWithDefaultLoot(rand, i + 16, j + 2, k + 10);
/* 689 */     addBlock(i + 16, j + 2, k + 12, 80);
/* 690 */     addBlock(i + 16, j + 3, k + 5, 80);
/* 691 */     addBlock(i + 16, j + 3, k + 12, 80);
/* 692 */     addBlock(i + 16, j + 4, k + 6, 80);
/* 693 */     addBlock(i + 16, j + 4, k + 7, 80);
/* 694 */     addBlock(i + 16, j + 4, k + 8, 80);
/* 695 */     addBlock(i + 16, j + 4, k + 9, 80);
/* 696 */     addBlock(i + 16, j + 4, k + 10, 80);
/* 697 */     addBlock(i + 16, j + 4, k + 11, 80);
/* 698 */     addBlock(i + 17, j + 0, k + 6, 80);
/* 699 */     addBlock(i + 17, j + 0, k + 7, 80);
/* 700 */     addBlock(i + 17, j + 0, k + 8, 80);
/* 701 */     addBlock(i + 17, j + 0, k + 9, 80);
/* 702 */     addBlock(i + 17, j + 0, k + 10, 80);
/* 703 */     addBlock(i + 17, j + 0, k + 11, 80);
/* 704 */     addBlock(i + 17, j + 1, k + 6, 80);
/* 705 */     addBlock(i + 17, j + 1, k + 7, 80);
/* 706 */     addBlock(i + 17, j + 1, k + 8, 80);
/* 707 */     addBlock(i + 17, j + 1, k + 9, 80);
/* 708 */     addBlock(i + 17, j + 1, k + 10, 80);
/* 709 */     addBlock(i + 17, j + 1, k + 11, 80);
/* 710 */     addBlock(i + 17, j + 2, k + 6, 80);
/* 711 */     addBlock(i + 17, j + 2, k + 7, 80);
/* 712 */     addBlock(i + 17, j + 2, k + 8, 80);
/* 713 */     addBlock(i + 17, j + 2, k + 9, 80);
/* 714 */     addBlock(i + 17, j + 2, k + 10, 80);
/* 715 */     addBlock(i + 17, j + 2, k + 11, 80);
/* 716 */     addBlock(i + 17, j + 3, k + 6, 80);
/* 717 */     addBlock(i + 17, j + 3, k + 7, 80);
/* 718 */     addBlock(i + 17, j + 3, k + 8, 80);
/* 719 */     addBlock(i + 17, j + 3, k + 9, 80);
/* 720 */     addBlock(i + 17, j + 3, k + 10, 80);
/* 721 */     addBlock(i + 17, j + 3, k + 11, 80);
/* 722 */     addBlockAndMetadata(i + 1, j + 1, k + 6, 65, 5);
/* 723 */     addBlockAndMetadata(i + 1, j + 1, k + 9, 65, 5);
/* 724 */     addBlockAndMetadata(i + 1, j + 2, k + 6, 65, 5);
/* 725 */     addBlockAndMetadata(i + 1, j + 2, k + 9, 65, 5);
/* 726 */     addBlock(i + 5, j + 1, k + 5, 78);
/* 727 */     addBlock(i + 7, j + 1, k + 4, 78);
/* 728 */     addBlock(i + 8, j + 2, k + 10, 72);
/* 729 */     addBlock(i + 8, j + 2, k + 11, 72);
/* 730 */     addBlock(i + 8, j + 2, k + 12, 72);
/* 731 */     addBlock(i + 8, j + 2, k + 13, 72);
/* 732 */     addBlock(i + 8, j + 2, k + 14, 72);
/* 733 */     addBlock(i + 9, j + 1, k + 1, 78);
/* 734 */     addBlock(i + 9, j + 1, k + 4, 78);
/* 735 */     addBlock(i + 9, j + 1, k + 5, 78);
/* 736 */     addBlock(i + 9, j + 1, k + 7, 78);
/* 737 */     addBlock(i + 9, j + 1, k + 15, 78);
/* 738 */     addBlockAndMetadata(i + 9, j + 2, k + 10, 72, 1);
/* 739 */     addBlock(i + 9, j + 2, k + 11, 72);
/* 740 */     addBlock(i + 9, j + 2, k + 12, 72);
/* 741 */     addBlock(i + 9, j + 2, k + 13, 72);
/* 742 */     addBlock(i + 9, j + 2, k + 14, 72);
/* 743 */     addBlock(i + 10, j + 1, k + 2, 78);
/* 744 */     addBlock(i + 10, j + 1, k + 3, 78);
/* 745 */     addBlock(i + 10, j + 1, k + 7, 78);
/* 746 */     addBlock(i + 10, j + 1, k + 9, 78);
/* 747 */     addBlock(i + 11, j + 1, k + 7, 78);
/* 748 */     addBlock(i + 11, j + 1, k + 10, 78);
/* 749 */     addBlock(i + 11, j + 1, k + 11, 78);
/* 750 */     addBlock(i + 11, j + 1, k + 12, 78);
/* 751 */     addBlock(i + 11, j + 1, k + 13, 78);
/* 752 */     addBlock(i + 11, j + 1, k + 14, 78);
/* 753 */     addBlock(i + 12, j + 1, k + 13, 78);
/* 754 */     addBlockAndMetadata(i + 16, j + 1, k + 7, 65, 4);
/* 755 */     addBlockAndMetadata(i + 16, j + 1, k + 9, 65, 4);
/* 756 */     addBlockAndMetadata(i + 16, j + 1, k + 11, 65, 4);
/* 757 */     addBlockAndMetadata(i + 16, j + 2, k + 7, 65, 4);
/* 758 */     addBlockAndMetadata(i + 16, j + 2, k + 9, 65, 4);
/* 759 */     addBlockAndMetadata(i + 16, j + 2, k + 11, 65, 4);
/* 760 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\IyadE\Desktop\Mod Porting Tools\dungeonpack-1.8.jar!\de\stuuupiiid\dungeonpack\DungeonGeneratorIgloo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */