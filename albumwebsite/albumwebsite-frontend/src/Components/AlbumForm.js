import React, {useState, useEffect} from "react";
import 'bootstrap/dist/css/bootstrap.css';
import {Form, Row, Button, Col} from 'react-bootstrap';
function AlbumForm({ addAlbum, updateAlbum, editing, setEditing, currentAlbum }) {
    const initialFormState = {id: null, number: '', year: '', title: '', artist: '', artwork: ''};
    const [album, setAlbum] = useState(initialFormState);

    // The useEffect is a hook to fetch the list of items from the API when the component mounts using fetch
    useEffect(() => {
        if (editing) {
            setAlbum(currentAlbum);
        }
    }, [currentAlbum, editing]);

    const handleChange = (event) => {
        const {name, value} = event.target;
        setAlbum({...album, [name]: value});
    };
    return (
        <>
        </>
    )
};

export default AlbumForm;