import axios from 'axios';

export default {
    getMyCollections() {
        return axios.get('/myCollections');
    },
    getAllCollections() {
        return axios.get("/allCollections");
    },
    addCollection(collection) {
        return axios.post("myCollections/add", collection);
    }
}