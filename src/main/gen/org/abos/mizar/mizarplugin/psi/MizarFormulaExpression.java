// This is a generated file. Not intended for manual editing.
package org.abos.mizar.mizarplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MizarFormulaExpression extends PsiElement {

  @Nullable
  MizarAtomicFormulaExpression getAtomicFormulaExpression();

  @Nullable
  MizarFormulaExpression getFormulaExpression();

  @Nullable
  MizarQuantifiedFormulaExpression getQuantifiedFormulaExpression();

}
