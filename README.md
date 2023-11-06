# Lexical-Analyzer-ProgrammingLanguages
Project for Programming Languages with Hui Lui

Steps to a Lexical Analyzer:
1. Input Preprocessing: Cleaning up input text and preparing for lexical analysis. May include: removing comments, whitespace, and other non-essential characters from the input text.
2. Tokenization:  Breaking the input text into a sequence of tokens. Done by matching the characters in the input text against a set of patterns that define the type of token.
3. Token Classification: The lexer determines the type of each token such as "identifiers, operators, punctuation."
4. Token Validation: The lexer checks that each token is valid according to the rules of the programming language. Has to have the right syntax.
5. Output Generation: The lexer generates the output of the lexical analysis process, usually a list of tokens. The tokens can be passed to the next stage of compilation of interpretation.

Source: https://www.geeksforgeeks.org/introduction-of-lexical-analysis/