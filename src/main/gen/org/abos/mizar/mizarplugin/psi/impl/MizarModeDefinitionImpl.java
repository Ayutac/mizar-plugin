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

public class MizarModeDefinitionImpl extends ASTWrapperPsiElement implements MizarModeDefinition {

  public MizarModeDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MizarVisitor visitor) {
    visitor.visitModeDefinition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MizarVisitor) accept((MizarVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MizarCorrectnessConditions getCorrectnessConditions() {
    return findChildByClass(MizarCorrectnessConditions.class);
  }

  @Override
  @Nullable
  public MizarDefiniens getDefiniens() {
    return findChildByClass(MizarDefiniens.class);
  }

  @Override
  @NotNull
  public MizarModePattern getModePattern() {
    return findNotNullChildByClass(MizarModePattern.class);
  }

  @Override
  @NotNull
  public List<MizarModeProperty> getModePropertyList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MizarModeProperty.class);
  }

  @Override
  @Nullable
  public MizarSpecification getSpecification() {
    return findChildByClass(MizarSpecification.class);
  }

  @Override
  @Nullable
  public MizarTypeExpression getTypeExpression() {
    return findChildByClass(MizarTypeExpression.class);
  }

}
