package me.ulrich.clans.data;

import java.util.List;


/*
      fill:
        clicksound: ''
        material: STAINED_GLASS_PANE
        amount: 1
        data: 15
        glow: false
        slot: 7
        name: ''
        # use | to break line
        lore: ''
        # %player%, nicknames or base64Textures
        texture: ''
        nbt:
          string:
          - example:example_nbt_string
          integer:
          - CustomModelData:00000001
*/
public class AddonGuiItemsData {

	private String id;
	private String clickSound;
	private int amount;
	private String material;
	private boolean glow;
	private String name;
	private List<String> lore;
	private String texture;
	private NbtData nbt;
	private int slot;
	private List<String> leftActions;
	private List<String> rightAction;
	private GuiItemsData_fill mineSlots;

	public AddonGuiItemsData(String id, String clickSound, String material, int amount, boolean glow, String name, List<String> lore, String texture, NbtData nbt, int slot, GuiItemsData_fill fill, List<String> leftAction, List<String> rightAction) {
		this.setId(id);
		this.setClickSound(clickSound);
		this.setMaterial(material);
		this.setAmount(amount);
		this.setGlow(glow);
		this.setName(name);
		this.setLore(lore);
		this.setTexture(texture);
		this.setNbt(nbt);
		this.setSlot(slot);
		this.setMineSlots(fill);
		this.setLeftActions(leftAction);
		this.setRightAction(rightAction);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClickSound() {
		return clickSound;
	}

	public void setClickSound(String clickSound) {
		this.clickSound = clickSound;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public boolean isGlow() {
		return glow;
	}

	public void setGlow(boolean glow) {
		this.glow = glow;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getLore() {
		return lore;
	}

	public void setLore(List<String> lore) {
		this.lore = lore;
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

	public NbtData getNbt() {
		return nbt;
	}

	public void setNbt(NbtData nbt) {
		this.nbt = nbt;
	}

	public int getSlot() {
		return slot;
	}

	public void setSlot(int slot) {
		this.slot = slot;
	}

	public List<String> getLeftActions() {
		return leftActions;
	}

	public void setLeftActions(List<String> leftActions) {
		this.leftActions = leftActions;
	}

	public List<String> getRightAction() {
		return rightAction;
	}

	public void setRightAction(List<String> rightAction) {
		this.rightAction = rightAction;
	}

	public GuiItemsData_fill getMineSlots() {
		return mineSlots;
	}

	public void setMineSlots(GuiItemsData_fill mineSlots) {
		this.mineSlots = mineSlots;
	}


}

