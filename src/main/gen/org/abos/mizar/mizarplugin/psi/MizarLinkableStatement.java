// This is a generated file. Not intended for manual editing.
package org.abos.mizar.mizarplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MizarLinkableStatement extends PsiElement {

  @Nullable
  MizarChoiceStatement getChoiceStatement();

  @Nullable
  MizarCompactStatement getCompactStatement();

  @Nullable
  MizarIterativeEquality getIterativeEquality();

  @Nullable
  MizarTypeChangingStatement getTypeChangingStatement();

}
