const url = '/posts'
const get = 'get'

init();

function init(){
    let data = requestAllPosts();
}

function requestAllPosts(){
    return fetch(url, {
        method: get,
    })
        .then((response) => {
            if(response.ok){
                return response.json();
            }else{
                return "something failed";
            }
        })
        .catch((error) => {
            console.log(error);
        });
}
