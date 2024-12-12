package me.ulrich.clans.interfaces;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.bukkit.entity.Player;

import me.ulrich.clans.Clans;
import me.ulrich.clans.data.EntityOptionsData;
import me.ulrich.clans.data.SpawnedEntityData;
import me.ulrich.entitywizard.entitylib.wrapper.WrapperEntity;
import me.ulrich.entitywizard.packetevents.protocol.entity.type.EntityType;
import me.ulrich.entitywizard.packetevents.protocol.player.Equipment;
import me.ulrich.entitywizard.packetevents.protocol.world.Location;
import me.ulrich.entitywizard.packetevents.util.Vector3d;
import me.ulrich.entitywizard.packetevents.wrapper.play.server.WrapperPlayServerEntityAnimation.EntityAnimationType;

public interface EntityAPI {

	void WalkTo(Clans plugin, UUID playerSender, int entityID, double velocity, Object targetLocation, boolean run, boolean returns);
	
	boolean isAnimal(EntityType entityType);
	boolean isMonster(EntityType entityType);
	boolean isMob(EntityType entityType);
	boolean isAbstractEntity(EntityType entityType);
	boolean isItem(EntityType entityType);
	void createEntityMeta(WrapperEntity entity, EntityType entityType, EntityOptionsData optionsData);
	Optional<SpawnedEntityData> createEntity(Player player, org.bukkit.Location location, EntityType entityType, EntityOptionsData optionsData, List<Equipment> equipament, List<Player> viewers);
	Optional<WrapperEntity> createCustomMetaEntity(EntityType type, EntityOptionsData optionsData, Location spawnLocation);
	void entitySetViews(int entityID, List<Player> viewers);
	void entitySetViewsUUID(int entityID, List<UUID> viewers);
	void entitySetViewDistance(int entityID, int distance);
	void entitySetInvisible(int entityID, boolean invisible);
	void entitySetGlowing(int entityID, boolean glowing);
	void entityRename(int entityID, Optional<String> name);
	void entityTeleport(int entityID, Location location, boolean ground);
	void entityTeleport(int entityID, Vector3d newPosition, float yaw, float pitch, boolean ground);
	void entityRelativeMove(int entityID, Location location, boolean ground);
	void entityRotation(int entityID, float yaw, float pitch);
	void equipEntity(int entityID, List<Equipment> equipaments);
	void velocityEntity(int entityID, Vector3d velocityVector);
	void passegerEntity(int entityID, int[] passegers);
	void animateEntity(int entityID, EntityAnimationType animation);
	void destroyEntity(int entityID);
	Vector3d genVec(Location a, Location b);
	Vector3d calculateVelocity(Vector3d from, Vector3d to, int heightGain);
	
}
