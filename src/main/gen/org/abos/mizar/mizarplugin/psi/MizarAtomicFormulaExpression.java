// This is a generated file. Not intended for manual editing.
package org.abos.mizar.mizarplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MizarAtomicFormulaExpression extends PsiElement {

  @NotNull
  List<MizarAdjective> getAdjectiveList();

  @Nullable
  MizarPredicateIdentifier getPredicateIdentifier();

  @NotNull
  List<MizarPredicateSymbol> getPredicateSymbolList();

  @Nullable
  MizarTermExpression getTermExpression();

  @NotNull
  List<MizarTermExpressionList> getTermExpressionListList();

  @Nullable
  MizarTypeExpression getTypeExpression();

}
