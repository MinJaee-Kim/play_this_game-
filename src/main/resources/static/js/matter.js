function scrollT() {
    window.scrollBy(0, 312);
}


function jbSubmit() {
    let textBox = document.getElementById('myname');
    let form = document.getElementById('nameform');
    if (textBox.value.trim() == "") {
        alert("이름을 입력해주세요");
        return false
    }
    form.action = "/check";
    form.submit();
}
