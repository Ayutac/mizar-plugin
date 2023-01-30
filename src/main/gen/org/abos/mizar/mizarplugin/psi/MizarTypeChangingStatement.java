// This is a generated file. Not intended for manual editing.
package org.abos.mizar.mizarplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MizarTypeChangingStatement extends PsiElement {

  @NotNull
  MizarSimpleJustification getSimpleJustification();

  @NotNull
  MizarTypeChangeList getTypeChangeList();

  @NotNull
  MizarTypeExpression getTypeExpression();

}
