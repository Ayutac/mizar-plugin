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

public class MizarStructureDefinitionImpl extends ASTWrapperPsiElement implements MizarStructureDefinition {

  public MizarStructureDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MizarVisitor visitor) {
    visitor.visitStructureDefinition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MizarVisitor) accept((MizarVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MizarAncestors getAncestors() {
    return findChildByClass(MizarAncestors.class);
  }

  @Override
  @NotNull
  public MizarFields getFields() {
    return findNotNullChildByClass(MizarFields.class);
  }

  @Override
  @Nullable
  public MizarLoci getLoci() {
    return findChildByClass(MizarLoci.class);
  }

  @Override
  @NotNull
  public MizarStructureSymbol getStructureSymbol() {
    return findNotNullChildByClass(MizarStructureSymbol.class);
  }

}
