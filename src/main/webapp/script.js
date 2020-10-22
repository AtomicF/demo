function add(){
    const request = new XMLHttpRequest();
    request.open("POST", "/addname",true);
    request.setRequestHeader("Content-Type","application/json");

    request.onreadystatechange = function (){
        if(request.readyState===XMLHttpRequest.DONE){
            if(request.status===200){
                console.log("name sent!")
            }
        }
    }

    name = document.getElementById("input_name").value;

    request.send(JSON.stringify(name));
}

function remove(){
    const request = new XMLHttpRequest();
    request.open("POST", "/deletename",true);
    request.setRequestHeader("Content-Type","application/json");

    request.onreadystatechange = function (){
        if(request.readyState===XMLHttpRequest.DONE){
            if(request.status===200){
                console.log("deleted!")
            }
        }
    }

    name = document.getElementById("input_name").value;

    request.send(JSON.stringify(name));
}

function showNames(){
    const request = new XMLHttpRequest();
    request.open("GET", "/allnames",true);
    request.setRequestHeader("Content-Type","application/json");

    request.onreadystatechange = function (){
        if(request.readyState===XMLHttpRequest.DONE){
            if(request.status===200){
                console.log(request.body);
                const data = JSON.parse(request.body);
                console.log(data);

                // data.forEach((user)=>{
                //     console.log(user);
                // });
            }

        }
    }
    request.send();
}