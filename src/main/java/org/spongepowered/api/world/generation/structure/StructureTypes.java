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
@RegistryScopes(scopes = RegistryScope.GAME)
public final class StructureTypes {

    //@formatter:off
    public static final DefaultedRegistryReference<StructureType> BURIED_TREASURE = StructureTypes.key(ResourceKey.minecraft("buried_treasure"));

    public static final DefaultedRegistryReference<StructureType> DESERT_PYRAMID = StructureTypes.key(ResourceKey.minecraft("desert_pyramid"));

    public static final DefaultedRegistryReference<StructureType> END_CITY = StructureTypes.key(ResourceKey.minecraft("end_city"));

    public static final DefaultedRegistryReference<StructureType> FORTRESS = StructureTypes.key(ResourceKey.minecraft("fortress"));

    public static final DefaultedRegistryReference<StructureType> IGLOO = StructureTypes.key(ResourceKey.minecraft("igloo"));

    public static final DefaultedRegistryReference<StructureType> JIGSAW = StructureTypes.key(ResourceKey.minecraft("jigsaw"));

    public static final DefaultedRegistryReference<StructureType> JUNGLE_TEMPLE = StructureTypes.key(ResourceKey.minecraft("jungle_temple"));

    public static final DefaultedRegistryReference<StructureType> MINESHAFT = StructureTypes.key(ResourceKey.minecraft("mineshaft"));

    public static final DefaultedRegistryReference<StructureType> NETHER_FOSSIL = StructureTypes.key(ResourceKey.minecraft("nether_fossil"));

    public static final DefaultedRegistryReference<StructureType> OCEAN_MONUMENT = StructureTypes.key(ResourceKey.minecraft("ocean_monument"));

    public static final DefaultedRegistryReference<StructureType> OCEAN_RUIN = StructureTypes.key(ResourceKey.minecraft("ocean_ruin"));

    public static final DefaultedRegistryReference<StructureType> RUINED_PORTAL = StructureTypes.key(ResourceKey.minecraft("ruined_portal"));

    public static final DefaultedRegistryReference<StructureType> SHIPWRECK = StructureTypes.key(ResourceKey.minecraft("shipwreck"));

    public static final DefaultedRegistryReference<StructureType> STRONGHOLD = StructureTypes.key(ResourceKey.minecraft("stronghold"));

    public static final DefaultedRegistryReference<StructureType> SWAMP_HUT = StructureTypes.key(ResourceKey.minecraft("swamp_hut"));

    public static final DefaultedRegistryReference<StructureType> WOODLAND_MANSION = StructureTypes.key(ResourceKey.minecraft("woodland_mansion"));

    //@formatter:on
    private StructureTypes() {
    }

    public static Registry<StructureType> registry() {
        return Sponge.game().registry(RegistryTypes.STRUCTURE_TYPE);
    }

    private static DefaultedRegistryReference<StructureType> key(final ResourceKey location) {
        return RegistryKey.of(RegistryTypes.STRUCTURE_TYPE, location).asDefaultedReference(Sponge::game);
    }
}
