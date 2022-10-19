// Get a random integer from 1 to 10 inclusive
function p8() {
 const num = Math.ceil(Math.random() * 10);
console.log(num);
document.writeln("Random number: "+num+"<br>");
 const gnum = prompt('Guess the number between 1 and 10 inclusive');
 if (gnum == num) {
   console.log('Matched');
  document.writeln("Mathced, the number was"+gnum);
  }
  else {
   console.log('Not matched, the number was '+gnum);
  document.writeln("Not mathced, the number was"+gnum);
  }
}