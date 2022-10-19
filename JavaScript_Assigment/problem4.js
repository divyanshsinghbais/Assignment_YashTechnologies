function p4() {
var side1 = 5; 
var side2 = 6; 
var side3 = 7; 
var s = (side1 + side2 + side3)/2;
var area =  Math.sqrt(s*((s-side1)*(s-side2)*(s-side3)));
console.log(area);
document.write("Side1: "+side1+"<br>");
document.write("Side2: "+side2+"<br>");
document.write("Side3: "+side3+"<br>");
document.write("Area: "+area);
}