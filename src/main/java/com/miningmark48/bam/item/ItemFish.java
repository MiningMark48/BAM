package com.miningmark48.bam.item;

import com.miningmark48.bam.init.ModItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

import java.util.List;

public class ItemFish extends ItemBAM{

    public ItemFish()
    {
        super();
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        if (stack.getItem() == ModItems.aaFish2){
            player.playSound("random.drink", 0.5F, 0.5F);
            if (!world.isRemote){
                player.addChatComponentMessage(new ChatComponentTranslation("Heh heh, soda."));
            }
        }
        return stack;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean isHeld) {
        if (stack.getItem() == ModItems.aaFish){
            list.add("Bloodfin Tetra");
        }else if(stack.getItem() == ModItems.aaFish2){
            list.add("Soda Cichlid");
        }else if(stack.getItem() == ModItems.aaFish3){
            list.add("Albino Peacock Cichlid");
        }else if(stack.getItem() == ModItems.abFish){
            list.add("Yellow Peacock Cichlid");
        }else if(stack.getItem() == ModItems.acFish){
            list.add("Black Calvus Cichlid");
        }else if(stack.getItem() == ModItems.acFish2){
            list.add("Compressed Cichlid");
        }else if(stack.getItem() == ModItems.afFish){
            list.add("Banded Tetra");
        }else if(stack.getItem() == ModItems.ahFish){
            list.add("Threadfin Acara Cichlid");
        }else if(stack.getItem() == ModItems.ajFish){
            list.add("Frieberg Cichlid");
        }else if(stack.getItem() == ModItems.ajFish2){
            list.add("Lemon Jake Peacock Cichlid");
        }else if(stack.getItem() == ModItems.alFish){
            list.add("Red Devil Cichlid");
        }else if(stack.getItem() == ModItems.aoFish){
            list.add("Albino Tiger Oscar Cichlid");
        }else if(stack.getItem() == ModItems.anFish){
            list.add("Convict Cichlid");
        }else if(stack.getItem() == ModItems.arFish){
            list.add("Green Terror Cichlid");
        }else if(stack.getItem() == ModItems.arFish2){
            list.add("Red Peacock Cichlid");
        }else if(stack.getItem() == ModItems.arFish3){
            list.add("Ruby Red Peacock Cichlid");
        }else if(stack.getItem() == ModItems.asFish){
            list.add("Arnold's Tetra");
        }else if(stack.getItem() == ModItems.asFish2){
            list.add("Flametail Peacock Cichlid");
        }else if(stack.getItem() == ModItems.asFish3){
            list.add("Red Shoulder Peacock Cichlid");
        }else if(stack.getItem() == ModItems.aspFish){
            list.add("Orange Bushy Nose Pleco");
        }else if(stack.getItem() == ModItems.aspFish2){
            list.add("Bushy Nose Pleco");
        }else if(stack.getItem() == ModItems.aspFish3){
            list.add("Albino Bushy Nose Pleco");
        }else if(stack.getItem() == ModItems.aspFish4){
            list.add("Strawberry Peacock Cichlid");
        }else if(stack.getItem() == ModItems.aspFish5){
            list.add("Red Top Lwanda Peacock Cichlid");
        }else if(stack.getItem() == ModItems.aspFish6){
            list.add("Sunshine Peacock Cichlid");
        }else if(stack.getItem() == ModItems.atFish){
            list.add("African Butterfly Cichlid");
        }else if(stack.getItem() == ModItems.bcFish){
            list.add("African Moon Tetra");
        }else if(stack.getItem() == ModItems.bfFish){
            list.add("Blue Tetra");
        }else if(stack.getItem() == ModItems.blFish){
            list.add("African Long-Finned Tetra");
        }else if(stack.getItem() == ModItems.bmFish){
            list.add("Bala Shark");
        }else if(stack.getItem() == ModItems.cfFish){
            list.add("Frontosa Cichlid");
        }else if(stack.getItem() == ModItems.gtFish){
            list.add("Black Tetra");
        }else if(stack.getItem() == ModItems.hcFish){
            list.add("Giant Freshwater Stingray");
        }else if(stack.getItem() == ModItems.heFish) {
            list.add("Bleeding Heart Tetra");
        }else if(stack.getItem() == ModItems.hhFish){
            list.add("Black Neon Tetra");
        }else if(stack.getItem() == ModItems.hhFish2){
            list.add("Flag Tetra");
        }else if(stack.getItem() == ModItems.hpFish){
            list.add("Black Wedge Tetra");
        }else if(stack.getItem() == ModItems.hrFish){
            list.add("Brass Tetra");
        }else if(stack.getItem() == ModItems.hsFish){
            list.add("Black Line Tetra");
        }else if(stack.getItem() == ModItems.hspFish){
            list.add("Gypsy King Tiger Pleco");
        }else if(stack.getItem() == ModItems.hzFish){
            list.add("Zebra Pleco");
        }else if(stack.getItem() == ModItems.isFish){
            list.add("Rusty Cichlid");
        }else if(stack.getItem() == ModItems.lcFish){
            list.add("Electric Yellow Cichlid");
        }else if(stack.getItem() == ModItems.ltFish){
            list.add("Tretocephalus Cichlid");
        }else if(stack.getItem() == ModItems.mcFish){
            list.add("Cobalt Zebra Cichlid");
        }else if(stack.getItem() == ModItems.mcFish2){
            list.add("Maingano Cichlid");
        }else if(stack.getItem() == ModItems.mdFish){
            list.add("Bandtail Tetra");
        }else if(stack.getItem() == ModItems.meFish){
            list.add("Red Zebra Cichlid");
        }else if(stack.getItem() == ModItems.mlFish){
            list.add("Kenyi Cichlid");
        }else if(stack.getItem() == ModItems.nsFish){
            list.add("Yellow Sexfasciatus");
        }else if(stack.getItem() == ModItems.pwFish){
            list.add("Black Darter Tetra");
        }else if(stack.getItem() == ModItems.sfFish){
            list.add("Electric Blue Hap Cichlid");
        }else if(stack.getItem() == ModItems.paFish){
            list.add("404 - Not Found");
        }else if(stack.getItem() == ModItems.paFish2){
            list.add("Pseudoacanthicus Angelicus Pleco");
        }else if(stack.getItem() == ModItems.pdFish){
            list.add("Demasoni Mbuna Cichlid");
        }else if(stack.getItem() == ModItems.psFish){
            list.add("Snow White Zebra Cichlid");
        }else if(stack.getItem() == ModItems.paFish3){
            list.add("Yellow Acei Mbuna Cichlid");
        }else if(stack.getItem() == ModItems.pnFish3){
            list.add("Victorian Cichlid");
        }else if(stack.getItem() == ModItems.ptFish){
            list.add("Tiger Barb");
        }else if(stack.getItem() == ModItems.smFish){
            list.add("Dolly Varden");
        }else if(stack.getItem() == ModItems.vmFish){
            list.add("404 - Not Found");
        }else if(stack.getItem() == ModItems.xhFish){
            list.add("Marigold Twinbar Swordtail");
        }else if(stack.getItem() == ModItems.xhFish2){
            list.add("Koi Molly");
        }else if(stack.getItem() == ModItems.nlFish){
            list.add("Kalingo Cichlid");
        }else if(stack.getItem() == ModItems.ogFish){
            list.add("Pink Salmon");
        }else if(stack.getItem() == ModItems.okFish){
            list.add("Chum Salmon");
        }else if(stack.getItem() == ModItems.okFish2){
            list.add("Coho Salmon");
        }else if(stack.getItem() == ModItems.omFish){
            list.add("Steelhead Salmon");
        }else if(stack.getItem() == ModItems.omFish2){
            list.add("Rainbow Trout");
        }else if(stack.getItem() == ModItems.otFish){
            list.add("King Salmon");
        }else if(stack.getItem() == ModItems.pnFish){
            list.add("Gold Royal Pleco L-027");
        }else if(stack.getItem() == ModItems.pnFish2){
            list.add("Royal Pleco L-191");
        }else if(stack.getItem() == ModItems.psmFish){
            list.add("Mango Pleco L-47");
        }else if(stack.getItem() == ModItems.pcFish){
            list.add("Pastel Cichlid");
        }else if(stack.getItem() == ModItems.psFish2){
            list.add("Bigtooth River Stingray");
        }else if(stack.getItem() == ModItems.pmFish){
            list.add("Ocellate River Stingray");
        }else if(stack.getItem() == ModItems.pmvFish){
            list.add("Motoro Stingray");
        }else if(stack.getItem() == ModItems.poFish){
            list.add("Red-Blotched River Stingray");
        }else if(stack.getItem() == ModItems.poFish2){
            list.add("Smooth Back River Stingray");
        }else if(stack.getItem() == ModItems.asFish4){
            list.add("American shad");
        }else if(stack.getItem() == ModItems.acFish3){
            list.add("Bowfin");
        }else if(stack.getItem() == ModItems.ccFish){
            list.add("Carp");
        }else if(stack.getItem() == ModItems.eaFish){
            list.add("American Pickerel");
        }else if(stack.getItem() == ModItems.elFish){
            list.add("Northern Pike");
        }else if(stack.getItem() == ModItems.emFish){
            list.add("Muskellunge");
        }else if(stack.getItem() == ModItems.ipFish){
            list.add("Channel catfish");
        }else if(stack.getItem() == ModItems.lgFish){
            list.add("Pumpkinseed");
        }else if(stack.getItem() == ModItems.mdFish2){
            list.add("Smallmouth Bass");
        }else if(stack.getItem() == ModItems.maFish){
            list.add("White perch");
        }else if(stack.getItem() == ModItems.msFish){
            list.add("Striped Bass");
        }else if(stack.getItem() == ModItems.paFish4){
            list.add("White Crappie");
        }else if(stack.getItem() == ModItems.stFish){
            list.add("Brown trout");
        }else if(stack.getItem() == ModItems.scFish){
            list.add("Sauger");
        }

    }

}
