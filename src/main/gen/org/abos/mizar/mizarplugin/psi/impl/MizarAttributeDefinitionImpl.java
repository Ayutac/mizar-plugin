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

public class MizarAttributeDefinitionImpl extends ASTWrapperPsiElement implements MizarAttributeDefinition {

  public MizarAttributeDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MizarVisitor visitor) {
    visitor.visitAttributeDefinition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MizarVisitor) accept((MizarVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public MizarAttributePattern getAttributePattern() {
    return findNotNullChildByClass(MizarAttributePattern.class);
  }

  @Override
  @NotNull
  public MizarCorrectnessConditions getCorrectnessConditions() {
    return findNotNullChildByClass(MizarCorrectnessConditions.class);
  }

  @Override
  @NotNull
  public MizarDefiniens getDefiniens() {
    return findNotNullChildByClass(MizarDefiniens.class);
  }

}
