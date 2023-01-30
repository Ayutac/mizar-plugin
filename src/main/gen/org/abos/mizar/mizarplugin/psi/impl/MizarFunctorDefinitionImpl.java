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

public class MizarFunctorDefinitionImpl extends ASTWrapperPsiElement implements MizarFunctorDefinition {

  public MizarFunctorDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MizarVisitor visitor) {
    visitor.visitFunctorDefinition(this);
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
  public MizarFunctorPattern getFunctorPattern() {
    return findNotNullChildByClass(MizarFunctorPattern.class);
  }

  @Override
  @NotNull
  public List<MizarFunctorProperty> getFunctorPropertyList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MizarFunctorProperty.class);
  }

  @Override
  @Nullable
  public MizarSpecification getSpecification() {
    return findChildByClass(MizarSpecification.class);
  }

}
