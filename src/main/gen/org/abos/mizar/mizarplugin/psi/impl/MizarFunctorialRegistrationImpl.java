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

public class MizarFunctorialRegistrationImpl extends ASTWrapperPsiElement implements MizarFunctorialRegistration {

  public MizarFunctorialRegistrationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MizarVisitor visitor) {
    visitor.visitFunctorialRegistration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MizarVisitor) accept((MizarVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MizarAdjectiveCluster getAdjectiveCluster() {
    return findChildByClass(MizarAdjectiveCluster.class);
  }

  @Override
  @NotNull
  public MizarCorrectnessConditions getCorrectnessConditions() {
    return findNotNullChildByClass(MizarCorrectnessConditions.class);
  }

  @Override
  @NotNull
  public MizarTermExpression getTermExpression() {
    return findNotNullChildByClass(MizarTermExpression.class);
  }

  @Override
  @Nullable
  public MizarTypeExpression getTypeExpression() {
    return findChildByClass(MizarTypeExpression.class);
  }

}
