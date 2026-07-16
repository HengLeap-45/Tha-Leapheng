// null list assignment
let ProductInfo1 = {
    name : "coca",
    price : 0,
    quantity :1000,
    image  : "",
};

ProductInfo1.price ??= 10;
ProductInfo1.quantity ||= "placeholder image";
console.log (ProductInfo1);

const salary = 0;
const income = salary || 150;
console.log("income :", income)
