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

public class MizarDefinitionImpl extends ASTWrapperPsiElement implements MizarDefinition {

  public MizarDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MizarVisitor visitor) {
    visitor.visitDefinition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MizarVisitor) accept((MizarVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MizarAttributeDefinition getAttributeDefinition() {
    return findChildByClass(MizarAttributeDefinition.class);
  }

  @Override
  @Nullable
  public MizarFunctorDefinition getFunctorDefinition() {
    return findChildByClass(MizarFunctorDefinition.class);
  }

  @Override
  @Nullable
  public MizarModeDefinition getModeDefinition() {
    return findChildByClass(MizarModeDefinition.class);
  }

  @Override
  @Nullable
  public MizarPredicateDefinition getPredicateDefinition() {
    return findChildByClass(MizarPredicateDefinition.class);
  }

  @Override
  @Nullable
  public MizarStructureDefinition getStructureDefinition() {
    return findChildByClass(MizarStructureDefinition.class);
  }

}
