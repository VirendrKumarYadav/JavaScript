console.log("hello js File is running!!!!");
// const header=document.getElementById("head");

// const div_1=document.createElement("div");
// div_1.innerHTML = "i am new Div"
// div_1.style.color="green";
// document.body.append(div_1);

// filter
// let age=["male","female","male","Female","male","male"];
// console.log(age.filter(function (e){
//     // console.log(e);
//     return e=="male";
// }).sort());

// map

// let num=[1,3,5,6,6,7]
// let male_fil =num.map(function (ss){
//     //  console.log(age);
//   return ss+10;
// });
// console.log(male_fil);


// const numbers = [65, 44, 12, 4];
// const newArr = numbers.map(myFunction);

// console.log(newArr);
// function myFunction(num) {
//   return num * 10;
// }

// const myArr = [1, 2, 3, 4, 5,6];
// const newAr = myArr.flatMap((x) => x * 2);

// newAr.forEach((x) => console.log(x));
// // table of infinire numbers 


// list of male and female]

// let data=document.querySelectorAll('li');
// console.log(data);

// project example data filter 

function myFunction(){
    let data=document.querySelector('input[name="gender"]:checked').value;
    console.log(data);

    let gender_li=document.querySelectorAll("#list li");
   
    gender_li.forEach(function(e){
        console.log(e.dataset.gender);
        if(e.dataset.gender===data){
           e.style.display="block";
        }else{
            e.style.display="none";
        }
    })

    // for feching all data of ui need to add some data set
}