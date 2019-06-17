var app = (()=>{
    let init = ()=>{
        login_form();
    }
    let login_form = ()=>{
        //alert('IIFE성공');
        var wrapper = document.querySelector('#wrapper');
        wrapper.innerHTML =
        'ID : <input type="text" name="customer_Id" id="customer_Id"><br>'
        + 'PASS : <input type="password" name="password" id="password"><br>'
        + '<input type="submit" value="로그인" name="login" id="login">'
        + ' <input type="button" value="가입" name="join" id="join">';

        var join = document.querySelector('#join');

        join.addEventListener('click', ()=>{
            join_form();
        });   
        
        let login_btn = document.querySelector('#login');
                login_btn.addEventListener('click',()=>{

                id = document.getElementById('customer_Id').value;
                pass = document.getElementById('password').value;
                let xhr = new XMLHttpRequest(),
                method = 'get',
                url = 'login/'+id+'/'+pass;   //위방법이 제일 빠른방식
                xhr.open(method,url,true);

                xhr.onreadystatechange = function(){
                    if(xhr.readyState ==4 && xhr.status == 200){
                        let d = xhr.responseText; 
                        if(d =='성공'){
                            wrapper = document.querySelector('#wrapper');
                            wrapper.innerHTML= '<h1>마이페이지</h1>';

                        }else{
                            alert('로그인실패');
                        }
                }
            };

            xhr.send();
            
                
        });
    }
        
    
   
        let count =()=>{
            let xhr = new XMLHttpRequest();
                    method = 'GET';
                    url = 'count';
                    xhr.open(method, url, true);
                    
                    
                    xhr.onreadystatechange= function(){
                        if(xhr.readyState==4 && xhr.status == 200){
                        alert('성공');
                        var wrapper = document.querySelector('#wrapper');
                        wrapper.innerHTML = '총 고객수 : <h1>'+xhr.responseText+'</h1>';
                    }
                        
            }
            xhr.send();
           
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

