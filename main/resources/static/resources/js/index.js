var app = (()=>{
    let init = ()=>{
        login_form();
    }
    let login_form = ()=>{
        //alert('IIFE성공');
        var wrapper = document.querySelector('#wrapper');
        wrapper.innerHTML =
        'ID : <input type="text" name="id"><br>'
        + 'PASS : <input type="password" name="pass"><br>'
        + '<input type="submit" value="로그인" name="login" id="login">'
        + ' <input type="button" value="가입" name="join" id="join">';

        var join = document.querySelector('#join');

        join.addEventListener('click', ()=>{
            join_form();
        });   
        
        let login_btn = document.querySelector('#login');
                login_btn.addEventListener('click',()=>{
                alert('로그인 버튼 클릭');
                count();
        });
    
   
        let count =()=>{
            let xhr = new XMLHttpRequest();
                    method = 'GET';
                    url = 'customer';
                    
                    xhr.onreadystatechange= function(){
                    if(xhr.readyState==4 && xhr.status == 200){
                    alert('성공');
                    var wrapper = document.querySelector('#wrapper');
                    wrapper.innerHTML = '총 고객수 : <h1>'+xhr.responseText+'</h1>';
                }
                        
            }
            xhr.open(method, url, true);
            xhr.send();
        }
       
    }


    let join_form = ()=>{
        wrapper.innerHTML = '<form action="">'
        + 'ID : <input type="text" name="id"><br>'
        + 'PASS : <input type="password" name="pass"><br>'
        + 'NAME : <input type="test" name="name"><br>'
        + 'PHONE : <input type="text" name="phone"><br>'
        + '<input type="submit" value="등록" id="join_ok">'
        + '</form>';

        var join_ok = document.querySelector('#join_ok');

        join_ok.addEventListener('click', ()=>{
            login_form();
        });
    }
    return {init: init};
})();

