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

public class MizarNotationDeclarationImpl extends ASTWrapperPsiElement implements MizarNotationDeclaration {

  public MizarNotationDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MizarVisitor visitor) {
    visitor.visitNotationDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MizarVisitor) accept((MizarVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MizarAttributeAntonym getAttributeAntonym() {
    return findChildByClass(MizarAttributeAntonym.class);
  }

  @Override
  @Nullable
  public MizarAttributeSynonym getAttributeSynonym() {
    return findChildByClass(MizarAttributeSynonym.class);
  }

  @Override
  @Nullable
  public MizarFunctorSynonym getFunctorSynonym() {
    return findChildByClass(MizarFunctorSynonym.class);
  }

  @Override
  @Nullable
  public MizarModeSynonym getModeSynonym() {
    return findChildByClass(MizarModeSynonym.class);
  }

  @Override
  @Nullable
  public MizarPredicateAntonym getPredicateAntonym() {
    return findChildByClass(MizarPredicateAntonym.class);
  }

  @Override
  @Nullable
  public MizarPredicateSynonym getPredicateSynonym() {
    return findChildByClass(MizarPredicateSynonym.class);
  }

}
