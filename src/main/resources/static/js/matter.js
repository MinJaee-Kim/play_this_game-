function scrollT() {
    window.scrollBy(0, 312);
}


function inputSubmit() {
    let textBox = document.getElementById('myname');
    let form = document.getElementById('nameform');
    if (textBox.value.trim() == "") {
        alert("이름을 입력해주세요");
        return false
    }
    form.action = "/check";
    form.submit();
}

function checkSubmit() {
    let radioBox = document.querySelectorAll('.main-check-input');
    let form = document.getElementById('checkform');
    let count = 0;
    for (var i=0; i<20; i++){
        for (var j=0; j<5; j++){
            if (radioBox[(i*5)+j].checked){
                count++;
                break;
            }
        }
    }

    if (count < 20){
        alert("지문을 전부 체크해주세요 " + (20-count) + "개 남음");
        return false;
    }

    form.action = "/result";
    form.submit();
}