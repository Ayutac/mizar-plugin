// This is a generated file. Not intended for manual editing.
package org.abos.mizar.mizarplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MizarFunctorDefinition extends PsiElement {

  @NotNull
  MizarCorrectnessConditions getCorrectnessConditions();

  @Nullable
  MizarDefiniens getDefiniens();

  @NotNull
  MizarFunctorPattern getFunctorPattern();

  @NotNull
  List<MizarFunctorProperty> getFunctorPropertyList();

  @Nullable
  MizarSpecification getSpecification();

}
