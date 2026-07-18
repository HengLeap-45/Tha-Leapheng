let user_one = prompt("Enter data")
if (user_one > 90) {
    console.log("you got A++")
}
else if (user_one > 80 ){
    console.log("you got B ")
}
else if (user_one > 70) {
    console.log("you got C")
}
else if (user_one > 60){
    console.log("you got D")
}
else if (user_one > 50 ){
    console.log("you got E")
}
else {
    console.log("you got F")
}
function greet() {
            const value = document.getElementById("Input").value;
            console.log("Welcome" + value);
        }

function Greet(name){
    console.log("Hello"+ name);
}
Greet("Heng")