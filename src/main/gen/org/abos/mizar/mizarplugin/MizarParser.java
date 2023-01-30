// This is a generated file. Not intended for manual editing.
package org.abos.mizar.mizarplugin;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.abos.mizar.mizarplugin.psi.MizarTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class MizarParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return Article(b, l + 1);
  }

  /* ********************************************************** */
  // NON? Adjective-Arguments? Attribute-Symbol
  public static boolean Adjective(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Adjective")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADJECTIVE, "<adjective>");
    r = Adjective_0(b, l + 1);
    r = r && Adjective_1(b, l + 1);
    r = r && Attribute_Symbol(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NON?
  private static boolean Adjective_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Adjective_0")) return false;
    consumeToken(b, NON);
    return true;
  }

  // Adjective-Arguments?
  private static boolean Adjective_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Adjective_1")) return false;
    Adjective_Arguments(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Term-Expression-List | "(" Term-Expression-List ")"
  public static boolean Adjective_Arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Adjective_Arguments")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADJECTIVE_ARGUMENTS, "<adjective arguments>");
    r = Term_Expression_List(b, l + 1);
    if (!r) r = Adjective_Arguments_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "(" Term-Expression-List ")"
  private static boolean Adjective_Arguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Adjective_Arguments_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && Term_Expression_List(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Adjective+
  public static boolean Adjective_Cluster(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Adjective_Cluster")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADJECTIVE_CLUSTER, "<adjective cluster>");
    r = Adjective(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!Adjective(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Adjective_Cluster", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Structure-Type-Expression ("," Structure-Type-Expression)*
  public static boolean Ancestors(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Ancestors")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ANCESTORS, "<ancestors>");
    r = Structure_Type_Expression(b, l + 1);
    p = r; // pin = 1
    r = r && Ancestors_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," Structure-Type-Expression)*
  private static boolean Ancestors_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Ancestors_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Ancestors_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Ancestors_1", c)) break;
    }
    return true;
  }

  // "," Structure-Type-Expression
  private static boolean Ancestors_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Ancestors_1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COMMA);
    p = r; // pin = 1
    r = r && Structure_Type_Expression(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // Term-Expression | "(" Term-Expression-List ")"
  public static boolean Arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Arguments")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARGUMENTS, "<arguments>");
    r = Term_Expression(b, l + 1);
    if (!r) r = Arguments_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "(" Term-Expression-List ")"
  private static boolean Arguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Arguments_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && Term_Expression_List(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Environment-Declaration Text-Proper
  static boolean Article(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Article")) return false;
    if (!nextTokenIs(b, ENVIRON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Environment_Declaration(b, l + 1);
    r = r && Text_Proper(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // filename
  public static boolean Article_Name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Article_Name")) return false;
    if (!nextTokenIs(b, FILENAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FILENAME);
    exit_section_(b, m, ARTICLE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // Single-Assumption | Collective-Assumption | Existential-Assumption
  public static boolean Assumption(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Assumption")) return false;
    if (!nextTokenIs(b, "<assumption>", ASSUME, GIVEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSUMPTION, "<assumption>");
    r = Single_Assumption(b, l + 1);
    if (!r) r = Collective_Assumption(b, l + 1);
    if (!r) r = Existential_Assumption(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Term-Expression-List? (( DOES | DO ) NOT)? Predicate-Symbol Term-Expression-List? ((( DOES | DO ) NOT)? Predicate-Symbol Term-Expression-List)* | Predicate-Identifier "[" Term-Expression-List? "]" | Term-Expression IS Adjective+ | Term-Expression IS Type-Expression
  public static boolean Atomic_Formula_Expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Atomic_Formula_Expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATOMIC_FORMULA_EXPRESSION, "<atomic formula expression>");
    r = Atomic_Formula_Expression_0(b, l + 1);
    if (!r) r = Atomic_Formula_Expression_1(b, l + 1);
    if (!r) r = Atomic_Formula_Expression_2(b, l + 1);
    if (!r) r = Atomic_Formula_Expression_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Term-Expression-List? (( DOES | DO ) NOT)? Predicate-Symbol Term-Expression-List? ((( DOES | DO ) NOT)? Predicate-Symbol Term-Expression-List)*
  private static boolean Atomic_Formula_Expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Atomic_Formula_Expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Atomic_Formula_Expression_0_0(b, l + 1);
    r = r && Atomic_Formula_Expression_0_1(b, l + 1);
    r = r && Predicate_Symbol(b, l + 1);
    r = r && Atomic_Formula_Expression_0_3(b, l + 1);
    r = r && Atomic_Formula_Expression_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Term-Expression-List?
  private static boolean Atomic_Formula_Expression_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Atomic_Formula_Expression_0_0")) return false;
    Term_Expression_List(b, l + 1);
    return true;
  }

  // (( DOES | DO ) NOT)?
  private static boolean Atomic_Formula_Expression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Atomic_Formula_Expression_0_1")) return false;
    Atomic_Formula_Expression_0_1_0(b, l + 1);
    return true;
  }

  // ( DOES | DO ) NOT
  private static boolean Atomic_Formula_Expression_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Atomic_Formula_Expression_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Atomic_Formula_Expression_0_1_0_0(b, l + 1);
    r = r && consumeToken(b, NOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // DOES | DO
  private static boolean Atomic_Formula_Expression_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Atomic_Formula_Expression_0_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, DOES);
    if (!r) r = consumeToken(b, DO);
    return r;
  }

  // Term-Expression-List?
  private static boolean Atomic_Formula_Expression_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Atomic_Formula_Expression_0_3")) return false;
    Term_Expression_List(b, l + 1);
    return true;
  }

  // ((( DOES | DO ) NOT)? Predicate-Symbol Term-Expression-List)*
  private static boolean Atomic_Formula_Expression_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Atomic_Formula_Expression_0_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Atomic_Formula_Expression_0_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Atomic_Formula_Expression_0_4", c)) break;
    }
    return true;
  }

  // (( DOES | DO ) NOT)? Predicate-Symbol Term-Expression-List
  private static boolean Atomic_Formula_Expression_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Atomic_Formula_Expression_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Atomic_Formula_Expression_0_4_0_0(b, l + 1);
    r = r && Predicate_Symbol(b, l + 1);
    r = r && Term_Expression_List(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (( DOES | DO ) NOT)?
  private static boolean Atomic_Formula_Expression_0_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Atomic_Formula_Expression_0_4_0_0")) return false;
    Atomic_Formula_Expression_0_4_0_0_0(b, l + 1);
    return true;
  }

  // ( DOES | DO ) NOT
  private static boolean Atomic_Formula_Expression_0_4_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Atomic_Formula_Expression_0_4_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Atomic_Formula_Expression_0_4_0_0_0_0(b, l + 1);
    r = r && consumeToken(b, NOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // DOES | DO
  private static boolean Atomic_Formula_Expression_0_4_0_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Atomic_Formula_Expression_0_4_0_0_0_0")) return false;
    boolean r;
    r = consumeToken(b, DOES);
    if (!r) r = consumeToken(b, DO);
    return r;
  }

  // Predicate-Identifier "[" Term-Expression-List? "]"
  private static boolean Atomic_Formula_Expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Atomic_Formula_Expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Predicate_Identifier(b, l + 1);
    r = r && consumeToken(b, LB);
    r = r && Atomic_Formula_Expression_1_2(b, l + 1);
    r = r && consumeToken(b, RB);
    exit_section_(b, m, null, r);
    return r;
  }

  // Term-Expression-List?
  private static boolean Atomic_Formula_Expression_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Atomic_Formula_Expression_1_2")) return false;
    Term_Expression_List(b, l + 1);
    return true;
  }

  // Term-Expression IS Adjective+
  private static boolean Atomic_Formula_Expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Atomic_Formula_Expression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Term_Expression(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && Atomic_Formula_Expression_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Adjective+
  private static boolean Atomic_Formula_Expression_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Atomic_Formula_Expression_2_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Adjective(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!Adjective(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Atomic_Formula_Expression_2_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // Term-Expression IS Type-Expression
  private static boolean Atomic_Formula_Expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Atomic_Formula_Expression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Term_Expression(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && Type_Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ANTONYM Attribute-Pattern FOR Attribute-Pattern ";"
  public static boolean Attribute_Antonym(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Attribute_Antonym")) return false;
    if (!nextTokenIs(b, ANTONYM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ANTONYM);
    r = r && Attribute_Pattern(b, l + 1);
    r = r && consumeToken(b, FOR);
    r = r && Attribute_Pattern(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, ATTRIBUTE_ANTONYM, r);
    return r;
  }

  /* ********************************************************** */
  // ATTR Attribute-Pattern MEANS Definiens ";" Correctness-Conditions
  public static boolean Attribute_Definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Attribute_Definition")) return false;
    if (!nextTokenIs(b, ATTR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ATTR);
    r = r && Attribute_Pattern(b, l + 1);
    r = r && consumeToken(b, MEANS);
    r = r && Definiens(b, l + 1);
    r = r && consumeToken(b, SEMI);
    r = r && Correctness_Conditions(b, l + 1);
    exit_section_(b, m, ATTRIBUTE_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // Loci | "(" Loci ")"
  public static boolean Attribute_Loci(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Attribute_Loci")) return false;
    if (!nextTokenIs(b, "<attribute loci>", ID, LP)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTE_LOCI, "<attribute loci>");
    r = Loci(b, l + 1);
    if (!r) r = Attribute_Loci_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "(" Loci ")"
  private static boolean Attribute_Loci_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Attribute_Loci_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && Loci(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Locus IS Attribute-Loci? Attribute-Symbol
  public static boolean Attribute_Pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Attribute_Pattern")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Locus(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && Attribute_Pattern_2(b, l + 1);
    r = r && Attribute_Symbol(b, l + 1);
    exit_section_(b, m, ATTRIBUTE_PATTERN, r);
    return r;
  }

  // Attribute-Loci?
  private static boolean Attribute_Pattern_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Attribute_Pattern_2")) return false;
    Attribute_Loci(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // symbol
  public static boolean Attribute_Symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Attribute_Symbol")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, ATTRIBUTE_SYMBOL, r);
    return r;
  }

  /* ********************************************************** */
  // SYNONYM Attribute-Pattern FOR Attribute-Pattern ";"
  public static boolean Attribute_Synonym(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Attribute_Synonym")) return false;
    if (!nextTokenIs(b, SYNONYM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYNONYM);
    r = r && Attribute_Pattern(b, l + 1);
    r = r && consumeToken(b, FOR);
    r = r && Attribute_Pattern(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, ATTRIBUTE_SYNONYM, r);
    return r;
  }

  /* ********************************************************** */
  // Statement | Private-Definition
  public static boolean Auxiliary_Item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Auxiliary_Item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AUXILIARY_ITEM, "<auxiliary item>");
    r = Statement(b, l + 1);
    if (!r) r = Private_Definition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CASE_ ( Proposition | Conditions ) ";" Reasoning END ";"
  public static boolean Case(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Case")) return false;
    if (!nextTokenIs(b, CASE_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CASE_);
    r = r && Case_1(b, l + 1);
    r = r && consumeToken(b, SEMI);
    r = r && Reasoning(b, l + 1);
    r = r && consumeTokens(b, 0, END, SEMI);
    exit_section_(b, m, CASE, r);
    return r;
  }

  // Proposition | Conditions
  private static boolean Case_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Case_1")) return false;
    boolean r;
    r = Proposition(b, l + 1);
    if (!r) r = Conditions(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // Case+
  public static boolean Case_List(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Case_List")) return false;
    if (!nextTokenIs(b, CASE_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Case(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!Case(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Case_List", c)) break;
    }
    exit_section_(b, m, CASE_LIST, r);
    return r;
  }

  /* ********************************************************** */
  // CONSIDER Qualified-Variables SUCH Conditions Simple-Justification ";"
  public static boolean Choice_Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Choice_Statement")) return false;
    if (!nextTokenIs(b, CONSIDER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONSIDER);
    r = r && Qualified_Variables(b, l + 1);
    r = r && consumeToken(b, SUCH);
    r = r && Conditions(b, l + 1);
    r = r && Simple_Justification(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, CHOICE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // Existential-Registration | Conditional-Registration | Functorial-Registration
  public static boolean Cluster_Registration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Cluster_Registration")) return false;
    if (!nextTokenIs(b, CLUSTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Existential_Registration(b, l + 1);
    if (!r) r = Conditional_Registration(b, l + 1);
    if (!r) r = Functorial_Registration(b, l + 1);
    exit_section_(b, m, CLUSTER_REGISTRATION, r);
    return r;
  }

  /* ********************************************************** */
  // ASSUME Conditions ";"
  public static boolean Collective_Assumption(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Collective_Assumption")) return false;
    if (!nextTokenIs(b, ASSUME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSUME);
    r = r && Conditions(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, COLLECTIVE_ASSUMPTION, r);
    return r;
  }

  /* ********************************************************** */
  // Proposition Justification ";"
  public static boolean Compact_Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Compact_Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPACT_STATEMENT, "<compact statement>");
    r = Proposition(b, l + 1);
    r = r && Justification(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (THUS | HENCE) ( Compact-Statement | Iterative-Equality ) | Diffuse-Conclusion
  public static boolean Conclusion(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Conclusion")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONCLUSION, "<conclusion>");
    r = Conclusion_0(b, l + 1);
    if (!r) r = Diffuse_Conclusion(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (THUS | HENCE) ( Compact-Statement | Iterative-Equality )
  private static boolean Conclusion_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Conclusion_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Conclusion_0_0(b, l + 1);
    r = r && Conclusion_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // THUS | HENCE
  private static boolean Conclusion_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Conclusion_0_0")) return false;
    boolean r;
    r = consumeToken(b, THUS);
    if (!r) r = consumeToken(b, HENCE);
    return r;
  }

  // Compact-Statement | Iterative-Equality
  private static boolean Conclusion_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Conclusion_0_1")) return false;
    boolean r;
    r = Compact_Statement(b, l + 1);
    if (!r) r = Iterative_Equality(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (":" Label-Identifier ":")? Partial-Definiens-List (OTHERWISE ( Sentence | Term-Expression ))?
  public static boolean Conditional_Definiens(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Conditional_Definiens")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITIONAL_DEFINIENS, "<conditional definiens>");
    r = Conditional_Definiens_0(b, l + 1);
    r = r && Partial_Definiens_List(b, l + 1);
    r = r && Conditional_Definiens_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (":" Label-Identifier ":")?
  private static boolean Conditional_Definiens_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Conditional_Definiens_0")) return false;
    Conditional_Definiens_0_0(b, l + 1);
    return true;
  }

  // ":" Label-Identifier ":"
  private static boolean Conditional_Definiens_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Conditional_Definiens_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && Label_Identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OTHERWISE ( Sentence | Term-Expression ))?
  private static boolean Conditional_Definiens_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Conditional_Definiens_2")) return false;
    Conditional_Definiens_2_0(b, l + 1);
    return true;
  }

  // OTHERWISE ( Sentence | Term-Expression )
  private static boolean Conditional_Definiens_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Conditional_Definiens_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OTHERWISE);
    r = r && Conditional_Definiens_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Sentence | Term-Expression
  private static boolean Conditional_Definiens_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Conditional_Definiens_2_0_1")) return false;
    boolean r;
    r = Sentence(b, l + 1);
    if (!r) r = Term_Expression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // CLUSTER Adjective-Cluster? "->" Adjective-Cluster? FOR Type-Expression ";" Correctness-Conditions
  public static boolean Conditional_Registration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Conditional_Registration")) return false;
    if (!nextTokenIs(b, CLUSTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CLUSTER);
    r = r && Conditional_Registration_1(b, l + 1);
    r = r && consumeToken(b, RA);
    r = r && Conditional_Registration_3(b, l + 1);
    r = r && consumeToken(b, FOR);
    r = r && Type_Expression(b, l + 1);
    r = r && consumeToken(b, SEMI);
    r = r && Correctness_Conditions(b, l + 1);
    exit_section_(b, m, CONDITIONAL_REGISTRATION, r);
    return r;
  }

  // Adjective-Cluster?
  private static boolean Conditional_Registration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Conditional_Registration_1")) return false;
    Adjective_Cluster(b, l + 1);
    return true;
  }

  // Adjective-Cluster?
  private static boolean Conditional_Registration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Conditional_Registration_3")) return false;
    Adjective_Cluster(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // THAT Proposition (AND Proposition)*
  public static boolean Conditions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Conditions")) return false;
    if (!nextTokenIs(b, THAT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THAT);
    r = r && Proposition(b, l + 1);
    r = r && Conditions_2(b, l + 1);
    exit_section_(b, m, CONDITIONS, r);
    return r;
  }

  // (AND Proposition)*
  private static boolean Conditions_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Conditions_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Conditions_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Conditions_2", c)) break;
    }
    return true;
  }

  // AND Proposition
  private static boolean Conditions_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Conditions_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && Proposition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SET Equating-List ";"
  public static boolean Constant_Definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constant_Definition")) return false;
    if (!nextTokenIs(b, SET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SET);
    r = r && Equating_List(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, CONSTANT_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // (EXISTENCE | UNIQUENESS | COHERENCE | COMPATIBILITY | CONSISTENCY | REDUCIBILITY) Justification ";"
  public static boolean Correctness_Condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Correctness_Condition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CORRECTNESS_CONDITION, "<correctness condition>");
    r = Correctness_Condition_0(b, l + 1);
    r = r && Justification(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // EXISTENCE | UNIQUENESS | COHERENCE | COMPATIBILITY | CONSISTENCY | REDUCIBILITY
  private static boolean Correctness_Condition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Correctness_Condition_0")) return false;
    boolean r;
    r = consumeToken(b, EXISTENCE);
    if (!r) r = consumeToken(b, UNIQUENESS);
    if (!r) r = consumeToken(b, COHERENCE);
    if (!r) r = consumeToken(b, COMPATIBILITY);
    if (!r) r = consumeToken(b, CONSISTENCY);
    if (!r) r = consumeToken(b, REDUCIBILITY);
    return r;
  }

  /* ********************************************************** */
  // Correctness-Condition* (CORRECTNESS Justification ";")?
  public static boolean Correctness_Conditions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Correctness_Conditions")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CORRECTNESS_CONDITIONS, "<correctness conditions>");
    r = Correctness_Conditions_0(b, l + 1);
    r = r && Correctness_Conditions_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Correctness-Condition*
  private static boolean Correctness_Conditions_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Correctness_Conditions_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Correctness_Condition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Correctness_Conditions_0", c)) break;
    }
    return true;
  }

  // (CORRECTNESS Justification ";")?
  private static boolean Correctness_Conditions_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Correctness_Conditions_1")) return false;
    Correctness_Conditions_1_0(b, l + 1);
    return true;
  }

  // CORRECTNESS Justification ";"
  private static boolean Correctness_Conditions_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Correctness_Conditions_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CORRECTNESS);
    r = r && Justification(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Simple-Definiens | Conditional-Definiens
  public static boolean Definiens(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definiens")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFINIENS, "<definiens>");
    r = Simple_Definiens(b, l + 1);
    if (!r) r = Conditional_Definiens(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Structure-Definition | Mode-Definition | Functor-Definition | Predicate-Definition | Attribute-Definition
  public static boolean Definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFINITION, "<definition>");
    r = Structure_Definition(b, l + 1);
    if (!r) r = Mode_Definition(b, l + 1);
    if (!r) r = Functor_Definition(b, l + 1);
    if (!r) r = Predicate_Definition(b, l + 1);
    if (!r) r = Attribute_Definition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Loci-Declaration | Permissive-Assumption | Auxiliary-Item
  public static boolean Definition_Item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definition_Item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFINITION_ITEM, "<definition item>");
    r = Loci_Declaration(b, l + 1);
    if (!r) r = Permissive_Assumption(b, l + 1);
    if (!r) r = Auxiliary_Item(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // number
  public static boolean Definition_Number(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definition_Number")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    exit_section_(b, m, DEFINITION_NUMBER, r);
    return r;
  }

  /* ********************************************************** */
  // DEFINITION_ (Definition-Item | Definition | Redefinition)* END
  public static boolean Definitional_Block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definitional_Block")) return false;
    if (!nextTokenIs(b, DEFINITION_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEFINITION_);
    r = r && Definitional_Block_1(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, DEFINITIONAL_BLOCK, r);
    return r;
  }

  // (Definition-Item | Definition | Redefinition)*
  private static boolean Definitional_Block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definitional_Block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Definitional_Block_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Definitional_Block_1", c)) break;
    }
    return true;
  }

  // Definition-Item | Definition | Redefinition
  private static boolean Definitional_Block_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definitional_Block_1_0")) return false;
    boolean r;
    r = Definition_Item(b, l + 1);
    if (!r) r = Definition(b, l + 1);
    if (!r) r = Redefinition(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // Definitional-Block ";"
  public static boolean Definitional_Item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definitional_Item")) return false;
    if (!nextTokenIs(b, DEFINITION_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Definitional_Block(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, DEFINITIONAL_ITEM, r);
    return r;
  }

  /* ********************************************************** */
  // THUS Diffuse-Statement | HEREBY Reasoning END ";"
  public static boolean Diffuse_Conclusion(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Diffuse_Conclusion")) return false;
    if (!nextTokenIs(b, "<diffuse conclusion>", HEREBY, THUS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DIFFUSE_CONCLUSION, "<diffuse conclusion>");
    r = Diffuse_Conclusion_0(b, l + 1);
    if (!r) r = Diffuse_Conclusion_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // THUS Diffuse-Statement
  private static boolean Diffuse_Conclusion_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Diffuse_Conclusion_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THUS);
    r = r && Diffuse_Statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // HEREBY Reasoning END ";"
  private static boolean Diffuse_Conclusion_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Diffuse_Conclusion_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HEREBY);
    r = r && Reasoning(b, l + 1);
    r = r && consumeTokens(b, 0, END, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (Label-Identifier ":")? NOW Reasoning END ";"
  public static boolean Diffuse_Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Diffuse_Statement")) return false;
    if (!nextTokenIs(b, "<diffuse statement>", ID, NOW)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DIFFUSE_STATEMENT, "<diffuse statement>");
    r = Diffuse_Statement_0(b, l + 1);
    r = r && consumeToken(b, NOW);
    r = r && Reasoning(b, l + 1);
    r = r && consumeTokens(b, 0, END, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (Label-Identifier ":")?
  private static boolean Diffuse_Statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Diffuse_Statement_0")) return false;
    Diffuse_Statement_0_0(b, l + 1);
    return true;
  }

  // Label-Identifier ":"
  private static boolean Diffuse_Statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Diffuse_Statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Label_Identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Vocabulary-Directive | Library-Directive | Requirement-Directive
  public static boolean Directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Directive")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DIRECTIVE, "<directive>");
    r = Vocabulary_Directive(b, l + 1);
    if (!r) r = Library_Directive(b, l + 1);
    if (!r) r = Requirement_Directive(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ENVIRON Directive*
  public static boolean Environment_Declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Environment_Declaration")) return false;
    if (!nextTokenIs(b, ENVIRON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENVIRON);
    r = r && Environment_Declaration_1(b, l + 1);
    exit_section_(b, m, ENVIRONMENT_DECLARATION, r);
    return r;
  }

  // Directive*
  private static boolean Environment_Declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Environment_Declaration_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Directive(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Environment_Declaration_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Variable-Identifier "=" Term-Expression
  public static boolean Equating(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Equating")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Variable_Identifier(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && Term_Expression(b, l + 1);
    exit_section_(b, m, EQUATING, r);
    return r;
  }

  /* ********************************************************** */
  // Equating ("," Equating)*
  public static boolean Equating_List(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Equating_List")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EQUATING_LIST, null);
    r = Equating(b, l + 1);
    p = r; // pin = 1
    r = r && Equating_List_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," Equating)*
  private static boolean Equating_List_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Equating_List_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Equating_List_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Equating_List_1", c)) break;
    }
    return true;
  }

  // "," Equating
  private static boolean Equating_List_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Equating_List_1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COMMA);
    p = r; // pin = 1
    r = r && Equating(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // Term-Expression | Variable-Identifier "=" Term-Expression
  public static boolean Example(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Example")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXAMPLE, "<example>");
    r = Term_Expression(b, l + 1);
    if (!r) r = Example_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Variable-Identifier "=" Term-Expression
  private static boolean Example_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Example_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Variable_Identifier(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && Term_Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TAKE Example ("," Example)* ";"
  public static boolean Exemplification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Exemplification")) return false;
    if (!nextTokenIs(b, TAKE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TAKE);
    r = r && Example(b, l + 1);
    r = r && Exemplification_2(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, EXEMPLIFICATION, r);
    return r;
  }

  // ("," Example)*
  private static boolean Exemplification_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Exemplification_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Exemplification_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Exemplification_2", c)) break;
    }
    return true;
  }

  // "," Example
  private static boolean Exemplification_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Exemplification_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Example(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // GIVEN Qualified-Variables (SUCH Conditions)? ";"
  public static boolean Existential_Assumption(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Existential_Assumption")) return false;
    if (!nextTokenIs(b, GIVEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GIVEN);
    r = r && Qualified_Variables(b, l + 1);
    r = r && Existential_Assumption_2(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, EXISTENTIAL_ASSUMPTION, r);
    return r;
  }

  // (SUCH Conditions)?
  private static boolean Existential_Assumption_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Existential_Assumption_2")) return false;
    Existential_Assumption_2_0(b, l + 1);
    return true;
  }

  // SUCH Conditions
  private static boolean Existential_Assumption_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Existential_Assumption_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SUCH);
    r = r && Conditions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CLUSTER Adjective-Cluster? FOR Type-Expression ";" Correctness-Conditions
  public static boolean Existential_Registration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Existential_Registration")) return false;
    if (!nextTokenIs(b, CLUSTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CLUSTER);
    r = r && Existential_Registration_1(b, l + 1);
    r = r && consumeToken(b, FOR);
    r = r && Type_Expression(b, l + 1);
    r = r && consumeToken(b, SEMI);
    r = r && Correctness_Conditions(b, l + 1);
    exit_section_(b, m, EXISTENTIAL_REGISTRATION, r);
    return r;
  }

  // Adjective-Cluster?
  private static boolean Existential_Registration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Existential_Registration_1")) return false;
    Adjective_Cluster(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Qualified-Segment ("," Qualified-Segment)*
  public static boolean Explicitly_Qualified_Variables(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Explicitly_Qualified_Variables")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EXPLICITLY_QUALIFIED_VARIABLES, null);
    r = Qualified_Segment(b, l + 1);
    p = r; // pin = 1
    r = r && Explicitly_Qualified_Variables_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," Qualified-Segment)*
  private static boolean Explicitly_Qualified_Variables_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Explicitly_Qualified_Variables_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Explicitly_Qualified_Variables_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Explicitly_Qualified_Variables_1", c)) break;
    }
    return true;
  }

  // "," Qualified-Segment
  private static boolean Explicitly_Qualified_Variables_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Explicitly_Qualified_Variables_1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COMMA);
    p = r; // pin = 1
    r = r && Qualified_Segment(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // Selector-Symbol ("," Selector-Symbol)* Specification
  public static boolean Field_Segment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Field_Segment")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FIELD_SEGMENT, null);
    r = Selector_Symbol(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, Field_Segment_1(b, l + 1));
    r = p && Specification(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," Selector-Symbol)*
  private static boolean Field_Segment_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Field_Segment_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Field_Segment_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Field_Segment_1", c)) break;
    }
    return true;
  }

  // "," Selector-Symbol
  private static boolean Field_Segment_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Field_Segment_1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COMMA);
    p = r; // pin = 1
    r = r && Selector_Symbol(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // Field-Segment ("," Field-Segment)*
  public static boolean Fields(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Fields")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FIELDS, null);
    r = Field_Segment(b, l + 1);
    p = r; // pin = 1
    r = r && Fields_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," Field-Segment)*
  private static boolean Fields_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Fields_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Fields_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Fields_1", c)) break;
    }
    return true;
  }

  // "," Field-Segment
  private static boolean Fields_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Fields_1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COMMA);
    p = r; // pin = 1
    r = r && Field_Segment(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // "(" Formula-Expression ")" | Atomic-Formula-Expression | Quantified-Formula-Expression | Formula-Expression "&" Formula-Expression | Formula-Expression "&" "..." "&" Formula-Expression | Formula-Expression OR Formula-Expression | Formula-Expression OR "..." OR Formula-Expression | Formula-Expression IMPLIES Formula-Expression | Formula-Expression IFF Formula-Expression | NOT Formula-Expression | CONTRADICTION | THESIS
  public static boolean Formula_Expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Formula_Expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMULA_EXPRESSION, "<formula expression>");
    r = Formula_Expression_0(b, l + 1);
    if (!r) r = Atomic_Formula_Expression(b, l + 1);
    if (!r) r = Quantified_Formula_Expression(b, l + 1);
    if (!r) r = Formula_Expression_3(b, l + 1);
    if (!r) r = Formula_Expression_4(b, l + 1);
    if (!r) r = Formula_Expression_5(b, l + 1);
    if (!r) r = Formula_Expression_6(b, l + 1);
    if (!r) r = Formula_Expression_7(b, l + 1);
    if (!r) r = Formula_Expression_8(b, l + 1);
    if (!r) r = Formula_Expression_9(b, l + 1);
    if (!r) r = consumeToken(b, CONTRADICTION);
    if (!r) r = consumeToken(b, THESIS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "(" Formula-Expression ")"
  private static boolean Formula_Expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Formula_Expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && Formula_Expression(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // Formula-Expression "&" Formula-Expression
  private static boolean Formula_Expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Formula_Expression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Formula_Expression(b, l + 1);
    r = r && consumeToken(b, AMP);
    r = r && Formula_Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Formula-Expression "&" "..." "&" Formula-Expression
  private static boolean Formula_Expression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Formula_Expression_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Formula_Expression(b, l + 1);
    r = r && consumeTokens(b, 0, AMP, DOTS, AMP);
    r = r && Formula_Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Formula-Expression OR Formula-Expression
  private static boolean Formula_Expression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Formula_Expression_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Formula_Expression(b, l + 1);
    r = r && consumeToken(b, OR);
    r = r && Formula_Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Formula-Expression OR "..." OR Formula-Expression
  private static boolean Formula_Expression_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Formula_Expression_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Formula_Expression(b, l + 1);
    r = r && consumeTokens(b, 0, OR, DOTS, OR);
    r = r && Formula_Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Formula-Expression IMPLIES Formula-Expression
  private static boolean Formula_Expression_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Formula_Expression_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Formula_Expression(b, l + 1);
    r = r && consumeToken(b, IMPLIES);
    r = r && Formula_Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Formula-Expression IFF Formula-Expression
  private static boolean Formula_Expression_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Formula_Expression_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Formula_Expression(b, l + 1);
    r = r && consumeToken(b, IFF);
    r = r && Formula_Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NOT Formula-Expression
  private static boolean Formula_Expression_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Formula_Expression_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOT);
    r = r && Formula_Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FUNC Functor-Pattern Specification? (( MEANS | EQUALS ) Definiens)? ";" Correctness-Conditions Functor-Property*
  public static boolean Functor_Definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Functor_Definition")) return false;
    if (!nextTokenIs(b, FUNC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FUNC);
    r = r && Functor_Pattern(b, l + 1);
    r = r && Functor_Definition_2(b, l + 1);
    r = r && Functor_Definition_3(b, l + 1);
    r = r && consumeToken(b, SEMI);
    r = r && Correctness_Conditions(b, l + 1);
    r = r && Functor_Definition_6(b, l + 1);
    exit_section_(b, m, FUNCTOR_DEFINITION, r);
    return r;
  }

  // Specification?
  private static boolean Functor_Definition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Functor_Definition_2")) return false;
    Specification(b, l + 1);
    return true;
  }

  // (( MEANS | EQUALS ) Definiens)?
  private static boolean Functor_Definition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Functor_Definition_3")) return false;
    Functor_Definition_3_0(b, l + 1);
    return true;
  }

  // ( MEANS | EQUALS ) Definiens
  private static boolean Functor_Definition_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Functor_Definition_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Functor_Definition_3_0_0(b, l + 1);
    r = r && Definiens(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MEANS | EQUALS
  private static boolean Functor_Definition_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Functor_Definition_3_0_0")) return false;
    boolean r;
    r = consumeToken(b, MEANS);
    if (!r) r = consumeToken(b, EQUALS);
    return r;
  }

  // Functor-Property*
  private static boolean Functor_Definition_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Functor_Definition_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Functor_Property(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Functor_Definition_6", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // id
  public static boolean Functor_Identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Functor_Identifier")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, FUNCTOR_IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // Locus | "(" Loci ")"
  public static boolean Functor_Loci(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Functor_Loci")) return false;
    if (!nextTokenIs(b, "<functor loci>", ID, LP)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTOR_LOCI, "<functor loci>");
    r = Locus(b, l + 1);
    if (!r) r = Functor_Loci_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "(" Loci ")"
  private static boolean Functor_Loci_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Functor_Loci_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && Loci(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Functor-Loci? Functor-Symbol Functor-Loci? | Left-Functor-Bracket Loci Right-Functor-Bracket
  public static boolean Functor_Pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Functor_Pattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTOR_PATTERN, "<functor pattern>");
    r = Functor_Pattern_0(b, l + 1);
    if (!r) r = Functor_Pattern_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Functor-Loci? Functor-Symbol Functor-Loci?
  private static boolean Functor_Pattern_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Functor_Pattern_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Functor_Pattern_0_0(b, l + 1);
    r = r && Functor_Symbol(b, l + 1);
    r = r && Functor_Pattern_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Functor-Loci?
  private static boolean Functor_Pattern_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Functor_Pattern_0_0")) return false;
    Functor_Loci(b, l + 1);
    return true;
  }

  // Functor-Loci?
  private static boolean Functor_Pattern_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Functor_Pattern_0_2")) return false;
    Functor_Loci(b, l + 1);
    return true;
  }

  // Left-Functor-Bracket Loci Right-Functor-Bracket
  private static boolean Functor_Pattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Functor_Pattern_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Left_Functor_Bracket(b, l + 1);
    r = r && Loci(b, l + 1);
    r = r && Right_Functor_Bracket(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (COMMUTATIVITY | IDEMPOTENCE | INVOLUTIVENESS | PROJECTIVITY) Justification ";"
  public static boolean Functor_Property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Functor_Property")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTOR_PROPERTY, "<functor property>");
    r = Functor_Property_0(b, l + 1);
    r = r && Justification(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMUTATIVITY | IDEMPOTENCE | INVOLUTIVENESS | PROJECTIVITY
  private static boolean Functor_Property_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Functor_Property_0")) return false;
    boolean r;
    r = consumeToken(b, COMMUTATIVITY);
    if (!r) r = consumeToken(b, IDEMPOTENCE);
    if (!r) r = consumeToken(b, INVOLUTIVENESS);
    if (!r) r = consumeToken(b, PROJECTIVITY);
    return r;
  }

  /* ********************************************************** */
  // Functor-Identifier ("," Functor-Identifier)* "(" Type-Expression-List? ")" Specification
  public static boolean Functor_Segment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Functor_Segment")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUNCTOR_SEGMENT, null);
    r = Functor_Identifier(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, Functor_Segment_1(b, l + 1));
    r = p && report_error_(b, consumeToken(b, LP)) && r;
    r = p && report_error_(b, Functor_Segment_3(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, RP)) && r;
    r = p && Specification(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," Functor-Identifier)*
  private static boolean Functor_Segment_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Functor_Segment_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Functor_Segment_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Functor_Segment_1", c)) break;
    }
    return true;
  }

  // "," Functor-Identifier
  private static boolean Functor_Segment_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Functor_Segment_1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COMMA);
    p = r; // pin = 1
    r = r && Functor_Identifier(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Type-Expression-List?
  private static boolean Functor_Segment_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Functor_Segment_3")) return false;
    Type_Expression_List(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // symbol
  public static boolean Functor_Symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Functor_Symbol")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, FUNCTOR_SYMBOL, r);
    return r;
  }

  /* ********************************************************** */
  // SYNONYM Functor-Pattern FOR Functor-Pattern ";"
  public static boolean Functor_Synonym(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Functor_Synonym")) return false;
    if (!nextTokenIs(b, SYNONYM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYNONYM);
    r = r && Functor_Pattern(b, l + 1);
    r = r && consumeToken(b, FOR);
    r = r && Functor_Pattern(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, FUNCTOR_SYNONYM, r);
    return r;
  }

  /* ********************************************************** */
  // CLUSTER Term-Expression "->" Adjective-Cluster? (FOR Type-Expression)? ";" Correctness-Conditions
  public static boolean Functorial_Registration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Functorial_Registration")) return false;
    if (!nextTokenIs(b, CLUSTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CLUSTER);
    r = r && Term_Expression(b, l + 1);
    r = r && consumeToken(b, RA);
    r = r && Functorial_Registration_3(b, l + 1);
    r = r && Functorial_Registration_4(b, l + 1);
    r = r && consumeToken(b, SEMI);
    r = r && Correctness_Conditions(b, l + 1);
    exit_section_(b, m, FUNCTORIAL_REGISTRATION, r);
    return r;
  }

  // Adjective-Cluster?
  private static boolean Functorial_Registration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Functorial_Registration_3")) return false;
    Adjective_Cluster(b, l + 1);
    return true;
  }

  // (FOR Type-Expression)?
  private static boolean Functorial_Registration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Functorial_Registration_4")) return false;
    Functorial_Registration_4_0(b, l + 1);
    return true;
  }

  // FOR Type-Expression
  private static boolean Functorial_Registration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Functorial_Registration_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && Type_Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LET Qualified-Variables (SUCH Conditions)? ";"
  public static boolean Generalization(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Generalization")) return false;
    if (!nextTokenIs(b, LET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LET);
    r = r && Qualified_Variables(b, l + 1);
    r = r && Generalization_2(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, GENERALIZATION, r);
    return r;
  }

  // (SUCH Conditions)?
  private static boolean Generalization_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Generalization_2")) return false;
    Generalization_2_0(b, l + 1);
    return true;
  }

  // SUCH Conditions
  private static boolean Generalization_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Generalization_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SUCH);
    r = r && Conditions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFY Functor-Pattern WITH Functor-Pattern (WHEN Locus "=" Locus ("," Locus "=" Locus)*)? ";" Correctness-Conditions
  public static boolean Identify_Registration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identify_Registration")) return false;
    if (!nextTokenIs(b, IDENTIFY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFY);
    r = r && Functor_Pattern(b, l + 1);
    r = r && consumeToken(b, WITH);
    r = r && Functor_Pattern(b, l + 1);
    r = r && Identify_Registration_4(b, l + 1);
    r = r && consumeToken(b, SEMI);
    r = r && Correctness_Conditions(b, l + 1);
    exit_section_(b, m, IDENTIFY_REGISTRATION, r);
    return r;
  }

  // (WHEN Locus "=" Locus ("," Locus "=" Locus)*)?
  private static boolean Identify_Registration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identify_Registration_4")) return false;
    Identify_Registration_4_0(b, l + 1);
    return true;
  }

  // WHEN Locus "=" Locus ("," Locus "=" Locus)*
  private static boolean Identify_Registration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identify_Registration_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHEN);
    r = r && Locus(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && Locus(b, l + 1);
    r = r && Identify_Registration_4_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," Locus "=" Locus)*
  private static boolean Identify_Registration_4_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identify_Registration_4_0_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Identify_Registration_4_0_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Identify_Registration_4_0_4", c)) break;
    }
    return true;
  }

  // "," Locus "=" Locus
  private static boolean Identify_Registration_4_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identify_Registration_4_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Locus(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && Locus(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Variables
  public static boolean Implicitly_Qualified_Variables(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Implicitly_Qualified_Variables")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Variables(b, l + 1);
    exit_section_(b, m, IMPLICITLY_QUALIFIED_VARIABLES, r);
    return r;
  }

  /* ********************************************************** */
  // (Label-Identifier ":")? Term-Expression "=" Term-Expression Simple-Justification (".=" Term-Expression Simple-Justification)+ ";"
  public static boolean Iterative_Equality(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Iterative_Equality")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ITERATIVE_EQUALITY, "<iterative equality>");
    r = Iterative_Equality_0(b, l + 1);
    r = r && Term_Expression(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && Term_Expression(b, l + 1);
    r = r && Simple_Justification(b, l + 1);
    r = r && Iterative_Equality_5(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (Label-Identifier ":")?
  private static boolean Iterative_Equality_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Iterative_Equality_0")) return false;
    Iterative_Equality_0_0(b, l + 1);
    return true;
  }

  // Label-Identifier ":"
  private static boolean Iterative_Equality_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Iterative_Equality_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Label_Identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // (".=" Term-Expression Simple-Justification)+
  private static boolean Iterative_Equality_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Iterative_Equality_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Iterative_Equality_5_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!Iterative_Equality_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Iterative_Equality_5", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ".=" Term-Expression Simple-Justification
  private static boolean Iterative_Equality_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Iterative_Equality_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PEQ);
    r = r && Term_Expression(b, l + 1);
    r = r && Simple_Justification(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Proof | Simple-Justification
  public static boolean Justification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Justification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, JUSTIFICATION, "<justification>");
    r = Proof(b, l + 1);
    if (!r) r = Simple_Justification(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // id
  public static boolean Label_Identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Label_Identifier")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, LABEL_IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // symbol | "{" | "["
  public static boolean Left_Functor_Bracket(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Left_Functor_Bracket")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LEFT_FUNCTOR_BRACKET, "<left functor bracket>");
    r = consumeToken(b, SYMBOL);
    if (!r) r = consumeToken(b, LC);
    if (!r) r = consumeToken(b, LB);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (NOTATIONS | CONSTRUCTORS | REGISTRATIONS | DEFINITIONS | EXPANSIONS | EQUALITIES | THEOREMS | SCHEMES) Article-Name ("," Article-Name)* ";"
  public static boolean Library_Directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Library_Directive")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LIBRARY_DIRECTIVE, "<library directive>");
    r = Library_Directive_0(b, l + 1);
    r = r && Article_Name(b, l + 1);
    r = r && Library_Directive_2(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NOTATIONS | CONSTRUCTORS | REGISTRATIONS | DEFINITIONS | EXPANSIONS | EQUALITIES | THEOREMS | SCHEMES
  private static boolean Library_Directive_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Library_Directive_0")) return false;
    boolean r;
    r = consumeToken(b, NOTATIONS);
    if (!r) r = consumeToken(b, CONSTRUCTORS);
    if (!r) r = consumeToken(b, REGISTRATIONS);
    if (!r) r = consumeToken(b, DEFINITIONS);
    if (!r) r = consumeToken(b, EXPANSIONS);
    if (!r) r = consumeToken(b, EQUALITIES);
    if (!r) r = consumeToken(b, THEOREMS);
    if (!r) r = consumeToken(b, SCHEMES);
    return r;
  }

  // ("," Article-Name)*
  private static boolean Library_Directive_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Library_Directive_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Library_Directive_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Library_Directive_2", c)) break;
    }
    return true;
  }

  // "," Article-Name
  private static boolean Library_Directive_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Library_Directive_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Article_Name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Article-Name ":" ( Theorem-Number | DEF Definition-Number ) ("," ( Theorem-Number | DEF Definition-Number ))*
  public static boolean Library_Reference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Library_Reference")) return false;
    if (!nextTokenIs(b, FILENAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Article_Name(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Library_Reference_2(b, l + 1);
    r = r && Library_Reference_3(b, l + 1);
    exit_section_(b, m, LIBRARY_REFERENCE, r);
    return r;
  }

  // Theorem-Number | DEF Definition-Number
  private static boolean Library_Reference_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Library_Reference_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Theorem_Number(b, l + 1);
    if (!r) r = Library_Reference_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DEF Definition-Number
  private static boolean Library_Reference_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Library_Reference_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEF);
    r = r && Definition_Number(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," ( Theorem-Number | DEF Definition-Number ))*
  private static boolean Library_Reference_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Library_Reference_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Library_Reference_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Library_Reference_3", c)) break;
    }
    return true;
  }

  // "," ( Theorem-Number | DEF Definition-Number )
  private static boolean Library_Reference_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Library_Reference_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Library_Reference_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Theorem-Number | DEF Definition-Number
  private static boolean Library_Reference_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Library_Reference_3_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Theorem_Number(b, l + 1);
    if (!r) r = Library_Reference_3_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DEF Definition-Number
  private static boolean Library_Reference_3_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Library_Reference_3_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEF);
    r = r && Definition_Number(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Article-Name ":" SCH Scheme-Number
  public static boolean Library_Scheme_Reference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Library_Scheme_Reference")) return false;
    if (!nextTokenIs(b, FILENAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Article_Name(b, l + 1);
    r = r && consumeTokens(b, 0, COLON, SCH);
    r = r && Scheme_Number(b, l + 1);
    exit_section_(b, m, LIBRARY_SCHEME_REFERENCE, r);
    return r;
  }

  /* ********************************************************** */
  // Compact-Statement | Choice-Statement | Type-Changing-Statement | Iterative-Equality
  public static boolean Linkable_Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Linkable_Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LINKABLE_STATEMENT, "<linkable statement>");
    r = Compact_Statement(b, l + 1);
    if (!r) r = Choice_Statement(b, l + 1);
    if (!r) r = Type_Changing_Statement(b, l + 1);
    if (!r) r = Iterative_Equality(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Label-Identifier
  public static boolean Local_Reference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Local_Reference")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Label_Identifier(b, l + 1);
    exit_section_(b, m, LOCAL_REFERENCE, r);
    return r;
  }

  /* ********************************************************** */
  // Scheme-Identifier
  public static boolean Local_Scheme_Reference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Local_Scheme_Reference")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Scheme_Identifier(b, l + 1);
    exit_section_(b, m, LOCAL_SCHEME_REFERENCE, r);
    return r;
  }

  /* ********************************************************** */
  // Locus ("," Locus)*
  public static boolean Loci(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Loci")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Locus(b, l + 1);
    r = r && Loci_1(b, l + 1);
    exit_section_(b, m, LOCI, r);
    return r;
  }

  // ("," Locus)*
  private static boolean Loci_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Loci_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Loci_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Loci_1", c)) break;
    }
    return true;
  }

  // "," Locus
  private static boolean Loci_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Loci_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Locus(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LET Qualified-Variables (SUCH Conditions)? ";"
  public static boolean Loci_Declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Loci_Declaration")) return false;
    if (!nextTokenIs(b, LET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LET);
    r = r && Qualified_Variables(b, l + 1);
    r = r && Loci_Declaration_2(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, LOCI_DECLARATION, r);
    return r;
  }

  // (SUCH Conditions)?
  private static boolean Loci_Declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Loci_Declaration_2")) return false;
    Loci_Declaration_2_0(b, l + 1);
    return true;
  }

  // SUCH Conditions
  private static boolean Loci_Declaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Loci_Declaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SUCH);
    r = r && Conditions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Variable-Identifier
  public static boolean Locus(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Locus")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Variable_Identifier(b, l + 1);
    exit_section_(b, m, LOCUS, r);
    return r;
  }

  /* ********************************************************** */
  // MODE Mode-Pattern ( Specification? (MEANS Definiens)? ";" Correctness-Conditions | IS Type-Expression ";" ) Mode-Property*
  public static boolean Mode_Definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Mode_Definition")) return false;
    if (!nextTokenIs(b, MODE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MODE);
    r = r && Mode_Pattern(b, l + 1);
    r = r && Mode_Definition_2(b, l + 1);
    r = r && Mode_Definition_3(b, l + 1);
    exit_section_(b, m, MODE_DEFINITION, r);
    return r;
  }

  // Specification? (MEANS Definiens)? ";" Correctness-Conditions | IS Type-Expression ";"
  private static boolean Mode_Definition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Mode_Definition_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Mode_Definition_2_0(b, l + 1);
    if (!r) r = Mode_Definition_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Specification? (MEANS Definiens)? ";" Correctness-Conditions
  private static boolean Mode_Definition_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Mode_Definition_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Mode_Definition_2_0_0(b, l + 1);
    r = r && Mode_Definition_2_0_1(b, l + 1);
    r = r && consumeToken(b, SEMI);
    r = r && Correctness_Conditions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Specification?
  private static boolean Mode_Definition_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Mode_Definition_2_0_0")) return false;
    Specification(b, l + 1);
    return true;
  }

  // (MEANS Definiens)?
  private static boolean Mode_Definition_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Mode_Definition_2_0_1")) return false;
    Mode_Definition_2_0_1_0(b, l + 1);
    return true;
  }

  // MEANS Definiens
  private static boolean Mode_Definition_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Mode_Definition_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MEANS);
    r = r && Definiens(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IS Type-Expression ";"
  private static boolean Mode_Definition_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Mode_Definition_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IS);
    r = r && Type_Expression(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // Mode-Property*
  private static boolean Mode_Definition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Mode_Definition_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Mode_Property(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Mode_Definition_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Mode-Symbol (OF Loci)?
  public static boolean Mode_Pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Mode_Pattern")) return false;
    if (!nextTokenIs(b, "<mode pattern>", SET, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODE_PATTERN, "<mode pattern>");
    r = Mode_Symbol(b, l + 1);
    r = r && Mode_Pattern_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OF Loci)?
  private static boolean Mode_Pattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Mode_Pattern_1")) return false;
    Mode_Pattern_1_0(b, l + 1);
    return true;
  }

  // OF Loci
  private static boolean Mode_Pattern_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Mode_Pattern_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OF);
    r = r && Loci(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SETHOOD Justification ";"
  public static boolean Mode_Property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Mode_Property")) return false;
    if (!nextTokenIs(b, SETHOOD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SETHOOD);
    r = r && Justification(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, MODE_PROPERTY, r);
    return r;
  }

  /* ********************************************************** */
  // symbol | SET
  public static boolean Mode_Symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Mode_Symbol")) return false;
    if (!nextTokenIs(b, "<mode symbol>", SET, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODE_SYMBOL, "<mode symbol>");
    r = consumeToken(b, SYMBOL);
    if (!r) r = consumeToken(b, SET);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SYNONYM Mode-Pattern FOR Mode-Pattern ";"
  public static boolean Mode_Synonym(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Mode_Synonym")) return false;
    if (!nextTokenIs(b, SYNONYM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYNONYM);
    r = r && Mode_Pattern(b, l + 1);
    r = r && consumeToken(b, FOR);
    r = r && Mode_Pattern(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, MODE_SYNONYM, r);
    return r;
  }

  /* ********************************************************** */
  // NOTATION (Loci-Declaration | Notation-Declaration)* END
  public static boolean Notation_Block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Notation_Block")) return false;
    if (!nextTokenIs(b, NOTATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOTATION);
    r = r && Notation_Block_1(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, NOTATION_BLOCK, r);
    return r;
  }

  // (Loci-Declaration | Notation-Declaration)*
  private static boolean Notation_Block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Notation_Block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Notation_Block_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Notation_Block_1", c)) break;
    }
    return true;
  }

  // Loci-Declaration | Notation-Declaration
  private static boolean Notation_Block_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Notation_Block_1_0")) return false;
    boolean r;
    r = Loci_Declaration(b, l + 1);
    if (!r) r = Notation_Declaration(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // Attribute-Synonym | Attribute-Antonym | Functor-Synonym | Mode-Synonym | Predicate-Synonym | Predicate-Antonym
  public static boolean Notation_Declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Notation_Declaration")) return false;
    if (!nextTokenIs(b, "<notation declaration>", ANTONYM, SYNONYM)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NOTATION_DECLARATION, "<notation declaration>");
    r = Attribute_Synonym(b, l + 1);
    if (!r) r = Attribute_Antonym(b, l + 1);
    if (!r) r = Functor_Synonym(b, l + 1);
    if (!r) r = Mode_Synonym(b, l + 1);
    if (!r) r = Predicate_Synonym(b, l + 1);
    if (!r) r = Predicate_Antonym(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Notation-Block ";"
  public static boolean Notation_Item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Notation_Item")) return false;
    if (!nextTokenIs(b, NOTATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Notation_Block(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, NOTATION_ITEM, r);
    return r;
  }

  /* ********************************************************** */
  // ( Sentence | Term-Expression ) IF Sentence
  public static boolean Partial_Definiens(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Partial_Definiens")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARTIAL_DEFINIENS, "<partial definiens>");
    r = Partial_Definiens_0(b, l + 1);
    r = r && consumeToken(b, IF);
    r = r && Sentence(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Sentence | Term-Expression
  private static boolean Partial_Definiens_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Partial_Definiens_0")) return false;
    boolean r;
    r = Sentence(b, l + 1);
    if (!r) r = Term_Expression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // Partial-Definiens ("," Partial-Definiens)*
  public static boolean Partial_Definiens_List(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Partial_Definiens_List")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PARTIAL_DEFINIENS_LIST, "<partial definiens list>");
    r = Partial_Definiens(b, l + 1);
    p = r; // pin = 1
    r = r && Partial_Definiens_List_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," Partial-Definiens)*
  private static boolean Partial_Definiens_List_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Partial_Definiens_List_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Partial_Definiens_List_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Partial_Definiens_List_1", c)) break;
    }
    return true;
  }

  // "," Partial-Definiens
  private static boolean Partial_Definiens_List_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Partial_Definiens_List_1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COMMA);
    p = r; // pin = 1
    r = r && Partial_Definiens(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // Assumption
  public static boolean Permissive_Assumption(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Permissive_Assumption")) return false;
    if (!nextTokenIs(b, "<permissive assumption>", ASSUME, GIVEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PERMISSIVE_ASSUMPTION, "<permissive assumption>");
    r = Assumption(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // WHERE Post-Qualifying-Segment ("," Post-Qualifying-Segment)*
  public static boolean Post_Qualification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Post_Qualification")) return false;
    if (!nextTokenIs(b, WHERE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHERE);
    r = r && Post_Qualifying_Segment(b, l + 1);
    r = r && Post_Qualification_2(b, l + 1);
    exit_section_(b, m, POST_QUALIFICATION, r);
    return r;
  }

  // ("," Post-Qualifying-Segment)*
  private static boolean Post_Qualification_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Post_Qualification_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Post_Qualification_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Post_Qualification_2", c)) break;
    }
    return true;
  }

  // "," Post-Qualifying-Segment
  private static boolean Post_Qualification_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Post_Qualification_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Post_Qualifying_Segment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // id
  public static boolean Post_Qualified_Variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Post_Qualified_Variable")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, POST_QUALIFIED_VARIABLE, r);
    return r;
  }

  /* ********************************************************** */
  // Post-Qualified-Variable ("," Post-Qualified-Variable)* (( IS | ARE ) Type-Expression)?
  public static boolean Post_Qualifying_Segment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Post_Qualifying_Segment")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Post_Qualified_Variable(b, l + 1);
    r = r && Post_Qualifying_Segment_1(b, l + 1);
    r = r && Post_Qualifying_Segment_2(b, l + 1);
    exit_section_(b, m, POST_QUALIFYING_SEGMENT, r);
    return r;
  }

  // ("," Post-Qualified-Variable)*
  private static boolean Post_Qualifying_Segment_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Post_Qualifying_Segment_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Post_Qualifying_Segment_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Post_Qualifying_Segment_1", c)) break;
    }
    return true;
  }

  // "," Post-Qualified-Variable
  private static boolean Post_Qualifying_Segment_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Post_Qualifying_Segment_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Post_Qualified_Variable(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (( IS | ARE ) Type-Expression)?
  private static boolean Post_Qualifying_Segment_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Post_Qualifying_Segment_2")) return false;
    Post_Qualifying_Segment_2_0(b, l + 1);
    return true;
  }

  // ( IS | ARE ) Type-Expression
  private static boolean Post_Qualifying_Segment_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Post_Qualifying_Segment_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Post_Qualifying_Segment_2_0_0(b, l + 1);
    r = r && Type_Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IS | ARE
  private static boolean Post_Qualifying_Segment_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Post_Qualifying_Segment_2_0_0")) return false;
    boolean r;
    r = consumeToken(b, IS);
    if (!r) r = consumeToken(b, ARE);
    return r;
  }

  /* ********************************************************** */
  // ANTONYM Predicate-Pattern FOR Predicate-Pattern ";"
  public static boolean Predicate_Antonym(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Predicate_Antonym")) return false;
    if (!nextTokenIs(b, ANTONYM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ANTONYM);
    r = r && Predicate_Pattern(b, l + 1);
    r = r && consumeToken(b, FOR);
    r = r && Predicate_Pattern(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, PREDICATE_ANTONYM, r);
    return r;
  }

  /* ********************************************************** */
  // PRED Predicate-Pattern (MEANS Definiens)? ";" Correctness-Conditions Predicate-Property*
  public static boolean Predicate_Definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Predicate_Definition")) return false;
    if (!nextTokenIs(b, PRED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PRED);
    r = r && Predicate_Pattern(b, l + 1);
    r = r && Predicate_Definition_2(b, l + 1);
    r = r && consumeToken(b, SEMI);
    r = r && Correctness_Conditions(b, l + 1);
    r = r && Predicate_Definition_5(b, l + 1);
    exit_section_(b, m, PREDICATE_DEFINITION, r);
    return r;
  }

  // (MEANS Definiens)?
  private static boolean Predicate_Definition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Predicate_Definition_2")) return false;
    Predicate_Definition_2_0(b, l + 1);
    return true;
  }

  // MEANS Definiens
  private static boolean Predicate_Definition_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Predicate_Definition_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MEANS);
    r = r && Definiens(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Predicate-Property*
  private static boolean Predicate_Definition_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Predicate_Definition_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Predicate_Property(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Predicate_Definition_5", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // id
  public static boolean Predicate_Identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Predicate_Identifier")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, PREDICATE_IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // Loci? Predicate-Symbol Loci?
  public static boolean Predicate_Pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Predicate_Pattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PREDICATE_PATTERN, "<predicate pattern>");
    r = Predicate_Pattern_0(b, l + 1);
    r = r && Predicate_Symbol(b, l + 1);
    r = r && Predicate_Pattern_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Loci?
  private static boolean Predicate_Pattern_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Predicate_Pattern_0")) return false;
    Loci(b, l + 1);
    return true;
  }

  // Loci?
  private static boolean Predicate_Pattern_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Predicate_Pattern_2")) return false;
    Loci(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (SYMMETRY | ASYMMETRY | CONNECTEDNESS | REFLEXIVITY | IRREFLEXIVITY) Justification ";"
  public static boolean Predicate_Property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Predicate_Property")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PREDICATE_PROPERTY, "<predicate property>");
    r = Predicate_Property_0(b, l + 1);
    r = r && Justification(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SYMMETRY | ASYMMETRY | CONNECTEDNESS | REFLEXIVITY | IRREFLEXIVITY
  private static boolean Predicate_Property_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Predicate_Property_0")) return false;
    boolean r;
    r = consumeToken(b, SYMMETRY);
    if (!r) r = consumeToken(b, ASYMMETRY);
    if (!r) r = consumeToken(b, CONNECTEDNESS);
    if (!r) r = consumeToken(b, REFLEXIVITY);
    if (!r) r = consumeToken(b, IRREFLEXIVITY);
    return r;
  }

  /* ********************************************************** */
  // Predicate-Identifier ("," Predicate-Identifier)* "[" Type-Expression-List? "]"
  public static boolean Predicate_Segment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Predicate_Segment")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PREDICATE_SEGMENT, null);
    r = Predicate_Identifier(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, Predicate_Segment_1(b, l + 1));
    r = p && report_error_(b, consumeToken(b, LB)) && r;
    r = p && report_error_(b, Predicate_Segment_3(b, l + 1)) && r;
    r = p && consumeToken(b, RB) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," Predicate-Identifier)*
  private static boolean Predicate_Segment_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Predicate_Segment_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Predicate_Segment_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Predicate_Segment_1", c)) break;
    }
    return true;
  }

  // "," Predicate-Identifier
  private static boolean Predicate_Segment_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Predicate_Segment_1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COMMA);
    p = r; // pin = 1
    r = r && Predicate_Identifier(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Type-Expression-List?
  private static boolean Predicate_Segment_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Predicate_Segment_3")) return false;
    Type_Expression_List(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // symbol | "="
  public static boolean Predicate_Symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Predicate_Symbol")) return false;
    if (!nextTokenIs(b, "<predicate symbol>", EQ, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PREDICATE_SYMBOL, "<predicate symbol>");
    r = consumeToken(b, SYMBOL);
    if (!r) r = consumeToken(b, EQ);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SYNONYM Predicate-Pattern FOR Predicate-Pattern ";"
  public static boolean Predicate_Synonym(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Predicate_Synonym")) return false;
    if (!nextTokenIs(b, SYNONYM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYNONYM);
    r = r && Predicate_Pattern(b, l + 1);
    r = r && consumeToken(b, FOR);
    r = r && Predicate_Pattern(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, PREDICATE_SYNONYM, r);
    return r;
  }

  /* ********************************************************** */
  // Constant-Definition | Private-Functor-Definition | Private-Predicate-Definition
  public static boolean Private_Definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Private_Definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIVATE_DEFINITION, "<private definition>");
    r = Constant_Definition(b, l + 1);
    if (!r) r = Private_Functor_Definition(b, l + 1);
    if (!r) r = Private_Predicate_Definition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // var
  public static boolean Private_Definition_Parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Private_Definition_Parameter")) return false;
    if (!nextTokenIs(b, VAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VAR);
    exit_section_(b, m, PRIVATE_DEFINITION_PARAMETER, r);
    return r;
  }

  /* ********************************************************** */
  // DEFFUNC Private-Functor-Pattern "=" Term-Expression ";"
  public static boolean Private_Functor_Definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Private_Functor_Definition")) return false;
    if (!nextTokenIs(b, DEFFUNC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEFFUNC);
    r = r && Private_Functor_Pattern(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && Term_Expression(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, PRIVATE_FUNCTOR_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // Functor-Identifier "(" Type-Expression-List? ")"
  public static boolean Private_Functor_Pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Private_Functor_Pattern")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Functor_Identifier(b, l + 1);
    r = r && consumeToken(b, LP);
    r = r && Private_Functor_Pattern_2(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, PRIVATE_FUNCTOR_PATTERN, r);
    return r;
  }

  // Type-Expression-List?
  private static boolean Private_Functor_Pattern_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Private_Functor_Pattern_2")) return false;
    Type_Expression_List(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // DEFPRED Private-Predicate-Pattern MEANS Sentence ";"
  public static boolean Private_Predicate_Definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Private_Predicate_Definition")) return false;
    if (!nextTokenIs(b, DEFPRED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEFPRED);
    r = r && Private_Predicate_Pattern(b, l + 1);
    r = r && consumeToken(b, MEANS);
    r = r && Sentence(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, PRIVATE_PREDICATE_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // Predicate-Identifier "[" Type-Expression-List? "]"
  public static boolean Private_Predicate_Pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Private_Predicate_Pattern")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Predicate_Identifier(b, l + 1);
    r = r && consumeToken(b, LB);
    r = r && Private_Predicate_Pattern_2(b, l + 1);
    r = r && consumeToken(b, RB);
    exit_section_(b, m, PRIVATE_PREDICATE_PATTERN, r);
    return r;
  }

  // Type-Expression-List?
  private static boolean Private_Predicate_Pattern_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Private_Predicate_Pattern_2")) return false;
    Type_Expression_List(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // PROOF_ Reasoning END
  public static boolean Proof(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Proof")) return false;
    if (!nextTokenIs(b, PROOF_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PROOF_);
    r = r && Reasoning(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, PROOF, r);
    return r;
  }

  /* ********************************************************** */
  // SETHOOD OF Type-Expression Justification ";"
  public static boolean Property_Registration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Property_Registration")) return false;
    if (!nextTokenIs(b, SETHOOD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SETHOOD, OF);
    r = r && Type_Expression(b, l + 1);
    r = r && Justification(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, PROPERTY_REGISTRATION, r);
    return r;
  }

  /* ********************************************************** */
  // (Label-Identifier ":")? Sentence
  public static boolean Proposition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Proposition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPOSITION, "<proposition>");
    r = Proposition_0(b, l + 1);
    r = r && Sentence(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (Label-Identifier ":")?
  private static boolean Proposition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Proposition_0")) return false;
    Proposition_0_0(b, l + 1);
    return true;
  }

  // Label-Identifier ":"
  private static boolean Proposition_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Proposition_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Label_Identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( BEING | BE ) Type-Expression
  public static boolean Qualification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Qualification")) return false;
    if (!nextTokenIs(b, "<qualification>", BE, BEING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUALIFICATION, "<qualification>");
    r = Qualification_0(b, l + 1);
    r = r && Type_Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // BEING | BE
  private static boolean Qualification_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Qualification_0")) return false;
    boolean r;
    r = consumeToken(b, BEING);
    if (!r) r = consumeToken(b, BE);
    return r;
  }

  /* ********************************************************** */
  // Variables Qualification
  public static boolean Qualified_Segment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Qualified_Segment")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Variables(b, l + 1);
    r = r && Qualification(b, l + 1);
    exit_section_(b, m, QUALIFIED_SEGMENT, r);
    return r;
  }

  /* ********************************************************** */
  // Explicitly-Qualified-Variables | Explicitly-Qualified-Variables "," Implicitly-Qualified-Variables | Implicitly-Qualified-Variables
  public static boolean Qualified_Variables(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Qualified_Variables")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Explicitly_Qualified_Variables(b, l + 1);
    if (!r) r = Qualified_Variables_1(b, l + 1);
    if (!r) r = Implicitly_Qualified_Variables(b, l + 1);
    exit_section_(b, m, QUALIFIED_VARIABLES, r);
    return r;
  }

  // Explicitly-Qualified-Variables "," Implicitly-Qualified-Variables
  private static boolean Qualified_Variables_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Qualified_Variables_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Explicitly_Qualified_Variables(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && Implicitly_Qualified_Variables(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FOR Qualified-Variables (ST Formula-Expression)? ( HOLDS Formula-Expression | Quantified-Formula-Expression ) | EX Qualified-Variables ST Formula-Expression
  public static boolean Quantified_Formula_Expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Quantified_Formula_Expression")) return false;
    if (!nextTokenIs(b, "<quantified formula expression>", EX, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUANTIFIED_FORMULA_EXPRESSION, "<quantified formula expression>");
    r = Quantified_Formula_Expression_0(b, l + 1);
    if (!r) r = Quantified_Formula_Expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // FOR Qualified-Variables (ST Formula-Expression)? ( HOLDS Formula-Expression | Quantified-Formula-Expression )
  private static boolean Quantified_Formula_Expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Quantified_Formula_Expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && Qualified_Variables(b, l + 1);
    r = r && Quantified_Formula_Expression_0_2(b, l + 1);
    r = r && Quantified_Formula_Expression_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ST Formula-Expression)?
  private static boolean Quantified_Formula_Expression_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Quantified_Formula_Expression_0_2")) return false;
    Quantified_Formula_Expression_0_2_0(b, l + 1);
    return true;
  }

  // ST Formula-Expression
  private static boolean Quantified_Formula_Expression_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Quantified_Formula_Expression_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ST);
    r = r && Formula_Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // HOLDS Formula-Expression | Quantified-Formula-Expression
  private static boolean Quantified_Formula_Expression_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Quantified_Formula_Expression_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Quantified_Formula_Expression_0_3_0(b, l + 1);
    if (!r) r = Quantified_Formula_Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // HOLDS Formula-Expression
  private static boolean Quantified_Formula_Expression_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Quantified_Formula_Expression_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HOLDS);
    r = r && Formula_Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EX Qualified-Variables ST Formula-Expression
  private static boolean Quantified_Formula_Expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Quantified_Formula_Expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EX);
    r = r && Qualified_Variables(b, l + 1);
    r = r && consumeToken(b, ST);
    r = r && Formula_Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Mode-Symbol (OF Term-Expression-List)? | Structure-Symbol (OVER Term-Expression-List)?
  public static boolean Radix_Type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Radix_Type")) return false;
    if (!nextTokenIs(b, "<radix type>", SET, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RADIX_TYPE, "<radix type>");
    r = Radix_Type_0(b, l + 1);
    if (!r) r = Radix_Type_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Mode-Symbol (OF Term-Expression-List)?
  private static boolean Radix_Type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Radix_Type_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Mode_Symbol(b, l + 1);
    r = r && Radix_Type_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OF Term-Expression-List)?
  private static boolean Radix_Type_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Radix_Type_0_1")) return false;
    Radix_Type_0_1_0(b, l + 1);
    return true;
  }

  // OF Term-Expression-List
  private static boolean Radix_Type_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Radix_Type_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OF);
    r = r && Term_Expression_List(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Structure-Symbol (OVER Term-Expression-List)?
  private static boolean Radix_Type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Radix_Type_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Structure_Symbol(b, l + 1);
    r = r && Radix_Type_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OVER Term-Expression-List)?
  private static boolean Radix_Type_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Radix_Type_1_1")) return false;
    Radix_Type_1_1_0(b, l + 1);
    return true;
  }

  // OVER Term-Expression-List
  private static boolean Radix_Type_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Radix_Type_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OVER);
    r = r && Term_Expression_List(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Reasoning-Item* (THEN? PER CASES Simple-Justification ";" ( Case-List | Suppose-List ))?
  public static boolean Reasoning(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Reasoning")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REASONING, "<reasoning>");
    r = Reasoning_0(b, l + 1);
    r = r && Reasoning_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Reasoning-Item*
  private static boolean Reasoning_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Reasoning_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Reasoning_Item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Reasoning_0", c)) break;
    }
    return true;
  }

  // (THEN? PER CASES Simple-Justification ";" ( Case-List | Suppose-List ))?
  private static boolean Reasoning_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Reasoning_1")) return false;
    Reasoning_1_0(b, l + 1);
    return true;
  }

  // THEN? PER CASES Simple-Justification ";" ( Case-List | Suppose-List )
  private static boolean Reasoning_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Reasoning_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Reasoning_1_0_0(b, l + 1);
    r = r && consumeTokens(b, 0, PER, CASES);
    r = r && Simple_Justification(b, l + 1);
    r = r && consumeToken(b, SEMI);
    r = r && Reasoning_1_0_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // THEN?
  private static boolean Reasoning_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Reasoning_1_0_0")) return false;
    consumeToken(b, THEN);
    return true;
  }

  // Case-List | Suppose-List
  private static boolean Reasoning_1_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Reasoning_1_0_5")) return false;
    boolean r;
    r = Case_List(b, l + 1);
    if (!r) r = Suppose_List(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // Auxiliary-Item | Skeleton-Item
  public static boolean Reasoning_Item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Reasoning_Item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REASONING_ITEM, "<reasoning item>");
    r = Auxiliary_Item(b, l + 1);
    if (!r) r = Skeleton_Item(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // REDEFINE ( Mode-Definition | Functor-Definition | Predicate-Definition | Attribute-Definition )
  public static boolean Redefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Redefinition")) return false;
    if (!nextTokenIs(b, REDEFINE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REDEFINE);
    r = r && Redefinition_1(b, l + 1);
    exit_section_(b, m, REDEFINITION, r);
    return r;
  }

  // Mode-Definition | Functor-Definition | Predicate-Definition | Attribute-Definition
  private static boolean Redefinition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Redefinition_1")) return false;
    boolean r;
    r = Mode_Definition(b, l + 1);
    if (!r) r = Functor_Definition(b, l + 1);
    if (!r) r = Predicate_Definition(b, l + 1);
    if (!r) r = Attribute_Definition(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // REDUCE Term-Expression TO Term-Expression ";" Correctness-Conditions
  public static boolean Reduction_Registration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Reduction_Registration")) return false;
    if (!nextTokenIs(b, REDUCE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REDUCE);
    r = r && Term_Expression(b, l + 1);
    r = r && consumeToken(b, TO);
    r = r && Term_Expression(b, l + 1);
    r = r && consumeToken(b, SEMI);
    r = r && Correctness_Conditions(b, l + 1);
    exit_section_(b, m, REDUCTION_REGISTRATION, r);
    return r;
  }

  /* ********************************************************** */
  // Local-Reference | Library-Reference
  public static boolean Reference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Reference")) return false;
    if (!nextTokenIs(b, "<reference>", FILENAME, ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REFERENCE, "<reference>");
    r = Local_Reference(b, l + 1);
    if (!r) r = Library_Reference(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Reference ("," Reference)*
  public static boolean References_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "References_")) return false;
    if (!nextTokenIs(b, "<references>", FILENAME, ID)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, REFERENCES_, "<references>");
    r = Reference(b, l + 1);
    p = r; // pin = 1
    r = r && References__1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," Reference)*
  private static boolean References__1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "References__1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!References__1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "References__1", c)) break;
    }
    return true;
  }

  // "," Reference
  private static boolean References__1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "References__1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COMMA);
    p = r; // pin = 1
    r = r && Reference(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // REGISTRATION (Loci-Declaration | Cluster-Registration | Identify-Registration | Property-Registration | Reduction-Registration | Auxiliary-Item)* END
  public static boolean Registration_Block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Registration_Block")) return false;
    if (!nextTokenIs(b, REGISTRATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REGISTRATION);
    r = r && Registration_Block_1(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, REGISTRATION_BLOCK, r);
    return r;
  }

  // (Loci-Declaration | Cluster-Registration | Identify-Registration | Property-Registration | Reduction-Registration | Auxiliary-Item)*
  private static boolean Registration_Block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Registration_Block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Registration_Block_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Registration_Block_1", c)) break;
    }
    return true;
  }

  // Loci-Declaration | Cluster-Registration | Identify-Registration | Property-Registration | Reduction-Registration | Auxiliary-Item
  private static boolean Registration_Block_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Registration_Block_1_0")) return false;
    boolean r;
    r = Loci_Declaration(b, l + 1);
    if (!r) r = Cluster_Registration(b, l + 1);
    if (!r) r = Identify_Registration(b, l + 1);
    if (!r) r = Property_Registration(b, l + 1);
    if (!r) r = Reduction_Registration(b, l + 1);
    if (!r) r = Auxiliary_Item(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // Registration-Block ";"
  public static boolean Registration_Item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Registration_Item")) return false;
    if (!nextTokenIs(b, REGISTRATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Registration_Block(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, REGISTRATION_ITEM, r);
    return r;
  }

  /* ********************************************************** */
  // filename
  public static boolean Requirement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Requirement")) return false;
    if (!nextTokenIs(b, FILENAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FILENAME);
    exit_section_(b, m, REQUIREMENT, r);
    return r;
  }

  /* ********************************************************** */
  // REQUIREMENTS Requirement ("," Requirement)* ";"
  public static boolean Requirement_Directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Requirement_Directive")) return false;
    if (!nextTokenIs(b, REQUIREMENTS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REQUIREMENTS);
    r = r && Requirement(b, l + 1);
    r = r && Requirement_Directive_2(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, REQUIREMENT_DIRECTIVE, r);
    return r;
  }

  // ("," Requirement)*
  private static boolean Requirement_Directive_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Requirement_Directive_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Requirement_Directive_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Requirement_Directive_2", c)) break;
    }
    return true;
  }

  // "," Requirement
  private static boolean Requirement_Directive_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Requirement_Directive_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Requirement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RESERVE Reservation-Segment ("," Reservation-Segment)* ";"
  public static boolean Reservation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Reservation")) return false;
    if (!nextTokenIs(b, RESERVE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RESERVE);
    r = r && Reservation_Segment(b, l + 1);
    r = r && Reservation_2(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, RESERVATION, r);
    return r;
  }

  // ("," Reservation-Segment)*
  private static boolean Reservation_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Reservation_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Reservation_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Reservation_2", c)) break;
    }
    return true;
  }

  // "," Reservation-Segment
  private static boolean Reservation_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Reservation_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Reservation_Segment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Reserved-Identifiers FOR Type-Expression
  public static boolean Reservation_Segment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Reservation_Segment")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Reserved_Identifiers(b, l + 1);
    r = r && consumeToken(b, FOR);
    r = r && Type_Expression(b, l + 1);
    exit_section_(b, m, RESERVATION_SEGMENT, r);
    return r;
  }

  /* ********************************************************** */
  // id ("," id)
  public static boolean Reserved_Identifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Reserved_Identifiers")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    r = r && Reserved_Identifiers_1(b, l + 1);
    exit_section_(b, m, RESERVED_IDENTIFIERS, r);
    return r;
  }

  // "," id
  private static boolean Reserved_Identifiers_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Reserved_Identifiers_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // symbol | "}" | "]"
  public static boolean Right_Functor_Bracket(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Right_Functor_Bracket")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RIGHT_FUNCTOR_BRACKET, "<right functor bracket>");
    r = consumeToken(b, SYMBOL);
    if (!r) r = consumeToken(b, RC);
    if (!r) r = consumeToken(b, RB);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SCHEME Scheme-Identifier "{" Scheme-Parameters "}" ":" Scheme-Conclusion (PROVIDED Scheme-Premise (AND Scheme-Premise)*)? ( PROOF_ | ";" ) Reasoning END
  public static boolean Scheme_Block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Scheme_Block")) return false;
    if (!nextTokenIs(b, SCHEME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SCHEME);
    r = r && Scheme_Identifier(b, l + 1);
    r = r && consumeToken(b, LC);
    r = r && Scheme_Parameters(b, l + 1);
    r = r && consumeTokens(b, 0, RC, COLON);
    r = r && Scheme_Conclusion(b, l + 1);
    r = r && Scheme_Block_7(b, l + 1);
    r = r && Scheme_Block_8(b, l + 1);
    r = r && Reasoning(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, SCHEME_BLOCK, r);
    return r;
  }

  // (PROVIDED Scheme-Premise (AND Scheme-Premise)*)?
  private static boolean Scheme_Block_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Scheme_Block_7")) return false;
    Scheme_Block_7_0(b, l + 1);
    return true;
  }

  // PROVIDED Scheme-Premise (AND Scheme-Premise)*
  private static boolean Scheme_Block_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Scheme_Block_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PROVIDED);
    r = r && Scheme_Premise(b, l + 1);
    r = r && Scheme_Block_7_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (AND Scheme-Premise)*
  private static boolean Scheme_Block_7_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Scheme_Block_7_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Scheme_Block_7_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Scheme_Block_7_0_2", c)) break;
    }
    return true;
  }

  // AND Scheme-Premise
  private static boolean Scheme_Block_7_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Scheme_Block_7_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && Scheme_Premise(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PROOF_ | ";"
  private static boolean Scheme_Block_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Scheme_Block_8")) return false;
    boolean r;
    r = consumeToken(b, PROOF_);
    if (!r) r = consumeToken(b, SEMI);
    return r;
  }

  /* ********************************************************** */
  // Sentence
  public static boolean Scheme_Conclusion(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Scheme_Conclusion")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SCHEME_CONCLUSION, "<scheme conclusion>");
    r = Sentence(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // id
  public static boolean Scheme_Identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Scheme_Identifier")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, SCHEME_IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // Scheme-Block ";"
  public static boolean Scheme_Item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Scheme_Item")) return false;
    if (!nextTokenIs(b, SCHEME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Scheme_Block(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, SCHEME_ITEM, r);
    return r;
  }

  /* ********************************************************** */
  // FROM Scheme-Reference ("(" References_ ")")?
  public static boolean Scheme_Justification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Scheme_Justification")) return false;
    if (!nextTokenIs(b, FROM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FROM);
    r = r && Scheme_Reference(b, l + 1);
    r = r && Scheme_Justification_2(b, l + 1);
    exit_section_(b, m, SCHEME_JUSTIFICATION, r);
    return r;
  }

  // ("(" References_ ")")?
  private static boolean Scheme_Justification_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Scheme_Justification_2")) return false;
    Scheme_Justification_2_0(b, l + 1);
    return true;
  }

  // "(" References_ ")"
  private static boolean Scheme_Justification_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Scheme_Justification_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && References_(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // number
  public static boolean Scheme_Number(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Scheme_Number")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    exit_section_(b, m, SCHEME_NUMBER, r);
    return r;
  }

  /* ********************************************************** */
  // Scheme-Segment ("," Scheme-Segment)*
  public static boolean Scheme_Parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Scheme_Parameters")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SCHEME_PARAMETERS, null);
    r = Scheme_Segment(b, l + 1);
    p = r; // pin = 1
    r = r && Scheme_Parameters_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," Scheme-Segment)*
  private static boolean Scheme_Parameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Scheme_Parameters_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Scheme_Parameters_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Scheme_Parameters_1", c)) break;
    }
    return true;
  }

  // "," Scheme-Segment
  private static boolean Scheme_Parameters_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Scheme_Parameters_1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COMMA);
    p = r; // pin = 1
    r = r && Scheme_Segment(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // Proposition
  public static boolean Scheme_Premise(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Scheme_Premise")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SCHEME_PREMISE, "<scheme premise>");
    r = Proposition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Local-Scheme-Reference | Library-Scheme-Reference
  public static boolean Scheme_Reference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Scheme_Reference")) return false;
    if (!nextTokenIs(b, "<scheme reference>", FILENAME, ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SCHEME_REFERENCE, "<scheme reference>");
    r = Local_Scheme_Reference(b, l + 1);
    if (!r) r = Library_Scheme_Reference(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Predicate-Segment | Functor-Segment
  public static boolean Scheme_Segment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Scheme_Segment")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Predicate_Segment(b, l + 1);
    if (!r) r = Functor_Segment(b, l + 1);
    exit_section_(b, m, SCHEME_SEGMENT, r);
    return r;
  }

  /* ********************************************************** */
  // BEGIN Text-Item*
  public static boolean Section(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Section")) return false;
    if (!nextTokenIs(b, BEGIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BEGIN);
    r = r && Section_1(b, l + 1);
    exit_section_(b, m, SECTION, r);
    return r;
  }

  // Text-Item*
  private static boolean Section_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Section_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Text_Item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Section_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // symbol
  public static boolean Selector_Symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Selector_Symbol")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, SELECTOR_SYMBOL, r);
    return r;
  }

  /* ********************************************************** */
  // Formula-Expression
  public static boolean Sentence(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Sentence")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SENTENCE, "<sentence>");
    r = Formula_Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (":" Label-Identifier ":")? ( Sentence | Term-Expression )
  public static boolean Simple_Definiens(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Simple_Definiens")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_DEFINIENS, "<simple definiens>");
    r = Simple_Definiens_0(b, l + 1);
    r = r && Simple_Definiens_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (":" Label-Identifier ":")?
  private static boolean Simple_Definiens_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Simple_Definiens_0")) return false;
    Simple_Definiens_0_0(b, l + 1);
    return true;
  }

  // ":" Label-Identifier ":"
  private static boolean Simple_Definiens_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Simple_Definiens_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && Label_Identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // Sentence | Term-Expression
  private static boolean Simple_Definiens_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Simple_Definiens_1")) return false;
    boolean r;
    r = Sentence(b, l + 1);
    if (!r) r = Term_Expression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // Scheme-Justification | Straightforward-Justification
  public static boolean Simple_Justification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Simple_Justification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_JUSTIFICATION, "<simple justification>");
    r = Scheme_Justification(b, l + 1);
    if (!r) r = Straightforward_Justification(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ASSUME Proposition ";"
  public static boolean Single_Assumption(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Single_Assumption")) return false;
    if (!nextTokenIs(b, ASSUME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSUME);
    r = r && Proposition(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, SINGLE_ASSUMPTION, r);
    return r;
  }

  /* ********************************************************** */
  // Generalization | Assumption | Conclusion | Exemplification
  public static boolean Skeleton_Item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Skeleton_Item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SKELETON_ITEM, "<skeleton item>");
    r = Generalization(b, l + 1);
    if (!r) r = Assumption(b, l + 1);
    if (!r) r = Conclusion(b, l + 1);
    if (!r) r = Exemplification(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "->" Type-Expression
  public static boolean Specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Specification")) return false;
    if (!nextTokenIs(b, RA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RA);
    r = r && Type_Expression(b, l + 1);
    exit_section_(b, m, SPECIFICATION, r);
    return r;
  }

  /* ********************************************************** */
  // THEN? Linkable-Statement | Diffuse-Statement
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = Statement_0(b, l + 1);
    if (!r) r = Diffuse_Statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // THEN? Linkable-Statement
  private static boolean Statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Statement_0_0(b, l + 1);
    r = r && Linkable_Statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // THEN?
  private static boolean Statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement_0_0")) return false;
    consumeToken(b, THEN);
    return true;
  }

  /* ********************************************************** */
  // (BY References_)?
  public static boolean Straightforward_Justification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Straightforward_Justification")) return false;
    Marker m = enter_section_(b, l, _NONE_, STRAIGHTFORWARD_JUSTIFICATION, "<straightforward justification>");
    Straightforward_Justification_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // BY References_
  private static boolean Straightforward_Justification_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Straightforward_Justification_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BY);
    r = r && References_(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STRUCT ("(" Ancestors ")")? Structure-Symbol (OVER Loci)? "(#" Fields "#)" ";"
  public static boolean Structure_Definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Structure_Definition")) return false;
    if (!nextTokenIs(b, STRUCT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRUCT);
    r = r && Structure_Definition_1(b, l + 1);
    r = r && Structure_Symbol(b, l + 1);
    r = r && Structure_Definition_3(b, l + 1);
    r = r && consumeToken(b, LS);
    r = r && Fields(b, l + 1);
    r = r && consumeTokens(b, 0, RS, SEMI);
    exit_section_(b, m, STRUCTURE_DEFINITION, r);
    return r;
  }

  // ("(" Ancestors ")")?
  private static boolean Structure_Definition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Structure_Definition_1")) return false;
    Structure_Definition_1_0(b, l + 1);
    return true;
  }

  // "(" Ancestors ")"
  private static boolean Structure_Definition_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Structure_Definition_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && Ancestors(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OVER Loci)?
  private static boolean Structure_Definition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Structure_Definition_3")) return false;
    Structure_Definition_3_0(b, l + 1);
    return true;
  }

  // OVER Loci
  private static boolean Structure_Definition_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Structure_Definition_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OVER);
    r = r && Loci(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // symbol
  public static boolean Structure_Symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Structure_Symbol")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, STRUCTURE_SYMBOL, r);
    return r;
  }

  /* ********************************************************** */
  // "(" Structure-Symbol (OVER Term-Expression-List)? ")" | Adjective-Cluster Structure-Symbol (OVER Term-Expression-List)?
  public static boolean Structure_Type_Expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Structure_Type_Expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCTURE_TYPE_EXPRESSION, "<structure type expression>");
    r = Structure_Type_Expression_0(b, l + 1);
    if (!r) r = Structure_Type_Expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "(" Structure-Symbol (OVER Term-Expression-List)? ")"
  private static boolean Structure_Type_Expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Structure_Type_Expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && Structure_Symbol(b, l + 1);
    r = r && Structure_Type_Expression_0_2(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OVER Term-Expression-List)?
  private static boolean Structure_Type_Expression_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Structure_Type_Expression_0_2")) return false;
    Structure_Type_Expression_0_2_0(b, l + 1);
    return true;
  }

  // OVER Term-Expression-List
  private static boolean Structure_Type_Expression_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Structure_Type_Expression_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OVER);
    r = r && Term_Expression_List(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Adjective-Cluster Structure-Symbol (OVER Term-Expression-List)?
  private static boolean Structure_Type_Expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Structure_Type_Expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Adjective_Cluster(b, l + 1);
    r = r && Structure_Symbol(b, l + 1);
    r = r && Structure_Type_Expression_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OVER Term-Expression-List)?
  private static boolean Structure_Type_Expression_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Structure_Type_Expression_1_2")) return false;
    Structure_Type_Expression_1_2_0(b, l + 1);
    return true;
  }

  // OVER Term-Expression-List
  private static boolean Structure_Type_Expression_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Structure_Type_Expression_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OVER);
    r = r && Term_Expression_List(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SUPPOSE_ ( Proposition | Conditions ) ";" Reasoning END ";"
  public static boolean Suppose(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suppose")) return false;
    if (!nextTokenIs(b, SUPPOSE_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SUPPOSE_);
    r = r && Suppose_1(b, l + 1);
    r = r && consumeToken(b, SEMI);
    r = r && Reasoning(b, l + 1);
    r = r && consumeTokens(b, 0, END, SEMI);
    exit_section_(b, m, SUPPOSE, r);
    return r;
  }

  // Proposition | Conditions
  private static boolean Suppose_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suppose_1")) return false;
    boolean r;
    r = Proposition(b, l + 1);
    if (!r) r = Conditions(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // Suppose+
  public static boolean Suppose_List(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suppose_List")) return false;
    if (!nextTokenIs(b, SUPPOSE_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Suppose(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!Suppose(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Suppose_List", c)) break;
    }
    exit_section_(b, m, SUPPOSE_LIST, r);
    return r;
  }

  /* ********************************************************** */
  // "(" Term-Expression ")" | Arguments? Functor-Symbol Arguments? | Left-Functor-Bracket Term-Expression-List Right-Functor-Bracket | Functor-Identifier "(" Term-Expression-List? ")" | Structure-Symbol "(#" Term-Expression-List "#)" | THE Structure-Symbol OF Term-Expression | Variable-Identifier | "{" Term-Expression Post-Qualification* ":" Sentence "}" | THE SET OF ALL Term-Expression Post-Qualification* | number | Term-Expression QUA Type-Expression | THE Selector-Symbol OF Term-Expression | THE Selector-Symbol | THE Type-Expression | Private-Definition-Parameter | IT
  public static boolean Term_Expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Term_Expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERM_EXPRESSION, "<term expression>");
    r = Term_Expression_0(b, l + 1);
    if (!r) r = Term_Expression_1(b, l + 1);
    if (!r) r = Term_Expression_2(b, l + 1);
    if (!r) r = Term_Expression_3(b, l + 1);
    if (!r) r = Term_Expression_4(b, l + 1);
    if (!r) r = Term_Expression_5(b, l + 1);
    if (!r) r = Variable_Identifier(b, l + 1);
    if (!r) r = Term_Expression_7(b, l + 1);
    if (!r) r = Term_Expression_8(b, l + 1);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = Term_Expression_10(b, l + 1);
    if (!r) r = Term_Expression_11(b, l + 1);
    if (!r) r = Term_Expression_12(b, l + 1);
    if (!r) r = Term_Expression_13(b, l + 1);
    if (!r) r = Private_Definition_Parameter(b, l + 1);
    if (!r) r = consumeToken(b, IT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "(" Term-Expression ")"
  private static boolean Term_Expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Term_Expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && Term_Expression(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // Arguments? Functor-Symbol Arguments?
  private static boolean Term_Expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Term_Expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Term_Expression_1_0(b, l + 1);
    r = r && Functor_Symbol(b, l + 1);
    r = r && Term_Expression_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Arguments?
  private static boolean Term_Expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Term_Expression_1_0")) return false;
    Arguments(b, l + 1);
    return true;
  }

  // Arguments?
  private static boolean Term_Expression_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Term_Expression_1_2")) return false;
    Arguments(b, l + 1);
    return true;
  }

  // Left-Functor-Bracket Term-Expression-List Right-Functor-Bracket
  private static boolean Term_Expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Term_Expression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Left_Functor_Bracket(b, l + 1);
    r = r && Term_Expression_List(b, l + 1);
    r = r && Right_Functor_Bracket(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Functor-Identifier "(" Term-Expression-List? ")"
  private static boolean Term_Expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Term_Expression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Functor_Identifier(b, l + 1);
    r = r && consumeToken(b, LP);
    r = r && Term_Expression_3_2(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // Term-Expression-List?
  private static boolean Term_Expression_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Term_Expression_3_2")) return false;
    Term_Expression_List(b, l + 1);
    return true;
  }

  // Structure-Symbol "(#" Term-Expression-List "#)"
  private static boolean Term_Expression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Term_Expression_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Structure_Symbol(b, l + 1);
    r = r && consumeToken(b, LS);
    r = r && Term_Expression_List(b, l + 1);
    r = r && consumeToken(b, RS);
    exit_section_(b, m, null, r);
    return r;
  }

  // THE Structure-Symbol OF Term-Expression
  private static boolean Term_Expression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Term_Expression_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THE);
    r = r && Structure_Symbol(b, l + 1);
    r = r && consumeToken(b, OF);
    r = r && Term_Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "{" Term-Expression Post-Qualification* ":" Sentence "}"
  private static boolean Term_Expression_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Term_Expression_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LC);
    r = r && Term_Expression(b, l + 1);
    r = r && Term_Expression_7_2(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Sentence(b, l + 1);
    r = r && consumeToken(b, RC);
    exit_section_(b, m, null, r);
    return r;
  }

  // Post-Qualification*
  private static boolean Term_Expression_7_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Term_Expression_7_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Post_Qualification(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Term_Expression_7_2", c)) break;
    }
    return true;
  }

  // THE SET OF ALL Term-Expression Post-Qualification*
  private static boolean Term_Expression_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Term_Expression_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, THE, SET, OF, ALL);
    r = r && Term_Expression(b, l + 1);
    r = r && Term_Expression_8_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Post-Qualification*
  private static boolean Term_Expression_8_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Term_Expression_8_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Post_Qualification(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Term_Expression_8_5", c)) break;
    }
    return true;
  }

  // Term-Expression QUA Type-Expression
  private static boolean Term_Expression_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Term_Expression_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Term_Expression(b, l + 1);
    r = r && consumeToken(b, QUA);
    r = r && Type_Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // THE Selector-Symbol OF Term-Expression
  private static boolean Term_Expression_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Term_Expression_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THE);
    r = r && Selector_Symbol(b, l + 1);
    r = r && consumeToken(b, OF);
    r = r && Term_Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // THE Selector-Symbol
  private static boolean Term_Expression_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Term_Expression_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THE);
    r = r && Selector_Symbol(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // THE Type-Expression
  private static boolean Term_Expression_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Term_Expression_13")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THE);
    r = r && Type_Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Term-Expression ("," Term-Expression)*
  public static boolean Term_Expression_List(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Term_Expression_List")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERM_EXPRESSION_LIST, "<term expression list>");
    r = Term_Expression(b, l + 1);
    r = r && Term_Expression_List_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ("," Term-Expression)*
  private static boolean Term_Expression_List_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Term_Expression_List_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Term_Expression_List_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Term_Expression_List_1", c)) break;
    }
    return true;
  }

  // "," Term-Expression
  private static boolean Term_Expression_List_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Term_Expression_List_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Term_Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Reservation | Definitional-Item | Registration-Item | Notation-Item | Theorem | Scheme-Item | Auxiliary-Item
  public static boolean Text_Item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Text_Item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEXT_ITEM, "<text item>");
    r = Reservation(b, l + 1);
    if (!r) r = Definitional_Item(b, l + 1);
    if (!r) r = Registration_Item(b, l + 1);
    if (!r) r = Notation_Item(b, l + 1);
    if (!r) r = Theorem(b, l + 1);
    if (!r) r = Scheme_Item(b, l + 1);
    if (!r) r = Auxiliary_Item(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Section+
  public static boolean Text_Proper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Text_Proper")) return false;
    if (!nextTokenIs(b, BEGIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Section(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!Section(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Text_Proper", c)) break;
    }
    exit_section_(b, m, TEXT_PROPER, r);
    return r;
  }

  /* ********************************************************** */
  // THEOREM_ Compact-Statement
  public static boolean Theorem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Theorem")) return false;
    if (!nextTokenIs(b, THEOREM_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THEOREM_);
    r = r && Compact_Statement(b, l + 1);
    exit_section_(b, m, THEOREM, r);
    return r;
  }

  /* ********************************************************** */
  // number
  public static boolean Theorem_Number(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Theorem_Number")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    exit_section_(b, m, THEOREM_NUMBER, r);
    return r;
  }

  /* ********************************************************** */
  // ( Equating | Variable-Identifier ) ("," ( Equating | Variable-Identifier ))*
  public static boolean Type_Change_List(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type_Change_List")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TYPE_CHANGE_LIST, null);
    r = Type_Change_List_0(b, l + 1);
    p = r; // pin = 1
    r = r && Type_Change_List_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Equating | Variable-Identifier
  private static boolean Type_Change_List_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type_Change_List_0")) return false;
    boolean r;
    r = Equating(b, l + 1);
    if (!r) r = Variable_Identifier(b, l + 1);
    return r;
  }

  // ("," ( Equating | Variable-Identifier ))*
  private static boolean Type_Change_List_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type_Change_List_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Type_Change_List_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Type_Change_List_1", c)) break;
    }
    return true;
  }

  // "," ( Equating | Variable-Identifier )
  private static boolean Type_Change_List_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type_Change_List_1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COMMA);
    p = r; // pin = 1
    r = r && Type_Change_List_1_0_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Equating | Variable-Identifier
  private static boolean Type_Change_List_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type_Change_List_1_0_1")) return false;
    boolean r;
    r = Equating(b, l + 1);
    if (!r) r = Variable_Identifier(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // RECONSIDER Type-Change-List AS Type-Expression Simple-Justification ";"
  public static boolean Type_Changing_Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type_Changing_Statement")) return false;
    if (!nextTokenIs(b, RECONSIDER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RECONSIDER);
    r = r && Type_Change_List(b, l + 1);
    r = r && consumeToken(b, AS);
    r = r && Type_Expression(b, l + 1);
    r = r && Simple_Justification(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, TYPE_CHANGING_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // Adjective-Cluster? "(" Radix-Type ")" | Adjective-Cluster? Radix-Type
  public static boolean Type_Expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type_Expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_EXPRESSION, "<type expression>");
    r = Type_Expression_0(b, l + 1);
    if (!r) r = Type_Expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Adjective-Cluster? "(" Radix-Type ")"
  private static boolean Type_Expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type_Expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Type_Expression_0_0(b, l + 1);
    r = r && consumeToken(b, LP);
    r = r && Radix_Type(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // Adjective-Cluster?
  private static boolean Type_Expression_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type_Expression_0_0")) return false;
    Adjective_Cluster(b, l + 1);
    return true;
  }

  // Adjective-Cluster? Radix-Type
  private static boolean Type_Expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type_Expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Type_Expression_1_0(b, l + 1);
    r = r && Radix_Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Adjective-Cluster?
  private static boolean Type_Expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type_Expression_1_0")) return false;
    Adjective_Cluster(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Type-Expression ("," Type-Expression)*
  public static boolean Type_Expression_List(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type_Expression_List")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_EXPRESSION_LIST, "<type expression list>");
    r = Type_Expression(b, l + 1);
    r = r && Type_Expression_List_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ("," Type-Expression)*
  private static boolean Type_Expression_List_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type_Expression_List_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Type_Expression_List_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Type_Expression_List_1", c)) break;
    }
    return true;
  }

  // "," Type-Expression
  private static boolean Type_Expression_List_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type_Expression_List_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Type_Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // id
  public static boolean Variable_Identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Variable_Identifier")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, VARIABLE_IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // Variable-Identifier ("," Variable-Identifier)*
  public static boolean Variables(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Variables")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VARIABLES, null);
    r = Variable_Identifier(b, l + 1);
    p = r; // pin = 1
    r = r && Variables_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," Variable-Identifier)*
  private static boolean Variables_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Variables_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Variables_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Variables_1", c)) break;
    }
    return true;
  }

  // "," Variable-Identifier
  private static boolean Variables_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Variables_1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COMMA);
    p = r; // pin = 1
    r = r && Variable_Identifier(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // VOCABULARIES Vocabulary-Name ("," Vocabulary-Name)* ";"
  public static boolean Vocabulary_Directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Vocabulary_Directive")) return false;
    if (!nextTokenIs(b, VOCABULARIES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VOCABULARIES);
    r = r && Vocabulary_Name(b, l + 1);
    r = r && Vocabulary_Directive_2(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, VOCABULARY_DIRECTIVE, r);
    return r;
  }

  // ("," Vocabulary-Name)*
  private static boolean Vocabulary_Directive_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Vocabulary_Directive_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Vocabulary_Directive_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Vocabulary_Directive_2", c)) break;
    }
    return true;
  }

  // "," Vocabulary-Name
  private static boolean Vocabulary_Directive_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Vocabulary_Directive_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Vocabulary_Name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // filename
  public static boolean Vocabulary_Name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Vocabulary_Name")) return false;
    if (!nextTokenIs(b, FILENAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FILENAME);
    exit_section_(b, m, VOCABULARY_NAME, r);
    return r;
  }

}
