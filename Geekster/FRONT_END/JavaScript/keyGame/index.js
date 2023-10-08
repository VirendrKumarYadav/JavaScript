

const ball = document.getElementById("ball_container");


document.addEventListener("keydown", moveBall);

let t = 0
let left = 0;
function moveBall(event) {
    // key code
    let key = event.keyCode;
    console.log(event.key + " " + key);
    let height = document.documentElement.clientHeight;
    let width = document.documentElement.clientWidth;
    console.log(height + " : " + width);
    let eleWidth = ball.offsetWidth;

  
   if(event.key==='38'){
    ball.style.top = left +10 + "px";
   }

  //  if(event.keycode='40'){
  //   ball.style.top = ball.offsetTop + 10 + "px";
  //  }

  //  if(event.keycode=='39'){
  //   ball.style.top = ball.offsetLeft - 10 + "px";
  //  }

  //  if(event.keycode=='37'){
  //   ball.style.top = ball.offsetLeft + 10 + "px";
  //  }


}