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
package org.spongepowered.api.data.type;

import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.registry.DefaultedRegistryReference;
import org.spongepowered.api.registry.Registry;
import org.spongepowered.api.registry.RegistryKey;
import org.spongepowered.api.registry.RegistryScope;
import org.spongepowered.api.registry.RegistryScopes;
import org.spongepowered.api.registry.RegistryTypes;

@RegistryScopes(scopes = RegistryScope.GAME)
public final class PushReactions {

    public static final DefaultedRegistryReference<PushReaction> NORMAL = key(ResourceKey.minecraft("NORMAL"));
    public static final DefaultedRegistryReference<PushReaction> DESTROY = key(ResourceKey.minecraft("DESTROY"));
    public static final DefaultedRegistryReference<PushReaction> BLOCK = key(ResourceKey.minecraft("BLOCK"));
    public static final DefaultedRegistryReference<PushReaction> IGNORE = key(ResourceKey.minecraft("IGNORE"));
    public static final DefaultedRegistryReference<PushReaction> PUSH_ONLY = key(ResourceKey.minecraft("PUSH_ONLY"));

    public static Registry<PushReaction> registry() {
        return Sponge.game().registry(RegistryTypes.PUSH_REACTION);
    }

    private static DefaultedRegistryReference<PushReaction> key(final ResourceKey location) {
        return RegistryKey.of(RegistryTypes.PUSH_REACTION, location).asDefaultedReference(Sponge::game);
    }
}
