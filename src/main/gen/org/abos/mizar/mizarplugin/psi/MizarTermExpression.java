// This is a generated file. Not intended for manual editing.
package org.abos.mizar.mizarplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MizarTermExpression extends PsiElement {

  @NotNull
  List<MizarArguments> getArgumentsList();

  @Nullable
  MizarFunctorIdentifier getFunctorIdentifier();

  @Nullable
  MizarFunctorSymbol getFunctorSymbol();

  @Nullable
  MizarLeftFunctorBracket getLeftFunctorBracket();

  @NotNull
  List<MizarPostQualification> getPostQualificationList();

  @Nullable
  MizarPrivateDefinitionParameter getPrivateDefinitionParameter();

  @Nullable
  MizarRightFunctorBracket getRightFunctorBracket();

  @Nullable
  MizarSelectorSymbol getSelectorSymbol();

  @Nullable
  MizarSentence getSentence();

  @Nullable
  MizarStructureSymbol getStructureSymbol();

  @Nullable
  MizarTermExpression getTermExpression();

  @Nullable
  MizarTermExpressionList getTermExpressionList();

  @Nullable
  MizarTypeExpression getTypeExpression();

  @Nullable
  MizarVariableIdentifier getVariableIdentifier();

  @Nullable
  PsiElement getNumber();

}
