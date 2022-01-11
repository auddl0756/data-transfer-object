const url = '/posts'
const get = 'get'

init();

async function init() {
    let posts = await requestAllPosts();
    console.log(posts);

    let list1DOM = document.querySelector('.list1');


    for (let post of posts) {
        post.toString = function () {
            return post.id + ' ' + post.title + ' ' + post.content;
        }

        list1DOM.innerHTML += '<li>' + post.toString() + '</li>';
    }
}

function requestAllPosts() {
    return fetch(url, {
        method: get,
    })
        .then((response) => {
            if (response.ok) {
                return response.json();
            } else {
                return "something failed";
            }
        })
        .catch((error) => {
            console.log(error);
        });
}
