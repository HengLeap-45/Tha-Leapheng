// multiple if statement
let score = 75 ;
if (score >90){
    console.log("Your score is A")
} 
else if (score >80){
    console.log("Your score is B")
} 
else if (score >70){
    console.log("Your score is C")
} 
else if (score >60){
    console.log("Your score is D")
}
else if (score >50){
    console.log("Your score is E")
} 
else {
    console.log("Your score is F")
}

// nested if else 
let writingTestresult = true ;
if (writingTestresult){
    let interviewTest =false;
    if(interviewTest){
        console.log("Well come to pre-07")
    }
    else{
        console.log("please try again")
    }
}

// swith
const day = 4;
switch (day) {
    case 0:
        console.log("Hello Sunday");
        break;
    case 1:
        console.log("Hello Monday");
        break;
    case 2:
        console.log("Hello Tuesday");
        break;
    case 3:
        console.log("Hello Wednesday");
        break;
    case 4:
        console.log("Hello Thursday");
        break;
    case 5:
        console.log("Hello Friday");
        break;
    case 6:
        console.log("Hello Saturday");
        break;
    default:
        console.log("Hello World");
        break;  
}

// for loop
for (let i = 0 ; i < 1000 ; i++){
    console.log("I LOVE YOU Ronaldo")
    
}
// for in loop
const user = {
    username : "heng",
    age : 22,
    gender : "male",
    email : "[EMAIL_ADDRESS]",
    phone : "123456789",
    address : "123 Main St",
    city : "New York",
    state : "NY",
    zip : "12345",
    country : "USA"
}
for (let key in user){
    console.log(key + user[key])
}

//  For of loop
// array
const bananas = ["banana1", "banana2", "banana3", ];
bananas[3];
 for (let banana of bananas){
      console.log(banana);
 }

//  String
let greeting = "Bro Code ";
for (let letter of greeting){
    console.log(letter)
}
