var names = new Array("Mary", "Tom", "Jack", "Jill");
function disp(arr) {
    for (var i = 0; i < arr.length; i++) {
        var e1 = "".concat(arr[i], " length: ").concat(arr[i].length);
        console.log(e1);
    }
}
disp(names);
console.log(disp.map(function (disp) { return disp.length; }));
