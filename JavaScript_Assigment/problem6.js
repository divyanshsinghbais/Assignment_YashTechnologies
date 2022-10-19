function leapyear(year)
{
return (year % 100 === 0) ? (year % 400 === 0) : (year % 4 === 0);
}
function p6() {
document.writeln("Year: leap year or not<br>");
console.log(leapyear(2016));
document.writeln("2016: "+leapyear(2016)+"<br>");
console.log(leapyear(2000));
document.writeln("2000: "+leapyear(2000)+"<br>");
console.log(leapyear(1700));
document.writeln("1700: "+leapyear(1700)+"<br>");
console.log(leapyear(1800));
document.writeln("1800: "+leapyear(1800)+"<br>");
console.log(leapyear(100));
document.writeln("100: "+leapyear(100)+"<br>");
}