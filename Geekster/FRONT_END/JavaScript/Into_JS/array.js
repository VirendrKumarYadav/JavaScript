
let arr=[1,2,43,4,5,6,6,7,7];
let arr1=[1,2,43,4,5,6,6,7,7];
arr.length; // size
arr.push(4);// add at last index
arr.join(" | "); //seperate with given symbol string
arr.pop();// pop out from last
arr.concat(1);// add other obj
arr.shift(); // remove from 1st index
arr.unshift(2);//add at 1stt index
arr.sort();// sort array
arr.some(function(){   
   return  arr>=2;
})   // beave like or oprator , if any of consition pass then return true
const val=arr.every(function (){
    return arr>0;
});  // behave like and , if nay of condition is fail then gets false

