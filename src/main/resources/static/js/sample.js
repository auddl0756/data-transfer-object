
$(addClickHandler());

function addClickHandler() {
    const stringUrl = '/api/sample/string';
    const intUrl = '/api/sample/int';
    const doubleUrl = '/api/sample/double';
    const arrayUrl = '/api/sample/array';
    const simpleObjetUrl = '/api/sample/simple_object';
    const listObjectUrl = '/api/sample/list_object';

    $('#send-sample-string-button').on('click', async () => {
        const ret = await send('sample string', stringUrl);
    });

    $('#send-sample-int-button').on('click', async () => {
        const ret = await send(100, intUrl);
    });

    $('#send-sample-double-button').on('click', async () => {
        const ret = await send(1.1234, doubleUrl);
    });

    $('#send-sample-array-button').on('click', () => send([1, 2, 3, 4, 5, 'a'], arrayUrl));
    $('#send-sample-object-button').on('click', () => send({name: 'obj', value: 1, str: 'abcd'}, simpleObjetUrl));
    $('#send-sample-objectList-button').on('click', () => send([{name: 'obj', value: 1, str: 'abc'}, {
        name: 'obj2',
        value: 2,
        str: 'def'
    }], listObjectUrl));

}

function send(data0, url) {
    return fetch(url, {
        method: 'get',
        body: data0
    });
}
