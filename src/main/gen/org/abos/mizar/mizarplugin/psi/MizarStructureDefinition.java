// This is a generated file. Not intended for manual editing.
package org.abos.mizar.mizarplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MizarStructureDefinition extends PsiElement {

  @Nullable
  MizarAncestors getAncestors();

  @NotNull
  MizarFields getFields();

  @Nullable
  MizarLoci getLoci();

  @NotNull
  MizarStructureSymbol getStructureSymbol();

}
