// This is a generated file. Not intended for manual editing.
package org.abos.mizar.mizarplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MizarClusterRegistration extends PsiElement {

  @Nullable
  MizarConditionalRegistration getConditionalRegistration();

  @Nullable
  MizarExistentialRegistration getExistentialRegistration();

  @Nullable
  MizarFunctorialRegistration getFunctorialRegistration();

}
