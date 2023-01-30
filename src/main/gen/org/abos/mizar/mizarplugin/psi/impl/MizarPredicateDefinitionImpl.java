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

public class MizarPredicateDefinitionImpl extends ASTWrapperPsiElement implements MizarPredicateDefinition {

  public MizarPredicateDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MizarVisitor visitor) {
    visitor.visitPredicateDefinition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MizarVisitor) accept((MizarVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public MizarCorrectnessConditions getCorrectnessConditions() {
    return findNotNullChildByClass(MizarCorrectnessConditions.class);
  }

  @Override
  @Nullable
  public MizarDefiniens getDefiniens() {
    return findChildByClass(MizarDefiniens.class);
  }

  @Override
  @NotNull
  public MizarPredicatePattern getPredicatePattern() {
    return findNotNullChildByClass(MizarPredicatePattern.class);
  }

  @Override
  @NotNull
  public List<MizarPredicateProperty> getPredicatePropertyList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MizarPredicateProperty.class);
  }

}
