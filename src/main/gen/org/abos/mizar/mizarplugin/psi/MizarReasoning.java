// This is a generated file. Not intended for manual editing.
package org.abos.mizar.mizarplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MizarReasoning extends PsiElement {

  @Nullable
  MizarCaseList getCaseList();

  @NotNull
  List<MizarReasoningItem> getReasoningItemList();

  @Nullable
  MizarSimpleJustification getSimpleJustification();

  @Nullable
  MizarSupposeList getSupposeList();

}
