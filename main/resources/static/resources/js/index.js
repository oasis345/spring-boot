/*var app = (function(){

    let init=function(){
        login_form();   
    }

    let login_form = function(){
        var wrapper = document.querySelector("#wrapper");
        


        wrapper.innerHTML=+'<form action="/action_page.php">'
        +'  First name:<br>'
        +'  <input type="text" name="firstname" value="Mickey">'
        +'  <br>'
        +'  Last name:<br>'
        +'  <input type="text" name="lastname" value="Mouse">'
        +'  <br><br>'
        +'  <input type="submit" value="Submit">'
        +'</form> ';
        
        var btn = document.querySelector("#btn");
        var btn2 = document.querySelector("#btn2");
        var add= document.querySelector("#add");
        var as= document.querySelector('#as');
        
        
        
        add.addEventListener("click",function(){
            as.innerHTML="hello world"
        });
        
        btn.addEventListener("click",function(){
            as.innerHTML='';
        });
        
        btn2.addEventListener("click",function(){
                var temp = document.createTextNode('새로 추가됨');
                as.appendChild(temp);
        });
    }
    return {keykey : init};//hash 구조  key : value
    //{init : init}; 는 제이슨이다. 제이슨을 하려면 이파이 페턴을써야한다.

   
})();*/

/*
var app = (function(){

    let init=function(){
        login_form();   
    }

    let login_form = function(){
        let wrapper = document.querySelector("#wrapper");
        wrapper.innerHTML=+'<form action="/action_page.php">'
        +'  First name:<br>'
        +'  <input type="text" name="firstname" value="Mickey">'
        +'  <br>'
        +'  Last name:<br>'
        +'  <input type="text" name="lastname" value="Mouse">'
        +'  <br><br>'
        +'  <input type="button" id="loginbtn" value="Login">'
        +'  <input type="button" id="joinbtn" value="JOIN">'
        +'</form> ';

        let join_btn = document.querySelector("#joinbtn");
        join_btn.addEventListener('click',function(){
            join_form();
        });
        
    }
    let join_form =function(){
        let wrapper = document.querySelector("#wrapper");
        wrapper.innerHTML=+'<form action="/action_page.php">'
        +'  아이디<br>'
        +'  <input type="text" name="firstname" value="oasis345">'
        +'  <br>'
        +'  비밀번호:<br>'
        +'  <input type="text" name="lastname" value="1234">'
        +'  <br><br>'
        +'  <input type="submit" id="join" value="가입하기">'
        +'  <input type="reset" id="reet"value="초기화">'
        +'</form> ';

        let join_btn = document.querySelector("#join");
        join_btn.addEventListener('click',function(){
            login_form();
        });
        
    }
return {init : init}; //{init : init}; 는 제이슨이다. 제이슨을 하려면 이파이 페턴을써야한다. 앞에 init은 그냥 명칭같은것
})();

*/
var app = (()=>{

    let init=()=>{
        login_form();   
    }

    let login_form = ()=>{
        let wrapper = document.querySelector("#wrapper");
        wrapper.innerHTML=+'<form action="/action_page.php">'
        +'  First name:<br>'
        +'  <input type="text" name="firstname" value="Mickey">'
        +'  <br>'
        +'  Last name:<br>'
        +'  <input type="text" name="lastname" value="Mouse">'
        +'  <br><br>'
        +'  <input type="button" id="loginbtn" value="Login">'
        +'  <input type="button" id="joinbtn" value="JOIN">'
        +'</form> ';

        let join_btn = document.querySelector("#joinbtn");
        join_btn.addEventListener('click',()=>{
            join_form();
        });
        
    }
    let join_form =()=>{
        let wrapper = document.querySelector("#wrapper");
        wrapper.innerHTML=+'<form action="/action_page.php">'
        +'  아이디<br>'
        +'  <input type="text" name="firstname" value="oasis345">'
        +'  <br>'
        +'  비밀번호:<br>'
        +'  <input type="text" name="lastname" value="1234">'
        +'  <br><br>'
        +'  <input type="submit" id="join" value="가입하기">'
        +'  <input type="reset" id="reet"value="초기화">'
        +'</form> ';

        let join_btn = document.querySelector("#join");
        join_btn.addEventListener('click',()=>{
            login_form();
        });
        
    }
return {init : init}; //{init : init}; 는 제이슨이다. 제이슨을 하려면 이파이 페턴을써야한다. 앞에 init은 그냥 명칭같은것
})();