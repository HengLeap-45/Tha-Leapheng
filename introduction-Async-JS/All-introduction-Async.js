function fetchData(callback) {
             setTimeout(() => {
                     callback("ទិន្នន័យត្រូវបានទាញ");
                     }, 1000);
    }
    fetchData(message => {
    console.log(message);
    });
    const fetchData = new Promise((resolve, reject) => {
             setTimeout(() => {
                const success = true;
                     if (success) {
                            resolve("Success to fetch data");
} else {
          reject("fail to fetch data");
   }
   }, 1000);
   });

   fetchData
  .then(data => console.log(data))

  .catch(error => console.log(error))

  .finally(() => console.log("End of fetching data"));
  setTimeout(() => {
         console.log("After 1 second");
}, 1000);
 // setInterval
      let count = 0;
const intervalId = setInterval(() => {
console.log("ចំនួន", $(++count));
if (count === 3) {
clearInterval(intervalId);
console.log("បញ្ឈប់ setInterval");}
}, 1000);
async function fetchData() {
  try {
           const promise = new Promise(resolve => {
  setTimeout(() => resolve("ទិន្នន័យជោគជ័យ"), 1000);
              });
    const data = await promise;
    console.log(data);
      } catch (error) {
         console.log(error);
     } finally {
            console.log("បញ្ចប់ការទាញទិន្នន័យ");
}} fetchData();
console.log("ចាប់ផ្តើម");

         setTimeout(() => {

    console.log("setTimeout callback");
                  }, 0);

     console.log("បញ្ចប់");
