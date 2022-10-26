// create arrays in TypeScript
let names: string[] = ["Theodore", "James", "Peter", "Amaka"]
let numbers : Array<number>; 
numbers = [12, 34, 5, 0.9]
let cars : Array<string> = ["Porsche", "Toyota", "Lexus"]
let randomValues : Array<string | number | boolean> = ["one",1, "two", 2, 56, true]

// sort the arrays
console.log(names.sort())
console.log(numbers.sort())
console.log(cars.sort())
console.log(randomValues.sort())
