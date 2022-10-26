var Student = /** @class */ (function () {
    function Student(_a) {
        var _b = _a === void 0 ? {} : _a, a = _b.a, b = _b.b, c = _b.c, d = _b.d;
        this.rollno = a;
        this.name = b;
        this.totalmarks = c;
        this.classname = d;
    }
    return Student;
}());
var data1 = { "a": 1, "b": 'A',
    "c": 380, "d": '10th' };
var data2 = { "a": 2, "b": 'B',
    "c": 480, "d": '10th' };
var data3 = { "a": 3, "b": 'C',
    "c": 450, "d": '10th' };
var student = [];
student[0] = new Student(data1);
student[1] = new Student(data2);
student[2] = new Student(data3);
function sortMarksAscending(m1, m2) {
    return m1.totalmarks - m2.totalmarks;
}
console.log(student.sort(sortMarksAscending));
