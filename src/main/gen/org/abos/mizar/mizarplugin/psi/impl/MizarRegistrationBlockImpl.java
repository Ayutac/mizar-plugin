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

public class MizarRegistrationBlockImpl extends ASTWrapperPsiElement implements MizarRegistrationBlock {

  public MizarRegistrationBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MizarVisitor visitor) {
    visitor.visitRegistrationBlock(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MizarVisitor) accept((MizarVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MizarAuxiliaryItem> getAuxiliaryItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MizarAuxiliaryItem.class);
  }

  @Override
  @NotNull
  public List<MizarClusterRegistration> getClusterRegistrationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MizarClusterRegistration.class);
  }

  @Override
  @NotNull
  public List<MizarIdentifyRegistration> getIdentifyRegistrationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MizarIdentifyRegistration.class);
  }

  @Override
  @NotNull
  public List<MizarLociDeclaration> getLociDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MizarLociDeclaration.class);
  }

  @Override
  @NotNull
  public List<MizarPropertyRegistration> getPropertyRegistrationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MizarPropertyRegistration.class);
  }

  @Override
  @NotNull
  public List<MizarReductionRegistration> getReductionRegistrationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MizarReductionRegistration.class);
  }

}
