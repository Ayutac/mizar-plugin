// This is a generated file. Not intended for manual editing.
package org.abos.mizar.mizarplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MizarIterativeEquality extends PsiElement {

  @Nullable
  MizarLabelIdentifier getLabelIdentifier();

  @NotNull
  List<MizarSimpleJustification> getSimpleJustificationList();

  @NotNull
  List<MizarTermExpression> getTermExpressionList();

}
