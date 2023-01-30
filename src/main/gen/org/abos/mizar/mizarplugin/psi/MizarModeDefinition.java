// This is a generated file. Not intended for manual editing.
package org.abos.mizar.mizarplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MizarModeDefinition extends PsiElement {

  @Nullable
  MizarCorrectnessConditions getCorrectnessConditions();

  @Nullable
  MizarDefiniens getDefiniens();

  @NotNull
  MizarModePattern getModePattern();

  @NotNull
  List<MizarModeProperty> getModePropertyList();

  @Nullable
  MizarSpecification getSpecification();

  @Nullable
  MizarTypeExpression getTypeExpression();

}
