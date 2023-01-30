// This is a generated file. Not intended for manual editing.
package org.abos.mizar.mizarplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MizarPostQualifyingSegment extends PsiElement {

  @NotNull
  List<MizarPostQualifiedVariable> getPostQualifiedVariableList();

  @Nullable
  MizarTypeExpression getTypeExpression();

}
