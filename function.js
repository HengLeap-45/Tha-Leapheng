function userInfo(name ,age ,hight ){
   console.log("Good morning");
} 
userInfo()
// (a,b) parameter 
// userInput name function
function userInput(a,b){
   console.log("a+b :" , a +b )  
   // body function
}
userInput(10,5)
userInput(20,40)
// argument

// function green(name){
//    console.log(`Good morning ${name}`)
// }
// let yourName =prompt("Enter your name :");
// green(yourName);

// function with Default Parameters

function sum( x=20 , y = 30){
   console.log("x * y" , x * y )
}
sum()
sum(20,4)
// function with return
function sub(a,b) {
   let result = a - b 
   //  result = 20 -8 =12
   return result ;
   console.log("happy ending");
}
// function call is calling name function
console.log(sub(20,8));

// type of varible 
// global scope

let x = 100; 
// let is global scope baceuse it not in function
function Remian(y){
   let fruit = "orange"
   let result = x % y
   return result;
}
console.log(Remian(3));
// using loca scope varible
// console.log(fruit);

// Arrow function    
let product  = ( price , qty) => price * qty ;
console.log(product(5,10));

// arrow with one parameter/argument 
let  hello = name => console.log (`hello ${name}`);

// arrow with an expression
// An expression is a piece of code that produces a value.
let  age = 19 ;
let welcome = 
 age < 18 
  ? () => console.log ( "Wellcome bro code babe ")
  : () => console.log ("Wellcome bro code abult");
welcome();

// We should not using  arrow function inside object 
//  We create regular inside object
let name = 'fanta'           
let productInfo = {
    name : "coca",
    getName : function () {
      console.log("1.product name :" ,this.name);
    },
};
productInfo.getName();
// create arrow function inside object 
let  productInfo1 = {
   name :"String",
   getName:() => {
      console.log("2.product name : ", this.name);
   },
};
productInfo1.getName();
//    cannot  use arrow  function  as constrctor 
//    arrow function 
const  foo = () => {
   console.log("Greeting");
};
// const foocopy =new foo();
// regular function
function fang () {
   console.log("Greating Fang.");

}
const newFang = new fang();
console.log(newFang);
// the right usage of  arrow 
// using  with filter 
const  number = [1,2,3,4,5];
const even = number.filter((num) => num %  2 == 0 );
console.log(even);
// using map 
const doubleNumber = number.map((num) => num *2 )
console.log(doubleNumber); 