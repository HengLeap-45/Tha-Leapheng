console.log("Start")
setTimeout(() => {
    console.log("Content")
}, 5000);
console.log("Bro code")
let productData = fetch("https://api.escuelajs.co/api/v1/products")
  .then((response) => response.js())
  .then((response) => console.log(console.log(response)));
console.log("Product data :" , productData);
// asyn await keyword 
async function getData() {
    const res  = await fetch("https://api.escuelajs.co/api/v1/products")
    const data = await res.json();
    return console.log("Product data ", data);
} 
getData();
// call back function 
function greating(name,callback){
  console.log(`Hello ${name},${callback}`);

}
function sayGodBye(){
  return "bye";
}
sayGodBye();
greating("JamE" , sayGodBye());
// use callback with array mathod 
let arr = [1,2,3];
let newArr = arr.map((num) => {
  let NewNum = num *2 ;
  return console.log(NewNum);

});