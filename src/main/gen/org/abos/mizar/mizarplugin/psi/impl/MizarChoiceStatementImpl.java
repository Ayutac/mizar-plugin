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

public class MizarChoiceStatementImpl extends ASTWrapperPsiElement implements MizarChoiceStatement {

  public MizarChoiceStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MizarVisitor visitor) {
    visitor.visitChoiceStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MizarVisitor) accept((MizarVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public MizarConditions getConditions() {
    return findNotNullChildByClass(MizarConditions.class);
  }

  @Override
  @NotNull
  public MizarQualifiedVariables getQualifiedVariables() {
    return findNotNullChildByClass(MizarQualifiedVariables.class);
  }

  @Override
  @NotNull
  public MizarSimpleJustification getSimpleJustification() {
    return findNotNullChildByClass(MizarSimpleJustification.class);
  }

}
