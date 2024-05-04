/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.world.generation.structure;

import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.registry.DefaultedRegistryReference;
import org.spongepowered.api.registry.Registry;
import org.spongepowered.api.registry.RegistryKey;
import org.spongepowered.api.registry.RegistryScope;
import org.spongepowered.api.registry.RegistryScopes;
import org.spongepowered.api.registry.RegistryTypes;

/**
 * <!-- This file is automatically generated. Any manual changes will be overwritten. -->
 */
@SuppressWarnings("unused")
@RegistryScopes(scopes = RegistryScope.ENGINE)
public final class Structures {

    //@formatter:off
    public static final DefaultedRegistryReference<Structure> ANCIENT_CITY = Structures.key(ResourceKey.minecraft("ancient_city"));

    public static final DefaultedRegistryReference<Structure> BASTION_REMNANT = Structures.key(ResourceKey.minecraft("bastion_remnant"));

    public static final DefaultedRegistryReference<Structure> BURIED_TREASURE = Structures.key(ResourceKey.minecraft("buried_treasure"));

    public static final DefaultedRegistryReference<Structure> DESERT_PYRAMID = Structures.key(ResourceKey.minecraft("desert_pyramid"));

    public static final DefaultedRegistryReference<Structure> END_CITY = Structures.key(ResourceKey.minecraft("end_city"));

    public static final DefaultedRegistryReference<Structure> FORTRESS = Structures.key(ResourceKey.minecraft("fortress"));

    public static final DefaultedRegistryReference<Structure> IGLOO = Structures.key(ResourceKey.minecraft("igloo"));

    public static final DefaultedRegistryReference<Structure> JUNGLE_PYRAMID = Structures.key(ResourceKey.minecraft("jungle_pyramid"));

    public static final DefaultedRegistryReference<Structure> MANSION = Structures.key(ResourceKey.minecraft("mansion"));

    public static final DefaultedRegistryReference<Structure> MINESHAFT = Structures.key(ResourceKey.minecraft("mineshaft"));

    public static final DefaultedRegistryReference<Structure> MINESHAFT_MESA = Structures.key(ResourceKey.minecraft("mineshaft_mesa"));

    public static final DefaultedRegistryReference<Structure> MONUMENT = Structures.key(ResourceKey.minecraft("monument"));

    public static final DefaultedRegistryReference<Structure> NETHER_FOSSIL = Structures.key(ResourceKey.minecraft("nether_fossil"));

    public static final DefaultedRegistryReference<Structure> OCEAN_RUIN_COLD = Structures.key(ResourceKey.minecraft("ocean_ruin_cold"));

    public static final DefaultedRegistryReference<Structure> OCEAN_RUIN_WARM = Structures.key(ResourceKey.minecraft("ocean_ruin_warm"));

    public static final DefaultedRegistryReference<Structure> PILLAGER_OUTPOST = Structures.key(ResourceKey.minecraft("pillager_outpost"));

    public static final DefaultedRegistryReference<Structure> RUINED_PORTAL = Structures.key(ResourceKey.minecraft("ruined_portal"));

    public static final DefaultedRegistryReference<Structure> RUINED_PORTAL_DESERT = Structures.key(ResourceKey.minecraft("ruined_portal_desert"));

    public static final DefaultedRegistryReference<Structure> RUINED_PORTAL_JUNGLE = Structures.key(ResourceKey.minecraft("ruined_portal_jungle"));

    public static final DefaultedRegistryReference<Structure> RUINED_PORTAL_MOUNTAIN = Structures.key(ResourceKey.minecraft("ruined_portal_mountain"));

    public static final DefaultedRegistryReference<Structure> RUINED_PORTAL_NETHER = Structures.key(ResourceKey.minecraft("ruined_portal_nether"));

    public static final DefaultedRegistryReference<Structure> RUINED_PORTAL_OCEAN = Structures.key(ResourceKey.minecraft("ruined_portal_ocean"));

    public static final DefaultedRegistryReference<Structure> RUINED_PORTAL_SWAMP = Structures.key(ResourceKey.minecraft("ruined_portal_swamp"));

    public static final DefaultedRegistryReference<Structure> SHIPWRECK = Structures.key(ResourceKey.minecraft("shipwreck"));

    public static final DefaultedRegistryReference<Structure> SHIPWRECK_BEACHED = Structures.key(ResourceKey.minecraft("shipwreck_beached"));

    public static final DefaultedRegistryReference<Structure> STRONGHOLD = Structures.key(ResourceKey.minecraft("stronghold"));

    public static final DefaultedRegistryReference<Structure> SWAMP_HUT = Structures.key(ResourceKey.minecraft("swamp_hut"));

    public static final DefaultedRegistryReference<Structure> TRAIL_RUINS = Structures.key(ResourceKey.minecraft("trail_ruins"));

    public static final DefaultedRegistryReference<Structure> VILLAGE_DESERT = Structures.key(ResourceKey.minecraft("village_desert"));

    public static final DefaultedRegistryReference<Structure> VILLAGE_PLAINS = Structures.key(ResourceKey.minecraft("village_plains"));

    public static final DefaultedRegistryReference<Structure> VILLAGE_SAVANNA = Structures.key(ResourceKey.minecraft("village_savanna"));

    public static final DefaultedRegistryReference<Structure> VILLAGE_SNOWY = Structures.key(ResourceKey.minecraft("village_snowy"));

    public static final DefaultedRegistryReference<Structure> VILLAGE_TAIGA = Structures.key(ResourceKey.minecraft("village_taiga"));

    //@formatter:on
    private Structures() {
    }

    public static Registry<Structure> registry() {
        return Sponge.server().registry(RegistryTypes.STRUCTURE);
    }

    private static DefaultedRegistryReference<Structure> key(final ResourceKey location) {
        return RegistryKey.of(RegistryTypes.STRUCTURE, location).asDefaultedReference(Sponge::server);
    }
}
