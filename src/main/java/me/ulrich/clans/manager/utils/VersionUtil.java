package me.ulrich.clans.manager.utils;

import org.jetbrains.annotations.NotNull;

import me.ulrich.clans.manager.utils.VersionUtil.VersionEnum;

public class VersionUtil {

	public static String VERSION;

	public static String CLEAN_VERSION;

	public static Integer BUILD_VERSION;

	static {

	}


	public static boolean is(@NotNull VersionEnum ve) {
		return false;
	}


	public static boolean isCompatible(@NotNull VersionEnum ve){
		return false;
	}

	public static boolean isAbove(@NotNull VersionEnum ve) {
		return false;
	}

	public static boolean isBelow(@NotNull VersionEnum ve) {
		return false;
	}

	public static boolean isBetween(@NotNull VersionEnum ve1, @NotNull VersionEnum ve2) {
		return false;
	}
	
	public static boolean isMinecraftFamily(@NotNull VersionEnum version) {
		return false;
	}

	public enum VersionEnum {

		V17(0),
		V18(1),
		V19(2),
		V110(3),
		V111(4),
		V112(5),
		V113(6),
		V114(7),
		V115(8),
		V116(9),
		V117(10),
		V118(11),
		V119(12),
		V120(13),
		V121(14),

		// Versões específicas, caso ainda precise delas em outros lugares
		V1211(15),

		// Família Minecraft 26
		V26(16),

		V261(17),
		V262(18);

        VersionEnum(int order) {
            
        }

        public int getOrder() {
            return 0;
        }
	}
}
