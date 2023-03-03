import React, { useState, useEffect} from "react";
import "../App.css";


function Home() {
    const [albums, setAlbums] = useState([]);
    const initialFormState = { id: null, album: '', artist: '', year: '', number: ''};
    const [currentAlbum, setCurrentAlbum] = useState(initialFormState);
    const baseURL = "http://localhost:8080";

useEffect(() => {
    fetch(`${baseURL}/api`)
        .then(response => response.json())
        .then(data => setAlbums(data));
}, []);

    return (
        <>
            <div>
                <table>
                    <thead>
                    <tr>
                        <th>Name</th>
                    </tr>
                    </thead>
                    <tbody>
                    {albums.map(albums => (
                        <tr key={albums.id}>
                            <td>{albums.name}</td>
                        </tr>
                    ))}
                    </tbody>
                </table>
            </div>
        </>
    );
}

export default Home;
