alert("자바 스크립트 왕초보!!");
var wrapper = document.querySelector('#wrapper');
wrapper.innerHTML ='<h1>spa시작</h1>'
+ '<button id="btn2">추가하자</button>'
+ '<div id="chae">삭제할내용</div>'
+ '<button id="btn">지어버리자</button>';

var btn = document.querySelector('#btn');
var chae = document.querySelector('#chae');
var taget = document.querySelector('#taget');
btn.addEventListener('click',function (){
  
    chae.innerHTML='';
    
    alert('버튼 클릭')
    
});


btn2.addEventListener('click',function(){
    taget.innerHTML = '';
});
var btn2 = document.querySelector('#btn2');

btn2.addEventListener('click',function(){
    var temp = document.createTextNode('새로 추가됨');
    taget.appendChild("temp");
})