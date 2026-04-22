package me.ulrich.clans.manager.utils;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.configuration.serialization.ConfigurationSerializable;

public class Cuboid implements Iterable<Block>, Cloneable, ConfigurationSerializable {

	
	public Cuboid(Location l1, Location l2) {

	}

	public Cuboid(Location l1) {
		
	}

	public Cuboid(Cuboid other) {

	}

	public Cuboid(World world, int x1, int y1, int z1, int x2, int y2, int z2) {

	}

	public Cuboid(Map<String, Object> map) {

	}

	@Override
	public Map<String, Object> serialize() {
		return null;
	}

	public Location getLowerNE() {
		return null;
	}

	public Location getUpperSW() {
		return null;
		}

	public List<Block> getBlocks() {
		return null;
	}

	public Location getCenter() {
		return null;
	}

	public World getWorld() {
		return null;
	}

	public int getSizeX() {
		return 0;
	}

	public int getSizeY() {
		return 0;
	}

	public int getSizeZ() {
		return 0;
	}

	public int getLowerX() {
		return 0;
	}

	public int getLowerY() {
		return 0;
	}

	public int getLowerZ() {
		return 0;
	}

	public int getUpperX() {
		return 0;
	}

	public int getUpperY() {
		return 0;
	}

	public int getUpperZ() {
		return 0;
	}

	public Block[] corners() {
		return null;
	}

	public Cuboid expand(CuboidDirection dir, int amount) {
		return null;
	}

	public Cuboid shift(CuboidDirection dir, int amount) {
		return null;
	}

	public Cuboid outset(CuboidDirection dir, int amount) {
		return null;
	}

	public Cuboid inset(CuboidDirection dir, int amount) {
		return null;
	}

	public boolean contains(int x, int y, int z) {
		return false;
	}

	public boolean contains(Block b) {
		return false;
	}


	public boolean contains(Location l) {
		return false;
	}

	public int getVolume() {
		return 0;
	}

	public byte getAverageLightLevel() {
		return 0;
	}

	public Cuboid contract() {

		return null;
	}

	public Cuboid contract(CuboidDirection dir) {
		return null;
	}

	public Cuboid getFace(CuboidDirection dir) {
		return null;
	}

	public boolean containsOnly(Material blockId) {
		return true;
	}

	public Cuboid getBoundingCuboid(Cuboid other) {
		return null;
	}


	public Block getRelativeBlock(int x, int y, int z) {
		return null;
	}

	public Block getRelativeBlock(World w, int x, int y, int z) {
		return null;
	}

	public List<Chunk> getChunks() {
		return null;
	}

	public Iterator<Block> iterator() {
		return null;
	}

	@Override
	public Cuboid clone() {
		return null;
	}

	@Override
	public String toString() {
		return null;
	}

	public class CuboidIterator implements Iterator<Block> {
		
		public boolean hasNext() {
			return false;
		}

		public Block next() {
			return null;
		}

		public void remove() {
		}
	}

	public enum CuboidDirection {
		North, East, South, West, Up, Down, Horizontal, Vertical, Both, Unknown;

		public CuboidDirection opposite() {
			switch (this) {
			case North:
				return South;
			case East:
				return West;
			case South:
				return North;
			case West:
				return East;
			case Horizontal:
				return Vertical;
			case Vertical:
				return Horizontal;
			case Up:
				return Down;
			case Down:
				return Up;
			case Both:
				return Both;
			default:
				return Unknown;
			}
		}

	}

}
