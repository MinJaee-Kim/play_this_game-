Kakao.init('3ea186cb8a32aa139da1f636aa84ff99');

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

function kakaotalkshare(){


    Kakao.Link.sendDefault({
        objectType: 'feed',
        content: {
            title: '이 겜 해봤어?',
            description: '요즘 할 게임이 없다고? 게임 찾아줄께! 너도 와서 한번 해봐!',
            imageUrl: 'https://ifh.cc/g/gM1N5a.jpg',
            link: {
                mobileWebUrl: '카카오공유하기 시 클릭 후 이동 경로',
                webUrl: '카카오공유하기 시 클릭 후 이동 경로',
            },
        },
        buttons: [
            {
                title: '나도 한번 해보기',
                link: {
                    mobileWebUrl: '카카오공유하기 시 클릭 후 이동 경로',
                    webUrl: '카카오공유하기 시 클릭 후 이동 경로',
                },
            },
        ],
        // 카카오톡 미설치 시 카카오톡 설치 경로이동
        installTalk: true,
    })
}
function shareFacebook() {
    var sendUrl = "http://3.92.225.108:8080/"; // 전달할 URL
    var image = "https://ifh.cc/g/gM1N5a.jpg";
    window.open("http://www.facebook.com/sharer.php?u="+ sendUrl + "&t=" + sendtitle);
}

function shareTwitter() {
    var sendText = "이 겜 해봣어?"; // 전달할 텍스트
    var sendUrl = "http://3.92.225.108:8080/"; // 전달할 URL
    window.open("https://twitter.com/intent/tweet?text=" + sendText + "&url=" + sendUrl);
}