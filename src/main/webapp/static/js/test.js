/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

const movieID = sessionStorage.getItem("movieID");
const userID = sessionStorage.getItem("userID");
//fetch('http://localhost:8080/Cinema/api/phim/' + movieID)
//.then(response => {
//    return response.json();
//})
//.then(data => {
//    console.log(data)
//})
//console.log(movieID)
//console.log(userID)
var input1 = document.getElementById('test1')
var input2 = document.getElementById('test2')
var input3 = document.getElementById('test3')
var nvc = document.getElementById('nvc')
nvc.addEventListener('submit', (e) => {
        
        e.preventDefault()
    const formData = new FormData(nvc)
    formData.append('i11', input1.value)
    formData.append('i21', input2.value)
    formData.append('file', input3.files[0])
    fetch('http://localhost:8080/Cinema/api/phim/insert', {
      method: 'POST',
      body: formData
    })

})
    
            
//    var formElement = document.querySelector('form');
//    var formData = new FormData(formElement);
//    var request = new XMLHttpRequest();
////    request.open("POST", 'http://localhost:8080/Cinema/api/phim/insert');
////    request.send(formData);
//    console.log(formData)
    


