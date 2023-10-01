// parameters functions

// function sum(a, b) {

//    return a + b;
// }
// console.log( sum(2,4));


// Ananonous function

// let ans = function(a, b) {

//    return a+b;
// }

// console.log(ans(2,4));

// call back function

// let ans = function(a,b){
//    return a + b;
// }

// function name(a ) {
//   let aa=ans(a,5);
// console.log(aa);
// }
// name(3);


// ananomus , parametrise ,arraw function
// function sum(a, b) {

// function destroyer(arr) {
//   const valsToRemove = Array.from(arguments).slice(1);
//   return arr.filter(function(val) {
//     return !valsToRemove.includes(val);
//   });
// }
// destroyer([1, 2, 3, 1, 2, 3], 2, 3);


// function sumFibs(num) {
//   let a = 0;
//   let b = 1;
//   let c = 0;
//   while (c <= num) {
//     c = a + b
//     a = b;
//     b = c;
//     console.log(c);
//   }
//   return c;

// }
// sumFibs(4);

function steamrollArray(arr) {
  const flattenedArray = [];
  // Loop over array contents
  for (let i = 0; i < arr.length; i++) {
    if (Array.isArray(arr[i])) {
      // Recursively flatten entries that are arrays
      //  and push into the flattenedArray
      flattenedArray.push(...steamrollArray(arr[i]));
    } else {
      // Copy contents that are not arrays
      flattenedArray.push(arr[i]);
    }
  }
  return flattenedArray;
};

// test here
steamrollArray([1, [2], [3, [[4]]]]);
