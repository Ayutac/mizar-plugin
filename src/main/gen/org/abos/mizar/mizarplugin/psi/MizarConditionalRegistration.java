// This is a generated file. Not intended for manual editing.
package org.abos.mizar.mizarplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MizarConditionalRegistration extends PsiElement {

  @NotNull
  List<MizarAdjectiveCluster> getAdjectiveClusterList();

  @NotNull
  MizarCorrectnessConditions getCorrectnessConditions();

  @NotNull
  MizarTypeExpression getTypeExpression();

}
