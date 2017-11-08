grammar Msg;

messageBody: (at | emot | url | text)* ;

at: AT WORD;
AT: '@' ;
WORD : LETTER+ ;

emot: LEFT_PAREN alphanumeric RIGHT_PAREN;
LEFT_PAREN: '(' ;
RIGHT_PAREN: ')' ;
alphanumeric: (WORD | NUMBER)+;

text: (WORD | NUMBER | ANYCHAR | ' ')+;
NUMBER : DIGIT+ ;
fragment LETTER : ('a'..'z' | 'A'..'Z') ;
fragment DIGIT : ('0'..'9') ;
ANYCHAR : .;

url
   : uri
   ;

uri
   : scheme '://' login? host (':' port)?  path query? frag? WS?
   ;

scheme
   : 'http' | 'https'
   ;

host
   : '/'? (hostname | hostnumber)
   ;

hostname
   : STRING ('.' STRING)*
   ;

hostnumber
   : NUMBER '.' NUMBER '.' NUMBER '.' NUMBER
   ;

port
   : NUMBER
   ;

path
   : ('/' alphanumeric)*
   ;

user
   : STRING
   ;

login
   : user ':' password '@'
   ;

password
   : STRING
   ;

frag
   : ('#' STRING)
   ;

query
   : ('?' search)
   ;

search
   : searchparameter ('&' searchparameter)*
   ;

searchparameter
   : STRING ('=' (STRING | NUMBER | HEX))?
   ;

STRING
   : ([a-zA-Z~0-9] | HEX) ([a-zA-Z0-9.-] | HEX)*
   ;

HEX
   : ('%' [a-fA-F0-9] [a-fA-F0-9]) +
   ;
WS
   :
   [\r\n]+
;