// This is a generated file. Not intended for manual editing.
package org.abos.mizar.mizarplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MizarIdentifyRegistration extends PsiElement {

  @NotNull
  MizarCorrectnessConditions getCorrectnessConditions();

  @NotNull
  List<MizarFunctorPattern> getFunctorPatternList();

  @NotNull
  List<MizarLocus> getLocusList();

}
