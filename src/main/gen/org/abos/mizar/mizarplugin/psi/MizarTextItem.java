// This is a generated file. Not intended for manual editing.
package org.abos.mizar.mizarplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MizarTextItem extends PsiElement {

  @Nullable
  MizarAuxiliaryItem getAuxiliaryItem();

  @Nullable
  MizarDefinitionalItem getDefinitionalItem();

  @Nullable
  MizarNotationItem getNotationItem();

  @Nullable
  MizarRegistrationItem getRegistrationItem();

  @Nullable
  MizarReservation getReservation();

  @Nullable
  MizarSchemeItem getSchemeItem();

  @Nullable
  MizarTheorem getTheorem();

}
