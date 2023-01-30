// This is a generated file. Not intended for manual editing.
package org.abos.mizar.mizarplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MizarNotationDeclaration extends PsiElement {

  @Nullable
  MizarAttributeAntonym getAttributeAntonym();

  @Nullable
  MizarAttributeSynonym getAttributeSynonym();

  @Nullable
  MizarFunctorSynonym getFunctorSynonym();

  @Nullable
  MizarModeSynonym getModeSynonym();

  @Nullable
  MizarPredicateAntonym getPredicateAntonym();

  @Nullable
  MizarPredicateSynonym getPredicateSynonym();

}
