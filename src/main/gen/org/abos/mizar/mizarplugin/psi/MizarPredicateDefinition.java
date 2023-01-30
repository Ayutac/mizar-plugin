// This is a generated file. Not intended for manual editing.
package org.abos.mizar.mizarplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MizarPredicateDefinition extends PsiElement {

  @NotNull
  MizarCorrectnessConditions getCorrectnessConditions();

  @Nullable
  MizarDefiniens getDefiniens();

  @NotNull
  MizarPredicatePattern getPredicatePattern();

  @NotNull
  List<MizarPredicateProperty> getPredicatePropertyList();

}
