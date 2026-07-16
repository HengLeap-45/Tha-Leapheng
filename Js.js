"use strict"

let num1 ="5";
let num2 = 10;
let result = num1 + num2 ;
//     check varible
         
      console.log("Num1 + Num2 :" , typeof result);
      let isSubmitting = true ;
      console.log("isSubmitting :", typeof isSubmitting);

    //    immutableno
        let str = " Hello bro Code ";
        str = "Gretting ";
        console.log("str :" , str);
        // object
        // mutable
        let userinfo = {
            username  : "Momo",
            age : 18,
            };
            userinfo.username ="Heng The King";
            console.log("Username :" ,userinfo.username)
//    undifined
    let a;
    console.log("a" , a);
    //  ==type Number ==
    // infinity
    let firstNumber = 3/0;
    console.log("firstNumber :"  , firstNumber);
    //  - infinity
    let lastNumber = -5/0;
    console.log("lastNumber :" , lastNumber);
    // NaN 
    let Number3 = "string"/3;
    console.log("Number3 :" , Number3);
    // bigInt 
    let   bigIntNumber =9007199254740991n;
    console.log("bigIntNumber :" , bigIntNumber);
    console.log("type " , typeof bigIntNumber);
    // ===============Boolean====== 
    let f = true;
    console.log("type",typeof f);
    // ===null===
    const ProductName = null ;
    console.log("Product :" , ProductName);
    //  Object 
    let userInformation = {
        userName : "Nika Coding",
        userAge : 30,
        userJob : "student",
        userFamily : 5,
        usersalary : 1000,
        Gender : "Female",
        userAdress :{   
            city : "Phnom Penh",
            country : "Cambodia",
            community : "Seam reao",
        }
    };
    console.log("userInformation :" , userInformation);
    // change user info
    userInformation.userAge = 20;
    console.log("Want something :" , userInformation.userAge);
    //  object key
    console.log(Object.keys(userInformation));
    // object value
    console.log(Object.values(userInformation));
    // object key and  value
    console.log(Object.entries(userInformation));
