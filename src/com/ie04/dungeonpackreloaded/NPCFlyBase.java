package de.stuuupiiid.dungeonpack;

import java.util.*;

public class NPCFlyBase extends DungeonGenerator
{
    @Override
    public boolean generate(final Random r, final int x, final int y, final int z) {
        this.generateNextPart(r, x, y, z);
        return true;
    }
    
    public boolean ebene15(final Random r, final int par1, final int par2, final int par3, final int block) {
        this.ebene13(r, par1, par2 - 1, par3, 49);
        for (int v1 = -7; v1 < 8; ++v1) {
            for (int v2 = -7; v2 < 8; ++v2) {
                this.addBlock(par1 + v1, par2, par3 + v2, block);
            }
        }
        return true;
    }
    
    public boolean ebene13(final Random r, final int par1, final int par2, final int par3, final int block) {
        this.ebene11(r, par1, par2 - 1, par3, 49);
        for (int v1 = -6; v1 < 7; ++v1) {
            for (int v2 = -6; v2 < 7; ++v2) {
                this.addBlock(par1 + v1, par2, par3 + v2, block);
            }
        }
        return true;
    }
    
    public boolean ebene11(final Random r, final int par1, final int par2, final int par3, final int block) {
        this.ebene9(r, par1, par2 - 1, par3, 49);
        for (int v1 = -5; v1 < 6; ++v1) {
            for (int v2 = -5; v2 < 6; ++v2) {
                this.addBlock(par1 + v1, par2, par3 + v2, block);
            }
        }
        return true;
    }
    
    public boolean ebene9(final Random r, final int par1, final int par2, final int par3, final int block) {
        this.ebene7(r, par1, par2 - 1, par3, 49);
        for (int v1 = -4; v1 < 5; ++v1) {
            for (int v2 = -4; v2 < 5; ++v2) {
                this.addBlock(par1 + v1, par2, par3 + v2, block);
            }
        }
        return true;
    }
    
    public boolean ebene7(final Random r, final int par1, final int par2, final int par3, final int block) {
        this.addBlock(par1, par2 - 3, par3, 49);
        for (int v1 = -17; v1 < 18; ++v1) {
            for (int v2 = -17; v2 < 18; ++v2) {
                for (int v3 = -1; v3 < 20; ++v3) {
                    this.addAir(par1 + v1, par2 + v3, par3 + v2);
                }
            }
        }
        for (int v1 = -1; v1 < 2; ++v1) {
            for (int v2 = -1; v2 < 2; ++v2) {
                this.addBlock(par1 + v1, par2 - 2, par3 + v2, 49);
            }
        }
        for (int v1 = -2; v1 < 3; ++v1) {
            for (int v2 = -2; v2 < 3; ++v2) {
                this.addBlock(par1 + v1, par2 - 1, par3 + v2, 49);
            }
        }
        for (int v1 = -3; v1 < 4; ++v1) {
            for (int v2 = -3; v2 < 4; ++v2) {
                this.addBlock(par1 + v1, par2, par3 + v2, block);
            }
        }
        return true;
    }
    
    public boolean generateBridge(final Random r, final int par1, int par2, final int par3) {
        --par2;
        if (!this.isAir(par1 + 34, par2, par3)) {
            for (int var1 = -20; var1 < 21; ++var1) {
                for (int var2 = -1; var2 < 2; ++var2) {
                    this.addBlock(par1 + 17 + var1, par2, par3 + var2, 121);
                }
            }
        }
        if (!this.isAir(par1 - 34, par2, par3)) {
            for (int var1 = -20; var1 < 21; ++var1) {
                for (int var2 = -1; var2 < 2; ++var2) {
                    this.addBlock(par1 - 17 + var1, par2, par3 + var2, 121);
                }
            }
        }
        if (!this.isAir(par1, par2, par3 + 34)) {
            for (int var1 = -20; var1 < 21; ++var1) {
                for (int var2 = -1; var2 < 2; ++var2) {
                    this.addBlock(par1 + var2, par2, par3 + 17 + var1, 121);
                }
            }
        }
        if (!this.isAir(par1, par2, par3 - 34)) {
            for (int var1 = -20; var1 < 21; ++var1) {
                for (int var2 = -1; var2 < 2; ++var2) {
                    this.addBlock(par1 + var2, par2, par3 - 17 + var1, 121);
                }
            }
        }
        return true;
    }
    
    public void generateNextPart(final Random r, final int par1, final int par2, final int par3) {
        new NPCFlyHouse1();
        final NPCFlyField field = new NPCFlyField();
        final NPCFlyHouse1 house1 = new NPCFlyHouse1();
        final NPCFlyHouse2 house2 = new NPCFlyHouse2();
        final NPCFlyFountain fountain = new NPCFlyFountain();
        final NPCFlyStable stable = new NPCFlyStable();
        for (int oft = 0; oft < 7; ++oft) {
            int var1 = 0;
            int var2 = 0;
            for (int often = 0; often < 5; ++often) {
                if (r.nextBoolean()) {
                    if (r.nextBoolean()) {
                        var1 += 34;
                    }
                    else {
                        var1 -= 34;
                    }
                }
                else if (r.nextBoolean()) {
                    var2 += 34;
                }
                else {
                    var2 -= 34;
                }
                final int random = r.nextInt(6);
                Object generator;
                if (random == 0) {
                    generator = field;
                }
                else if (random == 1) {
                    generator = house1;
                }
                else if (random == 2) {
                    generator = house1;
                    if (r.nextInt(3) == 1) {
                        generator = house2;
                    }
                }
                else if (random == 3) {
                    generator = house2;
                }
                else if (random == 4) {
                    generator = stable;
                    if (r.nextInt(2) == 0) {
                        generator = fountain;
                    }
                }
                else {
                    generator = house1;
                }
                if (this.isAir(par1 + var1, par2, par3 + var2)) {
                    ((NPCFlyBase)generator).generate(r, par1 + var1, par2, par3 + var2);
                }
                this.generateBridge(r, par1 + var1, par2, par3 + var2);
            }
        }
    }
}
