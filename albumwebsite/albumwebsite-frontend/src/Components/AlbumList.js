import React, {useEffect, useState} from "react";
import AlbumForm from './AlbumForm';
import {Button, Card, Container, Row} from 'react-bootstrap';


function AlbumList() {
    const [albums, setAlbums] = useState([]);
    const [editing, setEditing] = useState(false);
    const initialFormState = {id: null, number: '', year: '', title: '', artist: '', genre: '', subgenre: '', artwork: ''};
    const [currentAlbum, setCurrentAlbum] = useState(initialFormState);
    const baseURL = "http://localhost:8080";

    // The useEffect is a hook to fetch the list of items from the API when the component mounts using fetch
    useEffect(() => {
        fetch(`${baseURL}/api/albums`)
            .then(response => response.json())
            .then(data => setAlbums(data));
    }, []);

    // Using fetch
    const addAlbum = album => {
        fetch(`${baseURL}/api/albums`, {
            method: 'POST',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify(album)
        })
            .then(response => response.json())
            .then(data => {
                setAlbums([...albums, data])
            });
    };

    const deleteAlbum = id => {
        fetch(`${baseURL}/api/albums/${id}`, {
            method: 'DELETE'
        }).then(() => {
            setAlbums(albums.filter(album => album.id !== id))
        });
    };

    const updateAlbum = (id, updatedAlbum) => {
        setEditing(false);
        fetch(`${baseURL}/api/albums/${id}`, {
            method: 'PUT',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify(updatedAlbum)
        }).then(data => {
                setAlbums(albums.map(album => (album.id === id ? updateAlbum : album)))
            });
    };

    const editRow = album => {
        setEditing(true);
        setCurrentAlbum({
            id: album.id,
            number: album.number,
            year: album.year,
            title: album.title,
            artist: album.artist,
            genre: album.genre,
            subgenre: album.subgenre,
            artwork: album.artwork
        })
    };

    return (
        <>
            <Container>
                <Row>
                    <Card className="card border-primary mb-3" style={{width: '120rem'}}>
                        <Card.Header style={{backgroundColor: 'green'}}>
                            <h3 style={{color: 'white', textAlign: 'center'}}>Album List</h3>
                        </Card.Header>
                        <Card.Body>
                            <div>
                                <table className="table table-sm table-striped table-bordered table-hover ">
                                    <thead className="thead-light">
                                    <tr>
                                        <th>Number</th>
                                        <th>Album</th>
                                        <th>Artist</th>
                                        <th>Year</th>
                                        <th>Artwork</th>
                                    </tr>
                                    </thead>

                                    <tbody style={{textAlign: 'left'}}>
                                    {albums.map(album => (
                                        <tr key={album.id}>
                                            <td style={{textAlign: 'center'}}>{album.number}</td>
                                            <td>{album.title}</td>
                                            <td>{album.artist}</td>
                                            <td>{album.year}</td>
                                            {/* <td>{album.artwork}</td> */}
                                            <td style={{textAlign: 'center'}}>{<img src={album.artwork } style={{ width: '20%'}}/>}</td>
                                            {/* <td style={{textAlign: 'center'}}>
                                                <Button variant="outline-primary"
                                                        onClick={() => editRow(album)}>Edit</Button>
                                            </td>
                                            <td style={{textAlign: 'center'}}>
                                                <Button variant="outline-danger"
                                                        onClick={() => deleteAlbum(album).id}>Delete</Button>
                                            </td> */}
                                        </tr>
                                    ))}
                                    </tbody>
                                </table>
                            </div>
                        </Card.Body>
                    </Card>
                </Row>
            </Container>
            <Container>
                <Row>
                    {editing ? (
                        <Card className="card border-danger mb-3" style={{width: '120'}}>
                            <Card.Header style={{color: 'white', backgroundColor: 'red'}}>
                                <h3 style={{color: 'white', textAlign: 'center'}}>Edit Album</h3>
                            </Card.Header>
                            <Card.Body>
                                <div>
                                    <AlbumForm
                                        editing={editing}
                                        setEditing={setEditing}
                                        currentAlbum={currentAlbum}
                                        updateAlbum={updateAlbum}
                                    />
                                </div>
                            </Card.Body>
                        </Card>
                    ) : (<Card className="card border-success mb-3">
                        <Card.Header style={{color: 'white', backgroundColor: 'green'}}>
                            <h3 style={{color: 'white', textAlign: 'center'}}>Add New Album Details</h3>
                        </Card.Header>
                        <Card.Body>
                            <div>
                                <AlbumForm addAlbum={addAlbum}/>
                            </div>
                        </Card.Body>
                    </Card>)}
                </Row>
            </Container>
        </>
    )
};

export default AlbumList;
