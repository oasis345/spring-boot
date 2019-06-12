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
    return {init : init};
    //{init : init}; 는 제이슨이다. 제이슨을 하려면 이파이 페턴을써야한다.

   
})();*/

var app = (function(){

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
        +'  <input type="button" value="회원가입" id="join" >' 
        +'</form> ';

      /*  wrapper.innerHTML ='<h1>spa시작</h1>'
        + '<button id="btn2">추가하자</button>'
        + '<div id="chae">삭제할내용</div>'
        + '<button id="btn">지어버리자</button>';

        */

        var join = document.querySelector("#join");
        join.addEventListener("click" , function(){
            wrapper.innerHTML =
        +'<form action="/action_page.php">'
        +'  아이디:<br>'
        +'  <input type="text" name="id" value="Mickey">'
        +'  <br>'
        +'  비밀번호:<br>'
        +'  <input type="text" name="pw" value="Mouse">'
        +'  <br>'
        +'  이름:<br>'
        +'  <input type="text" name="name" value="채형국">'
        +'  <br>'
        +'  성별:<br>'
        +'  <input type="radio" name="gender"/checked>남자 <input type="radio" name = gender"/>여자'
        +'  <br>'
        +'  phone:<br>'
        +'  <input type="text" name="id" value="Mickey">'
        +'  <br>'
        +'  <br><br>'
        +'  <input type="submit" value="Submit">'
        +'  <input type="reset" value="초기화" >' 
        +'</form> ';
        });


        
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
    return {init : init};
    //{init : init}; 는 제이슨이다. 제이슨을 하려면 이파이 페턴을써야한다.

   
})();