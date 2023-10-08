
const grandFat =document.getElementById('grandFather');
grandFat.addEventListener('click',function (e){
   alert('grand parent');
  e.stopPropagation();
   
})

const Father =document.getElementById('father');
Father.addEventListener('click',function (e){
    alert('father');

    e.stopPropagation()
 })

const son =document.getElementById('son');
son.addEventListener('click',function (e){
    alert('son');
  e.stopPropagation();
 })

//  key pressed
const keys=document.getElementById('enter');
document.addEventListener("keypress", function (e) {
  console.log(e);
})

// 
const list=document.getElementById('list');


list.addEventListener('click', (e)=>{
  if(e.target.nodeName.toLowerCase()=='li'){
    alert(e.target.textContent);
}
    
})