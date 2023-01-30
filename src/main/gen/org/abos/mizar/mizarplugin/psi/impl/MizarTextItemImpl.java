// This is a generated file. Not intended for manual editing.
package org.abos.mizar.mizarplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.abos.mizar.mizarplugin.psi.MizarTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.abos.mizar.mizarplugin.psi.*;

public class MizarTextItemImpl extends ASTWrapperPsiElement implements MizarTextItem {

  public MizarTextItemImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MizarVisitor visitor) {
    visitor.visitTextItem(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MizarVisitor) accept((MizarVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MizarAuxiliaryItem getAuxiliaryItem() {
    return findChildByClass(MizarAuxiliaryItem.class);
  }

  @Override
  @Nullable
  public MizarDefinitionalItem getDefinitionalItem() {
    return findChildByClass(MizarDefinitionalItem.class);
  }

  @Override
  @Nullable
  public MizarNotationItem getNotationItem() {
    return findChildByClass(MizarNotationItem.class);
  }

  @Override
  @Nullable
  public MizarRegistrationItem getRegistrationItem() {
    return findChildByClass(MizarRegistrationItem.class);
  }

  @Override
  @Nullable
  public MizarReservation getReservation() {
    return findChildByClass(MizarReservation.class);
  }

  @Override
  @Nullable
  public MizarSchemeItem getSchemeItem() {
    return findChildByClass(MizarSchemeItem.class);
  }

  @Override
  @Nullable
  public MizarTheorem getTheorem() {
    return findChildByClass(MizarTheorem.class);
  }

}
