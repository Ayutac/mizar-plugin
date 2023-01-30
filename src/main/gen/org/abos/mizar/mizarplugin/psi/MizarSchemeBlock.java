// This is a generated file. Not intended for manual editing.
package org.abos.mizar.mizarplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MizarSchemeBlock extends PsiElement {

  @NotNull
  MizarReasoning getReasoning();

  @NotNull
  MizarSchemeConclusion getSchemeConclusion();

  @NotNull
  MizarSchemeIdentifier getSchemeIdentifier();

  @NotNull
  MizarSchemeParameters getSchemeParameters();

  @NotNull
  List<MizarSchemePremise> getSchemePremiseList();

}
