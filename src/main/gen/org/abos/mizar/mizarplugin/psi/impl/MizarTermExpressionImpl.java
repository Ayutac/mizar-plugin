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

public class MizarTermExpressionImpl extends ASTWrapperPsiElement implements MizarTermExpression {

  public MizarTermExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MizarVisitor visitor) {
    visitor.visitTermExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MizarVisitor) accept((MizarVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MizarArguments> getArgumentsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MizarArguments.class);
  }

  @Override
  @Nullable
  public MizarFunctorIdentifier getFunctorIdentifier() {
    return findChildByClass(MizarFunctorIdentifier.class);
  }

  @Override
  @Nullable
  public MizarFunctorSymbol getFunctorSymbol() {
    return findChildByClass(MizarFunctorSymbol.class);
  }

  @Override
  @Nullable
  public MizarLeftFunctorBracket getLeftFunctorBracket() {
    return findChildByClass(MizarLeftFunctorBracket.class);
  }

  @Override
  @NotNull
  public List<MizarPostQualification> getPostQualificationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MizarPostQualification.class);
  }

  @Override
  @Nullable
  public MizarPrivateDefinitionParameter getPrivateDefinitionParameter() {
    return findChildByClass(MizarPrivateDefinitionParameter.class);
  }

  @Override
  @Nullable
  public MizarRightFunctorBracket getRightFunctorBracket() {
    return findChildByClass(MizarRightFunctorBracket.class);
  }

  @Override
  @Nullable
  public MizarSelectorSymbol getSelectorSymbol() {
    return findChildByClass(MizarSelectorSymbol.class);
  }

  @Override
  @Nullable
  public MizarSentence getSentence() {
    return findChildByClass(MizarSentence.class);
  }

  @Override
  @Nullable
  public MizarStructureSymbol getStructureSymbol() {
    return findChildByClass(MizarStructureSymbol.class);
  }

  @Override
  @Nullable
  public MizarTermExpression getTermExpression() {
    return findChildByClass(MizarTermExpression.class);
  }

  @Override
  @Nullable
  public MizarTermExpressionList getTermExpressionList() {
    return findChildByClass(MizarTermExpressionList.class);
  }

  @Override
  @Nullable
  public MizarTypeExpression getTypeExpression() {
    return findChildByClass(MizarTypeExpression.class);
  }

  @Override
  @Nullable
  public MizarVariableIdentifier getVariableIdentifier() {
    return findChildByClass(MizarVariableIdentifier.class);
  }

  @Override
  @Nullable
  public PsiElement getNumber() {
    return findChildByType(NUMBER);
  }

}
