/* Generated By:JJTree&JavaCC: Do not edit this line. CompisConstants.java */

/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface CompisConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int START_COMMENT = 5;
  /** RegularExpression Id. */
  int END_COMMENT = 6;
  /** RegularExpression Id. */
  int COMMENTS = 7;
  /** RegularExpression Id. */
  int START_DOCUMENT = 8;
  /** RegularExpression Id. */
  int END_DOCUMENT = 9;
  /** RegularExpression Id. */
  int START_DOCUMENT_PROPERTIES = 10;
  /** RegularExpression Id. */
  int END_DOCUMENT_PROPERTIES = 11;
  /** RegularExpression Id. */
  int START_TITLE = 12;
  /** RegularExpression Id. */
  int END_TITLE = 13;
  /** RegularExpression Id. */
  int START_BODY = 14;
  /** RegularExpression Id. */
  int END_BODY = 15;
  /** RegularExpression Id. */
  int START_CONCLUSION = 16;
  /** RegularExpression Id. */
  int END_CONCLUSION = 17;
  /** RegularExpression Id. */
  int STYLE_TAG = 18;
  /** RegularExpression Id. */
  int VAL_TAG = 19;
  /** RegularExpression Id. */
  int HEIGHT_TAG = 20;
  /** RegularExpression Id. */
  int TYPE_TAG = 21;
  /** RegularExpression Id. */
  int FONT_TAG = 22;
  /** RegularExpression Id. */
  int LETTERS = 23;
  /** RegularExpression Id. */
  int DIGITS = 24;
  /** RegularExpression Id. */
  int ASSIGN_ATTRIBUTE = 25;
  /** RegularExpression Id. */
  int EQUAL = 26;
  /** RegularExpression Id. */
  int QUOTE = 27;
  /** RegularExpression Id. */
  int WORD = 28;
  /** RegularExpression Id. */
  int TAG_NAME = 29;
  /** RegularExpression Id. */
  int STRING = 30;
  /** RegularExpression Id. */
  int SHELL_SYM = 31;
  /** RegularExpression Id. */
  int OPEN_TAG = 32;
  /** RegularExpression Id. */
  int OPEN_CLOSING_TAG = 33;
  /** RegularExpression Id. */
  int CLOSE_TAG_NORMAL = 34;
  /** RegularExpression Id. */
  int OPEN_CLOSE_TAG = 35;
  /** RegularExpression Id. */
  int URL = 36;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\" \"",
    "<START_COMMENT>",
    "<END_COMMENT>",
    "<COMMENTS>",
    "\"<w:wordDocument>\"",
    "\"</w:wordDocument>\"",
    "\"<o:DocumentProperties>\"",
    "\"</o:DocumentProperties>\"",
    "\"<t:documentTitle>\"",
    "\"</t:documentTitle>\"",
    "\"<w:body>\"",
    "\"</w:body>\"",
    "\"<w:documentConclusion>\"",
    "\"</w:documentConclusion>\"",
    "\"w:style\"",
    "\"w:val\"",
    "\"w:height\"",
    "\"w:type\"",
    "\"w:font\"",
    "<LETTERS>",
    "<DIGITS>",
    "\":\"",
    "\"=\"",
    "\"\\\"\"",
    "<WORD>",
    "<TAG_NAME>",
    "<STRING>",
    "\"$\"",
    "\"<\"",
    "<OPEN_CLOSING_TAG>",
    "\">\"",
    "<OPEN_CLOSE_TAG>",
    "<URL>",
  };

}