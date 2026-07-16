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
