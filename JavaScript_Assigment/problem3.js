function p3() {
	var today = new Date();
var dd = today.getDate();

var mm = today.getMonth()+1; 
var yyyy = today.getFullYear();
if(dd<10) 
{
    dd='0'+dd;
} 

if(mm<10) 
{
    mm='0'+mm;
} 
today = mm+'-'+dd+'-'+yyyy;
console.log(today);
document.write("format 1: "+today+"<br>");
today = mm+'/'+dd+'/'+yyyy;
console.log(today);
document.writeln("format 2: "+today+"<br>");
today = dd+'-'+mm+'-'+yyyy;
console.log(today);
document.write("format 3: "+today+"<br>");
today = dd+'/'+mm+'/'+yyyy;
console.log(today);
document.write("format 4: "+today+"<br>");
}