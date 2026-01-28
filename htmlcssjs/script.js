// What is JavaScript?
// it makes the website interactive
// a programming language that is use to code functionaility to a website
// An Object Based Programming Language
// What is an Object Based Programming Language
// Everything is treated as an object
// JavaScript Has Classes but doesn't implement everything that an Object Oriented Language would do

let num = 10;

console.log(num)

console.log(num.toExponential())

// Variables

// var -- is the Original way of declaring variables
// Global scoped or Function Scoped -- This way is going out, so it shouldn't getting used in newer project
//var String = "hello";

// let String = "hello"

// var daniel = "hello"

// console.log(String)

// let
// when use let to declare variables, their mutable, they can be changed
//  so it gets used when we expect this variable to change throughout the instruction feed to the machine
// Developers can become lazy

//let isEven = 4 % 2 === 0

let numTwo = 10;
console.log(numTwo)
numTwo = 15
console.log(numTwo)

function isEven(num) {
    return num % 2 === 0 // JavaScript doesn't only have ==
}

// const
// const is immutable/cannot be reassigned
// so you want to use const when you want to prevent changes happening
// and must be assigned value immediately

const numthree = 20// even through it get boxed by the object, the value of numbers, strings, boolean because these not container objects the value becomes locked
// const is short for constant
const arr = [] //so if the object being stored inside a const is a container object(examples being arrays, hashmaps or etcs), you can modify what is inside the object but you cannot reassign that object

const numFour = 45

console.log(arr)

arr.push(numthree)
arr.push(numFour)

console.log(arr)

console.log("0" == 0)// this know as a truthy check, it compares the value of the string to the number after its cast
console.log("0" === 0) // this one is know as a truth check, so it check the datatype first then it compares the value, if the datatype is not a match it fails right
// Casting is when you go from one datatype to another
// with == it will cast the type then proform the boolean check
// with === it will not cast, if the types on't match then it fails

// Loops

// For Loop, While Loop, Do While Loop
// For Loop
// you with an iterater, this iterater will increment every round until you meet the condition
// forward or backward, counting up or counting down
// Big O Notation
// We use the Big O Notation
for(let count = 0; count < 10; count++) {
    console.log(count)
}

for(let count = 10; count > 0; count--) {
    console.log(count)
}

//While loop
// While the condition is not met, it continue the loop, if the condition is met before even entering the loop, the loop will not run

let foundEvenNumber = true

while (foundEvenNumber) {
    let randomNumber = Math.floor(Math.random() * 10)
    console.log(randomNumber)
    if(randomNumber % 2 === 0) {
        foundEvenNumber = false;
    }
    console.log(foundEvenNumber)
}

// Do While
// It will run the block of code once, then condition

let condition = true

do {
    console.log("example text")
    const b = Math.floor(Math.random() * 1)
    if (b <= 5) {
        condition = false
    }
} while (condition)

// Operators
//it special symbols used to help perform different operations
// Arthmatic
// Add, Substract, Multipcation, Division, Modulus, Exponents
// +, -, *, /, %, ** <- these are the simple math operators
// when chain together they follow PEMDAS

let result = 2
result *= 10 // 2*10
// result = result * 10
console.log(result)

// +=, *=, -=, /= <- the start of the advance math operaters
// they perform the math operation in a short hand format

// ++, --
result++ // result + 1, Postfix - it happens after
result-- // result - 1
++result // Prefix - it happens before

let playNum = 0
console.log(playNum);

console.log(++playNum);// <- Prefix
console.log(playNum++) // <- Postfix
console.log(playNum);

// boolean operators

// ==, ===, &&, ||
// Truthy, Truth, AND, OR
// Work hand and hand with the If Statement
// with the ==, === they are compartive operator
// with ==, it will type cast then compare the value after casting
// with ===, it doesn't type cast it, it compares the type and value

// Casting means changing the Datatype
// string, number, bool, NaN, undefined, Infinity
// string == number
// string transform it into another datatype like number

console.log("0" == 0)
console.log("0" === 0)

// AND, OR
// Truth Table
// condition(important) OR condition2(second) == True
// condition(important) AND condition2(second) == True

// +
// ADD, CONCATE

console.log(5 + "5")

// If Statements
// So it will check the condition or conditions and if they are met run the block of code

let mathResult = (15 + 25 === 40)

// an one condition if statement
if (mathResult) {
    console.log("IT WAS TRUE")
}

if((45 * 3 === 35 * 4) || true) { //<- with the OR operator either has to to be true to met the 
    // condition to run the block of code
    // will evulate the first if it is true stops evulating and runs code
    console.log("Its TRUE");
}

if (5 > 1 && 8 < 12) { // <- Here both conditions have to be true or the code will not run

}

//Reverse Bool

let boolResult = false

if (!boolResult) {
    console.log("My false went true");
    
}

if(!5) {
    console.log("error")
}
