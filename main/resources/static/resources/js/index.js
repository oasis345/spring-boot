var app = (()=>{
    let init = ()=>{
        login_form();
    }
    let login_form = ()=>{
        //alert('IIFE성공');
        var wrapper = document.querySelector('#wrapper');
        wrapper.innerHTML = '<form action="/">'
        + 'ID : <input type="text" name="id"><br>'
        + 'PASS : <input type="password" name="pass"><br>'
        + '<input type="submit" value="로그인" name="login" id="login">'
        + ' <input type="button" value="가입" name="join" id="join">'
        + '</form>';

        var join = document.querySelector('#join');

        join.addEventListener('click', ()=>{
            join_form();
        });   
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

