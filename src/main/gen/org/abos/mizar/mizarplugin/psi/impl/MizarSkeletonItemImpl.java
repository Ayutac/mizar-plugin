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

public class MizarSkeletonItemImpl extends ASTWrapperPsiElement implements MizarSkeletonItem {

  public MizarSkeletonItemImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MizarVisitor visitor) {
    visitor.visitSkeletonItem(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MizarVisitor) accept((MizarVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MizarAssumption getAssumption() {
    return findChildByClass(MizarAssumption.class);
  }

  @Override
  @Nullable
  public MizarConclusion getConclusion() {
    return findChildByClass(MizarConclusion.class);
  }

  @Override
  @Nullable
  public MizarExemplification getExemplification() {
    return findChildByClass(MizarExemplification.class);
  }

  @Override
  @Nullable
  public MizarGeneralization getGeneralization() {
    return findChildByClass(MizarGeneralization.class);
  }

}
