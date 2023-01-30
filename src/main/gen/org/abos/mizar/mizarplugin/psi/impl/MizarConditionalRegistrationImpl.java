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

public class MizarConditionalRegistrationImpl extends ASTWrapperPsiElement implements MizarConditionalRegistration {

  public MizarConditionalRegistrationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MizarVisitor visitor) {
    visitor.visitConditionalRegistration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MizarVisitor) accept((MizarVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MizarAdjectiveCluster> getAdjectiveClusterList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MizarAdjectiveCluster.class);
  }

  @Override
  @NotNull
  public MizarCorrectnessConditions getCorrectnessConditions() {
    return findNotNullChildByClass(MizarCorrectnessConditions.class);
  }

  @Override
  @NotNull
  public MizarTypeExpression getTypeExpression() {
    return findNotNullChildByClass(MizarTypeExpression.class);
  }

}
