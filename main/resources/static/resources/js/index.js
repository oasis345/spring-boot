var app =  {
    $wrapper : $wrapper = document.getElementById('wrapper'),
    init : init,
    join : join,
    count : count,
    login_form : login_form,
    login_success : login_success,
    join_form : join_form
};

function init() {
    $wrapper.innerHTML = app.login_form();
    
    let join = document.getElementById('join');
    let login_btn = document.getElementById('login-btn');

    join.addEventListener('click', () => {
        app.join_form();
    });

    login_btn.addEventListener('click', () => {
            id = document.getElementById('id').value;
            pass = document.getElementById('pass').value;

            if (id != "" && pass != ""){ // 아무것도 입력 안하고 로그인 버튼을 눌렀을 때

                let xhr = new XMLHttpRequest();

                xhr.onload = () => {
                    if(xhr.readyState == 4 && xhr.status == 200){
                        if (xhr.responseText){ // 값만 넣어도 true 인지 false 인지 검사함
                        console.dir(xhr.responseText); // JSON 문자열을 받음
                        let result = JSON.parse(xhr.responseText); // JSON 문자열을 자바스크립트 객체로 만들어줌

                        // let result = {
                        //                 "customer_Id":"choi",
                        //                 "customer_Name":"테스트",
                        //                 "password":"1234",
                        //                 "ssn":"123",
                        //                 "phone":"123",
                        //                 "city":"123",
                        //                 "address":"23",
                        //                 "postalcode":"123123",
                        //                 "photo":null
                        //             }

                        $wrapper.innerHTML = app.login_success(result);
                        } else {
                            alert('비밀번호가 틀렸거나 존재하지 않는 아이디입니다.');
                    }
                    };
                };
                xhr.open('GET', 'customers/' + id + '/' + pass, true);
                xhr.send();
        } else {
            alert('아이디와 비밀번호를 입력하세요.');
        }
    })
    
};


function join() {

    let data = { // 직접 JSON 타입으로 자바스크립트 객체를 만듬
        customer_Id : document.getElementById('create_id').value,
        password : document.getElementById('create_pass').value,
        customer_Name : document.getElementById('create_name').value,
        ssn : document.getElementById('create_ssn').value,
        phone : document.getElementById('create_phone').value,
        city : document.getElementById('create_city').value,
        address : document.getElementById('create_address').value,
        postalcode : document.getElementById('create_postalcode').value
    }

    let xhr = new XMLHttpRequest();
    xhr.onload = () => {
        if (xhr.readyState == 4 && xhr.status == 200){
            let d = JSON.parse(xhr.responseText);
                
            if (d.result === 'SUCCESS'){
                alert('회원가입 축하드립니다!' + d.result);
            } else {
                alert('회원가입 실패 ㅋㅋ');
            }
        } else {
            alert('AJAX 실패');
        }
    }
    xhr.open('POST','customers/join', true);
    xhr.setRequestHeader('Content-type','application/json;charset=UTF-8'); // 자바한테 JSON을 보내줄때 무적권 적어줌
    xhr.send(JSON.stringify(data)); // 자바스크립트 객체를 JSON으로 바꿔줌
};

function count() {
    let xhr = new XMLHttpRequest();
    xhr.open('GET', 'customers/count', true);
    xhr.onload=()=>{
        if(xhr.readyState===4 && xhr.status === 200){
            let wrapper = document.querySelector('#wrapper');
            wrapper.innerHTML = '총 고객수 : <h1>'+xhr.responseText+'</h1>'
        }
    }
    xhr.send();
};

function login_form() {
    return 'ID : <input type="text" id="id"><br>'
            + 'PASS : <input type="password" id="pass"><br>'
            + '<input type="submit" value="로그인" name="login" id="login-btn">'
            + ' <input type="button" value="가입" name="join" id="join">';
}

function login_success(result) {
    return '<h1>마이 페이지</h1>' + '아이디 : ' + result.customer_Id + '<br>' +
            '이름 : ' + result.customer_Name + '<br>' +
            '도시 : ' + result.city + '<br>' +
            '주소 : ' + result.address + '<br>' +
            '전화번호 : ' + result.phone + '<br>';
};

function join_form() {
    wrapper.innerHTML =
    'ID : <input type="text" id="create_id"><br>'
    + 'PASS : <input type="password" id="create_pass"><br>'
    + 'NAME : <input type="test" id="create_name"><br>'
    + 'SSN : <input type="test" id="create_ssn"><br>'
    + 'PHONE : <input type="text" id="create_phone"><br>'
    + 'CITY : <input type="test" id="create_city"><br>'
    + 'ADDRESS : <input type="test" id="create_address"><br>'
    + 'POSTALCODE : <input type="test" id="create_postalcode"><br>'
    + '<input type="button" value="등록" id="join_ok" style="margin:20px 20px 0 20px">'
    + '<input type="button" value="취소" id="join_cancel">'
    + '<input type="button" value="찾기" id="count">';

    let count = document.getElementById('count');
    count.addEventListener('click', () => {
        app.count();
    })

    let join_cancel = document.getElementById('join_cancel');
    join_cancel.addEventListener('click', () => {
        app.init();
    });

    let join_ok = document.getElementById('join_ok');
    join_ok.addEventListener('click', () => {
        app.join();
        alert('가입 성공!');
        app.init();
    })
};