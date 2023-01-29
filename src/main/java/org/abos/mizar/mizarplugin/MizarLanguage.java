package org.abos.mizar.mizarplugin;

import com.intellij.lang.Language;

public class MizarLanguage extends Language {

    public static final MizarLanguage INSTANCE = new MizarLanguage();

    private MizarLanguage() {
        super("Mizar");
    }
}
