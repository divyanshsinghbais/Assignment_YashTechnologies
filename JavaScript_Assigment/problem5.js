function p5() {
function leftrotate(str, d)
{
    var ans = str.substring(d, str.length) +
              str.substring(0, d);
    return ans;
}
 
// Function that rotates s towards right by d
function rightrotate(str, d)
{
    return leftrotate(str, str.length - d);
}
 
var str2 = "Yash Technologies";
document.write(rightrotate(str2, 2) + "<br>")
}