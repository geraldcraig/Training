
const BookSchema = {
    name: 'Book',
    properties: {
        _id: 'objectId',
        author: 'string?',
        category: 'string?',
        price: 'string?',
        realm_id: '65554a73927c01024596f784?', // should be userId or add any static for test project.
        title: 'string',
    },
    primaryKey: '_id',
};


export default BookSchema;