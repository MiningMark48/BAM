package com.miningmark48.bam.entity;

import com.miningmark48.bam.init.ModItems;
import com.miningmark48.bam.item.ItemWhiteRod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.StatList;
import net.minecraft.util.*;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class EntityWhiteHook extends EntityFishHook {

    public int var1;
    public int var2;
    public int var3;
    public Block var4;
    public boolean var5;
    public int var6;
    public EntityPlayer var7;
    public int var8;
    public int var9;
    public int var10;
    public int var11;
    public int var12;
    public float var13;
    public Entity var14;
    public int var15;
    public double var16;
    public double var17;
    public double var18;
    public double var19;
    public double var20;
    
    int speedModifier = 0;

    public EntityWhiteHook(World world) {

        super(world);
    }

    @SideOnly(Side.CLIENT)
    public EntityWhiteHook(World world, double x, double y, double z, EntityPlayer player) {

        super(world, x, y, z, player);

    }

    public EntityWhiteHook(World world, EntityPlayer player) {

        super(world, player);
        var7 = player;
    }

    @Override
    public void onUpdate() {

        onEntityUpdate();

        if (this.var15 > 0) {
            double d7 = this.posX + (this.var16 - this.posX) / this.var15;
            double d8 = this.posY + (this.var17 - this.posY) / this.var15;
            double d9 = this.posZ + (this.var18 - this.posZ) / this.var15;
            double d1 = MathHelper.wrapAngleTo180_double(this.var19 - this.rotationYaw);
            this.rotationYaw = (float) (this.rotationYaw + d1 / this.var15);
            this.rotationPitch = (float) (this.rotationPitch + (this.var20 - this.rotationPitch) / this.var15);
            --this.var15;
            this.setPosition(d7, d8, d9);
            this.setRotation(this.rotationYaw, this.rotationPitch);
        } else {
            if (!this.worldObj.isRemote) {
                ItemStack itemstack = this.var7.getCurrentEquippedItem();

                if (this.var7.isDead || !this.var7.isEntityAlive() || itemstack == null || !(itemstack.getItem() instanceof ItemFishingRod)
                        || this.getDistanceSqToEntity(this.var7) > 1024.0D) {
                    this.setDead();
                    this.var7.fishEntity = null;
                    return;
                }

                if (this.var14 != null) {
                    if (!this.var14.isDead) {
                        this.posX = this.var14.posX;
                        this.posY = this.var14.boundingBox.minY + this.var14.height * 0.8D;
                        this.posZ = this.var14.posZ;
                        return;
                    }

                    this.var14 = null;
                }
            }

            if (this.var6 > 0) {
                --this.var6;
            }

            if (this.var5) {
                if (this.worldObj.getBlock(this.var1, this.var2, this.var3) == this.var4) {
                    ++this.var8;

                    if (this.var8 == 1200) {
                        this.setDead();
                    }

                    return;
                }

                this.var5 = false;
                this.motionX *= this.rand.nextFloat() * 0.2F;
                this.motionY *= this.rand.nextFloat() * 0.2F;
                this.motionZ *= this.rand.nextFloat() * 0.2F;
                this.var8 = 0;
                this.var9 = 0;
            } else {
                ++this.var9;
            }

            Vec3 vec31 = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
            Vec3 vec3 = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
            MovingObjectPosition movingobjectposition = this.worldObj.rayTraceBlocks(vec31, vec3);
            vec31 = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
            vec3 = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);

            if (movingobjectposition != null) {
                vec3 = Vec3.createVectorHelper(movingobjectposition.hitVec.xCoord, movingobjectposition.hitVec.yCoord, movingobjectposition.hitVec.zCoord);
            }

            Entity entity = null;
            List<Entity> list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ)
                    .expand(1.0D, 1.0D, 1.0D));
            double d0 = 0.0D;
            double d2;

            for (int i = 0; i < list.size(); i++) {
                Entity entity1 = list.get(i);

                if (entity1.canBeCollidedWith() && (entity1 != this.var7 || this.var9 >= 5)) {
                    float f = 0.3F;
                    AxisAlignedBB axisalignedbb = entity1.boundingBox.expand(f, f, f);
                    MovingObjectPosition movingobjectposition1 = axisalignedbb.calculateIntercept(vec31, vec3);

                    if (movingobjectposition1 != null) {
                        d2 = vec31.distanceTo(movingobjectposition1.hitVec);

                        if (d2 < d0 || d0 == 0.0D) {
                            entity = entity1;
                            d0 = d2;
                        }
                    }
                }
            }

            if (entity != null) {
                movingobjectposition = new MovingObjectPosition(entity);
            }

            if (movingobjectposition != null) {
                if (movingobjectposition.entityHit != null) {
                    if (movingobjectposition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.var7), 0.0F)) {
                        this.var14 = movingobjectposition.entityHit;
                    }
                } else {
                    this.var5 = true;
                }
            }

            if (!this.var5) {
                this.moveEntity(this.motionX, this.motionY, this.motionZ);
                float f5 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
                this.rotationYaw = (float) (Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);

                for (this.rotationPitch = (float) (Math.atan2(this.motionY, f5) * 180.0D / Math.PI); this.rotationPitch - this.prevRotationPitch < -180.0F; this.prevRotationPitch -= 360.0F) {
                    ;
                }

                while (this.rotationPitch - this.prevRotationPitch >= 180.0F) {
                    this.prevRotationPitch += 360.0F;
                }

                while (this.rotationYaw - this.prevRotationYaw < -180.0F) {
                    this.prevRotationYaw -= 360.0F;
                }

                while (this.rotationYaw - this.prevRotationYaw >= 180.0F) {
                    this.prevRotationYaw += 360.0F;
                }

                this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2F;
                this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2F;
                float f6 = 0.92F;

                if (this.onGround || this.isCollidedHorizontally) {
                    f6 = 0.5F;
                }

                byte b0 = 5;
                double d10 = 0.0D;

                for (int j = 0; j < b0; ++j) {
                    double d3 = this.boundingBox.minY + (this.boundingBox.maxY - this.boundingBox.minY) * (j + 0) / b0 - 0.125D + 0.125D;
                    double d4 = this.boundingBox.minY + (this.boundingBox.maxY - this.boundingBox.minY) * (j + 1) / b0 - 0.125D + 0.125D;
                    AxisAlignedBB axisalignedbb1 = AxisAlignedBB.getBoundingBox(this.boundingBox.minX, d3, this.boundingBox.minZ, this.boundingBox.maxX, d4,
                            this.boundingBox.maxZ);

                    if (this.worldObj.isAABBInMaterial(axisalignedbb1, Material.water)) {
                        d10 += 1.0D / b0;
                    }
                }

                if (!this.worldObj.isRemote && d10 > 0.0D) {
                    WorldServer worldserver = (WorldServer) this.worldObj;
                    int k = 1;

                    if (this.rand.nextFloat() < 0.25F
                            && this.worldObj.canLightningStrikeAt(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY) + 1,
                            MathHelper.floor_double(this.posZ))) {
                        k = 2;
                    }

                    if (this.rand.nextFloat() < 0.5F
                            && !this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY) + 1,
                            MathHelper.floor_double(this.posZ))) {
                        --k;
                    }

                    if (this.var10 > 0) {
                        --this.var10;

                        if (this.var10 <= 0) {
                            this.var11 = 0;
                            this.var12 = 0;
                        }
                    } else {
                        float f1;
                        float f2;
                        double d5;
                        double d6;
                        float f7;
                        double d11;

                        if (this.var12 > 0) {
                            this.var12 -= k;

                            if (this.var12 <= 0) {
                                this.motionY -= 0.20000000298023224D;
                                this.playSound("random.splash", 0.25F, 1.0F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4F);
                                f1 = MathHelper.floor_double(this.boundingBox.minY);
                                worldserver.func_147487_a("bubble", this.posX, f1 + 1.0F, this.posZ, (int) (1.0F + this.width * 20.0F), this.width, 0.0D,
                                        this.width, 0.20000000298023224D);
                                worldserver.func_147487_a("wake", this.posX, f1 + 1.0F, this.posZ, (int) (1.0F + this.width * 20.0F), this.width, 0.0D,
                                        this.width, 0.20000000298023224D);
                                this.var10 = MathHelper.getRandomIntegerInRange(this.rand, 10, 30);
                            } else {
                                this.var13 = (float) (this.var13 + this.rand.nextGaussian() * 4.0D);
                                f1 = this.var13 * 0.017453292F;
                                f7 = MathHelper.sin(f1);
                                f2 = MathHelper.cos(f1);
                                d11 = this.posX + f7 * this.var12 * 0.1F;
                                d5 = MathHelper.floor_double(this.boundingBox.minY) + 1.0F;
                                d6 = this.posZ + f2 * this.var12 * 0.1F;

                                if (this.rand.nextFloat() < 0.15F) {
                                    worldserver.func_147487_a("bubble", d11, d5 - 0.10000000149011612D, d6, 1, f7, 0.1D, f2, 0.0D);
                                }

                                float f3 = f7 * 0.04F;
                                float f4 = f2 * 0.04F;
                                worldserver.func_147487_a("wake", d11, d5, d6, 0, f4, 0.01D, (-f3), 1.0D);
                                worldserver.func_147487_a("wake", d11, d5, d6, 0, (-f4), 0.01D, f3, 1.0D);
                            }
                        } else if (this.var11 != 0) {
                            this.var11 -= k;
                            f1 = 0.15F;

                            if (this.var11 < 20) {
                                f1 = (float) (f1 + (20 - this.var11) * 0.05D);
                            } else if (this.var11 < 40) {
                                f1 = (float) (f1 + (40 - this.var11) * 0.02D);
                            } else if (this.var11 < 60) {
                                f1 = (float) (f1 + (60 - this.var11) * 0.01D);
                            }

                            if (this.rand.nextFloat() < f1) {
                                f7 = MathHelper.randomFloatClamp(this.rand, 0.0F, 360.0F) * 0.017453292F;
                                f2 = MathHelper.randomFloatClamp(this.rand, 25.0F, 60.0F);
                                d11 = this.posX + MathHelper.sin(f7) * f2 * 0.1F;
                                d5 = MathHelper.floor_double(this.boundingBox.minY) + 1.0F;
                                d6 = this.posZ + MathHelper.cos(f7) * f2 * 0.1F;
                                worldserver.func_147487_a("splash", d11, d5, d6, 2 + this.rand.nextInt(2), 0.10000000149011612D, 0.0D, 0.10000000149011612D,
                                        0.0D);
                            }
                            if (this.var11 <= 0) {
                                this.var13 = MathHelper.randomFloatClamp(this.rand, 0.0F, 360.0F);
                                this.var12 = MathHelper.getRandomIntegerInRange(this.rand, 20, 80);
                            }
                        } else {
                            this.var11 = MathHelper.getRandomIntegerInRange(this.rand, 100, 900);
                            this.var11 -= (EnchantmentHelper.func_151387_h(this.var7) + speedModifier) * 20 * 5;
                        }
                    }

                    if (this.var10 > 0) {
                        this.motionY -= this.rand.nextFloat() * this.rand.nextFloat() * this.rand.nextFloat() * 0.2D;
                    }
                }
                d2 = d10 * 2.0D - 1.0D;
                this.motionY += 0.03999999910593033D * d2;

                if (d10 > 0.0D) {
                    f6 = (float) (f6 * 0.9D);
                    this.motionY *= 0.8D;
                }
                this.motionX *= f6;
                this.motionY *= f6;
                this.motionZ *= f6;
                this.setPosition(this.posX, this.posY, this.posZ);
            }
        }
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound nbt) {

        super.writeEntityToNBT(nbt);
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound nbt) {

        super.readEntityFromNBT(nbt);
    }

    @Override
    public int func_146034_e() {

        if (this.worldObj.isRemote) {
            return 0;
        } else {
            byte b0 = 0;

            if (this.var14 != null) {
                double d0 = this.var7.posX - this.posX;
                double d2 = this.var7.posY - this.posY;
                double d4 = this.var7.posZ - this.posZ;
                double d6 = MathHelper.sqrt_double(d0 * d0 + d2 * d2 + d4 * d4);
                double d8 = 0.1D;
                this.var14.motionX += d0 * d8;
                this.var14.motionY += d2 * d8 + MathHelper.sqrt_double(d6) * 0.08D;
                this.var14.motionZ += d4 * d8;
                b0 = 3;
            } else if (this.var10 > 0) {
                EntityItem entityitem = new EntityItem(this.worldObj, this.posX, this.posY, this.posZ, this.getFishingResult());
                double d1 = this.var7.posX - this.posX;
                double d3 = this.var7.posY - this.posY;
                double d5 = this.var7.posZ - this.posZ;
                double d7 = MathHelper.sqrt_double(d1 * d1 + d3 * d3 + d5 * d5);
                double d9 = 0.1D;
                entityitem.motionX = d1 * d9;
                entityitem.motionY = d3 * d9 + MathHelper.sqrt_double(d7) * 0.08D;
                entityitem.motionZ = d5 * d9;
                this.worldObj.spawnEntityInWorld(entityitem);
                this.var7.worldObj.spawnEntityInWorld(new EntityXPOrb(this.var7.worldObj, this.var7.posX,
                        this.var7.posY + 0.5D, this.var7.posZ + 0.5D, this.rand.nextInt(6) + 1));
                b0 = 1;
            }
            if (this.var5) {
                b0 = 2;
            }
            this.setDead();
            this.var7.fishEntity = null;
            return b0;
        }
    }

    public ItemStack getFishingResult()
    {
        Random rand = new Random();
        int x = rand.nextInt(16) + 1;

        if (x == 1){
            return new ItemStack(ModItems.aaFish);
        }else if(x == 2){
            return new ItemStack(ModItems.afFish);
        }else if(x == 3){
            return new ItemStack(ModItems.asFish);
        }else if(x == 4){
            return new ItemStack(ModItems.bcFish);
        }else if(x == 5){
            return new ItemStack(ModItems.bfFish);
        }else if(x == 6){
            return new ItemStack(ModItems.blFish);
        }else if(x == 7){
            return new ItemStack(ModItems.gtFish);
        }else if(x == 8){
            return new ItemStack(ModItems.heFish);
        }else if(x == 9){
            return new ItemStack(ModItems.hpFish);
        }else if(x == 10){
            return new ItemStack(ModItems.hrFish);
        }else if(x == 11){
            return new ItemStack(ModItems.mdFish);
        }else if(x == 12){
            return new ItemStack(ModItems.pwFish);
        }else if(x == 13){
            return new ItemStack(ModItems.hhFish);
        }else if(x == 14){
            return new ItemStack(ModItems.hhFish2);
        }else if (x == 15){
            return new ItemStack(ModItems.hsFish);
        }else if (x == 16){
            return new ItemStack(ModItems.lightBlueToolRod);
        }
        return new ItemStack(Items.fish);
    }


}
