package org.abos.mizar.mizarplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.intellij.sdk.language.psi.SimpleTypes;
import com.intellij.psi.TokenType;

%%
%public
%class Lexer
%implements FlexLexer
%cup
%type IElementType
%eof{  return;
%eof}

%{
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }

    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}
Letter = [a-zA-Z]
Digit = [0-9]
Punctuation = [!\"#\$%&\'()\*\+\,\-\.\/:<=>\?@\[\]\\\^_`{}\~]
Character = {Letter} | {Punctuation} | {Digit}
Identifier = {Character}+
ArticleName = [A-Z][A-Z0-9_]*
ArticleNumber = [1-9]{Digit}*
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
EndOfLineComment = "#" {InputCharacter}* {LineTerminator}?
WhiteSpace = {LineTerminator} | [   \t\f]
%%
"environ" { return symbol(sym.ENVIRON); }
[^] { throw new Error("Illegal character <"+yytext()+">"); }