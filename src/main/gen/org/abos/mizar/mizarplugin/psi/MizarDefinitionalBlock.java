// This is a generated file. Not intended for manual editing.
package org.abos.mizar.mizarplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MizarDefinitionalBlock extends PsiElement {

  @NotNull
  List<MizarDefinition> getDefinitionList();

  @NotNull
  List<MizarDefinitionItem> getDefinitionItemList();

  @NotNull
  List<MizarRedefinition> getRedefinitionList();

}
