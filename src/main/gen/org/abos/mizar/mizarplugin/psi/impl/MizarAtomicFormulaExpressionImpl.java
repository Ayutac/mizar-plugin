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

public class MizarAtomicFormulaExpressionImpl extends ASTWrapperPsiElement implements MizarAtomicFormulaExpression {

  public MizarAtomicFormulaExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MizarVisitor visitor) {
    visitor.visitAtomicFormulaExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MizarVisitor) accept((MizarVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MizarAdjective> getAdjectiveList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MizarAdjective.class);
  }

  @Override
  @Nullable
  public MizarPredicateIdentifier getPredicateIdentifier() {
    return findChildByClass(MizarPredicateIdentifier.class);
  }

  @Override
  @NotNull
  public List<MizarPredicateSymbol> getPredicateSymbolList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MizarPredicateSymbol.class);
  }

  @Override
  @Nullable
  public MizarTermExpression getTermExpression() {
    return findChildByClass(MizarTermExpression.class);
  }

  @Override
  @NotNull
  public List<MizarTermExpressionList> getTermExpressionListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MizarTermExpressionList.class);
  }

  @Override
  @Nullable
  public MizarTypeExpression getTypeExpression() {
    return findChildByClass(MizarTypeExpression.class);
  }

}
