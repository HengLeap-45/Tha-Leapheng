// using array literan notation
const number = [1,2,3,4,5,6]
const num1 = 1 ;
const num2 = 2 ;
const num3 = 3 ;
console.log (number)
// index start from 0 
// access item in an array  by index
console.log ("1.",number[0])
console.log("2.", number[1])
console.log("3.", number[2])
console.log("4.", number[3])
console.log("5.", number[4])
console.log("6.", number[5])
// literal better than constructor 
// creat Array with constructor vs literal notation
// with constructor 
const fruits = new Array(1,2,3,4,5,6);
console.log("fruits:", fruits)
const vegetables = [1,2,3,4,5,6,7]
console.log("vegetables:", vegetables)
// if we use  new Array with 1 argyment it will be length  not value 
const empty = new Array(5);
console.log("empty:", empty)
// length of array 
console.log("length:", empty.length)
// empty slot 
console.log("empty slot:", empty[1])

const data = ["heng","Keap","Lyly"]
console.log("data:",data)
// with unshift add new item to the beginning of an array
data.unshift("james")
console.log("after unshift:", data)
// with push add new item to the end of an array 
data.push("seng");
console.log("after push:", data)
// with pop remove the last item
data.pop();
console.log("after pop:", data)
// with shift remove the frist item
data.shift()
console.log("after using shift :" , data )
// with splice remove the mutiple element
data.splice(1,3)
console.log("after using splice :" , data )

const user = ["userOne","userTwo","userThree","userFour","userFive"];
// using splice method for data delete multi items
user.splice(1,3)
console.log("Delete 3 user in array :" , user )

// using splice method for data delete 

user.splice(1,1,"userSix")
console.log("Delete 1 user and add new item in array :" , user )

// using concat for merge 
const newArr = data.concat(user,vegetables,fruits)
console.log("after concat: " , newArr)

// spread syntax
const color =["black","red","white"]
console.log("color:", color)
const copyColor1 =[...color]
console.log("copyColor1:", copyColor1)
// array.from 
const copyColor2 =Array.from(color)
console.log("copyColor2:", copyColor2)
//  slice use for copy element in an array (start , end)
const copyColor3 = color.slice(1,3);
console.log("copyColor3:", copyColor3)

// object in array 
const userInfo3 ={
     username :"HENG",
     pob : "Poipet",
     userId : 1001,
     userAge : 18 ,
     

};

const userInfo2 = {
    id :1002 ,
    username : "Leap",
    pob : "Pnom penh",
    userAge : 19,
};

const userInfo =[userInfo3,userInfo2]
console.log("userInfo:",userInfo)
