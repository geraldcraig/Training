import React, {useState, useEffect} from "react";
import 'bootstrap/dist/css/bootstrap.css';
import {Form, Row, Button, Col} from 'react-bootstrap';

function AlbumForm({ addAlbum, updateAlbum, editing, setEditing, currentAlbum }) {
    const initialFormState = {id: null, number: '', year: '', title: '', artist: '', genre: '', subgenre: '', artwork: ''};
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

    const handleSubmit = event => {
        event.preventDefault();
        if (!album.number || !album.year || !album.title || !album.artist || !album.genre || !album.subgenre || !album.artwork) return;
        if (editing) {
            updateAlbum(album.id, album);
        } else {
            addAlbum(album);
        }
        setAlbum(initialFormState);
    };

    const handleCancel = event => {
        setAlbum(initialFormState);
        setEditing(false);
    }

    return (
        <Form onSubmit={handleSubmit}>

            <Row className="mb-3">
                <Form.Group as={Col} controlId="formAlbumTitle">
                    <Form.Label>Album Title</Form.Label>
                    <Form.Control type="text" name="title" value={album.title} onChange={handleChange} placeholder="Enter the album title" />
                </Form.Group>
            </Row>

            {editing ? (
                <div>
                    <Button variant="outline-success" type="submit">Update Album</Button>
                    <Button variant="outline-danger" onClick={() => handleCancel}>Cancel</Button>
                </div>
            ) : (
                <div>
                    <Button variant="outline-success" type="submit">Add Album</Button>
                </div>
            )}
        </Form>
    )
};

export default AlbumForm;