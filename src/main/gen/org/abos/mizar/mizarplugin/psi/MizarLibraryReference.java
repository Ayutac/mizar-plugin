// This is a generated file. Not intended for manual editing.
package org.abos.mizar.mizarplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MizarLibraryReference extends PsiElement {

  @NotNull
  MizarArticleName getArticleName();

  @NotNull
  List<MizarDefinitionNumber> getDefinitionNumberList();

  @NotNull
  List<MizarTheoremNumber> getTheoremNumberList();

}
