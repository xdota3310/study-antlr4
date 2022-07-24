// 这是一个名为ArrarInit的语法，它必须和文件名ArrayInit.g4相匹配
grammar ArrayInit;
// 一条名为init的规则，它匹配一对花括号中的逗号分隔的value
init : '{' value(','value)*'}';
// 一个value可以是嵌套的花括号结构，也可以是一个简单的整数，即INI词法符号
value : init
    | INT
    ;
// 语法分析器(INT, WS)的规则必须以小写字母开头，词法分析器(init, value)的规则必须用大写
INT : [0-9]+; // 定义词法富豪INT，它由一个或多个数字组成
WS : [\t\n]+ -> skip;// 定义词法规则 空白符，丢弃之