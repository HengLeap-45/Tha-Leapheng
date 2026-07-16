function fetchData(callback) {
             setTimeout(() => {
                     callback("ទិន្នន័យត្រូវបានទាញ");
                     }, 1000);
    }
    fetchData(message => {
    console.log(message);
    });
