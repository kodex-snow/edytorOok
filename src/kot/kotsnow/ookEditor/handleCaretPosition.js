function debilizm(){

var node = document.querySelector("div");
node.focus();
var textNode = node.firstChild;
var caret = 10; // insert caret after the 10th character say
var range = document.createRange();
range.setStart(textNode, caret);
range.setEnd(textNode, caret);
var sel = window.getSelection();
sel.removeAllRanges();
sel.addRange(range);

}