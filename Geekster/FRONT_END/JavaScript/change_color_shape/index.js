
const colors =['red','green','blue','yellow','pink','orange','purple','white','black'];


let index=0;

function changeColor(){
    const clr =document.getElementById('sq_clr');
    clr.style.backgroundColor=colors[index];
   index++;
   if(index==colors.length){
      index=0;
   }

}

function changeShape(){
   const shape=document.getElementById('sp_shape');
     console.log('hello');
     shape.style.transform = "skew(30deg, 30deg)";
     console.log(shape);
}
