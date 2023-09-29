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

let ans = function(a,b){
   return a + b;
}

function name(a ) {
  let aa=ans(a,5);
console.log(aa);
}
name(3);

