import React, {useState, useEffect, useCallback} from 'react';

import AlbumsList from './components/AlbumsList';
import './App.css';

function App() {
    const [albums, setAlbums] = useState([]);
    const [isLoading, setIsLoading] = useState(false);
    const [error, setError] = useState(null);

    const fetchAlbumsHandler = useCallback(async () => {
        setIsLoading(true);
        setError(null);
        try {
            const response = await fetch('http://gcraig15.webhosting6.eeecs.qub.ac.uk/albumsapi/api.php?topten');
            if (!response.ok) {
                throw new Error('Something went wrong!');
            }

            const data = await response.json();

            const loadedAlbums = [];

            for (const key in data) {
                loadedAlbums.push({
                    id: key,
                    title: data[key].title,
                    // name: data[key].name,
                    // image: data[key].image,
                });
            }

            setAlbums(loadedAlbums);
        } catch (error) {
            setError(error.message);
        }
        setIsLoading(false);
    }, []);

    useEffect(() => {
        fetchAlbumsHandler();
    }, [fetchAlbumsHandler]);

    let content = <p>Found no albums.</p>;

    if (albums.length > 0) {
        content = <AlbumsList albums={albums}/>;
    }

    if (error) {
        content = <p>{error}</p>;
    }

    if (isLoading) {
        content = <p>Loading...</p>;
    }

    return (
        <React.Fragment>
            <section>
                <button onClick={fetchAlbumsHandler}>Fetch Albums</button>
            </section>
            <section>{content}</section>
        </React.Fragment>
    );
}

export default App;