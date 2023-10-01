// // Q1 reverse string

// // let str= "My name is Lakhan";
// // let revrStr="";
// // for(let ans in str){
// //     revrStr=str[ans]+revrStr;

// // console.log(revrStr);

// // Q2 Anagaram

// // let str1 = "virendra";
// // let str2 = "virdraen";
// // let l1=str1.length;
// // let l2=str2.length;

// // function countFrq(ch, str,l){
// //    let count=0;
// //    for(let i=0; i<l; i++){
// //        if(ch==str[i]){
// //         count++;
// //        }
// //    }
// //    return count;
// // }

// // let status;
// // for(let i=0; i<l1; i++){
// //     if(countFrq(str1[i],str1,l1)==countFrq(str2[i],str2,l2)&& l1==l2){
// //         status=true;
// //     }else{
// //         status=false;
// //     }
// // }

// // console.log(status);



// // Q4 Palindrome

// // function isPalindrome(str){
// //    let revStr="";
// //    for(let ch in str){
// //     revStr=str[ch]+revStr;
// //    }

// //   if (str==revStr)  return true
// //    else return false;


// // }

// // let status=isPalindrome("radar");
// // console.log(status);


// // Q3 intersection 

// // function interSec(str1,str2){
// //     let ans ="";
// //     for (const key1 in str1) {
// //       for (const key2 in str2) {
// //            if(str1[key1]==str2[key2]){
// //                ans+=str1[key1]+" ";
// //            }
// //       }

// //   }
// //   return ans;
// // }

// // let arr1=["virendra", "yadav",11,"hello"]
// // let arr2=["vir", "same",11,"hello"];

// // let ans=interSec(arr1,arr2);
// // console.log(ans);

// // Question 5 Array Rotation

// // function rotation(str, l, num) {
// //     let temp = [], k = 0;
// //     for (let i = l-1; i >=l-2; i--) {
// //         temp[k] = str[i];
// //         k++;
// //     }
// //     for (let i = 0; i < l-2; i++) {
// //         temp[k] = str[i];
// //         k++;
// //     }
// //      return temp;
// // }
// // let arr = [1, 3, 5, 2, 6, 7, 8];
// // let ans=rotation(arr,arr.length, 2);
// // console.log(ans);


// // Q6 String compression

// // function countFrq(ch, str, l) {
// //     let count = 0;
// //     for (let i = 0; i < l; i++) {
// //         if (ch == str[i]) {
// //             count++;
// //         }
// //     }
// //     return count;
// // }
// // let str = "aabcccccaaa";
// //     let ans = "";
// //     for (let i = 0; i < str.length; i++) {
// //         let ch = str[i];
// //         if (i!=0 &&ch == str[i - 1]) {
// //             // 
// //         } else {
// //             ans += ch + "" + countFrq(ch, str, str.length);
// //         }
// //     }
// // console.log(ans);

// // Q7 Array Sum

// // let arr = [2, 3,5,6, 7, 7];

// // function targetSum(arr, target) {
// //     let sum = 0;

// //     for (let j = 0; j < arr.length; j++) {

// //         for (let i = j; i < arr.length; i++) {
// //             sum=arr[i]+arr[j]
// //             if (sum == target) {
// //                console.log( arr[i]+" "+arr[j]);
// //             } 
// //         }
// //     }
// //    return "No target"
// // }
// // targetSum(arr,8)

// // Q8 larget substring
// function countFrq(ch, str, l) {
//     let count = 0;
//     for (let i = 0; i < l; i++) {
//         if (ch == str[i]) {
//             count++;
//         }
//     }
//     return count;
// }
// function isUniqueStr(str) {
//     let status = false;
//     for (let i = 0; i < str.length; i++) {
//         if (countFrq(str[i], str, str.length) == 1) {
//             status = true;
//         } else {
//            return false;
//         }
//     }
//     return status;
// }
// function subtring(str) {
//     let fAns = "";
//     for (let i = 0; i < str.length; i++) {
//         let ans = "";
//         let subAns=""
//         for (let j = i; j < str.length; j++) {
//             subAns += str[j];  
//         }
//         if (isUniqueStr(subAns)) {
//             ans = subAns;
//         }
//         if (ans.length > fAns.length) {
//             fAns = ans;
//         }
//     }
//     return fAns;
// }
// console.log(subtring("virendra"));

const ss=document.querySelector("input");
ss.placeholder.innerHTML=subtring("vire overc   Available   Available   Available");
