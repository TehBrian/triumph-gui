/**
 * MIT License
 * <p>
 * Copyright (c) 2021 TriumphTeam
 * Copyright (c) 2022 HibiscusMC
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.hibiscusmc.triumphgui.gui;

import com.hibiscusmc.triumphgui.builder.gui.PaginatedBuilder;
import com.hibiscusmc.triumphgui.builder.gui.ScrollingBuilder;
import com.hibiscusmc.triumphgui.builder.gui.StorageBuilder;
import com.hibiscusmc.triumphgui.component.GuiType;
import com.hibiscusmc.triumphgui.component.ScrollType;
import com.hibiscusmc.triumphgui.builder.gui.SimpleBuilder;
import com.hibiscusmc.triumphgui.component.InteractionModifier;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

/**
 * Standard GUI implementation of {@link BaseGui}
 */
public class Gui extends BaseGui {

    /**
     * Main constructor for the GUI
     *
     * @param rows                 The amount of rows the GUI should have
     * @param title                The GUI's title.
     * @param interactionModifiers A set containing the {@link InteractionModifier} this GUI should use
     * @author SecretX
     * @since 3.0.3
     */
    public Gui(final int rows, @NotNull final Component title, @NotNull final Set<InteractionModifier> interactionModifiers) {
        super(rows, title, interactionModifiers);
    }

    /**
     * Alternative constructor that takes both a {@link GuiType} and a set of {@link InteractionModifier}
     *
     * @param guiType              The {@link GuiType} to be used
     * @param title                The GUI's title.
     * @param interactionModifiers A set containing the {@link InteractionModifier} this GUI should use
     * @since 3.0.3
     */
    public Gui(@NotNull final GuiType guiType, @NotNull final Component title, @NotNull final Set<InteractionModifier> interactionModifiers) {
        super(guiType, title, interactionModifiers);
    }

    /**
     * Old main constructor for the GUI
     *
     * @param rows  The amount of rows the GUI should have
     * @param title The GUI's title
     * @deprecated In favor of {@link Gui#Gui(int, Component, Set)}
     */
    @Deprecated
    public Gui(final int rows, @NotNull final Component title) {
        super(rows, title);
    }

    /**
     * Alternative constructor that defaults to 1 row
     *
     * @param title The GUI's title
     * @deprecated In favor of {@link Gui#Gui(int, Component, Set)}
     */
    @Deprecated
    public Gui(@NotNull final Component title) {
        super(1, title);
    }

    /**
     * Main constructor that takes a {@link GuiType} instead of rows
     *
     * @param guiType The {@link GuiType} to be used
     * @param title   The GUI's title
     * @deprecated In favor of {@link Gui#Gui(GuiType, Component, Set)}
     */
    @Deprecated
    public Gui(@NotNull final GuiType guiType, @NotNull final Component title) {
        super(guiType, title);
    }

    /**
     * Creates a {@link SimpleBuilder} to build a {@link Gui}
     *
     * @param type The {@link GuiType} to be used
     * @return A {@link SimpleBuilder}
     * @since 3.0.0
     */
    @NotNull
    @Contract("_ -> new")
    public static SimpleBuilder gui(@NotNull final GuiType type) {
        return new SimpleBuilder(type);
    }

    /**
     * Creates a {@link SimpleBuilder} with CHEST as the {@link GuiType}
     *
     * @return A CHEST {@link SimpleBuilder}
     * @since 3.0.0
     */
    @NotNull
    @Contract(" -> new")
    public static SimpleBuilder gui() {
        return gui(GuiType.CHEST);
    }

    /**
     * Creates a {@link StorageBuilder}.
     *
     * @return A CHEST {@link StorageBuilder}.
     * @since 3.0.0.
     */
    @NotNull
    @Contract(" -> new")
    public static StorageBuilder storage() {
        return new StorageBuilder();
    }

    /**
     * Creates a {@link PaginatedBuilder} to build a {@link PaginatedGui}
     *
     * @return A {@link PaginatedBuilder}
     * @since 3.0.0
     */
    @NotNull
    @Contract(" -> new")
    public static PaginatedBuilder paginated() {
        return new PaginatedBuilder();
    }

    /**
     * Creates a {@link ScrollingBuilder} to build a {@link ScrollingGui}
     *
     * @param scrollType The {@link ScrollType} to be used by the GUI
     * @return A {@link ScrollingBuilder}
     * @since 3.0.0
     */
    @NotNull
    @Contract("_ -> new")
    public static ScrollingBuilder scrolling(@NotNull final ScrollType scrollType) {
        return new ScrollingBuilder(scrollType);
    }

    /**
     * Creates a {@link ScrollingBuilder} with VERTICAL as the {@link ScrollType}
     *
     * @return A vertical {@link SimpleBuilder}
     * @since 3.0.0
     */
    @NotNull
    @Contract(" -> new")
    public static ScrollingBuilder scrolling() {
        return scrolling(ScrollType.VERTICAL);
    }

}
