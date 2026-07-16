const fetchData = new Promise((resolve, reject) => {
             setTimeout(() => {
                const success = true;
                     if (success) {
                            resolve("ទិន្នន័យជោគជ័យ");
} else {
          reject("មានកំហុស");
   }
   }, 1000);
   });

   fetchData
  .then(data => console.log(data))

  .catch(error => console.log(error))

  .finally(() => console.log("បញ្ចប់ការទាញទិន្នន័យ"));
