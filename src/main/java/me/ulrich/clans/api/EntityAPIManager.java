package me.ulrich.clans.api;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import me.ulrich.clans.Clans;
import me.ulrich.clans.data.SpawnedEntityData;
import me.ulrich.clans.interfaces.EntityAPI;
import me.ulrich.entitywizard.entitylib.wrapper.WrapperEntity;
import me.ulrich.entitywizard.packetevents.protocol.entity.type.EntityType;
import me.ulrich.entitywizard.packetevents.protocol.player.Equipment;
import me.ulrich.entitywizard.packetevents.util.Vector3d;
import me.ulrich.entitywizard.packetevents.wrapper.play.server.WrapperPlayServerEntityAnimation.EntityAnimationType;

public class EntityAPIManager implements EntityAPI {

	public EntityAPIManager(Clans clans) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void WalkTo(Clans plugin, UUID playerSender, int entityID, double velocity, Object targetLocation,
			boolean run, boolean returns) {		
	}

	@Override
	public boolean isAnimal(EntityType entityType) {
		return false;
	}

	@Override
	public boolean isMonster(EntityType entityType) {
		
		return false;
	}

	@Override
	public boolean isMob(EntityType entityType) {
		
		return false;
	}

	@Override
	public boolean isAbstractEntity(EntityType entityType) {
		
		return false;
	}

	@Override
	public boolean isItem(EntityType entityType) {
		
		return false;
	}

	@Override
	public void createEntityMeta(WrapperEntity entity, EntityType entityType, boolean baby) {
		
		
	}

	@Override
	public Optional<SpawnedEntityData> createEntity(Player player, Location location, EntityType entityType,
			boolean baby, boolean glowing, boolean invisible, List<Equipment> equipament, List<Player> viewers) {
		
		return Optional.empty();
	}

	@Override
	public Optional<WrapperEntity> createCustomMetaEntity(EntityType type,
			me.ulrich.entitywizard.packetevents.protocol.world.Location spawnLocation) {
		
		return Optional.empty();
	}

	@Override
	public void entitySetViews(int entityID, List<Player> viewers) {
		
		
	}

	@Override
	public void entitySetViewsUUID(int entityID, List<UUID> viewers) {
		
		
	}

	@Override
	public void entitySetViewDistance(int entityID, int distance) {
		
		
	}

	@Override
	public void entitySetInvisible(int entityID, boolean invisible) {
		
		
	}

	@Override
	public void entitySetGlowing(int entityID, boolean glowing) {
		
		
	}

	@Override
	public void entityRename(int entityID, Optional<String> name) {
		
		
	}

	@Override
	public void entityTeleport(int entityID, me.ulrich.entitywizard.packetevents.protocol.world.Location location,
			boolean ground) {
		
		
	}

	@Override
	public void entityTeleport(int entityID, Vector3d newPosition, float yaw, float pitch, boolean ground) {
		
		
	}

	@Override
	public void entityRelativeMove(int entityID, me.ulrich.entitywizard.packetevents.protocol.world.Location location,
			boolean ground) {
		
		
	}

	@Override
	public void entityRotation(int entityID, float yaw, float pitch) {
		
		
	}

	@Override
	public void equipEntity(int entityID, List<Equipment> equipaments) {
		
		
	}

	@Override
	public void velocityEntity(int entityID, Vector3d velocityVector) {
		
		
	}

	@Override
	public void passegerEntity(int entityID, int[] passegers) {
		
		
	}

	@Override
	public void animateEntity(int entityID, EntityAnimationType animation) {
		
		
	}

	@Override
	public void destroyEntity(int entityID) {
		
		
	}

	@Override
	public Vector3d genVec(me.ulrich.entitywizard.packetevents.protocol.world.Location a,
			me.ulrich.entitywizard.packetevents.protocol.world.Location b) {
		
		return null;
	}

	@Override
	public Vector3d calculateVelocity(Vector3d from, Vector3d to, int heightGain) {
		
		return null;
	}

}
