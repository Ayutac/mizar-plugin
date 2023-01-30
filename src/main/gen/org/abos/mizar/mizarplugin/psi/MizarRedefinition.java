// This is a generated file. Not intended for manual editing.
package org.abos.mizar.mizarplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MizarRedefinition extends PsiElement {

  @Nullable
  MizarAttributeDefinition getAttributeDefinition();

  @Nullable
  MizarFunctorDefinition getFunctorDefinition();

  @Nullable
  MizarModeDefinition getModeDefinition();

  @Nullable
  MizarPredicateDefinition getPredicateDefinition();

}
