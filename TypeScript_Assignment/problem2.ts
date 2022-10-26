var names:string[] = new Array("Mary","Tom","Jack","Jill")  

function disp(arr:string[]) {
   for(var i = 0;i<arr.length;i++) { 
   let e1: string = `${arr[i]} length: ${arr[i].length}`; 
      console.log(e1);
   }  
}  
disp(names)


console.log(disp.map(disp=>disp.length));

