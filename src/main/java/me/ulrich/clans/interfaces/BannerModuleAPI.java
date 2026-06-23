package me.ulrich.clans.interfaces;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.ulrich.clans.data.BannerGroupData;
import me.ulrich.clans.data.ClanData;
import me.ulrich.clans.data.ClanEnum.BannerFilter;

public interface BannerModuleAPI {
	
	public boolean canUploadMaterial(UUID clanUUID, ItemStack itemstack);

	public List<Material> getAllBannerEnabledListDistict(UUID clanUUID);

	public List<ItemStack> getAllBannerEnabledList(UUID clanUUID);
	
	public List<ItemStack> getBannerEnabledList(UUID clanUUID, BannerFilter filter);

	public Optional<BannerGroupData> getConvertedBanners(String... splited_group);
	
	public Optional<ItemStack> loadBanner(Object my_obj, String key);

	public Optional<ItemStack> getSkinBlock(String texture);

	public List<Material> collectItemsByPrefixSuffix(final String prefix, final String suffix);
	
	public List<Material> collectItemsByAll();
	
	public boolean deleteBanner(UUID clanUUID, Player player);

	public boolean setBanner(UUID clanid, Player player, ItemStack itemstack);

	public Optional<ItemStack> getBanner(UUID clanid);
	
	Optional<BannerGroupData> bannerCount(ClanData clan);

}
