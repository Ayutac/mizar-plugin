// This is a generated file. Not intended for manual editing.
package org.abos.mizar.mizarplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MizarRegistrationBlock extends PsiElement {

  @NotNull
  List<MizarAuxiliaryItem> getAuxiliaryItemList();

  @NotNull
  List<MizarClusterRegistration> getClusterRegistrationList();

  @NotNull
  List<MizarIdentifyRegistration> getIdentifyRegistrationList();

  @NotNull
  List<MizarLociDeclaration> getLociDeclarationList();

  @NotNull
  List<MizarPropertyRegistration> getPropertyRegistrationList();

  @NotNull
  List<MizarReductionRegistration> getReductionRegistrationList();

}
