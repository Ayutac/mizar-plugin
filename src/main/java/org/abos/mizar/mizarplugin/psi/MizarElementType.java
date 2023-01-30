package org.abos.mizar.mizarplugin.psi;

import com.intellij.psi.tree.IElementType;
import org.abos.mizar.mizarplugin.MizarLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class MizarElementType extends IElementType {

    public MizarElementType(@NotNull @NonNls String debugName) {
        super(debugName, MizarLanguage.INSTANCE);
    }
}
