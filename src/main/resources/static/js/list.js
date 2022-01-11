const url = '/posts'
const get = 'get'

$(init)

function init(){
    let data = requestAllPosts();
}

function requestAllPosts(){
    return fetch(url, {
        method: get,
    })
        .then((response) => {
            return response.json();
        })
        .catch((error) => {
            console.log(error);
        });
}
