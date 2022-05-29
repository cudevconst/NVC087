var login_form = document.querySelector('.login_form')
var dn = document.querySelector('.dn')
var dk = document.querySelector('.dk')
var form_dn_dk = document.querySelector('.form_dn_dk')
var form_dn = `<form action="login" method="POST" class="login_form form">
                <span class="block">Email</span>
                <input type="text" name="email" id="email" placeholder="Email" class="block">
                <span class="block">Mật khẩu</span>
                <input type="text" name="passWord" id="passWord" placeholder="Mật khẩu" class="block">
                <a href="#">Quên mật khẩu?</a>
                <button>Đăng nhập</button>
                </form>`;
var form_dk =`<form class="login_form form1" id="form1">
               
               
                <div class="info">
                    <span>
                            Tên đăng nhập
                    </span>
                    <input type="text" name="user" id="user" placeholder="Tên đăng nhập">
                </div>
                <div class="info">
                    <span>
                            Mật khẩu
                    </span>
                    <input type="text" name="matKhau" id="matKhau" placeholder="Mật khẩu">
                </div>
                <div class="info">
                    <span>
                            Xác nhận lại mật khẩu
                    </span>
                    <input type="text" name="xn-matKhau" id="xn-matKhau" placeholder="Xác nhận lại mật khẩu">
                </div> 
                <div class="info">
                    <span>
                            Họ tên
                    </span>
                    <input type="text" name="hoTen" id="hoTen" placeholder="Họ tên">
                </div>
                <div class="info">
                    <span>
                            Địa chỉ
                    </span>
                    <input type="text" name="diaChi" id="diaChi" placeholder="Địa chỉ">
                </div>
                <div class="info">
                    <span>
                            Số điện thoại
                    </span>
                    <input type="text" name="sdt" id="sdt" placeholder="Số điện thoại">
                </div>
                <div class="info">
                    <span>
                            Email
                    </span>
                    <input type="text" name="email" id="email" placeholder="Email">
                </div>
                <button>Đăng ký</button>           
            </form>
<button onclick="myFunction()">Test</button>`;

dn.addEventListener('click', function(){
    var active = document.querySelector('.active')
    active.classList.remove('active')
    dn.classList.add('active')
    login_form.classList.add('form')
    login_form.classList.remove('form1')
    form_dn_dk.innerHTML = form_dn

    
})
dk.addEventListener('click', function(){
    var active = document.querySelector('.active')
    active.classList.remove('active')
    dk.classList.add('active')
    login_form.classList.add('form1')
    login_form.classList.remove('form')
    form_dn_dk.innerHTML = form_dk;
})

var form1 = document.querySelector('#form1')
form1.addEventListener('submit', e =>{
    e.preventDefault();
    const formData = new FormData(form1);
    formData.append('user', )
})

function getInputValue(input){
    return document.getElementById(input).value
}
getInputValue('email')

function myFunction(){
    console.log(form1)
}