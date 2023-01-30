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

public class MizarPartialDefiniensImpl extends ASTWrapperPsiElement implements MizarPartialDefiniens {

  public MizarPartialDefiniensImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MizarVisitor visitor) {
    visitor.visitPartialDefiniens(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MizarVisitor) accept((MizarVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MizarSentence> getSentenceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MizarSentence.class);
  }

  @Override
  @Nullable
  public MizarTermExpression getTermExpression() {
    return findChildByClass(MizarTermExpression.class);
  }

}
