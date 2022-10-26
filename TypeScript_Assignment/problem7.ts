class Student {
  rollno: number;
  name: string;
  totalmarks: number;
  classname: string;
  constructor({ a,b,c,d }: { a?: number, b?: string, c?: number , d?: string} = {}) {
    this.rollno = a;
    this.name = b;
    this.totalmarks = c;
	this.classname = d;
  }
}

let data1 = { "a": 1, "b": 'A', 
	"c": 380 , "d":'10th'};
let data2 = { "a": 2, "b": 'B', 
	"c": 480 , "d":'10th'};
let data3 = { "a": 3, "b": 'C', 
	"c": 450 , "d":'10th'};

let student = [];

student[0] = new Student(data1);
student[1] = new Student(data2);
student[2] = new Student(data3);

function sortMarksAscending(m1,m2) {
	return m1.totalmarks - m2.totalmarks;
}

console.log(student.sort(sortMarksAscending));