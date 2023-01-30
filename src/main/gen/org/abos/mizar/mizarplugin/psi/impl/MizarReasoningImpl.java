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

public class MizarReasoningImpl extends ASTWrapperPsiElement implements MizarReasoning {

  public MizarReasoningImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MizarVisitor visitor) {
    visitor.visitReasoning(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MizarVisitor) accept((MizarVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MizarCaseList getCaseList() {
    return findChildByClass(MizarCaseList.class);
  }

  @Override
  @NotNull
  public List<MizarReasoningItem> getReasoningItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MizarReasoningItem.class);
  }

  @Override
  @Nullable
  public MizarSimpleJustification getSimpleJustification() {
    return findChildByClass(MizarSimpleJustification.class);
  }

  @Override
  @Nullable
  public MizarSupposeList getSupposeList() {
    return findChildByClass(MizarSupposeList.class);
  }

}
