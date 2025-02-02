package org.example.driver.manager;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class PlatformManager {

    private static final ThreadLocal<String> platformName = new ThreadLocal<>();

    public static String getPlatformName() {
        return platformName.get();
    }

    public static void setPlatformName(String platform) {
        platformName.set(platform);
    }

    public static void removePlatformName() {
        platformName.remove();
    }
}
