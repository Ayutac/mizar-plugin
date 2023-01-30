// This is a generated file. Not intended for manual editing.
package org.abos.mizar.mizarplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MizarFunctorPattern extends PsiElement {

  @NotNull
  List<MizarFunctorLoci> getFunctorLociList();

  @Nullable
  MizarFunctorSymbol getFunctorSymbol();

  @Nullable
  MizarLeftFunctorBracket getLeftFunctorBracket();

  @Nullable
  MizarLoci getLoci();

  @Nullable
  MizarRightFunctorBracket getRightFunctorBracket();

}
