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

public class MizarSchemeBlockImpl extends ASTWrapperPsiElement implements MizarSchemeBlock {

  public MizarSchemeBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MizarVisitor visitor) {
    visitor.visitSchemeBlock(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MizarVisitor) accept((MizarVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public MizarReasoning getReasoning() {
    return findNotNullChildByClass(MizarReasoning.class);
  }

  @Override
  @NotNull
  public MizarSchemeConclusion getSchemeConclusion() {
    return findNotNullChildByClass(MizarSchemeConclusion.class);
  }

  @Override
  @NotNull
  public MizarSchemeIdentifier getSchemeIdentifier() {
    return findNotNullChildByClass(MizarSchemeIdentifier.class);
  }

  @Override
  @NotNull
  public MizarSchemeParameters getSchemeParameters() {
    return findNotNullChildByClass(MizarSchemeParameters.class);
  }

  @Override
  @NotNull
  public List<MizarSchemePremise> getSchemePremiseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MizarSchemePremise.class);
  }

}
