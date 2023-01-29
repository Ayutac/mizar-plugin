package org.abos.mizar.mizarplugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.util.NlsSafe;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class MizarFileType extends LanguageFileType {

    public static final MizarFileType INSTANCE = new MizarFileType();

    private MizarFileType() {
        super(MizarLanguage.INSTANCE);
    }

    @Override
    public @NonNls @NotNull String getName() {
        return "Mizar Article File";
    }

    @Override
    public @NlsContexts.Label @NotNull String getDescription() {
        return "Mizar Article File";
    }

    @Override
    public @NlsSafe @NotNull String getDefaultExtension() {
        return "miz";
    }

    @Override
    public Icon getIcon() {
        return null;
    }
}
