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

public class MizarQuantifiedFormulaExpressionImpl extends ASTWrapperPsiElement implements MizarQuantifiedFormulaExpression {

  public MizarQuantifiedFormulaExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MizarVisitor visitor) {
    visitor.visitQuantifiedFormulaExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MizarVisitor) accept((MizarVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MizarFormulaExpression> getFormulaExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MizarFormulaExpression.class);
  }

  @Override
  @NotNull
  public MizarQualifiedVariables getQualifiedVariables() {
    return findNotNullChildByClass(MizarQualifiedVariables.class);
  }

  @Override
  @Nullable
  public MizarQuantifiedFormulaExpression getQuantifiedFormulaExpression() {
    return findChildByClass(MizarQuantifiedFormulaExpression.class);
  }

}
